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

    public abstract void add(String key, Object value);

    public abstract String render();

    public abstract String render(int indentSize);

}