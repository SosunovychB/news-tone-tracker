FROM openjdk:17-jdk-slim

WORKDIR /

COPY target/news-tone-tracker-*.jar news-tone-tracker.jar

EXPOSE 8060

CMD ["java", "-jar", "news-tone-tracker.jarr"]