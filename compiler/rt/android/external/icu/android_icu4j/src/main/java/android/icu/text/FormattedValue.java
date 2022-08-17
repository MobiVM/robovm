/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2018 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html
package android.icu.text;

import java.text.AttributedCharacterIterator;

import android.icu.util.ICUUncheckedIOException;

/**
 * An abstract formatted value: a string with associated field attributes.
 * Many formatters format to classes implementing FormattedValue.
 *
 * @author sffc
 */
public interface FormattedValue extends CharSequence {
    /**
     * Returns the formatted string as a Java String.
     *
     * Consider using {@link #appendTo} for greater efficiency.
     *
     * @return The formatted string.
     */
    @Override
    public String toString();

    /**
     * Appends the formatted string to an Appendable.
     * <p>
     * If an IOException occurs when appending to the Appendable, an unchecked
     * {@link ICUUncheckedIOException} is thrown instead.
     *
     * @param appendable The Appendable to which to append the string output.
     * @return The same Appendable, for chaining.
     * @throws ICUUncheckedIOException if the Appendable throws IOException
     */
    public <A extends Appendable> A appendTo(A appendable);

    /**
     * Iterates over field positions in the FormattedValue. This lets you determine the position
     * of specific types of substrings, like a month or a decimal separator.
     *
     * To loop over all field positions:
     *
     * <pre>
     *     ConstrainableFieldPosition cfpos = new ConstrainableFieldPosition();
     *     while (fmtval.nextPosition(cfpos)) {
     *         // handle the field position; get information from cfpos
     *     }
     * </pre>
     *
     * @param cfpos
     *         The object used for iteration state. This can provide constraints to iterate over
     *         only one specific field; see {@link ConstrainedFieldPosition#constrainField}.
     * @return true if a new occurrence of the field was found;
     *         false otherwise.
     */
    public boolean nextPosition(ConstrainedFieldPosition cfpos);

    /**
     * Exports the formatted number as an AttributedCharacterIterator.
     * <p>
     * Consider using {@link #nextPosition} if you are trying to get field information.
     *
     * @return An AttributedCharacterIterator containing full field information.
     */
    public AttributedCharacterIterator toCharacterIterator();
}
