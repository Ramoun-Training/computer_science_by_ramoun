# Software Architecture

## System Architecture

### Messaging

Means of communication between the various service

#### Criteria for choosing Messaging platform

- Performance
- Message Size
- Execution Model
- Feedback and Reliablity
- complexity

#### REST APIs

Defacto standard for http-based systems. follows the Request/Response model

##### Features

1. easy to implement
2. great for traditional web-based systems
3. very fast
4. small message size
5. reliable

#### HTTP Push Notifications

follows the subscribe/notify model. (e.g: signalR, socket.io). Very popular in chat apps and monitoring apps.

##### Features

1. very small message size
2. not reliable (fire and forget model)
3. easy to implement

#### Queue

handle messages in order. RabbitMQ. used for multiple cases for example when Reliablity is more important than Performance.

##### Features

1. bad Performance because of added latency due to nature of queue structure.
2. big message size (better use small messages though)
3. very reliable.
4. complex to implement

#### File-based + DB-based

so similar to queue with unlimited size.

##### Problems

1. File locked
2. duplicate processing

> > [!NOTE]
> > it is better to use queues

### Logging

logging should be centeral.

> [!NOTE]
> always make sure to use corelationId (id for each flow)

## External Considerations

### Deadlines

some implementations take longer than others (e.g: queue vs Rest)

### Existing Dev Team Skills

#### Results of selecting unknow technology

1. Delay: devs have to dedicate time for trianing to make them familiar with new technology.
2. Low Quality: devs not so familiar with stack. so, they don't know how to avoid common pitfalls with a specific technology. implement best practices. take advantage of hidden gems found in every development platform.

#### Migrations

- .NET -> Java (Not to difficult)
- Desktop windows => Python backend (very complicated) (i.e: desktop different than web + static to dynamic typed langs is ddifficult)

### It Support

- queue engines
- business flow managers
- nosql Dbs.
- ...etc

all of above need support (someone familiar with them and can maintain them)

> [!NOTE]
> always recommend prodcuts that the it department knows and support.

### Cost vs Value

## Architecture Document

### Goals of Architecture Document

1. it describes what should be developed and how
2. Layout Requirements (non-functional + functional)

### Audience of Architecture Document

everyone involved in the system. (e.g; project manager, devs, cto, qa ...etc)

#### for devs

the document lays out basic concepts of the system.

- tech stack
- components
- services
- communication
- and more...

#### for managment

- "the project is in good hands"
- Architecture geared towards business goals

> [!NOTE]
> Managment sections appear first in the doc

#### for QA

- prepare testing infrastructure
   - servers
   - testing tools
   - coding

> [!NOTE]
> by learning about tech used in system will make it easier for qa to prepare their infra.

### format of Architecture Document

there are some standards and a lot of debates.

#### UML

UML is one of the standards for writing Architecture Documents.




































