package de.mxro.json;

import de.mxro.json.internal.JSONImpl;

public abstract class JSON {

    /**
     * Creates a new instance. Note instances are not thread-safe.
     * 
     * @return A new instance for rendering JSON.
     */
    public static JSON create() {
        return new JSONImpl();
    }

    /**
     * <p>
     * Add a new entry to this JSON.
     * 
     * 
     * @param key
     *            The key for the value.
     * @param value
     *            Value for the key. Can be a generic object, a string, or an
     *            instance of {@link JSON}
     * 
     */
    public abstract void add(String key, Object value);

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
     * @return Th
     */
    public abstract String render(int indentSize);

}