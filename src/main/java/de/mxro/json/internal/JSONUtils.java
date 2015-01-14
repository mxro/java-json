package de.mxro.json.internal;

public class JSONUtils {

    public static final String render(final String indent, final Object object) {

    }

    public static final String indent(final int size) {
        String indent = "";
        for (int i = 1; i <= size; i++) {
            indent += " ";
        }
        return indent;
    }

}
