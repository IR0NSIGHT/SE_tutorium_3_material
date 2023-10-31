# Exercise #02 - Advanced Git

### 1. Review

> That's what makes Linux so good: you put in something, and that effort multiplies. It's a positive feedback cycle. Any program is only as good as it is useful. --Linus Torvalds

**Goal:** Revise & remember.

1. Do you have some questions about the last homework (HW1)?
2. What do you know about git?
3. Can you make three commits (on the same branch) and draw the commit graph?
4. How do you verify the state and history of the repository?
    - Hint: what git commands can you use to see the `status` and the `log` of a repository?
5. Do the very first level of the Learn Git Branching game: https://learngitbranching.js.org

### 2. Branching

> ![12866b49067642acea53e68a20815c76](https://github.com/se-tuebingen/se-teaching-materials/assets/11269173/28f4fda5-df9e-4ab3-b36b-1cf143dc4da7)

**Goal:** Understand git branches and be able to create them and use them.

1. What is a git branch?
    - What are branches good for?
    - How do you make a new git branch?
    - Can one commit be on multiple branches?
    - Can multiple branches point to the same commit?
2. Which git commands do you need to perform to have the following commit graph?
    - Perform the commands one by one, draw the commit graph, verify your assumptions using `git log` and `git status`.
```
                jjj <- experiment
               /
aaa <- bbb <- ccc <- ddd <- main
  \ 
   fff <- ggg <- hhh <- feature <- HEAD
                  \
                   zzz <- wip
```
3. How do you delete a branch?
     - When would branch deletion come in handy?
4. Do the second level of the Learn Git Branching game: https://learngitbranching.js.org

### 3. Merging

> Eventually, all things merge into one, and a river runs through it. --Norman Maclean

**Goal:** Have a good mental model of merging branches and can perform a merge without a problem.

1. What is merging good for?
2. Which commands do you need to use for merging?
3. Do the third level of the Learn Git Branching game: https://learngitbranching.js.org

### 4. Rebasing

> git rebase: Forward-port local commits to the updated upstream head --git manual

**Goal:** Have a good mental model of merging branches and can perform a merge without a problem.

1. What is rebasing good for?
    - What is the difference between merging and rebasing?
    - Draw a commit graph of a repository with two branches and show before and after merging and rebasing.
2. Which command do you need to use for rebasing?
    - What is a "force push"? Why is it sometimes needed and what are its disadvantages?
3. Do the fourth level of the Learn Git Branching game: https://learngitbranching.js.org
 
### 5. Merge conflicts

> To Resolve Conflict, Start with What's Your Fault

**Goal:** Be able to understand and resolve merge conflicts.

Your tutor will show you how (not) to resolve merge conflicts.

1. Why do merge conflicts exist? How do they happen?
2. How can you tell that you're resolving a merge conflict correctly?
3. How can you tell the status and history of a repository?
4. How can you revert a merge if something goes wrong?

### 6. Remotes

> Today, watching television often means fighting, violence and foul language – and that's just deciding who gets to hold the remote control. – Donna Gephart

**Goal:** Know how to synchronize local repository with a remote.

1. Create a new GitHub repository!
    - Make sure you create it with a README.md already in there.
2. Clone your new GitHub repository of your own choice by hand using the commands from the lecture and find out what each one does individually.
```sh
# git clone git@github.../repo.git

git init repo; cd repo
git remote add origin git@github.../repo.git
git fetch --all
git checkout -b main origin/main
```
3. Change something and commit it.
4. Push your changes to GitHub.
5. Observe that your changes are uploaded to GitHub.
6. Can you have multiple remotes? If so, why could you need them? If not, why?
   
### 7. Homework

> Einmal, zweimal, dreimal, viermal, fünfmal, sechsmal, und… siebenmal in der Woche zu viele Hausaufgaben!

**Goal**: Know who your teammates are and how team tasks work.

1. Find out how many people need to be in a team for this homework.
2. Have you already accepted the homework? Do you still need one or more teammates?
3. Why is it important to start early?
4. Why is it important to work together?
5. Do you have any questions about the homework?
