# amocrm-client

AmoCRM API client based on Retrofit2 http library

## Usage

Maven:

```
<dependency>
  <groupId>com.amocrm</groupId>
  <artifactId>amocrm-client</artifactId>
  <version>0.2</version>
  <type>pom</type>
</dependency>
```

Gradle:

```
repositories {
    jcenter()
}

dependencies {
    compile 'com.amocrm:amocrm-client:0.2'
}
```

to build for Java 1.7:

./gradlew -Dorg.gradle.java.home=/opt/jdk1.7.0_75/ shadowJar

Checkout tests for code examples
