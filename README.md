[![Build Status](https://travis-ci.org/mxro/java-json.svg)](https://travis-ci.org/mxro/java-json)

# Java JSON

An extremely simple library to render human-readable JSON with Java.

**Why:** A simple and very portable way to generate beautiful, human-readable JSON. 

## Usage

### Simple Document

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

### Composite Document

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

### Maven Dependency

```xml
<dependency>
    <groupId>de.mxro.metrics</groupId>
	<artifactId>metrics</artifactId>
	<version>[latest version]</version>
</dependency>
```

Find latest version [here](http://modules.appjangle.com/lightweight-java-metrics/latest/project-summary.html).

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

## License





