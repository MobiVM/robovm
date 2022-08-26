/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * (C) Copyright IBM Corp. 1999-2003 - All Rights Reserved
 *
 * The original version of this source code and documentation is
 * copyrighted and owned by IBM. These materials are provided
 * under terms of a License Agreement between IBM and Sun.
 * This technology is protected by multiple US and International
 * patents. This notice and attribution to IBM may not be removed.
 */

package java.text;

/**
 * This class implements the Unicode Bidirectional Algorithm.
 * <p>
 * A Bidi object provides information on the bidirectional reordering of the text
 * used to create it.  This is required, for example, to properly display Arabic
 * or Hebrew text.  These languages are inherently mixed directional, as they order
 * numbers from left-to-right while ordering most other text from right-to-left.
 * <p>
 * Once created, a Bidi object can be queried to see if the text it represents is
 * all left-to-right or all right-to-left.  Such objects are very lightweight and
 * this text is relatively easy to process.
 * <p>
 * If there are multiple runs of text, information about the runs can be accessed
 * by indexing to get the start, limit, and level of a run.  The level represents
 * both the direction and the 'nesting level' of a directional run.  Odd levels
 * are right-to-left, while even levels are left-to-right.  So for example level
 * 0 represents left-to-right text, while level 1 represents right-to-left text, and
 * level 2 represents left-to-right text embedded in a right-to-left run.
 *
 * @since 1.4
 */
public final class Bidi {

    /** Constant indicating base direction is left-to-right. */
    public static final int DIRECTION_LEFT_TO_RIGHT = 0;

    /** Constant indicating base direction is right-to-left. */
    public static final int DIRECTION_RIGHT_TO_LEFT = 1;

    /**
     * Constant indicating that the base direction depends on the first strong
     * directional character in the text according to the Unicode
     * Bidirectional Algorithm.  If no strong directional character is present,
     * the base direction is left-to-right.
     */
    public static final int DIRECTION_DEFAULT_LEFT_TO_RIGHT = -2;

    /**
     * Constant indicating that the base direction depends on the first strong
     * directional character in the text according to the Unicode
     * Bidirectional Algorithm.  If no strong directional character is present,
     * the base direction is right-to-left.
     */
    public static final int DIRECTION_DEFAULT_RIGHT_TO_LEFT = -1;

    // Android-note: Upstream this class delegates to an internal implementation class BidiBase.
    // For Android that is replaced with android.icu.text.Bidi. BidiBase and ICU Bidi work very
    // similarly, but differ in some details like level of argument validation and how how exactly
    // runs are counted. The majority of the changes in this file exist to allow for backwards
    // compatibility with an earlier ICU4C based Bidi implementation.

    // BEGIN Android-added: translateConstToIcu(int).
    private static int translateConstToIcu(int javaInt) {
        switch (javaInt) {
            case DIRECTION_DEFAULT_LEFT_TO_RIGHT:
                return android.icu.text.Bidi.DIRECTION_DEFAULT_LEFT_TO_RIGHT;
            case DIRECTION_DEFAULT_RIGHT_TO_LEFT:
                return android.icu.text.Bidi.DIRECTION_DEFAULT_RIGHT_TO_LEFT;
            case DIRECTION_LEFT_TO_RIGHT:
                return android.icu.text.Bidi.DIRECTION_LEFT_TO_RIGHT;
            case DIRECTION_RIGHT_TO_LEFT:
                return android.icu.text.Bidi.DIRECTION_RIGHT_TO_LEFT;
            // If the parameter was unrecognized use LEFT_TO_RIGHT.
            default:
                return android.icu.text.Bidi.DIRECTION_LEFT_TO_RIGHT;
        }
    }
    // END Android-added: translateConstToIcu(int).

    // Android-changed: use ICU Bidi class instead of BidiBase.
    private final android.icu.text.Bidi bidiBase;

    /**
     * Create Bidi from the given paragraph of text and base direction.
     * @param paragraph a paragraph of text
     * @param flags a collection of flags that control the algorithm.  The
     * algorithm understands the flags DIRECTION_LEFT_TO_RIGHT, DIRECTION_RIGHT_TO_LEFT,
     * DIRECTION_DEFAULT_LEFT_TO_RIGHT, and DIRECTION_DEFAULT_RIGHT_TO_LEFT.
     * Other values are reserved.
     */
    public Bidi(String paragraph, int flags) {
        if (paragraph == null) {
            throw new IllegalArgumentException("paragraph is null");
        }

        // Android-changed: use ICU Bidi class instead of BidiBase.
        bidiBase = new android.icu.text.Bidi(paragraph.toCharArray(), 0, null, 0,
                                             paragraph.length(), translateConstToIcu(flags));
    }

