/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// $Id: SAXParser.java 584483 2007-10-14 02:54:48Z mrglavas $

package javax.xml.parsers;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.validation.Schema;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;


/**
 * Defines the API that wraps an {@link org.xml.sax.XMLReader}
 * implementation class. In JAXP 1.0, this class wrapped the
 * {@link org.xml.sax.Parser} interface, however this interface was
 * replaced by the {@link org.xml.sax.XMLReader}. For ease
 * of transition, this class continues to support the same name
 * and interface as well as supporting new methods.
 *
 * An instance of this class can be obtained from the
 * {@link javax.xml.parsers.SAXParserFactory#newSAXParser()} method.
 * Once an instance of this class is obtained, XML can be parsed from
 * a variety of input sources. These input sources are InputStreams,
 * Files, URLs, and SAX InputSources.<p>
 *
 * This static method creates a new factory instance based
 * on a system property setting or uses the platform default
 * if no property has been defined.<p>
 *
 * The system property that controls which Factory implementation
 * to create is named <code>&quot;javax.xml.parsers.SAXParserFactory&quot;</code>.
 * This property names a class that is a concrete subclass of this
 * abstract class. If no property is defined, a platform default
 * will be used.</p>
 *
 * As the content is parsed by the underlying parser, methods of the
 * given {@link org.xml.sax.HandlerBase} or the
 * {@link org.xml.sax.helpers.DefaultHandler} are called.<p>
 *
 * Implementations of this class which wrap an underlying implementation
 * can consider using the {@link org.xml.sax.helpers.ParserAdapter}
 * class to initially adapt their SAX1 implementation to work under
 * this revised class.
 *
 * @author <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a>
 * @version $Revision: 584483 $, $Date: 2007-10-13 19:54:48 -0700 (Sat, 13 Oct 2007) $
 */
public abstract class SAXParser {

    private static final boolean DEBUG = false;

    /**
     * <p>Protected constructor to prevent instantiation.
     * Use {@link javax.xml.parsers.SAXParserFactory#newSAXParser()}.</p>
     */
    protected SAXParser () {

    }

    /**
     * <p>Reset this <code>SAXParser</code> to its original configuration.</p>
     *
     * <p><code>SAXParser</code> is reset to the same state as when it was created with
     * {@link SAXParserFactory#newSAXParser()}.
     * <code>reset()</code> is designed to allow the reuse of existing <code>SAXParser</code>s
     * thus saving resources associated with the creation of new <code>SAXParser</code>s.</p>
     *
     * <p>The reset <code>SAXParser</code> is not guaranteed to have the same {@link Schema}
     * <code>Object</code>, e.g. {@link Object#equals(Object obj)}.  It is guaranteed to have a functionally equal
     * <code>Schema</code>.</p>
     *
     * @since 1.5
     */
    public void reset() {

        // implementors should override this method
        throw new UnsupportedOperationException(
            "This SAXParser, \"" + this.getClass().getName() + "\", does not support the reset functionality."
            + "  Specification \"" + this.getClass().getPackage().getSpecificationTitle() + "\""
            + " version \"" + this.getClass().getPackage().getSpecificationVersion() + "\""
            );
    }

    /**
     * <p>Parse the content of the given {@link java.io.InputStream}
     * instance as XML using the specified {@link org.xml.sax.HandlerBase}.
     * <i> Use of the DefaultHandler version of this method is recommended as
     * the HandlerBase class has been deprecated in SAX 2.0</i>.</p>
     *
     * @param is InputStream containing the content to be parsed.
     * @param hb The SAX HandlerBase to use.
     *
     * @throws IllegalArgumentException If the given InputStream is null.
     * @throws SAXException If parse produces a SAX error.
     * @throws IOException If an IO error occurs interacting with the
     *   <code>InputStream</code>.
     *
     * @see org.xml.sax.DocumentHandler
     */
    public void parse(InputStream is, HandlerBase hb)
        throws SAXException, IOException {
        if (is == null) {
            throw new IllegalArgumentException("InputStream cannot be null");
        }

        InputSource input = new InputSource(is);
        this.parse(input, hb);
    }

