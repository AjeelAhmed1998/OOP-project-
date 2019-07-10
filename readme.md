Microsoft Windows [Version 10.0.17134.829]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\ajeel>cd Desktop

C:\Users\ajeel\Desktop>cd OOP_final_project_daycareManagementSystem

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git init
Reinitialized existing Git repository in C:/Users/ajeel/Desktop/OOP_final_project_daycareManagementSystem/.git/

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git help
usage: git [--version] [--help] [-C <path>] [-c <name>=<value>]
           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
           [-p | --paginate | -P | --no-pager] [--no-replace-objects] [--bare]
           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
           <command> [<args>]

These are common Git commands used in various situations:

start a working area (see also: git help tutorial)
   clone      Clone a repository into a new directory
   init       Create an empty Git repository or reinitialize an existing one

work on the current change (see also: git help everyday)
   add        Add file contents to the index
   mv         Move or rename a file, a directory, or a symlink
   reset      Reset current HEAD to the specified state
   rm         Remove files from the working tree and from the index

examine the history and state (see also: git help revisions)
   bisect     Use binary search to find the commit that introduced a bug
   grep       Print lines matching a pattern
   log        Show commit logs
   show       Show various types of objects
   status     Show the working tree status

grow, mark and tweak your common history
   branch     List, create, or delete branches
   checkout   Switch branches or restore working tree files
   commit     Record changes to the repository
   diff       Show changes between commits, commit and working tree, etc
   merge      Join two or more development histories together
   rebase     Reapply commits on top of another base tip
   tag        Create, list, delete or verify a tag object signed with GPG

collaborate (see also: git help workflows)
   fetch      Download objects and refs from another repository
   pull       Fetch from and integrate with another repository or a local branch
   push       Update remote refs along with associated objects

'git help -a' and 'git help -g' list available subcommands and some
concept guides. See 'git help <command>' or 'git help <concept>'
to read about a specific subcommand or concept.

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git push help
error: src refspec refs/heads/master does not match any.
error: failed to push some refs to 'help'

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git remote add origin https://github.com/AjeelAhmed1998/OOP-project-.git
fatal: remote origin already exists.

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git add .

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git commit -m "adding all files"
[master (root-commit) 7205c50] adding all files
 115 files changed, 5883 insertions(+)
 create mode 100644 .idea/checkstyle-idea.xml
 create mode 100644 .idea/codeStyles/codeStyleConfig.xml
 create mode 100644 .idea/dictionaries/wayne.xml
 create mode 100644 .idea/inspectionProfiles/Project_Default.xml
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/modules.xml
 create mode 100644 .idea/workspace.xml
 create mode 100644 Employee.ser
 create mode 100644 OOP_final_project_daycareManagementSystem.iml
 create mode 100644 build.xml
 create mode 100644 build/classes/.netbeans_automatic_build
 create mode 100644 build/classes/.netbeans_update_resources
 create mode 100644 build/classes/ex2.class
 create mode 100644 build/classes/ex3$1.class
 create mode 100644 build/classes/ex3.class
 create mode 100644 build/classes/ex3.form
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/Caregiver.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/Child.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/Cook.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/Employee.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/Janitor.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/OOP_final_project_daycareManagementSystem.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/Parent.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/Person.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/Receptionist.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/admitAndRegister$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/admitAndRegister.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/bill.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/createEmployee$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/createEmployee.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/createProfile$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/createProfile.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/dateClassTest.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/ex.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/existingParentAndNewChild$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/existingParentAndNewChild.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/for_date$1.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/for_date.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/for_date.form
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/hourlyEmployee.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/login$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/login.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/mainMenu$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/mainMenu.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/newParentAndChild$myactionlistener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/newParentAndChild.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/registerChild$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/registerChild.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/remove$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/remove.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/removeChild$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/removeChild.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/removeEmployee$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/removeEmployee.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/salariedEmployee.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/search$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/search.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/searchChild$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/searchChild.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/searchEmployee$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/searchEmployee.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/securityGuard.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/update$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/update.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/updateChild$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/updateChild.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/updateEmployee$myActionListener.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/updateEmployee.class
 create mode 100644 build/classes/oop_final_project_daycaremanagementsystem/usernameAndPassword.class
 create mode 100644 manifest.mf
 create mode 100644 nbproject/build-impl.xml
 create mode 100644 nbproject/genfiles.properties
 create mode 100644 nbproject/private/private.properties
 create mode 100644 nbproject/private/private.xml
 create mode 100644 nbproject/project.properties
 create mode 100644 nbproject/project.xml
 create mode 100644 parentAndChild.ser
 create mode 100644 src/ex2.java
 create mode 100644 src/ex3.form
 create mode 100644 src/ex3.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/Caregiver.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/Child.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/Cook.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/Employee.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/Janitor.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/OOP_final_project_daycareManagementSystem.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/Parent.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/Person.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/Receptionist.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/admitAndRegister.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/bill.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/createEmployee.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/createProfile.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/dateClassTest.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/ex.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/existingParentAndNewChild.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/for_date.form
 create mode 100644 src/oop_final_project_daycaremanagementsystem/for_date.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/hourlyEmployee.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/login.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/mainMenu.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/newParentAndChild.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/registerChild.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/remove.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/removeChild.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/removeEmployee.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/salariedEmployee.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/search.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/searchChild.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/searchEmployee.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/securityGuard.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/update.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/updateChild.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/updateEmployee.java
 create mode 100644 src/oop_final_project_daycaremanagementsystem/usernameAndPassword.java

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git pushh origin master
git: 'pushh' is not a git command. See 'git --help'.

