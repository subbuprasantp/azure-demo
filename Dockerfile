FROM --platform=amd64 amd64/openjdk:11
LABEL maintainer="Subbu Prasant P"

ENV APP_NAME demo
ENV APP_HOME /app/bin

RUN mkdir -p ${APP_HOME}
ADD ./target/${APP_NAME}-*.jar /app/app.jar
EXPOSE 8080

COPY ./opentelemetry-javaagent.jar /opentelemetry-javaagent-all.jar

WORKDIR ${APP_HOME}

ENTRYPOINT ["java","-Dapplication.name=${APP_NAME}","-Dotel.traces.exporter=otlp","-Dotel.exporter.otlp.traces.endpoint=http://otel-collector:4317", "-Dotel.service.name=opentelemetry-demo","-Dotel.metrics.exporter=none","-javaagent:/opentelemetry-javaagent-all.jar","-jar","/app/app.jar"]
