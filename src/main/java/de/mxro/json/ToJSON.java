package de.mxro.json;

/**
 * Marks a class which can be rendered to JSON.
 * 
 * @author <a href="http://www.mxro.de">Max Rohde</a>
 *
 */
public interface ToJSON {
    /**
     * 
     * @return The JSON document representing this object.
     */
    public JSON toJSON();
}
