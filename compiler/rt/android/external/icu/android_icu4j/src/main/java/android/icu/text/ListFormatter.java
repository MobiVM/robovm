/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html
/*
 *******************************************************************************
 * Copyright (C) 2012-2016, Google, International Business Machines Corporation and
 * others. All Rights Reserved.
 *******************************************************************************
 */
package android.icu.text;

import java.io.InvalidObjectException;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

import android.icu.impl.FormattedStringBuilder;
import android.icu.impl.FormattedValueStringBuilderImpl;
import android.icu.impl.FormattedValueStringBuilderImpl.SpanFieldPlaceholder;
import android.icu.impl.ICUCache;
import android.icu.impl.ICUData;
import android.icu.impl.ICUResourceBundle;
import android.icu.impl.SimpleCache;
import android.icu.impl.SimpleFormatterImpl;
import android.icu.impl.SimpleFormatterImpl.IterInternal;
import android.icu.impl.Utility;
import android.icu.util.ULocale;
import android.icu.util.UResourceBundle;

/**
 * Immutable class for formatting a list, using data from CLDR (or supplied
 * separately). The class is not subclassable.
 *
 * @author Mark Davis
 */
final public class ListFormatter {
    // Compiled SimpleFormatter patterns.
    private final String start;
    private final String middle;
    private final ULocale locale;

    private interface PatternHandler {
        public String getTwoPattern(String text);
        public String getEndPattern(String text);
    }
    private final PatternHandler patternHandler;

    /**
     * Indicates the style of Listformatter
     * TODO(ICU-20888): Remove this in ICU 68.
     * @deprecated This API is ICU internal only.
     * @hide Only a subset of ICU is exposed in Android
     * @hide draft / provisional / internal are hidden on Android
     */
    @Deprecated
    public enum Style {
        /**
         * Standard, conjunction style.
         * @deprecated This API is ICU internal only.
         * @hide draft / provisional / internal are hidden on Android
         */
        @Deprecated
        STANDARD("standard"),
        /**
         * Disjunction style.
         * @deprecated This API is ICU internal only.
         * @hide draft / provisional / internal are hidden on Android
         */
        @Deprecated
        OR("or"),
        /**
         * Style for full units
         * @deprecated This API is ICU internal only.
         * @hide draft / provisional / internal are hidden on Android
         */
        @Deprecated
        UNIT("unit"),
        /**
         * Style for units in abbrevated form
         * @deprecated This API is ICU internal only.
         * @hide draft / provisional / internal are hidden on Android
         */
        @Deprecated
        UNIT_SHORT("unit-short"),
        /**
         * Style for units in narrow form
         * @deprecated This API is ICU internal only.
         * @hide draft / provisional / internal are hidden on Android
         */
        @Deprecated
        UNIT_NARROW("unit-narrow");

        private final String name;

        Style(String name) {
            this.name = name;
        }
        /**
         * @deprecated This API is ICU internal only.
         * @hide draft / provisional / internal are hidden on Android
         */
        @Deprecated
        public String getName() {
            return name;
        }

    }

    /**
     * Type of meaning expressed by the list.
     *
     * @hide Only a subset of ICU is exposed in Android
     * @hide draft / provisional / internal are hidden on Android
     */
    public enum Type {
        /**
         * Conjunction formatting, e.g. "Alice, Bob, Charlie, and Delta".
         *
         * @hide draft / provisional / internal are hidden on Android
         */
        AND,

        /**
         * Disjunction (or alternative, or simply one of) formatting, e.g.
         * "Alice, Bob, Charlie, or Delta".
         *
         * @hide draft / provisional / internal are hidden on Android
         */
        OR,

        /**
         * Formatting of a list of values with units, e.g. "5 pounds, 12 ounces".
         *
         * @hide draft / provisional / internal are hidden on Android
         */
        UNITS
    };

    /**
     * Verbosity level of the list patterns.
     *
     * @hide Only a subset of ICU is exposed in Android
     * @hide draft / provisional / internal are hidden on Android
     */
    public enum Width {
        /**
         * Use list formatting with full words (no abbreviations) when possible.
         *
         * @hide draft / provisional / internal are hidden on Android
         */
        WIDE,

        /**
         * Use list formatting of typical length.
         *
         * @hide draft / provisional / internal are hidden on Android
         */
        SHORT,

        /**
         * Use list formatting of the shortest possible length.
         *
         * @hide draft / provisional / internal are hidden on Android
         */
        NARROW,
    };

