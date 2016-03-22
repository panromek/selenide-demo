In order to execute the test you need run the following Maven commands:

mvn clean test

mvn site

mvn jetty:run -Djetty.port=1111


You can select whichever port you like. 
After executing the last command, you can access Allure report at http://localhost:1111
Where 1111 - is a port which you have selected (1111 - is just an example).