    /**
     * Create Bidi from the given paragraph of text.
     * <p>
     * The RUN_DIRECTION attribute in the text, if present, determines the base
     * direction (left-to-right or right-to-left).  If not present, the base
     * direction is computes using the Unicode Bidirectional Algorithm, defaulting to left-to-right
     * if there are no strong directional characters in the text.  This attribute, if
     * present, must be applied to all the text in the paragraph.
     * <p>
     * The BIDI_EMBEDDING attribute in the text, if present, represents embedding level
     * information.  Negative values from -1 to -62 indicate overrides at the absolute value
     * of the level.  Positive values from 1 to 62 indicate embeddings.  Where values are
     * zero or not defined, the base embedding level as determined by the base direction
     * is assumed.
     * <p>
     * The NUMERIC_SHAPING attribute in the text, if present, converts European digits to
     * other decimal digits before running the bidi algorithm.  This attribute, if present,
     * must be applied to all the text in the paragraph.
     *
     * @param paragraph a paragraph of text with optional character and paragraph attribute information
     *
     * @see java.awt.font.TextAttribute#BIDI_EMBEDDING
     * @see java.awt.font.TextAttribute#NUMERIC_SHAPING
     * @see java.awt.font.TextAttribute#RUN_DIRECTION
     */
    public Bidi(AttributedCharacterIterator paragraph) {
        if (paragraph == null) {
            throw new IllegalArgumentException("paragraph is null");
        }

        // Android-changed: change from BidiBase to ICU Bidi class.
        this.bidiBase = new android.icu.text.Bidi(paragraph);
    }

    /**
     * Create Bidi from the given text, embedding, and direction information.
     * The embeddings array may be null.  If present, the values represent embedding level
     * information.  Negative values from -1 to -61 indicate overrides at the absolute value
     * of the level.  Positive values from 1 to 61 indicate embeddings.  Where values are
     * zero, the base embedding level as determined by the base direction is assumed.
     * @param text an array containing the paragraph of text to process.
     * @param textStart the index into the text array of the start of the paragraph.
     * @param embeddings an array containing embedding values for each character in the paragraph.
     * This can be null, in which case it is assumed that there is no external embedding information.
     * @param embStart the index into the embedding array of the start of the paragraph.
     * @param paragraphLength the length of the paragraph in the text and embeddings arrays.
     * @param flags a collection of flags that control the algorithm.  The
     * algorithm understands the flags DIRECTION_LEFT_TO_RIGHT, DIRECTION_RIGHT_TO_LEFT,
     * DIRECTION_DEFAULT_LEFT_TO_RIGHT, and DIRECTION_DEFAULT_RIGHT_TO_LEFT.
     * Other values are reserved.
     */
    public Bidi(char[] text, int textStart, byte[] embeddings, int embStart, int paragraphLength, int flags) {
        if (text == null) {
            throw new IllegalArgumentException("text is null");
        }
        if (paragraphLength < 0) {
            throw new IllegalArgumentException("bad length: " + paragraphLength);
        }
        if (textStart < 0 || paragraphLength > text.length - textStart) {
            throw new IllegalArgumentException("bad range: " + textStart +
                                               " length: " + paragraphLength +
                                               " for text of length: " + text.length);
        }
        if (embeddings != null && (embStart < 0 || paragraphLength > embeddings.length - embStart)) {
            throw new IllegalArgumentException("bad range: " + embStart +
                                               " length: " + paragraphLength +
                                               " for embeddings of length: " + text.length);
        }

        // Android-changed: use ICU Bidi class instead of BidiBase.
        bidiBase = new android.icu.text.Bidi(text, textStart, embeddings, embStart,
                                             paragraphLength, translateConstToIcu(flags));
    }

    // Android-added: private constructor based on ICU Bidi object.
    private Bidi(android.icu.text.Bidi bidiBase) {
        this.bidiBase = bidiBase;
    }

