# Refractoring rules

## Installing
    Install SourceMonitor
    Create a Java analyse project
    Import the guard app
		
#### Thresholds
Maximums:

LOC (Lines of code) - Not a real maximum, a high amount might be more error prone.

Cyclomatic complexity - 15

Block Depth - 7

If any of these thresholds are met add the Class to trello for critical refractoring, also add as issue on github.

#### Who does what?

During code review, we will know which classes have to highest complexity. Who should refactor the specified class is decided on as a group. 

The code reviews are carried out as teams of two, each person looks through the partners code and looks for error and lines that needs to be refined to correspond to or coding convention and quality specifications.

The feedback is annotated in a document, and the programmer has to fix the code in question.
When this is completed the document is marked done. 

#### When?

During friday code reviews. 

If the refactoring is critical, make the changes ASAP.
