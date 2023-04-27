FROM tomcat:latest
COPY target/CalculatorMVC.war /usr/local/tomcat/webapps
