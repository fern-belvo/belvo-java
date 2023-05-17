# Belvo Java Library

[![Maven Central](https://img.shields.io/maven-central/v/io.github.fern-api/{company})](https://central.sonatype.dev/artifact/io.github.fern-api/{company}/0.0.7/versions) 
[![fern shield](https://img.shields.io/badge/%F0%9F%8C%BF-SDK%20generated%20by%20Fern-brightgreen)](https://github.com/fern-api/fern)

## Documentation

API documentation is available [here]([url](https://developers.belvo.com/reference/using-the-api-reference)).

## Install

### Gradle

Add the dependency in your `build.gradle`:

```groovy
dependencies {
    implementation 'io.github.fern-api:belvo:0.x.x'
}
```

### Maven

Add the dependency in your `pom.xml`:

```xml
<dependency>
    <groupId>io.github.fern-api</groupId>
    <artifactId>belvo</artifactId>
    <version>0.x.x</version>
</dependency>
```

## Usage

Check out the [sample app](.sample-app/app.java) which consumes this SDK!

```java
// start with env variables
TODO
```

## Beta status

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning the package version to a specific version in your build.gradle file. This way, you can install the same version each time without breaking changes unless you are intentionally looking for the latest version.

## Contributing

While we value open-source contributions to this SDK, this library is generated programmatically. Additions made directly to this library would have to be moved over to our generation code, otherwise they would be overwritten upon the next generated release. Feel free to open a PR as a proof of concept, but know that we will not be able to merge it as-is. We suggest opening an issue first to discuss with us!

On the other hand, contributions to the README are always very welcome!
