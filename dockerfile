# Use the official MySQL image from the Docker Hub
FROM mysql:8.0

# Set environment variables for the MySQL root user
ENV MYSQL_ROOT_PASSWORD=root_password
ENV MYSQL_DATABASE=anime_library
ENV MYSQL_USER=anime_user
ENV MYSQL_PASSWORD=anime_password

# Copy the script to initialize the database
COPY init-db.sh /docker-entrypoint-initdb.d/

# Copy the JSON file to the container
COPY collected_data.json /docker-entrypoint-initdb.d/collected_data.json

# Expose port 3306 to the host machine
EXPOSE 3306

# Create a custom network to ensure the container is accessible
CMD ["mysqld"]
