# ms1-demo

Spring Boot project: `GET /ms1/add?a=-5&b=5` returns `MS 1.1 - Additon = 0`, tested with MockMvc.

## Import into STS4 / Eclipse
1. Unzip `ms1-demo.zip`.
2. File -> Import -> Maven -> Existing Maven Projects -> select the `ms1-demo` folder -> Finish.
3. Wait for Maven to finish downloading dependencies (Java 17 required).

## Run the test
1. Open `src/test/java/com/example/demo/AddControllerTest.java`.
2. Right-click -> Run As -> JUnit Test.
3. The JUnit view should show a green bar: Runs 3/3, Errors 0, Failures 0.

## Optional: run the app
Right-click `Ms1DemoApplication.java` -> Run As -> Spring Boot App, then open
http://localhost:8080/ms1/add?a=-5&b=5
