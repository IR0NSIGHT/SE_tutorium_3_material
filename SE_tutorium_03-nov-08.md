# Exercise #03 - Social Coding & GitHub

### 1. Organization

0. Is there anything about the previous homework (HW1) that your tutor wants to tell you?
1. Do you have some questions about the older homework (HW2)?
2. Do you know there are two homeworks running currently (HW2 and HW3)?
3. Did you get an invite to a GitHub team `se-tutorium-N`? Check your email!

### 2. Remotes

**Goal:** Know how to synchronize local repository with a remote.

0. Feel free to skip this if you managed to do it in last tutorial.
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

### 3. Issues

**Goal:** Know what issues are and know how to write good issues.

0. Can you find some larger repository on GitHub?
1. What are issues (on GitHub) for? What kinds of issues exist?
2. What does an issue contain?
    - What are labels for?
    - What are the "Assignees" for? Are those the same as authors?
3. Discuss: What makes an issue good?
    - Can you find some examples online on GitHub?
    - Can you find an improvable issue on GitHub? How would you improve it?
4. How do you create an issue?

### 4. Pull Requests & Reviews

**Goal:** Know what PRs are and know how to write good PRs. Also know how to review PRs.

1. What are pull requests (on GitHub) for?
2. What does an pull request contain?
    - What are the "Reviewers" for?
    - How do you link a pull request to an issue?
    - Can there be multiple pull requests per issue? Can there be multiple issues solved by one pull request?
    - In which situation is the pull request author different from the issue author?
3. Discuss: What makes a pull request good?
    - Can you find some examples online on GitHub?
    - Can you find an improvable pull request on GitHub? How would you improve it?
4. How do you create a pull request?
5. What are pull request _reviews_ for?
6. How do you create a pull request review?
7. Discuss: What makes a pull request _review_ good? See resources:
    - [Standard of Code Review](https://google.github.io/eng-practices/review/reviewer/standard.html)
    - the [summary](https://google.github.io/eng-practices/review/reviewer/looking-for.html#summary) in "What to look for in a code review"
    - the [summary](https://google.github.io/eng-practices/review/reviewer/comments.html#summary) in "How to write code review comments"

### 5. Social Coding

> You can do two things at once, but you can't focus effectively on two things at once. --Gary Keller

**Goal:** Try coding in a team of ≥20 people.

1. Clone the repository $REPO. <!-- TODO(jb) -->
2. Open it in the IntelliJ IDE.
3. Run the project.
    - In IntelliJ: use the green run button ▶️ on the top right
    - If you prefer the command line: use the command `sbt run`.
    - If you have any problems with your setup, please, ask on the forum.
4. On the `main` branch, add your GitHub username to the list of students in `peopleNames`, _while keeping the list sorted_.
5. Run the project again to test that everything works.
6. Commit your changes to the `main` branch and push your changes.
7. Discuss what happened.

### 6. Tooling

> A skilled craftsman must know how to use their tools in order to perform their craft well.

**Goal:** Can use the IDE efficiently.

1. Open $REPO in the IntelliJ IDE.
2. Hover over a type and observe the tooltip, hover over a term and observe the tooltip.
3. Use 'go to definition' and look at the definition of a name.
4. Use 'find usages', use 'find implementation' on a method/class/trait to find where it's used.
5. Use right click to see what other actions the IDE can perform.
6. Use context actions (the little lightbulb 💡).
7. Using everything you've learned in this part, find out (some of) the following: 
   - What are the existing enums and classes? Where are they located? How are they used?
   - Where is the user input being loaded? How are commands recognized? Which object holds the current state of the game?
   - How are people implemented? How are rooms implemented? How are the rooms connected?
   - Where are responses implemented and how?

### 7. GitHub Flow

**Goal:** Think about the logistics of working in a team.

1. Why can't just everybody commit straight to `main`?
2. How can you use branches to collaborate together?
3. Remember why issues and PRs are useful!
4. Draw a diagram of how one might work: creating an issue, then a branch, then a PR and finally one (or more) reviews.
5. Find out what "GitHub Flow" is.
6. Try GitHub Flow out on $REPO
   - Your goal is to add something new to this project.
     - example: new responses, new rooms, new functionality, ...
   - Use GitHub Flow: make an issue, then a pull request, assign a reviewer, then merge.
   - Note: You might need to reset your local changes! (And possibly even reset some commits...)

### 8. Homework

> Einmal, zweimal, dreimal, viermal, fünfmal, sechsmal, und… siebenmal in der Woche zu viele Hausaufgaben!

**Goal**: Be well set-up for the current homework.

1. Find out how many people need to be in a team for the current homework.
2. Find out if you can use AI assistance. If you can, for which tasks can you use it? Who is responsible for the AI output?
3. Have you already accepted the homework? Do you still need one or more teammates?
4. Why is it important to start early? Why is it important to work together?
5. Do you have any questions about the homework?
