# Module 5 Assignment

## Table of Contents

* [Iterative vs Recursive Performance Chart](#performance-chart)
* [Requirements](#requirements)
* [User Guide](#user-guide)

## Performance Chart
![alt text](https://github.com/davix14/module5Assignment/blob/master/Chart.png "Performance Chart")

## User Guide
Prerequisites:

* Ensure that java is installed on your computer and all enviroment variables are set. If help is needed with this step look at [these instructions](https://www.java.com/en/download/help/path.html)

Usage:
1. Clone the repository
2. Navigate to the project directory where repository was cloned to
3. Run the gradlew file and pass run command in terminal accompanied by ```--args="5"``` but instead of 5 you can supply any integer you want. This number will be the number that the fibonacci sequence will run until for both recursive and iterative methods.
   * ex: ```./gradlew run --args="5"```
4. The console will print out all results

## Technical Documentation

* The program must take user-provided arguments to define until what spot in the fibonacci sequence the methods will run until.
* The program must run both methods in their own thread to ensure one method does not slow down the other.
* The program must time each method independently and report the time each method took to complete in nanoseconds.
* The program was written using core java libraries in kotlin.
