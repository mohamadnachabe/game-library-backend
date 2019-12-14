FROM openjdk

EXPOSE 8080

COPY build/libs /app

CMD java -jar /app/game-library-service-1.0-SNAPSHOT.jar