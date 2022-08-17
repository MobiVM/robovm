/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2017 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html
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

    private static final IgnorablesMatcher DEFAULT = new IgnorablesMatcher(
            StaticUnicodeSets.get(StaticUnicodeSets.Key.DEFAULT_IGNORABLES));

    private static final IgnorablesMatcher STRICT = new IgnorablesMatcher(
            StaticUnicodeSets.get(StaticUnicodeSets.Key.STRICT_IGNORABLES));

    private static final IgnorablesMatcher JAVA_COMPATIBILITY = new IgnorablesMatcher(
            StaticUnicodeSets.get(StaticUnicodeSets.Key.EMPTY));

    public static IgnorablesMatcher getInstance(int parseFlags) {
        if (0 != (parseFlags & ParsingUtils.PARSE_FLAG_JAVA_COMPATIBILITY_IGNORABLES)) {
            return JAVA_COMPATIBILITY;
        } else if (0 != (parseFlags & ParsingUtils.PARSE_FLAG_STRICT_IGNORABLES)) {
            return STRICT;
        } else {
            return DEFAULT;
        }
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
