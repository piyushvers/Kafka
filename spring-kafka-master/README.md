# spring-kafka

Simple project to illustrate Spring Cloud Kafka Binder

### Pre-Requisites

You need to have the following installed on your machine:

- docker
- docker-compose
- an IDE (STE or Intellij or VSCode)

### Setting up the infrastructure

The docker files to setup the infrastructure required for this project is available in the docker folder.

To run the docker-compose file, the following needs to be run from a command line or terminal:

`docker-compose up -d`

To shut down the docker infrastructure, the following needs to be run from a command line or terminal:

`docker-compose down`

### Building a docker image of the project

To build the docker image of the project, the following needs to be run from a command line or terminal:

`mvn spring-boot:build-image`

This will create a local image of your project into your local docker.