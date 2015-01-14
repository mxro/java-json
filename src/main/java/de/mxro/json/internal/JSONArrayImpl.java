package de.mxro.json.internal;

import java.util.ArrayList;
import java.util.List;

import de.mxro.json.JSONArray;

public class JSONArrayImpl implements JSONArray {

    private final List<Object> items;

    @Override
    public JSONArray push(final Object value) {
        items.add(value);
        return this;
    }

    @Override
    public String render() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String render(final int indentSize) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub

    }

    public JSONArrayImpl() {
        super();
        this.items = new ArrayList<Object>();

    }

}
