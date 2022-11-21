![](readmefile/ricsue_Spring-Boot_f1.png)

```groovy
plugins {
    id 'java'
    id 'org.springframework.boot' version '2.7.5'
    id 'io.spring.dependency-management' version '1.0.15.RELEASE'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    implementation 'org.springframework.cloud:spring-cloud-starter-aws:2.2.6.RELEASE'
}

tasks.named('test') {
    useJUnitPlatform()
}
```

- ``spring-boot-starter-thymeleaf``: Spring Boot starter for Thymeleaf
- ``spring-boot-starter-web``: Spring Boot starter for web applications
- ``spring-boot-devtools``: Spring Boot DevTools adds development-time features to your application.
- ``spring-cloud-starter-aws``: Spring Cloud AWS provides integration with Amazon Web Services.

<br/>

----

<br/>


```yaml
cloud:
  aws:
    s3:
      bucket: tobiastestbucket
    region:
      static: ap-northeast-2
      auto: false
    credentials:
      access-key: AKIAQ3IRVK6RGOCB36D2
      secret-key: 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
    stack:
      auto: false

logging:
  level:
    com:
      amazonaws:
        util:
          EC2MetadataUtils: ERROR
```
- ``cloud.aws.s3.bucket``: S3 bucket name
- ``cloud.aws.region.static``: AWS region
- ``cloud.aws.credentials.access-key``: AWS access key
- ``cloud.aws.credentials.secret-key``: AWS secret key
- ``cloud.aws.stack.auto``: AWS stack auto
- ``logging.level.com.amazonaws.util.EC2MetadataUtils``: AWS logging level
  
<br/>

----

<br/>

```java
package com.example.awss3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsS3Application {

    static {
        System.setProperty("com.amazonaws.sdk.disableEc2Metadata", "true");
    }

    public static void main(String[] args) {
        SpringApplication.run(AwsS3Application.class, args);
    }

}

```

- ``System.setProperty("com.amazonaws.sdk.disableEc2Metadata", "true");``: AWS EC2 Metadata disable


<br/>

----

<br/>