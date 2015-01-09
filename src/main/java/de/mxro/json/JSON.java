package de.mxro.json;

public interface JSON {

    public void add(String key, Object value);

    public String render();

    public String render(int indentSize);

}