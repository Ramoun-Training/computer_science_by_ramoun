# Git (freeCodeCamp)

## What is Git?

Free and open source version control system.

## What is version control?

A way that programers track their code changes.

The management of changes to documents, computer programs, large websites, and other collections of information.

just a save button.

## Why use a version control system?

see what you did when, track down bugs, and go back to previous versions of the code as needed.

## Terms

Term | defination
-----|-----------
Directory | Folder on computer
terminal/command-line | cli
Rebository | Project, or the folder/place where your project is kept
Github | a website where you host all of your git repos.

## Git Commands

command | explaination
--------|-------------
`clone` | bring a repo that is hosted somewhere like github into a folder on your local machine.
`add` | Track changes (choose files/dirs that you want git to track)
`commit` | Save changes to git
`push` | upload git commits to a remote repo, like github.
`pull` | download changes from remote repo to your local machine, the opposite of `push`.
`status` | shows all of the files that were updated, created, or deleted.

> **Note**: all commands are lowercase.

## Git Flow

1. go to github.com and create a new repo.
2. clone the repo to your local machine.
3. make some changes.
4. track those changes using `git add .`.
5. commit changes to the repo with `git commit -m "This is the title" -m "This is the description"`.
6. push the live to the remote repo using `git push`.

> **Note**: if you are using `git push` you have to set the remote and the branch.

## SSH

connecting local machine to github account is simple using ssh-keys

1. Generating a Key locally:
    `ssh-keygen -t rsa -b 4096 -C "email@example.com"`
    `-t`: type of encryption
    `-b`: strength of ecryption
    `-C`: github email account

### How it Works?

The previous steps create 2 files:
`id_rsa`: private key (only you can use or view this key - don't share this key with anybody).
`id_rsa.pub`: public key (it is ok for other people to see this key).

You put the public key on github and everytime you want to connect to github, push code on github, or use account via your local machine, you use the private key to show github that you are the one that generated that public key.

> **Note**: you can copy contents of a file using `pbcopy < ~/path/to/file.txt`

## Create a Repo Locally

1. create a directory.
2. add a file (EG: `README.md`).
3. open the terminal and type `git init` to initialize a repo in current direcotory.
4. add file to be tracked by git using `git add .`.
5. commit file using `git commit -m "created readme file"`.
6. create an empty git repo on github.
7. copy the ssh link.
8. back to the termianl and type `git remote add <name-of-remote> <copied-ssh-link>` to add a refrence to the remote repo on github.
9. to show any remote repos conected to current local repo use `git remote -v`
10. now push to remote repo using `git push <name-of-remote> master`.

> **Note**: you can make shortcut so that git can use one of the remote connections as the default push connection by `git push -u <name-of-remote> master`. You are telling git that this is where you want to push to by default.

## GitHub WorkFlow (explained)

1. write code
2. commit changes
3. make a pull request (if we don't have access rights)

> **Note**: there's no `add` step to stage changes, that's because github handles this. So by commiting in github, we are adding and commiting at the same time. 

## Git WorkFlow (explained)

1. write code
2. stage changes
3. commit changes
4. push changes 

## Git Branching

master: is the naming convention for the main or the default branch of a repository.

![git branching](https://imgur.com/jtD0ZbO.png)

![feature-branch](https://imgur.com/0wNCiiZ.png)

### What Happens When We Create a new Feature Branch?

1. The code on master and the new feature branch will be exactly the same.
2. As you make updates to the feature branch, those changes are only seen in the feature branch.

> **Note**: if you make changes to the feature branch and make a commit to save those changes on to that branch, then you switch back to the master branch, you won't be able to see those changes that you've made on that feature branch.

> **Note**: Each indvidual branch has no way of knowing, what commits or what changes have been made to any other branch. Each branch is only keeping track of what changes are made on its own branch.

> **Note**: you can continue to change the code on master branch and save it through a commit to the master branch, and then if you switch to the feature branch likewise you'll not be able to see the changes that you've just saved to master.

### Why Branching is useful?

- because you'll be building new features to apps that may break your code or they are not finished yet and you don't wanna save them to the main master branch, you wanna work on them in kinda a sandboxed area, So you can write all code you need and get right and then merge it back into the master branch of the code base.

[merge branch to master](https://imgur.com/AWSD1o7.png)

### hot-fixes

![hot-fixes](https://imgur.com/QM0Zp3h.png)

### code

1. `git branch`: shows branches and currenty branch.
2. `git checkout <branch-name>`: used to switch between branches.
3. `git checkout -b <branch-name>`: create a new branch and switch to it.
4. `git diff`: check the differences between 2 branches before merging.
5. `git merge`: merge the feature-branch into master.

> **Note**: branch naming is a whole other topic. Ex: `feature-11-fixing screen close bug` (11 is issue number).

> **Note**: you can type any part of the branch name and hit tab and it will get it ok!!.