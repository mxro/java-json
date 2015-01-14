package de.mxro.json;

public abstract class JSONObject extends JSON {

    /**
     * <p>
     * Add a new entry to this JSON.
     * <p>
     * Note that <code>value</code> may be another {@link JSON} instance.
     * 
     * @param key
     *            The key for the value.
     * @param value
     *            Value for the key. Can be a generic object, a string, or an
     *            instance of {@link JSON} or {@link JSONArray}
     * 
     */
    public abstract JSON add(String key, Object value);

    /**
     * 
     * @return The rendered string representation of this JSON document.
     */
    @Override
    public abstract String render();

    /**
     * 
     * @param indentSize
     *            Defines how many spaces are to be inserted at the beginning of
     *            ever line.
     * @return The rendered string representation of this JSON document.
     */
    @Override
    public abstract String render(int indentSize);

    /**
     * <p>
     * Prints this document to standard out.
     */

}
