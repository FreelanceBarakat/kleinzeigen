![Kleinanzeigen Logo](https://www.kleinanzeigen.de/static/img/common/logo/logo-kleinanzeigen-402x80.png)
# CSV parsing coding challenge

Congratulations! You made it to the Kleinanzeigen remote coding challenge, 
where we want to see your hands-on coding skills.


## Steps

1. Check installation prerequisites: JDK version >=17, Maven latest version, your preferred IDE/editor. To see that everything basic is working, execute `mvn verify`, it should show you a `SUCCESS` build.
2. Read carefully through "Requirements" and "Out-of-scope" to focus on the right things.
3. IMPORTANT: After finishing coding, please add your comments and remarks inside this `README.md` file, see end of file. It helps us gaining context on how you reflect on the coding task.
4. Send back the result as mentioned inside the coding challenge mail

Coding guidance: Combine "clean, object-oriented code" with "working software".


##  Requirements

* Take address-book.csv as data-source and parse it programmatically with Java. Do NOT use a csv parsing library, but code it on your own. You can focus to parse based on existing .csv file, no need to cover whole csv standard.
* Printout the result of `How many females are in the address book?`
* Printout the result of `Who is the oldest person in the address book?`
* Printout above results inside [`exercise.Main.main()`](/src/main/java/exercise/Main.java).
* Ideally you write a few unit tests inside [`exercise.CSVTest.java`](/src/test/java/excercise/CSVTest.java).
* Don't feel constrained to `Main.java` or `CSVTest.java`. You can structure, create further classes and rename things as you like. 


## Out-of-scope

* NO need to be Maven expert or adapt build, project harness and build is setup already.
* NO Javadoc necessary. Tests and self explaining code is sufficient.


## Your comments / remarks

I chose to implement the code using a simple layered application with clean code.

What would you do if you had more time? 
- Add code quality checks (To spot bugs and checkstyle..etc)
- Test coverage ( plugins like Jacoco )
- Add more types of tests (like but not limited to: Integration tests, performance tests)
  - But since it was only asked to create unit tests, I only created unit tests.
- Use code generation lib to eliminate boiler plate code ( like Lombok & Mapstruct)
- Use more performant methods to read files.
- Support more types/formats of CSV files.

Which trade-offs did you take?

* Simple implementation VS performant way to read files
* Focusing only on 1 type of csv files.
* Services are stateless.
* Top level error handling!


Have fun!
