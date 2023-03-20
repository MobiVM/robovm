package org.robovm.gradle;

import org.gradle.api.GradleException;

import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;

public class RoboVMGradleException extends GradleException {
    public RoboVMGradleException() {
    }

    public RoboVMGradleException(String message) {
        super(message);
    }

    public RoboVMGradleException(String message, @Nullable Throwable cause) {
        super(buildMessage(message, cause), cause);
    }

    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }

    private static String buildMessage(String message, Throwable cause) {
        if (cause == null)
            return message;

        try {
            // combine all cause messages into single multi-line string
            StringBuilder sb = new StringBuilder();
            sb.append(message);
            Set<Throwable> visitedCause = new HashSet<>();
            Throwable c = cause;
            String lastMessage = message;
            int deep = 10;
            while (c != null && !visitedCause.contains(c) && deep > 0) {
                if (visitedCause.contains(c))
                    break;

                visitedCause.add(c);
                deep--;
                String m = c.getLocalizedMessage();
                if (m != null && !m.isEmpty() && (lastMessage == null || !lastMessage.equals(m))) {
                    sb.append('\n');
                    sb.append(m);
                    lastMessage = m;
                }

                if (c instanceof RoboVMGradleException) {
                    // its localized message has all causes already built, nothing to add there
                    break;
                }

                c = c.getCause();
            }
            return sb.toString();
        } catch (Exception ignored) {
            return message;
        }
    }
}
