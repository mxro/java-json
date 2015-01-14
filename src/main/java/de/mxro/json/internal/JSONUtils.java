package de.mxro.json.internal;

import de.mxro.json.JSON;

public class JSONUtils {

    public static final String render(final String indent, final Object object) {
        String res = "";
        if (object instanceof JSON) {

            final JSON json = (JSON) object;

            res += json.render(indent.length() + 4);

        } else {

        }
    }

    public static final String indent(final int size) {
        String indent = "";
        for (int i = 1; i <= size; i++) {
            indent += " ";
        }
        return indent;
    }

}
