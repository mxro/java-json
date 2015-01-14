package de.mxro.json.examples;

import de.mxro.json.JSON;
import de.mxro.json.JSONObject;

public class ExampleRenderComplexDocument {

    public static void main(final String[] args) {

        final JSONObject json = JSON.create();

        json.add("text", "hello");
        json.add("inner", JSON.create().add("number", 1234));

        json.print();

    }

}
