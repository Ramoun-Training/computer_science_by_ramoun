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

1. go to github.com and create a new repo or fork a repo that you like.
2. clone the repo to your local machine `git clone <link-of-repo>`.
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

- merging locally
1. `git branch`: shows branches and currenty branch.
2. `git checkout <branch-name>`: used to switch between branches.
3. `git checkout -b <branch-name>`: create a new branch and switch to it.
4. `git diff <name-of-branch>`: check the differences between 2 branches before merging (for this line of code to work you need to be on the master branch and make the `<name-of-branch>` the feature branch).
5. `git merge <name-of-branch>`: merge the feature-branch into master (the branch will be merged with the current branch).

- merging using a PR(Pull Request):
1. `git checkout <branch-name>`.
2. `git push --set-upstream origin <branch-name>` (you can use another name for the remote branch).
3. make a PR (github).
4. merge PR (github).
5. `git pull origin master`
6. `git branch -d <branch-name>`: delete feature-branch.
7. `git branch master`: switch back to master branch.

> **Note**: branch naming is a whole other topic. Ex: `feature-11-fixing screen close bug` (11 is issue number).

> **Note**: you can type any part of the branch name and hit tab and it will get it ok!!.

PR: is a request to have your code pulled into another branch.(e.g: making a PR from the feature-branch to the master-branch).

> **Note**: once we have made a PR, anyone can review our code, comment on it, and ask us to make changes/updates.

> **Note**: you don't use branches that you've already merged into master branch.

### merge conflicts

if master is getting updated from muliple different places (branches): [2 coders change the same file] -> so here comes the problem (which code to keep, which is redundent...and so on) so we have to solve that conflict manually.

Ex:
1. `git checkout -b new-branch1` 
2. modify a file "index.html": add "hi" to line #2.
3. `git diff` to show all of my changes since my last commit.
4. `git commit -am "updated index.html"`: only works for modified files not for newly created ones.
5. `git checkout master`.
6. modify the same file "index.html": add "no" to line #2.
7. `git checkout new-branch1`: gives error.
8. `git commit -am "added no"`.
9. `git checkout new-branch1`.
10. `git diff`.
11. `git merge master`: error: fix conflicts.
12. edit the file (index.html).
13. `git diff`.
14. `git commit -am "solved conflicts"`.

## Undoing in Git

- `git reset`: undo staging.
- `git reset HEAD ~1`: go back one commit further.
- `git reset <commit-hash>`: go to a specific commit (but the change to the local file will still be there).
- `git reset --hard <commit-hash>`: got to a specific commit (and also remove changes from the local file).

> **Note**: `HEAD` is a pointer to the last commit.

## Note

when you finish developing a feature and merge it to mastr, you delete that feature branch, but it is a little bit different when using branches like `dev`, `staging`, or `master`.

Those branhces are reserved for only just merging into. you don't make any changes to those branches, you just merge your branches into `dev` or `master` depending on how your code base is set-up.

> **Note**: in large projects like vue.js, we would merge all of our feature branches or bug fixes ..etc into the `dev` branch and then delete the branch that we've just merged in and then when all the changes on the `dev` branch are ready those get merged into `master` but `dev` never gets deleted (all other branches are just temporary).

# OPEN SOURCE

1. fork a repo.
2. clone my fork.
3. do my updates.
4. test'em out.
5. push them back to my fork.
6. create a PR against the original repository.