    /**
     * <p>Parse the content of the given {@link java.io.InputStream}
     * instance as XML using the specified {@link org.xml.sax.HandlerBase}.
     * <i> Use of the DefaultHandler version of this method is recommended as
     * the HandlerBase class has been deprecated in SAX 2.0</i>.</p>
     *
     * @param is InputStream containing the content to be parsed.
     * @param hb The SAX HandlerBase to use.
     * @param systemId The systemId which is needed for resolving relative URIs.
     *
     * @throws IllegalArgumentException If the given <code>InputStream</code> is
     *   <code>null</code>.
     * @throws IOException If any IO error occurs interacting with the
     *   <code>InputStream</code>.
     * @throws SAXException If any SAX errors occur during processing.
     *
     * @see org.xml.sax.DocumentHandler version of this method instead.
     */
    public void parse(
        InputStream is,
        HandlerBase hb,
        String systemId)
        throws SAXException, IOException {
        if (is == null) {
            throw new IllegalArgumentException("InputStream cannot be null");
        }

        InputSource input = new InputSource(is);
        input.setSystemId(systemId);
        this.parse(input, hb);
    }

    /**
     * Parse the content of the given {@link java.io.InputStream}
     * instance as XML using the specified
     * {@link org.xml.sax.helpers.DefaultHandler}.
     *
     * @param is InputStream containing the content to be parsed.
     * @param dh The SAX DefaultHandler to use.
     *
     * @throws IllegalArgumentException If the given InputStream is null.
     * @throws IOException If any IO errors occur.
     * @throws SAXException If any SAX errors occur during processing.
     *
     * @see org.xml.sax.DocumentHandler
     */
    public void parse(InputStream is, DefaultHandler dh)
        throws SAXException, IOException {
        if (is == null) {
            throw new IllegalArgumentException("InputStream cannot be null");
        }

        InputSource input = new InputSource(is);
        this.parse(input, dh);
    }

    /**
     * Parse the content of the given {@link java.io.InputStream}
     * instance as XML using the specified
     * {@link org.xml.sax.helpers.DefaultHandler}.
     *
     * @param is InputStream containing the content to be parsed.
     * @param dh The SAX DefaultHandler to use.
     * @param systemId The systemId which is needed for resolving relative URIs.
     *
     * @throws IllegalArgumentException If the given InputStream is null.
     * @throws IOException If any IO errors occur.
     * @throws SAXException If any SAX errors occur during processing.
     *
     * @see org.xml.sax.DocumentHandler version of this method instead.
     */
    public void parse(
        InputStream is,
        DefaultHandler dh,
        String systemId)
        throws SAXException, IOException {
        if (is == null) {
            throw new IllegalArgumentException("InputStream cannot be null");
        }

        InputSource input = new InputSource(is);
        input.setSystemId(systemId);
        this.parse(input, dh);
    }

    /**
     * Parse the content described by the giving Uniform Resource
     * Identifier (URI) as XML using the specified
     * {@link org.xml.sax.HandlerBase}.
     * <i> Use of the DefaultHandler version of this method is recommended as
     * the <code>HandlerBase</code> class has been deprecated in SAX 2.0</i>
     *
     * @param uri The location of the content to be parsed.
     * @param hb The SAX HandlerBase to use.
     *
     * @throws IllegalArgumentException If the uri is null.
     * @throws IOException If any IO errors occur.
     * @throws SAXException If any SAX errors occur during processing.
     *
     * @see org.xml.sax.DocumentHandler
     */
    public void parse(String uri, HandlerBase hb)
        throws SAXException, IOException {
        if (uri == null) {
            throw new IllegalArgumentException("uri cannot be null");
        }

        InputSource input = new InputSource(uri);
        this.parse(input, hb);
    }

    /**
     * Parse the content described by the giving Uniform Resource
     * Identifier (URI) as XML using the specified
     * {@link org.xml.sax.helpers.DefaultHandler}.
     *
     * @param uri The location of the content to be parsed.
     * @param dh The SAX DefaultHandler to use.
     *
     * @throws IllegalArgumentException If the uri is null.
     * @throws IOException If any IO errors occur.
     * @throws SAXException If any SAX errors occur during processing.
     *
     * @see org.xml.sax.DocumentHandler
     */
    public void parse(String uri, DefaultHandler dh)
        throws SAXException, IOException {
        if (uri == null) {
            throw new IllegalArgumentException("uri cannot be null");
        }

        InputSource input = new InputSource(uri);
        this.parse(input, dh);
    }

