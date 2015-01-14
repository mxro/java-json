package de.mxro.json;

public interface JSONArray {

    public JSONArray push(Object value);

    /**
     * 
     * @return The rendered string representation of this JSON array.
     */
    public abstract String render();

    /**
     * 
     * @param indentSize
     *            Defines how many spaces are to be inserted at the beginning of
     *            ever line.
     * @return The rendered string representation of this JSON array.
     */
    public abstract String render(int indentSize);

    /**
     * <p>
     * Prints this array to standard out.
     */
    public abstract void print();
}
