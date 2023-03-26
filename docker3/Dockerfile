FROM openjdk:16-jdk-slim

WORKDIR /api

COPY highestscore.java /api

RUN mkdir -p /api/classes
RUN javac -d /api/classes highestscore.java

CMD ["java", "-classpath", "/api/classes", "docker3.highestscore"]