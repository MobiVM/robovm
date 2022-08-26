/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2017 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
package android.icu.impl.number.parse;

import static android.icu.impl.number.parse.ParsingUtils.safeContains;

import android.icu.impl.StaticUnicodeSets;
import android.icu.impl.StringSegment;
import android.icu.text.DecimalFormatSymbols;

/**
 * @author sffc
 * @hide Only a subset of ICU is exposed in Android
 *
 */
public class InfinityMatcher extends SymbolMatcher {

    private static final InfinityMatcher DEFAULT = new InfinityMatcher();

    public static InfinityMatcher getInstance(DecimalFormatSymbols symbols) {
        String symbolString = symbols.getInfinity();
        if (safeContains(DEFAULT.uniSet, symbolString)) {
            return DEFAULT;
        } else {
            return new InfinityMatcher(symbolString);
        }
    }

    private InfinityMatcher(String symbolString) {
        super(symbolString, DEFAULT.uniSet);
    }

    private InfinityMatcher() {
        super(StaticUnicodeSets.Key.INFINITY);
    }

    @Override
    protected boolean isDisabled(ParsedNumber result) {
        return 0 != (result.flags & ParsedNumber.FLAG_INFINITY);
    }

    @Override
    protected void accept(StringSegment segment, ParsedNumber result) {
        result.flags |= ParsedNumber.FLAG_INFINITY;
        result.setCharsConsumed(segment);
    }

    @Override
    public String toString() {
        return "<InfinityMatcher>";
    }
}