The most similar command is
        push

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git push origin master
remote: Repository not found.
fatal: repository 'https://github.com/AjeelAhmed1998/OOP_final_project_daycareManagementSystem.git/' not found

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git status
On branch master
nothing to commit, working tree clean

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git add .

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git status
On branch master
nothing to commit, working tree clean

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>dir
 Volume in drive C is OS
 Volume Serial Number is F083-1E22

 Directory of C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem

07/10/2019  12:44 PM    <DIR>          .
07/10/2019  12:44 PM    <DIR>          ..
02/16/2019  02:37 PM    <DIR>          .idea
12/21/2018  07:50 PM    <DIR>          build
12/21/2018  05:58 PM             3,708 build.xml
02/15/2019  08:49 PM                 0 Employee.ser
12/21/2018  05:58 PM                85 manifest.mf
12/21/2018  05:58 PM    <DIR>          nbproject
02/16/2019  02:35 PM               433 OOP_final_project_daycareManagementSystem.iml
12/28/2018  04:27 PM            38,066 parentAndChild.ser
12/27/2018  03:08 PM    <DIR>          src
12/21/2018  06:02 PM    <DIR>          test
               5 File(s)         42,292 bytes
               7 Dir(s)  313,289,314,304 bytes free

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git init
Reinitialized existing Git repository in C:/Users/ajeel/Desktop/OOP_final_project_daycareManagementSystem/.git/

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git add build.xml

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git status
On branch master
nothing to commit, working tree clean

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git commit -m "Test"
On branch master
nothing to commit, working tree clean

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git
usage: git [--version] [--help] [-C <path>] [-c <name>=<value>]
           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
           [-p | --paginate | -P | --no-pager] [--no-replace-objects] [--bare]
           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
           <command> [<args>]

These are common Git commands used in various situations:

start a working area (see also: git help tutorial)
   clone      Clone a repository into a new directory
   init       Create an empty Git repository or reinitialize an existing one

work on the current change (see also: git help everyday)
   add        Add file contents to the index
   mv         Move or rename a file, a directory, or a symlink
   reset      Reset current HEAD to the specified state
   rm         Remove files from the working tree and from the index

examine the history and state (see also: git help revisions)
   bisect     Use binary search to find the commit that introduced a bug
   grep       Print lines matching a pattern
   log        Show commit logs
   show       Show various types of objects
   status     Show the working tree status

grow, mark and tweak your common history
   branch     List, create, or delete branches
   checkout   Switch branches or restore working tree files
   commit     Record changes to the repository
   diff       Show changes between commits, commit and working tree, etc
   merge      Join two or more development histories together
   rebase     Reapply commits on top of another base tip
   tag        Create, list, delete or verify a tag object signed with GPG

collaborate (see also: git help workflows)
   fetch      Download objects and refs from another repository
   pull       Fetch from and integrate with another repository or a local branch
   push       Update remote refs along with associated objects

'git help -a' and 'git help -g' list available subcommands and some
concept guides. See 'git help <command>' or 'git help <concept>'
to read about a specific subcommand or concept.

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git log
commit 7205c504bd45b8322a995742989c8a9baceb2e03 (HEAD -> master)
Author: AJ <ajeelahmed1998@gmail.com>
Date:   Wed Jul 10 23:05:44 2019 +0500

    adding all files

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git origin
git: 'origin' is not a git command. See 'git --help'.

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git push
fatal: The current branch master has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin master


C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git push --set-upstream origin master
remote: Repository not found.
fatal: repository 'https://github.com/AjeelAhmed1998/OOP_final_project_daycareManagementSystem.git/' not found

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git remote add origin https://github.com/AjeelAhmed1998/OOP-project-.git
fatal: remote origin already exists.

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git remote
origin

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git remote origin
error: Unknown subcommand: origin
usage: git remote [-v | --verbose]
   or: git remote add [-t <branch>] [-m <master>] [-f] [--tags | --no-tags] [--mirror=<fetch|push>] <name> <url>
   or: git remote rename <old> <new>
   or: git remote remove <name>
   or: git remote set-head <name> (-a | --auto | -d | --delete | <branch>)
   or: git remote [-v | --verbose] show [-n] <name>
   or: git remote prune [-n | --dry-run] <name>
   or: git remote [-v | --verbose] update [-p | --prune] [(<group> | <remote>)...]
   or: git remote set-branches [--add] <name> <branch>...
   or: git remote get-url [--push] [--all] <name>
   or: git remote set-url [--push] <name> <newurl> [<oldurl>]
   or: git remote set-url --add <name> <newurl>
   or: git remote set-url --delete <name> <url>

    -v, --verbose         be verbose; must be placed before a subcommand


C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git remote remove origin

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git remote

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git remote add origin https://github.com/AjeelAhmed1998/OOP-project-.git

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git remote
origin

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git remote remove origin

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git add .

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git status
On branch master
nothing to commit, working tree clean

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>
C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git commit -m "Add all"
On branch master
nothing to commit, working tree clean

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git status
On branch master
nothing to commit, working tree clean

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>git push --set-upstream origin master
Enumerating objects: 124, done.
Counting objects: 100% (124/124), done.
Delta compression using up to 4 threads.
Compressing objects: 100% (119/119), done.
Writing objects: 100% (124/124), 100.85 KiB | 1.10 MiB/s, done.
Total 124 (delta 38), reused 0 (delta 0)
remote: Resolving deltas: 100% (38/38), done.
To https://github.com/AjeelAhmed1998/OOP-project-.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.

C:\Users\ajeel\Desktop\OOP_final_project_daycareManagementSystem>
