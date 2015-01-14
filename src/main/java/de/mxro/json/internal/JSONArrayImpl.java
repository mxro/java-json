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

        return render(0);
    }

    @Override
    public String render(final int indentSize) {
        final String indent = JSONUtils.indent(indentSize);
        String res = "[\n";

        int idx = 0;
        for (final Object item : items) {

            res += indent + item.toString();

            idx++;
            if (idx != items.size()) {
                res += ",\n";
            } else {
                res += "\n";
            }

        }

        res += indent + "]";

        return res;
    }

    @Override
    public void print() {
        System.out.println(render());
    }

    public JSONArrayImpl() {
        super();
        this.items = new ArrayList<Object>();

    }

}
