**Overview**
This repository contains automated test cases designed for the Amazon website using Selenium WebDriver with TestNG. The tests cover various functionalities, ensuring a seamless user experience on the platform.

**Prerequisites for Execution**
Before running the automated test cases, ensure you have the following installed:
1. Java 11
2. Maven 3.9.9
3. TestNG
4. ChromeDriver: Download the ChromeDriver that matches your version of Google Chrome from the ChromeDriver downloads page.
Ensure the ChromeDriver executable is in your system's PATH or specify its location in your code.

**Execution Instructions**
Clone the Repository:
Copy code
git clone <repository-url>
cd <repository-directory>
Navigate to the Project Directory: Make sure you are in the root directory of the project where the pom.xml file is located.

Compile and Run the Tests: Use the following Maven command to execute the automated test cases:
mvn clean test
Main Test File: The main test file to execute is TestEntrata.java. This file contains all the test cases and should run as part of the Maven test execution.
modifications to the tests or additional test cases, you can edit TestEntrata.java accordingly.
