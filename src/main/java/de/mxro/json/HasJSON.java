package de.mxro.json;

/**
 * Marks a class which can be rendered into JSON.
 * 
 * @author <a href="http://www.mxro.de">Max Rohde</a>
 *
 */
public interface HasJSON {
    /**
     * 
     * @return The JSON document representing this object.
     */
    public JSON getJSON();
}
