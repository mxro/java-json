package de.mxro.json;

public abstract class JSONArray extends JSON {

    public abstract JSONArray push(Object value);

    /**
     * 
     * @return The rendered string representation of this JSON array.
     */
    @Override
    public abstract String render();

    /**
     * 
     * @param indentSize
     *            Defines how many spaces are to be inserted at the beginning of
     *            ever line.
     * @return The rendered string representation of this JSON array.
     */
    @Override
    public abstract String render(int indentSize);

    /**
     * <p>
     * Prints this array to standard out.
     */
    @Override
    public abstract void print();
}
