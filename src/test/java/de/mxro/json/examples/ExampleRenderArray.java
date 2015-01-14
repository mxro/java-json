package de.mxro.json.examples;

import de.mxro.json.JSON;
import de.mxro.json.JSONObject;

public class ExampleRenderArray {

    public static void main(final String[] args) {
        final JSONObject json = JSON.create();

        json.add("array", JSON.createArray().push("1").push("2").push("3"));

        json.print();

    }

}
