package de.mxro.json.internal;

import de.mxro.json.JSON;

public class JSONUtils {

    public static final String render(final String indent, final Object object) {
        String res = "";
        if (e.getValue() instanceof JSONImpl) {

            final JSON json = (JSON) e.getValue();

            res += "    '" + e.getKey() + "': ";

            res += json.render(indentSize + 4);
            continue;
        } else {

            res += indent + "    '" + e.getKey() + "': '" + e.getValue().toString() + "'";
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
