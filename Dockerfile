FROM openjdk:17
RUN mkdir /opt/app
COPY target/*.jar employees.jar
CMD ["java", "-jar","employees.jar"]