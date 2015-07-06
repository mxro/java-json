** MOVED ** This project has moved to [javadelight/delight-json](https://github.com/javadelight/delight-json) and is now part of the [Java Delight Suite](http://javadelight.org).

[![Build Status](https://travis-ci.org/mxro/java-json.svg)](https://travis-ci.org/mxro/java-json)

# Java JSON

[Java JSON](https://github.com/mxro/java-json) is an extremely simple library to render human-readable JSON with Java.

**Why:** A simple and very portable way to generate beautiful, human-readable JSON. 

## Usage

### JSON Objects

```java
JSON json = JSON.create();

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

### Nested JSON Objects

JSON documents may be added as values to other JSON documents.

```java

final JSON json = JSON.create();

json.add("text", "hello");
json.add("inner", JSON.create().add("number", 1234));

json.print();
```

Results in:

```
{
    'text': 'hello',
    'inner': {
        'number': '1234'
    }
}
```

### JSON Arrays

Arrays can be added as values of JSON documents.

```java
JSON json = JSON.create();
        
json.add("array", JSON.createArray().push("1").push("2").push("3"));

json.print();
```

Results in:

```
{
    'array': [
        '1',
        '2',
        '3'
    ]
}
```

### Rendering

Documents can either be printed to standard out:

```java
json.print();
```

Or rendered as String:

```java
String str = json.render();
```

## Maven Dependency

```xml
<dependency>
    <groupId>de.mxro.json</groupId>
	<artifactId>java-json</artifactId>
	<version>[latest version]</version>
</dependency>
```

Find latest version [here](http://modules.appjangle.com/java-json/latest/project-summary.html).

Add repository if required:

```xml
<repositories>
	<repository>
		<id>Appjangle Releases</id>
		<url>http://maven.appjangle.com/appjangle/releases</url>
	</repository>
</repositories>
```

## Compatibility

This project is compatible with the following environments:

- Java 1.6+
- GWT 2.5.0+
- Android (any)
- OSGi (any)

## Further Resources

- [JavaDocs](http://modules.appjangle.com/java-json/latest/apidocs/)
- [Project Reports](http://modules.appjangle.com/java-json/latest/project-reports.html)
- [Documentation with TOC](http://documentup.com/mxro/java-json)
- [ReadTheDocs](http://java-json.readthedocs.org/en/latest/)

[![Documentation Status](https://readthedocs.org/projects/java-json/badge/?version=latest)](https://readthedocs.org/projects/java-json/?badge=latest)

## Licenses

- Apache 2.0

- MIT

see [LICENSE.TXT](https://github.com/mxro/java-json/blob/master/LICENSE.TXT)



