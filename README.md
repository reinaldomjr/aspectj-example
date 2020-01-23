# AspectJ Exercise
![](https://github.com/reinaldomjr/aspectj-example/workflows/Maven/badge.svg)  ![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/reinaldomjr/aspectj-example?label=latest&logo=github&logoColor=yellow)

This project is a simple example on how to apply AspectJ classes to a Java project

## Installation

Just clone this repository and run a maven build:

```bash
mvn package
```

## Usage

After the build is complete, a single jar, with all the dependencies will be generated at the target folder.

All you have to do is execute the jar, using ``java -jar``

```bash
java -jar target/aspectj-test-service.jar
```

All the weaving is done at *class loading time*

## Contributing
Pull requests are welcome.

For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
