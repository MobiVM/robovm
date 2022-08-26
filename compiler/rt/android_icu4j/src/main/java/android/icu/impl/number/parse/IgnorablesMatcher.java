/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2017 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
package android.icu.impl.number.parse;

import android.icu.impl.StaticUnicodeSets;
import android.icu.impl.StringSegment;
import android.icu.text.UnicodeSet;

/**
 * @author sffc
 * @hide Only a subset of ICU is exposed in Android
 *
 */
public class IgnorablesMatcher extends SymbolMatcher implements NumberParseMatcher.Flexible {

    public static final IgnorablesMatcher DEFAULT = new IgnorablesMatcher(
            StaticUnicodeSets.get(StaticUnicodeSets.Key.DEFAULT_IGNORABLES));

    public static final IgnorablesMatcher STRICT = new IgnorablesMatcher(
            StaticUnicodeSets.get(StaticUnicodeSets.Key.STRICT_IGNORABLES));

    public static IgnorablesMatcher getInstance(UnicodeSet ignorables) {
        assert ignorables.isFrozen();
        return new IgnorablesMatcher(ignorables);
    }

    private IgnorablesMatcher(UnicodeSet ignorables) {
        super("", ignorables);
    }

    @Override
    protected boolean isDisabled(ParsedNumber result) {
        return false;
    }

    @Override
    protected void accept(StringSegment segment, ParsedNumber result) {
        // No-op
    }

    @Override
    public String toString() {
        return "<IgnorablesMatcher>";
    }
}
