# Git & GitHub Learning

This section documents my practical learning of Git and GitHub using Fedora Linux and the terminal.

## Repository

GitHub Repository:

`AnirudhaSwami/Learnings`

Local Repository:

`~/MyStudy`

---

# Stage 1 — Install GitHub CLI

## Objective

Install GitHub CLI (`gh`) on Fedora so GitHub can be accessed and managed from the terminal.

## Check Installation

```bash
gh --version
```

Initially, `gh` was not installed.

Fedora suggested installing the package:

```text
Install package 'gh' to provide command 'gh'?
```

## Installation

```bash
sudo dnf install gh
```

## Verify

```bash
gh --version
```

## What I Learned

GitHub CLI (`gh`) is a command-line tool that allows GitHub repositories, authentication, pull requests, issues, and other GitHub features to be managed from the terminal.

---

# Stage 2 — Authenticate GitHub CLI

## Objective

Authenticate the terminal with my GitHub account.

## Command

```bash
gh auth login
```

## Authentication

GitHub CLI asked:

```text
Where do you use GitHub?
> GitHub.com
  Other
```

I selected:

```text
GitHub.com
```

Then used:

```text
HTTPS
Login with a web browser
```

## Verify Authentication

```bash
gh auth status
```

## Result

The terminal confirmed that the GitHub account was authenticated.

## What I Learned

`gh auth login` connects GitHub CLI with my GitHub account so that GitHub operations can be performed from the terminal.

`gh auth status` can be used to check the current authentication status.

---

# Stage 3 — Check GitHub Repository

## Objective

Find and verify the GitHub repository belonging to my account.

## Command

```bash
gh repo list AnirudhaSwami
```

## Result

The GitHub account contained the repository:

```text
AnirudhaSwami/Learnings
```

Description:

```text
My learning journey
```

## Get Repository Details

```bash
gh repo view AnirudhaSwami/Learnings
```

## Repository URL

`https://github.com/AnirudhaSwami/Learnings`

## What I Learned

The repository name must match exactly.

For example:

```text
Learning
```

and

```text
Learnings
```

are different repository names.

---

# Stage 4 — Connect Local Repository to GitHub

## Objective

Connect the existing local Git repository to the GitHub repository.

## Local Repository

```bash
cd ~/MyStudy
```

## Check Existing Remote

```bash
git remote -v
```

Initially, the remote pointed to the wrong repository:

```text
https://github.com/AnirudhaSwami/Learning.git
```

The correct repository was:

```text
https://github.com/AnirudhaSwami/Learnings.git
```

## Fix Remote URL

```bash
git remote set-url origin https://github.com/AnirudhaSwami/Learnings.git
```

## Verify

```bash
git remote -v
```

Expected result:

```text
origin  https://github.com/AnirudhaSwami/Learnings.git (fetch)
origin  https://github.com/AnirudhaSwami/Learnings.git (push)
```

## What I Learned

A Git remote connects a local repository with a remote repository such as GitHub.

`origin` is the standard name used for the main remote repository.

If a remote already exists, use:

```bash
git remote set-url origin <new-url>
```

instead of:

```bash
git remote add origin <url>
```

---

# Stage 5 — Check Remote Branches

## Objective

Check which branches actually exist on GitHub.

## Command

```bash
git ls-remote --heads origin
```

## Result

GitHub contained:

```text
refs/heads/Learning
refs/heads/main
```

## Local Branches

The local repository contained:

```text
MyLearning
main
```

## Important Difference

Local:

```text
MyLearning
main
```

GitHub:

```text
Learning
main
```

Therefore, `MyLearning` and `Learning` are different branch names.

## What I Learned

`git branch -a` shows local and locally-known remote branches.

`git ls-remote --heads origin` directly checks the branches currently available on the remote GitHub repository.

---

# Stage 6 — Delete Learning Branch

## Objective

Delete the unwanted `Learning` branch from GitHub.

## Important Observation

GitHub's Branches page displayed `Learning` under both:

- Your branches
- Active branches

This does **not** mean there are two `Learning` branches.

It is the same branch displayed in two categories.

The GitHub repository had:

```text
main
Learning
```

## Delete Remote Branch

```bash
git push origin --delete Learning
```

## Verify

```bash
git ls-remote --heads origin
```

After successful deletion, only `main` should remain:

```text
refs/heads/main
```

## Important Note

Deleting a branch removes the branch reference. It does not necessarily mean that every commit has immediately disappeared from Git's underlying history.

---

# Stage 7 — Clear Main Branch

## Objective

Remove the files from the GitHub `main` branch while keeping `main` as the default branch.

## Why Can't I Delete Main?

`main` is the default branch of the GitHub repository.

Instead of deleting the branch, the contents can be removed and the change committed.

## Switch to Main

```bash
git switch main
```

## Check Status

```bash
git status
```

## Remove Tracked Files

```bash
git rm -r .
```

## Create Commit

```bash
git commit -m "Clear main branch"
```

## Push to GitHub

```bash
git push origin main
```

## Result

The `main` branch remains available:

```text
Learnings
└── main
```

but the tracked project files are removed from the latest version of the branch.

## Important Note

This does **not** erase the previous Git commit history.

If the objective is to completely remove old files from Git history, a history rewrite/reset is required.

---

# Git & GitHub Commands Learned

## Git Commands

```bash
git remote -v
git remote set-url origin <url>
git branch -a
git ls-remote --heads origin
git switch <branch>
git push origin --delete <branch>
git rm -r .
git commit -m "<message>"
git push origin <branch>
git status
```

## GitHub CLI Commands

```bash
gh --version
gh auth login
gh auth status
gh repo list
gh repo view
```

---

# Key Concepts

## Local Repository

A Git repository stored on my computer.

## Remote Repository

A Git repository hosted on GitHub.

## Remote

`origin` is the conventional name given to the GitHub repository connected to the local repository.

## Branch

A separate line of development inside a Git repository.

## Default Branch

The primary branch of a GitHub repository. In this repository, it is `main`.

## GitHub CLI

`gh` allows GitHub operations directly from the terminal.

---

# Final Repository State

After completing the cleanup:

```text
GitHub: AnirudhaSwami/Learnings
│
└── main
```

The unwanted `Learning` branch is deleted, while `main` remains as the default branch.
