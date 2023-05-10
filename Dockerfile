# Use the OpenJDK 17 as the base image
FROM openjdk:17

# Copy the Recipient Management Service JAR file to the container
COPY ./target/RecipientMService-0.0.1-SNAPSHOT.jar ./

# Set the working directory to the root of the container
WORKDIR ./

# Expose port 9002 for the Recipient Management Service
EXPOSE 9002

# Set the entrypoint for the container to run the JAR file
ENTRYPOINT ["java", "-jar"]

# Set the default command to run the Recipient Management Service JAR file
CMD ["RecipientMService-0.0.1-SNAPSHOT.jar"]
