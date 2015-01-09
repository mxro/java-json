[![Build Status](https://travis-ci.org/mxro/java-json.svg)](https://travis-ci.org/mxro/java-json)

# Java JSON

An extremely simple library to render human-readable JSON with Java.

**Why** A simple and very portable way to generate beautiful, human-readable JSON. 

## Usage

Create a simple document.

```java
final JSON json = JSON.create();

json.add("text", "hello");
json.add("number", 123);

json.print();
```

Results in:

```
{
    'text': 'hello',
    'number': '123'
}
```




