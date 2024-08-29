# Use the official MySQL image as a base
FROM mysql:8.0

# Set environment variables for MySQL
ENV MYSQL_ROOT_PASSWORD=root_password
ENV MYSQL_DATABASE=my_database
ENV MYSQL_USER=my_user
ENV MYSQL_PASSWORD=my_password

# Expose MySQL port
EXPOSE 3306

# Start MySQL service
CMD ["mysqld"]