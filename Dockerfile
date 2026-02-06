FROM fnproject/fn-java-fdk-build:jdk17-1.0.187 as build
WORKDIR /function
ENV MAVEN_OPTS=-Dmaven.repo.local=/usr/share/maven/ref/repository

ADD pom.xml /function/pom.xml
RUN mvn dependency:go-offline

ADD src /function/src
RUN mvn package

FROM fnproject/fn-java-fdk:jre17-1.0.187
WORKDIR /function
COPY --from=build /function/target/*.jar /function/app.jar
CMD ["com.example.fn.HelloFunction::handleRequest"]