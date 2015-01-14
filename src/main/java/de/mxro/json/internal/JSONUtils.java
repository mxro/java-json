package de.mxro.json.internal;

import de.mxro.json.JSON;
import de.mxro.json.JSONArray;

public class JSONUtils {

    public static final String render(final String indent, final Object object) {

        if (object instanceof String) {

            return "'" + object + "'";
        } else if (object instanceof JSON) {

            final JSON json = (JSON) object;

            return json.render(indent.length() + 4);

        } else if (object instanceof JSONArray) {
            final JSONArray array = (JSONArray) object;

            return array.render(indent.length() + 4);

        } else {
            return "'" + object.toString() + "'";
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
