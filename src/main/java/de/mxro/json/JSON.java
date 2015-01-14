package de.mxro.json;

import de.mxro.json.internal.JSONArrayImpl;
import de.mxro.json.internal.JSONObjectImpl;

/**
 * <p>
 * A JSON document for which fields can be added and which can be rendered into
 * a {@link String}.
 * 
 * @author <a href="http://www.mxro.de">Max Rohde</a>
 *
 */
public abstract class JSON {

    /**
     * Creates a new instance. Note instances are not thread-safe.
     * 
     * @return A new instance for rendering JSON.
     */
    public static JSONObject create() {
        return new JSONObjectImpl();
    }

    public static JSONArray createArray() {
        return new JSONArrayImpl();
    }

    /**
     * 
     * @return The rendered string representation of this JSON document.
     */
    public abstract String render();

    /**
     * 
     * @param indentSize
     *            Defines how many spaces are to be inserted at the beginning of
     *            ever line.
     * @return The rendered string representation of this JSON document.
     */
    public abstract String render(int indentSize);

    /**
     * <p>
     * Prints this document to standard out.
     */
    public abstract void print();

}