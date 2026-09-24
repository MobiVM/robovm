package org.robovm.idea.inspection;

import com.intellij.DynamicBundle;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.PropertyKey;

import java.util.function.Supplier;

public final class RvmInspectionBundle extends DynamicBundle {
        public static final @NonNls String BUNDLE = "robovm.RvmInspectionBundle";

        private RvmInspectionBundle() {
            super(BUNDLE);
        }

        private static final DynamicBundle INSTANCE = new RvmInspectionBundle();

        public static @NotNull
        @Nls String message(@NotNull @PropertyKey(resourceBundle = BUNDLE) String key, Object ... params) {
            return INSTANCE.getMessage(key, params);
        }

        public static @NotNull Supplier<String> messagePointer(@NotNull @PropertyKey(resourceBundle = BUNDLE) String key, Object ... params) {
            return INSTANCE.getLazyMessage(key, params);
        }
    }