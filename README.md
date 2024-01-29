 Download Selenium WebDriverManager and TestNG libraries
 Make sure to configure your project with the necessary dependencies
 Create Maven project
 Update the initializeDriver() method in BaseTest class with the appropriate WebDriver setup
 Tests
1. entrataLoginTest
This test case covers the login functionality on the Entrata website.

Open the Entrata website.
Hover over the "ResidentPay" option in the header.
Click on "ResidentPay."
Accept cookies.
Click on the "Learn More" link.
Fill in the registration form.
Verify the presence of an element on the webpage.
Navigate back to the homepage.

2. verifyelementispresentornot
This test case verifies the presence of a specific element on the webpage.

Check if the "View the Website" element is displayed.
Navigate back to the previous page.

3. propertymanagerlogin
This test case verifies the text of the "Property Manager Login" button.

Check if the text of the "Property Manager Login" button matches the expected result.

Usage
Run the tests using your preferred test runner or IDE.
Review the test results for any failures.
