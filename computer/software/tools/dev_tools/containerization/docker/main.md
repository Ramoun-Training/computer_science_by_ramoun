# Docker

## Image

### What they contain

- Runtime Env.
- App Code
- Dependencies
- extra configs
- commands

### What are they made of

several layers (order matters)

0. Parent Image (OS + runtime env {e.g: linux + python}) [also a docker image]
1. source code
2. dependencies
3. run commands

> **Note:** You can find any image you want in docker hub (github for docker)

> **Note:** in docker terms when we download the image, we say "we pull the image down"

## Tags

variations of an image. E.g: `17-alpine` (this tag specifies a specific node image + a specific linux distro)

## Container (Isolated Process)

Running Instance of an Image.

```sh {"id":"01J2BMQZ1C8MA2BFBQHYM6EZM9"}
# building an image
docker build -t tag-of-image . # the '.' refers to the directory of the Dockerfile
```

## Compose

running multiple services (containers) at the same time.

```sh {"id":"01J2BMQZ1C8MA2BFBQHZ3HFN1T"}
# build and run all services listed in the compose file.
docker compose up -d # '-d' tells docker to run in detached mode
```

## Volume

a volume is a location on your local filesystem managed by docker. It allows for persisting data even after container is deleted

```yml {"id":"01J2BMQZ1C8MA2BFBQHZ8Y51NG"}
todo-database:
    # ...
    volumes:
      - database:/data/db

# ...
volumes:
  database:
```

> **Note:** The volumes element that is nested in todo-database tells Compose to mount the volume named database to /data/db in the container for the todo-database service.

> **Note:** The top-level volumes element defines and configures a volume named database that can be used by any of the services in the Compose file.

> **Note:** Docker isolates all content, code, and data in a container from your local filesystem.  Sometimes you may want the container to access a directory on your system. This is when you use bind mounts.

## Bind Mounts

If you want to access data on your system, you can use a bind mount. A bind mount lets you share a directory from your host's filesystem into the container.

```yml {"id":"01J2BMQZ1C8MA2BFBQHZR2NX3G"}
todo-app:
    # ...
    volumes:
      - ./app:/usr/src/app
      - /usr/src/app/node_modules
```

## Building An Image

When working with containers, you usually need to create a Dockerfile to define your image and a compose.yaml file to define how to run it.

> **Note:** Every line in the `Dockerfile` is a new layer added to the image.

> **Note:** and this is how images are built. By stacking layers on top of each other

```dockerfile {"id":"01J2BMQZ1C8MA2BFBQJ0EKKGNY"}
# Parent Image
FROM node:17-alpine # layer 1

# the base path (every path inside docker image will be relative to this path)
WORKDIR /app # layer 2

# Source Code : local / inside docker image (this is default - but if you use the 'WORKDIR' then it will be relative to that Directory)
COPY . . # layer 3

# install all dependencies by running commands
RUN npm install

# we don't do the following
# RUN node app.js
# because when we add a `RUN` instruction, it runs the command as the app is being built (at build time).
# so it makes sense to use the `RUN` instruction for installing dependencies at build time while creating the image. instead, we want to run the app when we have a running instance inside the container.


# which port the container should expose
EXPOSE 3000 # used by docker desktop app

# to do this we use `CMD` command. it specifies what commands should be run at runtime
CMD ["node", "app.js"]

# command for running the app
CMD ["npm", "start"]

```

> **Note:** why don't we use `RUN` instead of `CMD` to run the app? Simply, ...

```sh {"id":"01J2BNJQPZ8TB6HQEHEGTHK8E4"}
# to build the image
docker build -t myapp-tag . # '.' directory of the docker file

```

> **Note:** once an image is created, it is read-only. if you make any changes to source code. you have to build a new image.

> **Note:** use `.cockerignore` file to ignore files

## Create a Container for the image

### using Docker Desktop

1. click on `run` next to the image in docker desktop app.
2. give the container a `name`, local `port`, ..etc.

> **Note:** remember that docker allows you to map a local port number on your computer to an exposed port number of the docker image and this way you can easily use the app on your computer.

### using terminal

```shell
# list all docker images
docker images

# you can run an image using 'name' or 'id' of an image (this command creates a new container)
docker run my_app

# you can also add options in there
# add a custom name to our container before running it.
docker run --name myapp_container1 myapp


# check list of running containers (processes)
docker ps

# to see all containers even the ones not running
docker ps -all

# stop a container
docker stop myapp_container1

# publish a container port to our computer (map ports)
# left: the port we wanna map to that container on our computer
# right: port exposed by container
docker run --name myapp_c2 -p 4000:4000 myapp

# run in detach mode
docker run --name myapp_3 -p 4000:4000 -d myapp

# start an already existing container (a stopped one)
# by default 'docker start' starts the container in detached mode
docker start myapp_c2
```

## using Volumes

changing source code doesn't change the image. To see changes, you have to create a new image and after that create a new container to run that image. This is so cumbersome, so it is better use volumes.

Volumes allow you to map a local folder on your computer to your image.

```sh {"id":"01J2E2HDFJ5AC96QEYXQ2N3KHW"}
docker run --name myapp_c_nodemon -p 4000:4000 --rm -v /Users/ramoun/api:/app -v /app/node_modules myapp:nodemon
```

## Docker Compose

gives us a away to make a `docker-compose.yml` file. which contains all container configs for our projects.

```yaml {"id":"01J2E3F0T94S2P7BAVTY7ZBTEF"}
# create a docker compose file `docker-compose.yml`
version: "3.8"
services: # projects that we want our container for.
  api: # project - nested property
    build: ./api # path for the docker file to build the app
    container_name: api_container
    ports: # mapping ports - it contains a list of ports
      - '4000:4000'
    volumes: # contains a list of volumes [computer:container]
      - ./api:/app
      - ./app/node_modules # making sure the node_modules folder doesn't get deleted because of this other volume that we have

```

```sh {"id":"01J2E47AT83ZPEN52HKBC25ZZ2"}
# clean all images, voluemes, and containers made
# getting a blank slate
docker system prune

# docker will find the compose file and run it
docker-compose up

#
docker-compose down

# delete image and volumes
docker-compose down --rmi all -v
```

```dockerfile {"id":"01J2E5RW7BHSG11N3P6F2DBD0J"}
Dockerfile
# dockerizing a react app
FROM node:17-alpine

WORKDIR /app

COPY package.json .

RUN npm install

COPY . .

EXPOSE 3000

CMD ["npm", "start"]
```

```yaml {"id":"01J2E620NQ4821TP976CZTFX9P"}
# docker-compose.yaml
services:
  api:
    #...
  frontend:
    build: ./frontend
    container_name: frontend_container
    ports:
      - '3000:3000'
    volumes: # if you are on windows try using wsl
      - ./frontend:/app
      - ./app/node_modules
    stdin_open: true # start container in interactive mode
    tty: true
```

## Resources

- [Docs](https://docs.docker.com/)