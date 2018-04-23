# RoboVM-Surefire-Provider

The RoboVM surefire provider is a means of running unit tests compiled by
RoboVM on the console, in the iOS Simulator or on an iOS device.

## Using RoboVM Surefire Provider

### Compile and install this plugin

Compile robovm-surefire-provider and install into your local maven repository
with `mvn install`.

### Example test class:

```java
import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

    @Test
    public void testTest() throws Exception {
        System.err.println("Running testTest");
        assertTrue(1 == 1);
    }
}
```

### Example pom.xml

```xml
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>2.17</version>
        <dependencies>
          <dependency>
            <groupId>org.robovm</groupId>
            <artifactId>robovm-surefire-provider</artifactId>
            <version>1.0.0-SNAPSHOT</version>
          </dependency>
        </dependencies>
      </plugin>
    </plugins>
  </build>  
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
```

### Running

mvn test

## How does it work?

The RoboVM surefire provider scans your project for JUnit3/4 tests. The test
classes are compiled into native code with RoboVM and executed on the
simulator or a real device. Results are transferred back using GSON over a TCP
connection.

## Configuration

The provider can be configured using system properties. The following system
properties are supported:

* `robovm.test.enableDebugLogging` -- Set to `true` to enable debug logging
  output from the provider.
* `robovm.test.enableServerLogging` -- Set to `true` to enable debug logging
  output from the test server executable.
* `robovm.test.propertiesFile` -- Properties file to read in. If not set the
  provider will try with `robovm.test.properties` and then
  `robovm.properties`.
* `robovm.test.configFile` -- Config file to read in. If not set the provider
  will try with `robovm.test.xml` and then `robovm.xml`.
* `robovm.test.os` -- Sets the OS to test on. If not set the OS will be read
  from the config file. The final fallback is to build for the current host
  OS.
* `robovm.test.arch` -- Sets the CPU architecture to test on. If not set the
  architecture will be read from the config file. The final fallback is to
  build for the current host architecture.

These properties can either be specified on the `mvn` command line when
running the tests, e.g.:

```
mvn -Drobovm.test.enableDebugLogging=true -Drobovm.test.os=ios -Drobovm.test.arch=x86 clean test
```

Or be set in the provider coniguration in the `pom.xml`, e.g.:

```xml
  <plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>2.21.0</version>
    <dependencies>
      <dependency>
        <groupId>org.robovm</groupId>
        <artifactId>robovm-surefire-provider</artifactId>
        <version>1.0.0-SNAPSHOT</version>
      </dependency>
    </dependencies>
    <configuration>
      <systemPropertyVariables>
        <robovm.test.enableDebugLogging>true</robovm.test.enableDebugLogging>
        <robovm.test.os>ios</robovm.test.os>
        <robovm.test.arch>x86</robovm.test.arch>
      </systemPropertyVariables>
    </configuration>
  </plugin>
```
