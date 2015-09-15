# Web Engineering 2015-2016 / Hello
User name | NIA | Travis-CI|Score
----------|-----|----------|-----
[UNIZAR-30246-WebEngineering](https://github.com/UNIZAR-30246-WebEngineering/hello) |30246 | [![Build Status](https://travis-ci.org/UNIZAR-30246-WebEngineering/hello.svg)](https://travis-ci.org/UNIZAR-30246-WebEngineering/hello)
your name | your nia | your Travis-ci status

This is the repository that we will use for the first assignment of the course 2015-2016. This guide is command line oriented but your are free to use IDE like _Eclipse_ and _IntelliJ IDEA_ which have full support of the tools that we are going to use. We also assume that you have installed in your box _Java 8 JDK_.

This is a speed competition. The quicker will do less work and will be more easily to them to pass it. You can browse the [src](src) folder. The code is not documented and I expect that you documment it without breaking it. Each should add a few lines adding __NEW__ and __CORRECT__ documentation. The topics expected are:
* How to build the code
* How to test the code
* How to deploy the code in a server
* Which are the technologies used in the code
* How these technonogies work
* What means each a specific piece or code
* Which is the purpose of a specific Java annotation

The documentacion can be added only to existing files (here in _README.md_ or any in [src](src)) and must be written in English (B1 level of course!).

And remember, if you add outstanding information you will have a cumulative bonus of 10% in your personal score in the evaluation of the project. People deserving the cummulative bonus will be announced here in the Score column. If you fail to commit your work before October, 17th you will have a cumulative penalisation of 20% in your personal score in the evaluation of the project.


## Set up git
The first step is setting up [git](http://git-scm.com/). This is a _git_ repository. First, you’ll need to sign up for an account on [GitHub.com](https://github.com). Let's imagine that you account is named `your-github-username` 

Install _git_ for Windows, Mac or Linux as [needed](http://git-scm.com/downloads). 
Next, in your console type:
```
$ git config --global user.name "Your real Here"
$ git config --global user.email "your_email@youremail.com"
$ git config --global push.default simple
```
Next steps you must configure your preferred way to connecting _GitHub_: _HTTPS_ ([tutorial](https://help.github.com/articles/caching-your-github-password-in-git/)) or _SSH_ ([tutorial](https://help.github.com/articles/generating-ssh-keys/)).
Now you can create your own online repository on _GitHub_ ([tutorial](https://help.github.com/articles/create-a-repo/))

## Fork this repository
Forking this repository is very easy. First click on the right-top corner of the page _Fork_. That's it!. Now you have https://github.com/UNIZAR-30246-WebEngineering/hello cloned in `https://github.com/your-github-username/hello`
Next you need to keep your fork synced. We assume here that you have set up _git_ in your computer.
```
$ git clone https://github.com/your-github-username/hello
$ cd hello
$ git remote add upstream https://github.com/UNIZAR-30246-WebEngineering/hello.git
```
## Keep synced this repository
Do the following steps to keep your repo synced.
```
$ cd hello
$ git fetch upstream
$ git checkout master
$ git merge upstream/master
```
## Setting up Gradle
[Gradle](http://gradle.org/) is the building tool used in this course. It is like a Swiss Army knife for building software from the command line. _Gradle_ is configured by adding a file named `gradle.build` to the root directory of a project, which is a [Groovy](http://www.groovy-lang.org/) script. Please, refer to the [Gradle user guide](https://docs.gradle.org/current/userguide/installation.html) for its installation. Once it is installed just do a first run for checking the code:
```
$ cd hello
$ gradle check
```
## Setting up Travis-CI
[Travis-CI](https://travis-ci.org/) is an open-source hosted, distributed continuous integration service used to build and test projects hosted at _GitHub_. _Travis CI_ is configured by adding a file named `.travis.yml`, which is a [YAML](http://yaml.org/) format text file, to the root directory of the _GitHub_ repository. When you push code to your repository, _Travis CI_ grabs your code and build it, providing a nice report of the outcome (see [here](https://travis-ci.org/UNIZAR-30246-WebEngineering/hello)). You only need to settup a free account linked to your GitHub account and configure _Travis-CI_ to monitor your `your-github-username/hello` repository.

## Upload your changes
In order to check that _Travis-CI_ is working well modify locally `README.md` and add to the above table the following [markdown](https://help.github.com/articles/github-flavored-markdown/) code:
```
your name | your nia | [![Build Status](https://travis-ci.org/your-github-username/hello.svg)](https://travis-ci.org/your-github-username/hello)
```
Next add your changes into your local repository:
```
$ cd hello
$ git add -A
$ git commit -m "with a concise description of the commit"
```
And then push them to your online _hello_ repository in __GitHub__:
```
$ git push
```
The file `README.md` in your _GitHub_ repository will be updated and _Travis-CI_ will start to build and test your code. Soon your badge will turn green if you refresh your browser. Otherwise, it means that you have done something wrong.

## Complete the documentation

Now is time to review the code and look for relevant and correct information. Once your have updated locally ensure that you code works with `gradle check` and if it works do a `git push`.

## Do a pull request
Finally, you must make a pull request. Go to your `your-github-username/hello` repository in __GitHub__ and click on the green icon on the left. Create a pull request so that we can check your changes and accept them in this repository. If everything is ok, your changes will be added. If not, you will receive a message explaining why not. 

The most three common reason for rejecting your request are:
* You are not adding _NEW_ and _CORRECT_ information.
* Your request cannot be automatically merged. The fix is easy. sync your local repository with https://github.com/UNIZAR-30246-WebEngineering/hello, then upload your changes, and finally perform the pull request. 
* Your __Travis-CI__ status is not green. Check why it doesn't work and fix it!
