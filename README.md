In order to execute the test you need run the following Maven commands:

mvn clean test -Demail=test_email_address -Dpassword=test_password

mvn site

mvn jetty:run -Djetty.port=port_number


You need to specify the following parameters: test_email_address, test_password, port_number.

You will be able to access Allure report at http://localhost:port_number

ATTENTION! Your email and password will be shown in Allure report. Do not use personal email and password to avoid inconveniences.