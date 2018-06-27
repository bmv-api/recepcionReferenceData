# recepcion-refdata-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.bursatec</groupId>
    <artifactId>recepcion-refdata-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.bursatec:recepcion-refdata-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/recepcion-refdata-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.bursatec.referencedata.recepcion.client.*;
import com.bursatec.referencedata.recepcion.client.auth.*;
import com.bursatec.referencedata.recepcion.client.*;
import com.bursatec.referencedata.recepcion.client.api.BmvApi;

import java.util.*;

public class BmvApiExample {

    public static void main(String[] args) {
        
        BmvApi apiInstance = new BmvApi();
        String userid = "userid_example"; // String | The user name for login
        String password = "password_example"; // String | The user name for login
        List<ReferenceData> referenceData = new ArrayList<>(); // List<ReferenceData> |
        
        referenceData.add(new ReferenceData(1L, "Zx", "2018XXXXXXXXXX"));
        referenceData.add(new ReferenceData(2L, "Zx", "2018XXXXXXXXXY"));
                
        try {
            // Here, set your server's URL
            apiInstance.getApiClient().setBasePath("https://localhost:1234");
            apiInstance.receiveRefData(userid, password, referenceData);
        } catch (ApiException e) {
            System.err.println("Exception when calling BmvApi#receiveRefData");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://<server-ip>:<port>*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BmvApi* | [**receiveHeartBeat**](docs/BmvApi.md#receiveHeartBeat) | **POST** /v1/referenceData/heartbeat | Receives heartbeats.
*BmvApi* | [**receiveRefData**](docs/BmvApi.md#receiveRefData) | **POST** /v1/referenceData/receive | Receives Data Reference.


## Documentation for Models

 - [ReferenceData](docs/ReferenceData.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



