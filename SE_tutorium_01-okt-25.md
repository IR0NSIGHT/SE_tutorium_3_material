# Exercise #01 - Intro to Git

### 1. Introduction

> The first step towards getting somewhere is to decide you're not going to stay where you are. --J.P.Morgan

**Goal:** Get to know each other, know where to find help and how to ask for it.

1. Who is your tutor?
2. What is your experience with `git`?
3. Do you have some professional experience programming? Did you program in a team?
4. How is Software Engineering different from programming?
5. How does the forum work? What is it good for?
6. [How to ask good questions](https://jvns.ca/blog/good-questions/)

![questions-2](https://github.com/se-tuebingen/se-teaching-materials/assets/11269173/ab4b4180-39ad-494e-8e14-5c73a6aa0bcb)

### 2. Quick Terminal Primer

> `command not found: help` --my terminal

**Goal:** Be able to use basic terminal commands

1. What do the following terminal commands do?
    - `cd`, `cp`, `mv`, `mkdir`
2. What does `cd ~/Dokumente` do?
3. What about `cd ../`?
4. How do you find out in which folder you currently are?
5. How to navigate in your history? What does `Ctrl+R` in the terminal do?
6. How to open a file from the terminal?

### 3. Git intro

> It is easy to shoot your foot off with `git`, but also easy to revert to a previous foot and merge it with your current leg. --Jack William Bell

**Goal:** Have a good mental model of `git`, can verify the current state of the repository, know the difference between staging area, working copy and repository. 

1. Set-up `~/.gitconfig` to open `git commit` in something else than `vim`.
2. Use `git status` and `git log --oneline --graph --decorate --all` after **EVERY** git command going forward to check what actually happened.
3. Create a new repository and add a new file to the staging area.
4. Discussion:
    - What should a commit include? What should it not include?
    - What does a good commit message look like?
5. Find out what happened using the commands above, then commit the file to the repository, then use the commands above again.
6. Create one more commit and draw the commit graph.
7. What is the difference between staging area and working copy? How can we move a file between them? Try it and verify with `git status` and `git log`.
8. What is the difference between staging area and repository? How can we move a file between them? Try it and verify with `git status` and `git log`.
9. What is the difference between working copy and repository? How can we move a file between them? Try it and verify with `git status` and `git log`.
10. What does `git diff` do? What is it good for?
    - How do I diff a file between staging area and repository?

### 4. Git-ting gud

> I know I am getting better at golf because I am hitting fewer spectators. --Gerald R. Ford

**Goal**: Can use advanced flags for basic `git` commands.

1. What does `git add -p` do?
    - What does `Stage this hunk [y,n,q,a,d,j,J,g,/,e,?]?` mean? [Hint: try `?`]
2. What does `git add -u` do?
3. What does `git log -p` do? What about `git log -p <filename>`?
4. Find out what the `--oneline`, `--graph` and `--decorate` flags do in `git log`. Experiment and verify.
5. What happens if you do `mv ./tracked-file new-directory/tracked-file` and `git add new-directory/tracked-file`. What does `git status` tell you?
    - Undo the change and try again with `git mv`.
 
### 5. Homework

> Einmal, zweimal, dreimal, viermal, fünfmal, sechsmal, und… siebenmal in der Woche zu viele Hausaufgaben!

**Goal**: Know where your homework is, how to accept it, and how to fill it out.

Find the answers to the following questions:
1. Where can you find your homework?
2. When is the deadline of your homework?
3. Is this homework individual or is it in teams?
4. How can you "accept" your homework to start working on it?
