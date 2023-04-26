From openjdk:17
Expose 8080
ADD target/CalculatorMVC.war CalculatorMVC.war
ENTRYPOINT ["java","-war","/CalculatorMVC.war"]
