FROM eclipse-temurin:17-jdk-jammy
EXPOSE 8080
ADD target/CalculatorMVC.war CalculatorMVC.war
ENTRYPOINT ["java","-war","/CalculatorMVC.war"]
