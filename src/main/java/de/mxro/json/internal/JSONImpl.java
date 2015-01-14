package de.mxro.json.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import de.mxro.json.JSON;

public class JSONImpl extends JSON {

    private final List<Entry<String, Object>> entries;

    @Override
    public JSON add(final String key, final Object value) {

        entries.add(new Entry<String, Object>() {

            @Override
            public String setValue(final Object value) {
                return null;
            }

            @Override
            public Object getValue() {

                return value;
            }

            @Override
            public String getKey() {
                return key;
            }
        });

        return this;

    }

    @Override
    public String render() {
        return render(0);
    }

    @Override
    public String render(final int indentSize) {
        final String indent = JSONUtils.indent(indentSize);
        String res = "{\n";

        int count = 0;
        for (final Entry<String, Object> e : entries) {
            count += 1;
            if (e.getValue() instanceof String) {
                res += indent + "    '" + e.getKey() + "': '" + e.getValue() + "'";

            } else {
                res += indent + "    '" + e.getKey() + "': " + JSONUtils.render(indent, e.getValue());
            }

            if (count != entries.size()) {
                res += ",\n";
            } else {
                res += "\n";
            }

        }

        res += indent + "}\n";

        return res;

    }

    public JSONImpl() {
        super();
        this.entries = new ArrayList<Entry<String, Object>>();
    }

    @Override
    public void print() {
        System.out.println(this.render());
    }

}
