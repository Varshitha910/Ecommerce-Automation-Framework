FROM openjdk:17

WORKDIR /app

COPY . .

RUN mvn clean install

CMD ["mvn", "test"]s