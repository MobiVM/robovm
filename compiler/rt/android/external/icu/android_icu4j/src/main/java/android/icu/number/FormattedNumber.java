/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2017 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html
package android.icu.number;

import java.math.BigDecimal;
import java.text.AttributedCharacterIterator;

import android.icu.impl.FormattedStringBuilder;
import android.icu.impl.FormattedValueStringBuilderImpl;
import android.icu.impl.Utility;
import android.icu.impl.number.DecimalQuantity;
import android.icu.text.ConstrainedFieldPosition;
import android.icu.text.FormattedValue;
import android.icu.text.PluralRules.IFixedDecimal;
import android.icu.util.MeasureUnit;

/**
 * The result of a number formatting operation. This class allows the result to be exported in several
 * data types, including a String, an AttributedCharacterIterator, and a BigDecimal.
 *
 * Instances of this class are immutable and thread-safe.
 *
 * @see NumberFormatter
 */
public class FormattedNumber implements FormattedValue {
    final FormattedStringBuilder string;
    final DecimalQuantity fq;
    final MeasureUnit outputUnit;

    FormattedNumber(FormattedStringBuilder nsb, DecimalQuantity fq, MeasureUnit outputUnit) {
        this.string = nsb;
        this.fq = fq;
        this.outputUnit = outputUnit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return string.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int length() {
        return string.length();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public char charAt(int index) {
        return string.charAt(index);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharSequence subSequence(int start, int end) {
        return string.subString(start, end);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <A extends Appendable> A appendTo(A appendable) {
        return Utility.appendTo(string, appendable);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean nextPosition(ConstrainedFieldPosition cfpos) {
        return FormattedValueStringBuilderImpl.nextPosition(string, cfpos, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributedCharacterIterator toCharacterIterator() {
        return FormattedValueStringBuilderImpl.toCharacterIterator(string, null);
    }

    /**
     * Export the formatted number as a BigDecimal. This endpoint is useful for obtaining the exact
     * number being printed after scaling and rounding have been applied by the number formatting
     * pipeline.
     *
     * @return A BigDecimal representation of the formatted number.
     * @see NumberFormatter
     */
    public BigDecimal toBigDecimal() {
        return fq.toBigDecimal();
    }

    /**
     * Gets the resolved output unit.
     * <p>
     * The output unit is dependent upon the localized preferences for the usage
     * specified via NumberFormatterSettings.usage(), and may be a unit with
     * MeasureUnit.Complexity.MIXED unit complexity (MeasureUnit.getComplexity()), such
     * as "foot-and-inch" or "hour-and-minute-and-second".
     *
     * @return `MeasureUnit`.
     * @hide draft / provisional / internal are hidden on Android
     */
    public MeasureUnit getOutputUnit() {
        return this.outputUnit;
    }

    /**
     * @deprecated This API is ICU internal only.
     * @hide draft / provisional / internal are hidden on Android
     */
    @Deprecated
    public IFixedDecimal getFixedDecimal() {
        return fq;
    }
}
