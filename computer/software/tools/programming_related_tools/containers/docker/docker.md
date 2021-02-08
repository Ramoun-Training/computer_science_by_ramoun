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

if we have docker on an ubuntu system, docker can run any flavour of os on top of it as long as 