    /**
     * Create a Bidi object representing the bidi information on a line of text within
     * the paragraph represented by the current Bidi.  This call is not required if the
     * entire paragraph fits on one line.
     *
     * @param lineStart the offset from the start of the paragraph to the start of the line.
     * @param lineLimit the offset from the start of the paragraph to the limit of the line.
     * @return a {@code Bidi} object
     */
    public Bidi createLineBidi(int lineStart, int lineLimit) {
        // BEGIN Android-changed: add explict argument checks and use ICU Bidi class.
        if (lineStart < 0 || lineLimit < 0 || lineStart > lineLimit || lineLimit > getLength()) {
            throw new IllegalArgumentException("Invalid ranges (start=" + lineStart + ", " +
                                               "limit=" + lineLimit + ", length=" + getLength() + ")");
        }

        // In the special case where the start and end positions are the same, we return a new bidi
        // instance which is empty. Note that the default constructor for an empty ICU4J bidi
        // instance is not the same as passing in empty values. This way allows one to call
        // .getLength() for example and return a correct value instead of an IllegalStateException
        // being thrown, which happens in the case of using the empty constructor.
        if (lineStart == lineLimit) {
            return new Bidi(new android.icu.text.Bidi(new char[] {}, 0, new byte[] {}, 0, 0,
                                                      translateConstToIcu(DIRECTION_LEFT_TO_RIGHT)));
         }

        return new Bidi(bidiBase.createLineBidi(lineStart, lineLimit));
        // END Android-changed: add explict argument checks and use ICU Bidi class.
    }

    /**
     * Return true if the line is not left-to-right or right-to-left.  This means it either has mixed runs of left-to-right
     * and right-to-left text, or the base direction differs from the direction of the only run of text.
     *
     * @return true if the line is not left-to-right or right-to-left.
     */
    public boolean isMixed() {
        return bidiBase.isMixed();
    }

    /**
     * Return true if the line is all left-to-right text and the base direction is left-to-right.
     *
     * @return true if the line is all left-to-right text and the base direction is left-to-right
     */
    public boolean isLeftToRight() {
        return bidiBase.isLeftToRight();
    }

    /**
     * Return true if the line is all right-to-left text, and the base direction is right-to-left.
     * @return true if the line is all right-to-left text, and the base direction is right-to-left
     */
    public boolean isRightToLeft() {
        return bidiBase.isRightToLeft();
    }

    /**
     * Return the length of text in the line.
     * @return the length of text in the line
     */
    public int getLength() {
        return bidiBase.getLength();
    }

    /**
     * Return true if the base direction is left-to-right.
     * @return true if the base direction is left-to-right
     */
    public boolean baseIsLeftToRight() {
        return bidiBase.baseIsLeftToRight();
    }

    /**
     * Return the base level (0 if left-to-right, 1 if right-to-left).
     * @return the base level
     */
    public int getBaseLevel() {
        return bidiBase.getParaLevel();
    }

    /**
     * Return the resolved level of the character at offset.  If offset is
     * {@literal <} 0 or &ge; the length of the line, return the base direction
     * level.
     *
     * @param offset the index of the character for which to return the level
     * @return the resolved level of the character at offset
     */
    public int getLevelAt(int offset) {
        // BEGIN Android-changed: return base level on out of range offset argument.
        try {
            return bidiBase.getLevelAt(offset);
        } catch (IllegalArgumentException e) {
            return getBaseLevel();
        }
        // END Android-changed: return base level on out of range offset argument.
    }

    /**
     * Return the number of level runs.
     * @return the number of level runs
     */
    public int getRunCount() {
        // Android-changed: ICU treats the empty string as having 0 runs, we see it as 1 empty run.
        int runCount = bidiBase.countRuns();
        return (runCount == 0 ? 1 : runCount);
    }

    /**
     * Return the level of the nth logical run in this line.
     * @param run the index of the run, between 0 and <code>getRunCount()</code>
     * @return the level of the run
     */
    public int getRunLevel(int run) {
        // Android-added: Tolerate calls with run == getRunCount() for backwards compatibility.
        if (run == getRunCount()) {
            return getBaseLevel();
        }
        // Android-changed: ICU treats the empty string as having 0 runs, we see it as 1 empty run.
        return (bidiBase.countRuns() == 0 ? bidiBase.getBaseLevel() : bidiBase.getRunLevel(run));
    }

