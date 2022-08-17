/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.i18n.timezone;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

class XmlUtils {

    private static final String TRUE_ATTRIBUTE_VALUE = "y";

    private static final String FALSE_ATTRIBUTE_VALUE = "n";

    private XmlUtils() {}

    /**
     * Parses an attribute value, which must be either {@code null} or a valid signed long value.
     * If the attribute value is {@code null} then {@code defaultValue} is returned. If the
     * attribute is present but not a valid long value then an XmlPullParserException is thrown.
     */
    static Long parseLongAttribute(XmlPullParser parser, String attributeName,
            Long defaultValue) throws XmlPullParserException {
        String attributeValueString = parser.getAttributeValue(null /* namespace */, attributeName);
        if (attributeValueString == null) {
            return defaultValue;
        }
        try {
            return Long.parseLong(attributeValueString);
        } catch (NumberFormatException e) {
            throw new XmlPullParserException("Attribute \"" + attributeName
                    + "\" is not a long value: " + parser.getPositionDescription());
        }
    }

    /**
     * Parses an attribute value, which must be either {@code null}, {@code "y"} or {@code "n"}.
     * If the attribute value is {@code null} then {@code defaultValue} is returned. If the
     * attribute is present but not "y" or "n" then an XmlPullParserException is thrown.
     */
    static Boolean parseBooleanAttribute(XmlPullParser parser,
            String attributeName, Boolean defaultValue) throws XmlPullParserException {
        String attributeValueString = parser.getAttributeValue(null /* namespace */, attributeName);
        if (attributeValueString == null) {
            return defaultValue;
        }
        boolean isTrue = TRUE_ATTRIBUTE_VALUE.equals(attributeValueString);
        if (!(isTrue || FALSE_ATTRIBUTE_VALUE.equals(attributeValueString))) {
            throw new XmlPullParserException("Attribute \"" + attributeName
                    + "\" is not \"y\" or \"n\": " + parser.getPositionDescription());
        }
        return isTrue;
    }

    /**
     * Parses an attribute value, which must be either {@code null} or a comma-separated String
     * list. There is no support for escaping the comma. If the attribute value is {@code null} then
     * {@code defaultValue} is returned.
     */
    static List<String> parseStringListAttribute(XmlPullParser parser, String attributeName,
            List<String> defaultValue) throws XmlPullParserException {
        String attributeValueString = parser.getAttributeValue(null /* namespace */, attributeName);
        if (attributeValueString == null) {
            return defaultValue;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(attributeValueString, ",", false);
        ArrayList<String> strings = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            strings.add(stringTokenizer.nextToken());
        }
        strings.trimToSize();
        return strings;
    }

    /**
     * Advances the the parser to the START_TAG for the specified element without decreasing the
     * depth, or increasing the depth by more than one (i.e. no recursion into child nodes).
     * If the next (non-nested) END_TAG an exception is thrown. Throws an exception if the end of
     * the document is encountered unexpectedly.
     */
    static void findNextStartTagOrThrowNoRecurse(XmlPullParser parser, String elementName)
            throws IOException, XmlPullParserException {
        if (!findNextStartTagOrEndTagNoRecurse(parser, elementName)) {
            throw new XmlPullParserException("No next element found with name " + elementName);
        }
    }

    /**
     * Advances the the parser to the START_TAG for the specified element without decreasing the
     * depth, or increasing the depth by more than one (i.e. no recursion into child nodes).
     * Returns {@code true} if the requested START_TAG is found, or {@code false} when the next
     * (non-nested) END_TAG is encountered instead. Throws an exception if the end of the document
     * is encountered unexpectedly.
     */
    static boolean findNextStartTagOrEndTagNoRecurse(XmlPullParser parser, String elementName)
            throws IOException, XmlPullParserException {
        int type;
        while ((type = parser.next()) != XmlPullParser.END_DOCUMENT) {
            switch (type) {
                case XmlPullParser.START_TAG:
                    String currentElementName = parser.getName();
                    if (elementName.equals(currentElementName)) {
                        return true;
                    }

                    // It was not the START_TAG we were looking for. Consume until the end.
                    parser.next();
                    consumeUntilEndTag(parser, currentElementName);
                    break;
                case XmlPullParser.END_TAG:
                    return false;
                default:
                    // Ignore.
                    break;
            }
        }
        throw new XmlPullParserException("Unexpected end of document while looking for "
                + elementName);
    }

