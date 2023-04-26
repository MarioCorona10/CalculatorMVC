FROM openjdk:17
EXPOSE 8080
ADD target/CalculatorMVC.war CalculatorMVC.war
ENTRYPOINT ["java","-war","/CalculatorMVC.war"]
