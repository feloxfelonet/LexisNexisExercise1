Getting Started
Prerequisites & Installation
JDK 1.8+ 
Maven 
Eclipse IDE

Required Eclipse Plugins:
Maven
Cucumber
TestNG

Required JAVA libraries
cucumber-java
selenium-java
cucumber-testng
testing
webdrivermanager

The Page Object Model Design Pattern
With this pattern, the UI elements of web application are modeled as objects within the test code. The Page Object pattern provides a solution by centralizing these selectors in separate .java files, where you can manage them along with the associated methods.
By using the Page Object pattern, test files will only call the test methods, while the selectors and reusable methods reside in the corresponding Page Objects. This approach helps maintain a separation of concerns and ensures that when a test fails, it fails on an individual step.




Running Tests
To run the tests, right click on project in Solution Explorer -> Run As -> TestNG Test



Reporting
Report can be found as htmlreport.html under 'target' folder.

Note: 1 test is failed intentionally so show log trace and screenshot captured
Sample report