    /**
     * Class for span fields in FormattedList.
     *
     * @hide Only a subset of ICU is exposed in Android
     * @hide draft / provisional / internal are hidden on Android
     */
    public static final class SpanField extends UFormat.SpanField {
        private static final long serialVersionUID = 3563544214705634403L;

        /**
         * The concrete field used for spans in FormattedList.
         *
         * Instances of LIST_SPAN should have an associated value, the index
         * within the input list that is represented by the span.
         *
         * @hide draft / provisional / internal are hidden on Android
         */
        public static final SpanField LIST_SPAN = new SpanField("list-span");

        private SpanField(String name) {
            super(name);
        }

        /**
         * serialization method resolve instances to the constant
         * ListFormatter.SpanField values
         * @deprecated This API is ICU internal only.
         * @hide draft / provisional / internal are hidden on Android
         */
        @Deprecated
        @Override
        protected Object readResolve() throws InvalidObjectException {
            if (this.getName().equals(LIST_SPAN.getName()))
                return LIST_SPAN;

            throw new InvalidObjectException("An invalid object.");
        }
    }

    /**
     * Field selectors for format fields defined by ListFormatter.
     * @hide Only a subset of ICU is exposed in Android
     * @hide draft / provisional / internal are hidden on Android
     */
    public static final class Field extends Format.Field {
        private static final long serialVersionUID = -8071145668708265437L;

        /**
         * The literal text in the result which came from the resources.
         * @hide draft / provisional / internal are hidden on Android
         */
        public static Field LITERAL = new Field("literal");

        /**
         * The element text in the result which came from the input strings.
         * @hide draft / provisional / internal are hidden on Android
         */
        public static Field ELEMENT = new Field("element");

        private Field(String name) {
            super(name);
        }

        /**
         * Serizalization method resolve instances to the constant Field values
         *
         * @hide draft / provisional / internal are hidden on Android
         */
        @Override
        protected Object readResolve() throws InvalidObjectException {
            if (this.getName().equals(LITERAL.getName()))
                return LITERAL;
            if (this.getName().equals(ELEMENT.getName()))
                return ELEMENT;

            throw new InvalidObjectException("An invalid object.");
        }
    }

    /**
     * An immutable class containing the result of a list formatting operation.
     *
     * Instances of this class are immutable and thread-safe.
     *
     * Not intended for public subclassing.
     *
     * @hide Only a subset of ICU is exposed in Android
     * @hide draft / provisional / internal are hidden on Android
     */
    public static final class FormattedList implements FormattedValue {
        private final FormattedStringBuilder string;

        FormattedList(FormattedStringBuilder string) {
            this.string = string;
        }

        /**
         * {@inheritDoc}
         * @hide draft / provisional / internal are hidden on Android
         */
        @Override
        public String toString() {
            return string.toString();
        }

        /**
         * {@inheritDoc}
         * @hide draft / provisional / internal are hidden on Android
         */
        @Override
        public int length() {
            return string.length();
        }

        /**
         * {@inheritDoc}
         * @hide draft / provisional / internal are hidden on Android
         */
        @Override
        public char charAt(int index) {
            return string.charAt(index);
        }

        /**
         * {@inheritDoc}
         * @hide draft / provisional / internal are hidden on Android
         */
        @Override
        public CharSequence subSequence(int start, int end) {
            return string.subString(start, end);
        }

        /**
         * {@inheritDoc}
         * @hide draft / provisional / internal are hidden on Android
         */
        @Override
        public <A extends Appendable> A appendTo(A appendable) {
            return Utility.appendTo(string, appendable);
        }

        /**
         * {@inheritDoc}
         * @hide draft / provisional / internal are hidden on Android
         */
        @Override
        public boolean nextPosition(ConstrainedFieldPosition cfpos) {
            return FormattedValueStringBuilderImpl.nextPosition(string, cfpos, null);
        }

        /**
         * {@inheritDoc}
         * @hide draft / provisional / internal are hidden on Android
         */
        @Override
        public AttributedCharacterIterator toCharacterIterator() {
            return FormattedValueStringBuilderImpl.toCharacterIterator(string, null);
        }
    }

    /**
     * <b>Internal:</b> Create a ListFormatter from component strings,
     * with definitions as in LDML.
     *
     * @param two
     *            string for two items, containing {0} for the first, and {1}
     *            for the second.
     * @param start
     *            string for the start of a list items, containing {0} for the
     *            first, and {1} for the rest.
     * @param middle
     *            string for the start of a list items, containing {0} for the
     *            first part of the list, and {1} for the rest of the list.
     * @param end
     *            string for the end of a list items, containing {0} for the
     *            first part of the list, and {1} for the last item.
     * @deprecated This API is ICU internal only.
     * @hide draft / provisional / internal are hidden on Android
     */
    @Deprecated
    public ListFormatter(String two, String start, String middle, String end) {
        this(
                compilePattern(two, new StringBuilder()),
                compilePattern(start, new StringBuilder()),
                compilePattern(middle, new StringBuilder()),
                compilePattern(end, new StringBuilder()),
                null);
    }