    /**
     * Consume any remaining contents of an element and move to the END_TAG. Used when processing
     * within an element can stop.
     *
     * <p>When called, the parser must be pointing at one of:
     * <ul>
     *     <li>the END_TAG we are looking for</li>
     *     <li>a TEXT</li>
     *     <li>a START_TAG nested within the element that can be consumed</li>
     * </ul>
     * Note: The parser synthesizes an END_TAG for self-closing tags so this works for them too.
     */
    static void consumeUntilEndTag(XmlPullParser parser, String elementName)
            throws IOException, XmlPullParserException {

        if (isEndTag(parser, elementName)) {
            // Early return - we are already there.
            return;
        }

        // Keep track of the required depth in case there are nested elements to be consumed.
        // Both the name and the depth must match our expectation to complete.

        int requiredDepth = parser.getDepth();
        // A TEXT tag would be at the same depth as the END_TAG we are looking for.
        if (parser.getEventType() == XmlPullParser.START_TAG) {
            // A START_TAG would have incremented the depth, so we're looking for an END_TAG one
            // higher than the current tag.
            requiredDepth--;
        }

        while (parser.getEventType() != XmlPullParser.END_DOCUMENT) {
            int type = parser.next();

            int currentDepth = parser.getDepth();
            if (currentDepth < requiredDepth) {
                throw new XmlPullParserException(
                        "Unexpected depth while looking for end tag: "
                                + parser.getPositionDescription());
            } else if (currentDepth == requiredDepth) {
                if (type == XmlPullParser.END_TAG) {
                    if (elementName.equals(parser.getName())) {
                        return;
                    }
                    throw new XmlPullParserException(
                            "Unexpected eng tag: " + parser.getPositionDescription());
                }
            }
            // Everything else is either a type we are not interested in or is too deep and so is
            // ignored.
        }
        throw new XmlPullParserException("Unexpected end of document");
    }

    /**
     * Throws an exception if the current element is not an end tag.
     * Note: The parser synthesizes an END_TAG for self-closing tags so this works for them too.
     */
    static void checkOnEndTag(XmlPullParser parser, String elementName)
            throws XmlPullParserException {
        if (!isEndTag(parser, elementName)) {
            throw new XmlPullParserException(
                    "Unexpected tag encountered: " + parser.getPositionDescription());
        }
    }

    /**
     * Returns true if the current tag is an end tag.
     * Note: The parser synthesizes an END_TAG for self-closing tags so this works for them too.
     */
    private static boolean isEndTag(XmlPullParser parser, String elementName)
            throws XmlPullParserException {
        return parser.getEventType() == XmlPullParser.END_TAG
                && parser.getName().equals(elementName);
    }

    static String normalizeCountryIso(String countryIso) {
        // Lowercase ASCII is normalized for the purposes of the input files and the code in this
        // class and related classes.
        return countryIso.toLowerCase(Locale.US);
    }

    /**
     * Reads the text inside the current element. Should be called when the parser is currently
     * on the START_TAG before the TEXT. The parser will be positioned on the END_TAG after this
     * call when it completes successfully.
     */
    static String consumeText(XmlPullParser parser)
            throws IOException, XmlPullParserException {

        int type = parser.next();
        String text;
        if (type == XmlPullParser.TEXT) {
            text = parser.getText();
        } else {
            throw new XmlPullParserException("Text not found. Found type=" + type
                    + " at " + parser.getPositionDescription());
        }

        type = parser.next();
        if (type != XmlPullParser.END_TAG) {
            throw new XmlPullParserException(
                    "Unexpected nested tag or end of document when expecting text: type=" + type
                            + " at " + parser.getPositionDescription());
        }
        return text;
    }

    /**
     * A source of Readers that can be used repeatedly.
     */
    interface ReaderSupplier {
        /** Returns a Reader. Throws an IOException if the Reader cannot be created. */
        Reader get() throws IOException;

        static ReaderSupplier forFile(String fileName, Charset charSet) throws IOException {
            Path file = Paths.get(fileName);
            if (!Files.exists(file)) {
                throw new FileNotFoundException(fileName + " does not exist");
            }
            if (!Files.isRegularFile(file) && Files.isReadable(file)) {
                throw new IOException(fileName + " must be a regular readable file.");
            }
            return () -> Files.newBufferedReader(file, charSet);
        }

        static ReaderSupplier forString(String xml) {
            return () -> new StringReader(xml);
        }
    }
}
