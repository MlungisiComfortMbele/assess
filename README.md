# Selenium-Appium Hybrid Framework

The aim of this project is to create a test automation framework that will be used for testing Web and Mobile applications. This is a Selenium-Appium hybrid framework designed using Page Factory design pattern.

## Getting Started

This project is a Maven project. To access this project, import this project directly from github into your IntelliJ IDE or clone the Repository in your local machine and open the Maven project from your local directory into IntelliJ.

## Prerequisites

```bash
IntelliJ IDEA Community 2020/Eclipse 2019
Android SDK (Studio)-v3.2.x
Appium desktop-v1.7.x
JRE-9.0.x
JDK-9.0.x
Chrome Web browser

```

## Installing - following the instructions from the links
```bash
Download and Install:
1.	IntelliJ IDE  - https://www.guru99.com/intellij-selenium-webdriver.html#2
2.	Android SDK - https://www.guru99.com/introduction-to-appium.html#22
3.	Appium Desktop - https://developer.android.com/studio/install
4.	JRE and JDK  - https://docs.oracle.com/javase/7/docs/webnotes/install
5.	Chrome - https://support.google.com/chrome/answer/95346?co=GENIE.Platform%3DDesktop&hl=en-GB
```

## Framework
### Tools 
```bash
Mobile Testing Framework: Appium
Build Tool: Maven
Testing Tool: TestNG
Programming Language: Java
```

### Design
```bash
APK, Excel file and drivers stored within framework to easily access and use. Making the solution portable.
```

```bash
Framework consists of following modules / packages:
•	data_readers (contains class to manipulate excel data source), 
•	driver_handlers (mobile driver initialization classes), 
•	pages (mobile applications page factory), 
•	resources(mobile config.properties files, 
•	MobileEngine (for mobile tests)

```

```bash
Mobile tests use TestNG annotations following the same structure:

@BeforeClass – This is the precondition / setup of the tests
@Test – steps to run
@AfterClass – Post condition / resetting the driver into its initial state 

```
## Running the tests with TestNG

```bash
Open Edit run/debug configuration dialog
```

```bash
APN_Tests Class for executing Mobile App tests.
```

```bash
To execute each Class, navigate to the respective class > right-click on it > run using the respective configuration set on previous step
```

```bash

### To execute Mobile Tests

```bash
1.	Open Appium Desktop and Start Appium Server 
```

```bash
2.	Connect Android device to your machine - I used Vysor to display the mobile to the machine
```
```bash
3.	Type adb devices on your cmd to make sure that your device is connected
```

```bash
4.	Install the apk into your android device using adb install and path to the apk
```

```bash
5.	Change the Platform version in mobileconfig.properties file to match your device OS version
```


```bash
6.	Navigate to the APN_Tests class > Right-click and run using the TestNG
```


