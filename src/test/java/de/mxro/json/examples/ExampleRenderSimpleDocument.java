package de.mxro.json.examples;

import de.mxro.json.JSON;

public class ExampleRenderSimpleDocument {

    public static void main(final String[] args) {

        final JSON json = JSON.create();

        json.add("text", "hello");
        json.add("number", 123);

        json.print();

    }

}
