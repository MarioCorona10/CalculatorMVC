FROM tomcat:8.5.47-jdk8-openjdk
ADD target/CalculatorMVC.war /usr/local/tomcat/webapps/
CMD ["catalina.sh", "run]
