# Docker 

from freecodecamp.org

## Why do we need docker?

![Why Docker?](https://imgur.com/GFvPtOn.png)

- setting and end-to-end app stack with various techonlogies:
    + webserver: node.js/express
    + databse: mongoDB
    + messaging: reddit
    + orchestration: ansible

- issues from previous architecture:
    + technologies compatiblity with the underlying os(version) is an issue.
    + technologies compatiblity with the libraries and dependencies of the os (one service requires one version of a dependent library where another service requires another version).
    + each time something changes we have to go through the same process of checking compatiblity between various components (This combaitlbity matrix issue is referred to as "The matrix from hell").
    + Each time we have a new developer on board, we found it very difficult to set up a new environment(takes forever).
    + different dev/test/prod environements due to different developers.

## What can docker do?

![What can it do?](https://imgur.com/mEiSLGH.png)

with docker you are able to run each compnent in a seprate container with its own dependencies and its own libraries all on the same vm or os (something like virtual environements).

all you need to do is to build the docker configuration once and all developers can get started with a simple docker run commands.

## What are containers?

![What are containers?](https://imgur.com/AtOTMik.png)

they are completly isolated environments. They can have their own processors, services, network-interfaces, and their own mounts just like vms except they all share the same so kernal.

> **Note**: containers are not new. Some of the different types of containers are LXC, LXE ..etc. Docker utlizes LXC containers. Docker offers a high-level tools to use those containers.

## OS

![os](https://imgur.com/tTmQ8j2.png)

Any OS in the world consists of 2 parts the os kernal and a set of software.

OS-kernal: is responsible for interacting with underlying hardware.

> **Note**: while the os-kernal in ubunto, debian, fedora ..etc is the same (linux), it is the set of softwares that makes these distros different.

Softwares: may consist of a different ui, compilers, file managers, dev tools ...etc.

## Sharing Kernal

![sharing kernal](https://imgur.com/8vzmRVQ.png)

if we have docker on an ubuntu system, docker can run any flavour of os on top of it as long as they are all based on the same kernal. Each docker container only has the additional set of software that makes distro different.

> **Note**: you won't be able to run a windows based container on a docker host with a linux on it because they do not share the same kernal.

> **Note**: Windows plays a very cool trick though, windows runs a linux container on a linux virtual machine under the hoods.

> **Note**: the main purpose of docker is not to virtualize and run different OSes and kernals on the same hardware, The main purpose of docker is to package and containerize apps and to ship them and to run them anywhere, anytime, and as manytimes as you want.

## Containers Vs VMS

![containers vs vms](https://imgur.com/6jl75kn.png)

|  | vms | containers
|--|-------|--------
utlization | heavy(multiple kernals are running) | light
size | big (each vm is heavy) | lightwieght
boot | slower | faster (seconds)

## Containers & VMS

![containers and vms](https://imgur.com/uxkUsRr.png)

## How is it done?

![how is it done](https://imgur.com/HjjxUZY.png)

There are a lot of containerized versions of apps readily available as of today. Most organizations have their products containerized and available in a public docker repository called dockerhub/dockerstore (e.g: images of most OSes, dbs, services, and tools).

> **Note**: we use the `docker run <image-name>` to run instances of different images.You can run multiple instances of the same image.

## container vs image

image: is a package/template that is used to create one or more containers.

containers: are running instances of images that are isolated and have their own environements and set of processes.

> **Note**: you can create your own image and push it to dockerhub repository making it public for other users if you don't find what you want. 

## Docker in DevOps

![](https://imgur.com/Wena679.png)

- Life before Docker:
    ![life before](https://imgur.com/nRBzQuC.png)
    + traditionaly developers developed apps and they handed them over to devops team to deploy and manage them in production environments.
    + They do that by providing a set of instructions such as information about how the host must be set-up, what pre-requisites are to be installed on the host and how the dependencies to be configured ...etc.
    + devops didn't develop the app so they struggle on setting it up.
    + So they work with developers to solve issues (and that takes time).
- Life after Docker:
    ![life after](https://imgur.com/XPPjxkG.png)
    + developers and opteam work hand in hand to transform the guide into a docker file with both of their requirements.
    + this docker file is then used to create an image for thier apps.
    + this image can now run on any host wiht docker installed on it and is guranteed to work well anywhere.

## Docker Editions

- community
- eterprise

## Docker Commands

command | job
--------|----
`docker pull` | pulls (downloads) an image from the docker repo.
`docker run` | start a container (e.g: run an instance of the nginx app).
`docker ps -a` | lists all running containers with additonal info (`-a` is used to show even stopped containers).
`docker stop` | stop a container from running (must provide container name/id).
`docker rm` | remove a stopped or exited container (to save space on ram but the image is still there though).
`docker image` | list all downloaded images and their sizes.
`docker rmi` | removes an image.

> **Note**: you must stop and delete all dependent containers to be able to delete an image.

> **Note**: if you run `docker run ubuntu` command. Because containers are not meant to host an OS. Containers are meant to run a specific task or process.

> **Note**: the container lives as long as the process inside it is alive.

### `docker run`

```docker
docker run kodekloud/simple-webapp
```

### `docker run -d`
detached mode
```docker
docker run -d kodekloud/simple-webapp
```

## `run`

- traditional run
  ```docker
  docker run redis
  ```

- run with a tag
    ```docker
    docker run redis:4.0
    ```
- interactive mode
  ```docker
  docker run -i <image-name>
  ```
- attach to terminal
  ```docker
  docker run -t <image-name>
  ```

- PORT mapping

  ```docker
  
  ```

# links

- [lab](https://kodekloud.com/courses/970256/lectures/18323815)
- [official labs](https://labs.play-with-docker.com/p/c0hcq09lo550009b0j2g#c0hcq09l_c0hcraplo550009b0j70)