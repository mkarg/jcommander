package com.beust.jcommander;

import java.util.List;

public class Strings {

    public static boolean isStringEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public static boolean startsWith(String s, String with, boolean isCaseSensitive) {
        if (isCaseSensitive)
            return s.startsWith(with);
        else {
            return s.toLowerCase().startsWith(with.toLowerCase());
        }
    }

    public static String join(String delimiter, List<String> args) {
        return String.join(delimiter, args);
    }

    public static String join(String delimiter, Object[] args) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            builder.append(args[i]);

            if (i + 1 < args.length)
                builder.append(delimiter);
        }
        return builder.toString();
    }
}