    /**
     * Parse the content of the file specified as XML using the
     * specified {@link org.xml.sax.HandlerBase}.
     * <i> Use of the DefaultHandler version of this method is recommended as
     * the HandlerBase class has been deprecated in SAX 2.0</i>
     *
     * @param f The file containing the XML to parse
     * @param hb The SAX HandlerBase to use.
     *
     * @throws IllegalArgumentException If the File object is null.
     * @throws IOException If any IO errors occur.
     * @throws SAXException If any SAX errors occur during processing.
     *
     * @see org.xml.sax.DocumentHandler
     */
    public void parse(File f, HandlerBase hb)
        throws SAXException, IOException {
        if (f == null) {
            throw new IllegalArgumentException("File cannot be null");
        }

        String escapedURI = FilePathToURI.filepath2URI(f.getAbsolutePath());

        if (DEBUG) {
            System.out.println("Escaped URI = " + escapedURI);
        }

        InputSource input = new InputSource(escapedURI);
        this.parse(input, hb);
    }

    /**
     * Parse the content of the file specified as XML using the
     * specified {@link org.xml.sax.helpers.DefaultHandler}.
     *
     * @param f The file containing the XML to parse
     * @param dh The SAX DefaultHandler to use.
     *
     * @throws IllegalArgumentException If the File object is null.
     * @throws IOException If any IO errors occur.
     * @throws SAXException If any SAX errors occur during processing.
     *
     * @see org.xml.sax.DocumentHandler
     */
    public void parse(File f, DefaultHandler dh)
        throws SAXException, IOException {
        if (f == null) {
            throw new IllegalArgumentException("File cannot be null");
        }

        String escapedURI = FilePathToURI.filepath2URI(f.getAbsolutePath());

        if (DEBUG) {
            System.out.println("Escaped URI = " + escapedURI);
        }

        InputSource input = new InputSource(escapedURI);
        this.parse(input, dh);
    }

    /**
     * Parse the content given {@link org.xml.sax.InputSource}
     * as XML using the specified
     * {@link org.xml.sax.HandlerBase}.
     * <i> Use of the DefaultHandler version of this method is recommended as
     * the HandlerBase class has been deprecated in SAX 2.0</i>
     *
     * @param is The InputSource containing the content to be parsed.
     * @param hb The SAX HandlerBase to use.
     *
     * @throws IllegalArgumentException If the <code>InputSource</code> object
     *   is <code>null</code>.
     * @throws IOException If any IO errors occur.
     * @throws SAXException If any SAX errors occur during processing.
     *
     * @see org.xml.sax.DocumentHandler
     */
    public void parse(InputSource is, HandlerBase hb)
        throws SAXException, IOException {
        if (is == null) {
            throw new IllegalArgumentException("InputSource cannot be null");
        }

        Parser parser = this.getParser();
        if (hb != null) {
            parser.setDocumentHandler(hb);
            parser.setEntityResolver(hb);
            parser.setErrorHandler(hb);
            parser.setDTDHandler(hb);
        }
        parser.parse(is);
    }

    /**
     * Parse the content given {@link org.xml.sax.InputSource}
     * as XML using the specified
     * {@link org.xml.sax.helpers.DefaultHandler}.
     *
     * @param is The InputSource containing the content to be parsed.
     * @param dh The SAX DefaultHandler to use.
     *
     * @throws IllegalArgumentException If the <code>InputSource</code> object
     *   is <code>null</code>.
     * @throws IOException If any IO errors occur.
     * @throws SAXException If any SAX errors occur during processing.
     *
     * @see org.xml.sax.DocumentHandler
     */
    public void parse(InputSource is, DefaultHandler dh)
        throws SAXException, IOException {
        if (is == null) {
            throw new IllegalArgumentException("InputSource cannot be null");
        }

        XMLReader reader = this.getXMLReader();
        if (dh != null) {
            reader.setContentHandler(dh);
            reader.setEntityResolver(dh);
            reader.setErrorHandler(dh);
            reader.setDTDHandler(dh);
        }
        reader.parse(is);
    }