    private ListFormatter(String two, String start, String middle, String end, ULocale locale) {
        this.start = start;
        this.middle = middle;
        this.locale = locale;
        this.patternHandler = createPatternHandler(two, end);
    }

    private static String compilePattern(String pattern, StringBuilder sb) {
        return SimpleFormatterImpl.compileToStringMinMaxArguments(pattern, sb, 2, 2);
    }

    /**
     * Create a list formatter that is appropriate for a locale.
     *
     * @param locale
     *            the locale in question.
     * @return ListFormatter
     * @hide draft / provisional / internal are hidden on Android
     */
    public static ListFormatter getInstance(ULocale locale, Type type, Width width) {
        String styleName = typeWidthToStyleString(type, width);
        if (styleName == null) {
            throw new IllegalArgumentException("Invalid list format type/width");
        }
        return cache.get(locale, styleName);
    }

    /**
     * Create a list formatter that is appropriate for a locale.
     *
     * @param locale
     *            the locale in question.
     * @return ListFormatter
     * @hide draft / provisional / internal are hidden on Android
     */
    public static ListFormatter getInstance(Locale locale, Type type, Width width) {
        return getInstance(ULocale.forLocale(locale), type, width);
    }

    /**
     * Create a list formatter that is appropriate for a locale and style.
     *
     * @param locale the locale in question.
     * @param style the style
     * @return ListFormatter
     * @deprecated This API is ICU internal only.
     * @hide draft / provisional / internal are hidden on Android
     */
    @Deprecated
    public static ListFormatter getInstance(ULocale locale, Style style) {
        return cache.get(locale, style.getName());
    }

    /**
     * Create a list formatter that is appropriate for a locale.
     *
     * @param locale
     *            the locale in question.
     * @return ListFormatter
     */
    public static ListFormatter getInstance(ULocale locale) {
      return getInstance(locale, Style.STANDARD);
    }

    /**
     * Create a list formatter that is appropriate for a locale.
     *
     * @param locale
     *            the locale in question.
     * @return ListFormatter
     */
    public static ListFormatter getInstance(Locale locale) {
        return getInstance(ULocale.forLocale(locale), Style.STANDARD);
    }

