FROM  eclipse-temurin:8-jdk-alpine
MAINTAINER devops


ADD target/*.jar /app.jar




# 执行命令
ENTRYPOINT ["java","-jar","/app.jar"]
