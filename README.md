# amocrm-client

AmoCRM API client based on Retrofit2 http library

## Usage

Maven:

```
<dependency>
  <groupId>com.amocrm</groupId>
  <artifactId>amocrm-client</artifactId>
  <version>0.3.0</version>
  <type>pom</type>
</dependency>
```

Gradle:

```
repositories {
    jcenter()
}

dependencies {
    compile 'com.amocrm:amocrm-client:0.3.0'
}
```

to build everything to bundle for particular Java version:

./gradlew -Dorg.gradle.java.home=/path/to/jdk/ shadowJar

Note: if you need java 1.7 compatibility check for version <= 0.2.1

Checkout tests for code examples
