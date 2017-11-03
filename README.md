# KMF - Kill, Marry, Love
### Problem Statement:
Gathering a large group of friends can be a daunting task.  As a host you can find yourself worried about keeping everyone
entertained. There is a need for a hands off way to keep everyone engaged without sacrificing your own sanity. 

### Proposed Solution:
This API is built as a fun icebreaker, party game similar to quiplash.  It will either take in a list of 3 name, a category, or a number 
of people participating.  It will then return a fun story based on the parameters given. For example taking in Spock, Tiberius, 
and Bones: 

The application will return a story of how you casually let bones die, after spending a passionate night with spock, and 
then lived a long happy life with Tiberius.  

### Project Plan:

A more detailed look into the project plan can be found [here](design.md).

### Included URI's:
- kmf/{category} -> return a random story with 3 people from a given category
- kmf/{category}/{numberOfPeople} -> return a random story with numberOfPeople from a given category
- kmf/{numberOfPeople} -> return a story with people randomized from all categories
- kmf/{numberOfPeople}/{names} -> using the provided names give a story

## Technology Requirements

This application requires Maven 3.0 + and at least JDK 1.8 to be installed. 


## Running The application

Clone the repository 
```
$ git clone git@github.com:MadJavaEntFall2017/fantastic-umbrella.git
```

In the root directory of the application run the maven command 
```
$ mvn install
```

## The Team - Contact us
- [Brooke Swanson](mailto:kmf@kmf.com) 
- [Collin Schindler](mailto:)
- [Jake Stroffregen](mailto:)
- [Justin Skarha](mailto:) 
