## General commands to work with docker and postgres
```
# to execute a query from current cmd
docker exec -it <container_name> psql -U <username> -d <database_name> -c "<your_query>"

# to enter into the container's terminal
docker exec -it postgres_db bash or sh , not cmd (because base image is Debian [linux distro])

# to enter into our specific db from container's terminal
psql -U testuser -d testdb 

# few commands of psql
\l - lists databases
\dt - lists tables

```

## seeder command for current context --

```
docker exec -it postgres_db psql -U testuser -d testdb -c "INSERT INTO users (name, email) VALUES ('Alice', 'alice@example.com');INSERT INTO users (name, email) VALUES ('Bob', 'bob@example.com');"
```