    /**
     * Return the index of the character at the start of the nth logical run in this line, as
     * an offset from the start of the line.
     * @param run the index of the run, between 0 and <code>getRunCount()</code>
     * @return the start of the run
     */
    public int getRunStart(int run) {
        // Android-added: Tolerate calls with run == getRunCount() for backwards compatibility.
        if (run == getRunCount()) {
            return getBaseLevel();
        }
        // Android-changed: ICU treats the empty string as having 0 runs, we see it as 1 empty run.
        return (bidiBase.countRuns() == 0 ? 0 : bidiBase.getRunStart(run));
    }

    /**
     * Return the index of the character past the end of the nth logical run in this line, as
     * an offset from the start of the line.  For example, this will return the length
     * of the line for the last run on the line.
     * @param run the index of the run, between 0 and <code>getRunCount()</code>
     * @return limit the limit of the run
     */
    public int getRunLimit(int run) {
        // Android-added: Tolerate calls with run == getRunCount() for backwards compatibility.
        if (run == getRunCount()) {
            return getBaseLevel();
        }
        // Android-changed: ICU treats the empty string as having 0 runs, we see it as 1 empty run.
        return (bidiBase.countRuns() == 0 ? bidiBase.getLength() : bidiBase.getRunLimit(run));
    }

    /**
     * Return true if the specified text requires bidi analysis.  If this returns false,
     * the text will display left-to-right.  Clients can then avoid constructing a Bidi object.
     * Text in the Arabic Presentation Forms area of Unicode is presumed to already be shaped
     * and ordered for display, and so will not cause this function to return true.
     *
     * @param text the text containing the characters to test
     * @param start the start of the range of characters to test
     * @param limit the limit of the range of characters to test
     * @return true if the range of characters requires bidi analysis
     */
    public static boolean requiresBidi(char[] text, int start, int limit) {
        // Android-added: Check arguments to throw correct exception.
        if (0 > start || start > limit || limit > text.length) {
            throw new IllegalArgumentException("Value start " + start +
                                               " is out of range 0 to " + limit);
        }
        return android.icu.text.Bidi.requiresBidi(text, start, limit);
    }

    /**
     * Reorder the objects in the array into visual order based on their levels.
     * This is a utility function to use when you have a collection of objects
     * representing runs of text in logical order, each run containing text
     * at a single level.  The elements at <code>index</code> from
     * <code>objectStart</code> up to <code>objectStart + count</code>
     * in the objects array will be reordered into visual order assuming
     * each run of text has the level indicated by the corresponding element
     * in the levels array (at <code>index - objectStart + levelStart</code>).
     *
     * @param levels an array representing the bidi level of each object
     * @param levelStart the start position in the levels array
     * @param objects the array of objects to be reordered into visual order
     * @param objectStart the start position in the objects array
     * @param count the number of objects to reorder
     */
    public static void reorderVisually(byte[] levels, int levelStart, Object[] objects, int objectStart, int count) {
        // BEGIN Android-added: Check arguments to throw correct exception.
        if (0 > levelStart || levels.length <= levelStart) {
            throw new IllegalArgumentException("Value levelStart " +
                      levelStart + " is out of range 0 to " +
                      (levels.length-1));
        }
        if (0 > objectStart || objects.length <= objectStart) {
            throw new IllegalArgumentException("Value objectStart " +
                      levelStart + " is out of range 0 to " +
                      (objects.length-1));
        }
        if (0 > count || objects.length < (objectStart+count)) {
            throw new IllegalArgumentException("Value count " +
                      levelStart + " is out of range 0 to " +
                      (objects.length - objectStart));
        }
        // END Android-added: Check arguments to throw correct exception.

        // Android-changed: use ICU Bidi class instead of BidiBase.
        android.icu.text.Bidi.reorderVisually(levels, levelStart, objects, objectStart, count);
    }

    /**
     * Display the bidi internal state, used in debugging.
     */
    public String toString() {
        // Android-changed: construct String representation from ICU Bidi object values.
        return getClass().getName()
            + "[direction: " + bidiBase.getDirection() + " baseLevel: " + bidiBase.getBaseLevel()
            + " length: " + bidiBase.getLength() + " runs: " + bidiBase.getRunCount() + "]";
    }

}
