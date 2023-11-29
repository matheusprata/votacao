FROM 966432988823.dkr.ecr.us-east-1.amazonaws.com/openjdk:11-stable

LABEL maintainer="devops@com.prata"

WORKDIR /app

COPY target/votacao-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["/app/startup.sh", "-jar", "votacao-0.0.1-SNAPSHOT.jar"]