    /**
     * Returns the SAX parser that is encapsulated by the
     * implementation of this class.
     *
     * @return The SAX parser that is encapsulated by the
     *         implementation of this class.
     *
     * @throws SAXException If any SAX errors occur during processing.
     */
    public abstract org.xml.sax.Parser getParser() throws SAXException;

    /**
     * Returns the {@link org.xml.sax.XMLReader} that is encapsulated by the
     * implementation of this class.
     *
     * @return The XMLReader that is encapsulated by the
     *         implementation of this class.
     *
     * @throws SAXException If any SAX errors occur during processing.
     */

    public abstract org.xml.sax.XMLReader getXMLReader() throws SAXException;

    /**
     * Indicates whether or not this parser is configured to
     * understand namespaces.
     *
     * @return true if this parser is configured to
     *         understand namespaces; false otherwise.
     */

    public abstract boolean isNamespaceAware();

    /**
     * Indicates whether or not this parser is configured to
     * validate XML documents.
     *
     * @return true if this parser is configured to
     *         validate XML documents; false otherwise.
     */

    public abstract boolean isValidating();

    /**
     * <p>Sets the particular property in the underlying implementation of
     * {@link org.xml.sax.XMLReader}.
     * A list of the core features and properties can be found at
     * <a href="http://sax.sourceforge.net/?selected=get-set">
     * http://sax.sourceforge.net/?selected=get-set</a>.</p>
     *
     * @param name The name of the property to be set.
     * @param value The value of the property to be set.
     *
     * @throws SAXNotRecognizedException When the underlying XMLReader does
     *   not recognize the property name.
     * @throws SAXNotSupportedException When the underlying XMLReader
     *  recognizes the property name but doesn't support the property.
     *
     * @see org.xml.sax.XMLReader#setProperty
     */
    public abstract void setProperty(String name, Object value)
        throws SAXNotRecognizedException, SAXNotSupportedException;

    /**
     * <p>Returns the particular property requested for in the underlying
     * implementation of {@link org.xml.sax.XMLReader}.</p>
     *
     * @param name The name of the property to be retrieved.
     * @return Value of the requested property.
     *
     * @throws SAXNotRecognizedException When the underlying XMLReader does
     *    not recognize the property name.
     * @throws SAXNotSupportedException When the underlying XMLReader
     *  recognizes the property name but doesn't support the property.
     *
     * @see org.xml.sax.XMLReader#getProperty
     */
    public abstract Object getProperty(String name)
        throws SAXNotRecognizedException, SAXNotSupportedException;

    /** <p>Get a reference to the the {@link Schema} being used by
     * the XML processor.</p>
     *
     * <p>If no schema is being used, <code>null</code> is returned.</p>
     *
     * @return {@link Schema} being used or <code>null</code>
     *  if none in use
     *
     * @throws UnsupportedOperationException
     *      For backward compatibility, when implementations for
     *      earlier versions of JAXP is used, this exception will be
     *      thrown.
     *
     * @since 1.5
     */
    public Schema getSchema() {
        throw new UnsupportedOperationException(
            "This parser does not support specification \""
            + this.getClass().getPackage().getSpecificationTitle()
            + "\" version \""
            + this.getClass().getPackage().getSpecificationVersion()
            + "\""
            );
    }

    /**
     * <p>Get the XInclude processing mode for this parser.</p>
     *
     * @return
     *      the return value of
     *      the {@link SAXParserFactory#isXIncludeAware()}
     *      when this parser was created from factory.
     *
     * @throws UnsupportedOperationException
     *      For backward compatibility, when implementations for
     *      earlier versions of JAXP is used, this exception will be
     *      thrown.
     *
     * @since 1.5
     *
     * @see SAXParserFactory#setXIncludeAware(boolean)
     */
    public boolean isXIncludeAware() {
        throw new UnsupportedOperationException(
            "This parser does not support specification \""
            + this.getClass().getPackage().getSpecificationTitle()
            + "\" version \""
            + this.getClass().getPackage().getSpecificationVersion()
            + "\""
            );
    }
}