    /**
     * Create a list formatter that is appropriate for the default FORMAT locale.
     *
     * @return ListFormatter
     */
    public static ListFormatter getInstance() {
        return getInstance(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    /**
     * Format a list of objects.
     *
     * @param items
     *            items to format. The toString() method is called on each.
     * @return items formatted into a string
     */
    public String format(Object... items) {
        return format(Arrays.asList(items));
    }

    /**
     * Format a collection of objects. The toString() method is called on each.
     *
     * @param items
     *            items to format. The toString() method is called on each.
     * @return items formatted into a string
     */
    public String format(Collection<?> items) {
        return formatImpl(items, false).toString();
    }

    /**
     * Format a list of objects to a FormattedList. You can access the offsets
     * of each element from the FormattedList.
     *
     * @param items
     *            items to format. The toString() method is called on each.
     * @return items formatted into a FormattedList
     * @hide draft / provisional / internal are hidden on Android
     */
    public FormattedList formatToValue(Object... items) {
        return formatToValue(Arrays.asList(items));
    }


    /**
     * Format a collection of objects to a FormattedList. You can access the offsets
     * of each element from the FormattedList.
     *
     * @param items
     *            items to format. The toString() method is called on each.
     * @return items formatted into a FormattedList
     * @hide draft / provisional / internal are hidden on Android
     */
    public FormattedList formatToValue(Collection<?> items) {
        return formatImpl(items, true).toValue();
    }

    // Formats a collection of objects and returns the formatted string plus the offset
    // in the string where the index th element appears. index is zero based. If index is
    // negative or greater than or equal to the size of items then this function returns -1 for
    // the offset.
    FormattedListBuilder formatImpl(Collection<?> items, boolean needsFields) {
        Iterator<?> it = items.iterator();
        int count = items.size();
        switch (count) {
        case 0:
            return new FormattedListBuilder("", needsFields);
        case 1:
            return new FormattedListBuilder(it.next(), needsFields);
        case 2:
            Object first = it.next();
            Object second = it.next();
            return new FormattedListBuilder(first, needsFields)
                .append(patternHandler.getTwoPattern(String.valueOf(second)), second, 1);
        }
        FormattedListBuilder builder = new FormattedListBuilder(it.next(), needsFields);
        builder.append(start, it.next(), 1);
        for (int idx = 2; idx < count - 1; ++idx) {
            builder.append(middle, it.next(), idx);
        }
        Object last = it.next();
        return builder.append(patternHandler.getEndPattern(String.valueOf(last)), last, count - 1);
    }

    // A static handler just returns the pattern without considering the input text.
    private static final class StaticHandler implements PatternHandler {
        StaticHandler(String two, String end) {
            twoPattern = two;
            endPattern = end;
        }

        @Override
        public String getTwoPattern(String text) { return twoPattern; }

        @Override
        public String getEndPattern(String text) { return endPattern; }

        private final String twoPattern;
        private final String endPattern;
    }

    // A contextual handler returns one of the two patterns depending on whether the text matched the regexp.
    private static final class ContextualHandler implements PatternHandler {
        ContextualHandler(Pattern regexp, String thenTwo, String elseTwo, String thenEnd, String elseEnd) {
            this.regexp = regexp;
            thenTwoPattern = thenTwo;
            elseTwoPattern = elseTwo;
            thenEndPattern = thenEnd;
            elseEndPattern = elseEnd;
        }

        @Override
        public String getTwoPattern(String text) {
            if(regexp.matcher(text).matches()) {
                return thenTwoPattern;
            } else {
                return elseTwoPattern;
            }
        }

        @Override
        public String getEndPattern(String text) {
            if(regexp.matcher(text).matches()) {
                return thenEndPattern;
            } else {
                return elseEndPattern;
            }
        }

        private final Pattern regexp;
        private final String thenTwoPattern;
        private final String elseTwoPattern;
        private final String thenEndPattern;
        private final String elseEndPattern;

    }

    // Pattern in the ICU Data which might be replaced y by e.
    private static final String compiledY = compilePattern("{0} y {1}", new StringBuilder());

    // The new pattern to replace y to e
    private static final String compiledE = compilePattern("{0} e {1}", new StringBuilder());

    // Pattern in the ICU Data which might be replaced o by u.
    private static final String compiledO = compilePattern("{0} o {1}", new StringBuilder());

    // The new pattern to replace u to o
    private static final String compiledU = compilePattern("{0} u {1}", new StringBuilder());

    // Condition to change to e.
    // Starts with "hi" or "i" but not with "hie" nor "hia"a
    private static final Pattern changeToE = Pattern.compile("(i.*|hi|hi[^ae].*)", Pattern.CASE_INSENSITIVE);

    // Condition to change to u.
    // Starts with "o", "ho", and "8". Also "11" by itself.
    private static final Pattern changeToU = Pattern.compile("((o|ho|8).*|11)", Pattern.CASE_INSENSITIVE);

    // Pattern in the ICU Data which might need to add a DASH after VAV.
    private static final String compiledVav = compilePattern("{0} \u05D5{1}", new StringBuilder());

    // Pattern to add a DASH after VAV.
    private static final String compiledVavDash = compilePattern("{0} \u05D5-{1}", new StringBuilder());

    // Condition to change to VAV follow by a dash.
    // Starts with non Hebrew letter.
    private static final Pattern changeToVavDash = Pattern.compile("^[\\P{InHebrew}].*$");

    // A factory function to create function based on locale
    // Handle specal case of Spanish and Hebrew
    private PatternHandler createPatternHandler(String two, String end) {
        if (this.locale != null) {
            String language = this.locale.getLanguage();
            if (language.equals("es")) {
                boolean twoIsY = two.equals(compiledY);
                boolean endIsY = end.equals(compiledY);
                if (twoIsY || endIsY) {
                    return new ContextualHandler(
                        changeToE, twoIsY ? compiledE : two, two, endIsY ? compiledE : end, end);
                }
                boolean twoIsO = two.equals(compiledO);
                boolean endIsO = end.equals(compiledO);
                if (twoIsO || endIsO) {
                    return new ContextualHandler(
                        changeToU, twoIsO ? compiledU : two, two, endIsO ? compiledU : end, end);
                }
            } else if (language.equals("he") || language.equals("iw")) {
                boolean twoIsVav = two.equals(compiledVav);
                boolean endIsVav = end.equals(compiledVav);
                if (twoIsVav || endIsVav) {
                    return new ContextualHandler(changeToVavDash,
                        twoIsVav ? compiledVavDash : two, two, endIsVav ? compiledVavDash : end, end);
                }
            }
        }
        return new StaticHandler(two, end);
    }

    /**
     * Returns the pattern to use for a particular item count.
     * @param count the item count.
     * @return the pattern with {0}, {1}, {2}, etc. For English,
     * getPatternForNumItems(3) == "{0}, {1}, and {2}"
     * @throws IllegalArgumentException when count is 0 or negative.
     */
    public String getPatternForNumItems(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("count must be > 0");
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(String.format("{%d}", i));
        }
        return format(list);
    }

    /**
     * Returns the locale of this object.
     * @deprecated This API is ICU internal only.
     * @hide draft / provisional / internal are hidden on Android
     */
    @Deprecated
    public ULocale getLocale() {
        return locale;
    }

    // Builds a formatted list
    static class FormattedListBuilder {
        private FormattedStringBuilder string;
        boolean needsFields;

        // Start is the first object in the list; If needsFields is true, enable the slightly
        // more expensive code path that records offsets of each element.
        public FormattedListBuilder(Object start, boolean needsFields) {
            string = new FormattedStringBuilder();
            this.needsFields = needsFields;
            string.setAppendableField(Field.LITERAL);
            appendElement(start, 0);
        }

        // Appends additional object. pattern is a template indicating where the new object gets
        // added in relation to the rest of the list. {0} represents the rest of the list; {1}
        // represents the new object in pattern. next is the object to be added. position is the
        // index of the next object in the list of inputs.
        public FormattedListBuilder append(String compiledPattern, Object next, int position) {
            assert SimpleFormatterImpl.getArgumentLimit(compiledPattern) == 2;
            string.setAppendIndex(0);
            long state = 0;
            while (true) {
                state = IterInternal.step(state, compiledPattern, string);
                if (state == IterInternal.DONE) {
                    break;
                }
                int argIndex = IterInternal.getArgIndex(state);
                if (argIndex == 0) {
                    string.setAppendIndex(string.length());
                } else {
                    appendElement(next, position);
                }
            }
            return this;
        }

        private void appendElement(Object element, int position) {
            if (needsFields) {
                SpanFieldPlaceholder field = new SpanFieldPlaceholder();
                field.spanField = SpanField.LIST_SPAN;
                field.normalField = Field.ELEMENT;
                field.value = position;
                string.append(element.toString(), field);
            } else {
                string.append(element.toString(), null);
            }
        }

        public void appendTo(Appendable appendable) {
            Utility.appendTo(string, appendable);
        }

        public int getOffset(int fieldPositionFoundIndex) {
            return FormattedValueStringBuilderImpl.findSpan(string, fieldPositionFoundIndex);
        }

        @Override
        public String toString() {
            return string.toString();
        }

        public FormattedList toValue() {
            return new FormattedList(string);
        }
    }

    private static class Cache {
        private final ICUCache<String, ListFormatter> cache =
            new SimpleCache<>();

        public ListFormatter get(ULocale locale, String style) {
            String key = String.format("%s:%s", locale.toString(), style);
            ListFormatter result = cache.get(key);
            if (result == null) {
                result = load(locale, style);
                cache.put(key, result);
            }
            return result;
        }

        private static ListFormatter load(ULocale ulocale, String style) {
            ICUResourceBundle r = (ICUResourceBundle)UResourceBundle.
                    getBundleInstance(ICUData.ICU_BASE_NAME, ulocale);
            StringBuilder sb = new StringBuilder();
            return new ListFormatter(
                compilePattern(r.getWithFallback("listPattern/" + style + "/2").getString(), sb),
                compilePattern(r.getWithFallback("listPattern/" + style + "/start").getString(), sb),
                compilePattern(r.getWithFallback("listPattern/" + style + "/middle").getString(), sb),
                compilePattern(r.getWithFallback("listPattern/" + style + "/end").getString(), sb),
                ulocale);
        }
    }

    static Cache cache = new Cache();

    static String typeWidthToStyleString(Type type, Width width) {
        switch (type) {
            case AND:
                switch (width) {
                    case WIDE:
                        return "standard";
                    case SHORT:
                        return "standard-short";
                    case NARROW:
                        return "standard-narrow";
                }
                break;

            case OR:
                switch (width) {
                    case WIDE:
                        return "or";
                    case SHORT:
                        return "or-short";
                    case NARROW:
                        return "or-narrow";
                }
                break;

            case UNITS:
                switch (width) {
                    case WIDE:
                        return "unit";
                    case SHORT:
                        return "unit-short";
                    case NARROW:
                        return "unit-narrow";
                }
        }

        return null;
    }
}
