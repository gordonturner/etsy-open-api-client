# README Generate

## Generation Steps

This repo was generated from the Etsy Open API json file:

[https://www.etsy.com/openapi/generated/oas/3.0.0.json](https://www.etsy.com/openapi/generated/oas/3.0.0.json)

It was generated using the openapi-generator:

[https://github.com/OpenAPITools/openapi-generator](https://github.com/OpenAPITools/openapi-generator)

- 2022-04-08 latest stable release 5.4.0

- Download the jar:

```
wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/5.4.0/openapi-generator-cli-5.4.0.jar -O openapi-generator-cli.jar
```

- Create a new project by running:

```
java -jar openapi-generator-cli.jar generate \
-i https://www.etsy.com/openapi/generated/oas/3.0.0.json \
-g java \
-o ./etsy-open-api-client \
--skip-validate-spec \
--group-id com.gordonturner.etsy \
--artifact-id etsy-open-api-client \
--artifact-version 1.1.0 \
--type-mappings=integer=Long,int=Long
```

- NOTE: The tests fail to compile b/c of the type change
- Compile:

```
mvn clean install -Dmaven.test.skip=true
```

