package de.mxro.json.examples;

import de.mxro.json.JSON;

public class ExampleRenderArray {

    public static void main(final String[] args) {
        final JSON json = JSON.create();

        json.add("array", JSON.createArray().push("1").push("2").push("3"));

        json.print();

    }

}
