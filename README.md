# Setting up Cucumber for Spring Boot Project

This guide walks you through the process of setting up Cucumber for a Spring Boot project, writing feature files, and executing tests.

## Step 1: Add Cucumber Dependencies to `pom.xml`

```xml
<!-- Cucumber Dependencies -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.14.0</version>
</dependency>
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-spring</artifactId>
    <version>7.14.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>7.14.0</version>
    <!-- <scope>test</scope> -->
</dependency>

<!-- Spring Boot Starter Web -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<!-- Spring Boot Starter Test -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>

<!-- JUnit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13</version>
    <!-- <scope>test</scope> -->
</dependency>

<!-- Cucumber Reporting Plugin -->
<dependency>
    <groupId>net.masterthought</groupId>
    <artifactId>cucumber-reporting</artifactId>
    <version>5.7.0</version>
    <scope>test</scope>
</dependency>
```

## Step 2: Configure Maven Surefire Plugin
- Update the maven-surefire-plugin in the build section of your pom.xml:
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.0.0-M5</version>
    <configuration>
        <testFailureIgnore>true</testFailureIgnore>
    </configuration>
</plugin>
```

## Step 3: Configure Cucumber Reporting Plugin
- Add the maven-cucumber-reporting plugin to the build section:

```xml
<plugin>
    <groupId>net.masterthought</groupId>
    <artifactId>maven-cucumber-reporting</artifactId>
    <version>5.7.0</version>
    <executions>
        <execution>
            <id>execution</id>
            <phase>verify</phase>
            <goals>
                <goal>generate</goal>
            </goals>
            <configuration>
                <projectName>YourProjectName</projectName>
                <outputDirectory>${project.build.directory}/cucumber-report-html</outputDirectory>
                <cucumberOutput>${project.build.directory}/cucumber.json</cucumberOutput>
            </configuration>
        </execution>
    </executions>
</plugin>
```

## Step 4: Create Cucumber Feature Files
- Create your feature files in the src/test/resources directory. Example:


- src/test/resources/features/sample.feature
```gherkin
Feature: Sample Feature

  Scenario: Sample Scenario
    Given I have a sample step
    When I perform some action
    Then I should see the expected result
```

## Step 5: Write Cucumber Step Definitions
Create step definition classes in the src/test/java directory to implement the steps from your feature files.

## Step 6: Run Cucumber Tests
Run the Cucumber tests using your IDE or execute the following Maven command:

```bash
mvn clean
mvn test
mvn verify

```

## Step 7: View Cucumber Reports
- After running the tests, view the generated Cucumber reports in the target/cucumber-report-html directory.

# Screenshot

<img width="960" src="https://github.com/surazkarn/Testing-SpringBoot-JavaApp-using-Cucumber/assets/90691739/972f95d3-68e9-4103-96a5-6cbccd9d0a79">
