package de.mxro.json;

public interface JSONObject {

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

}
