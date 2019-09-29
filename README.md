# Assignment 3: Inherit the Wind

## Assignment Self Assessment:
#### Reflection
[//]: <> (share your thoughts on the assignment, things you learnt and would like to remember when you look back at this assignment)


#### Self Assessment
- [ ] The program runs with no errors.
- [ ] The Person class includes all the fields and methods specified above.
- [ ] The Worker class includes all the fields and methods specified above.
- [ ] Constructor calls super, passing all the person attributes.
- [ ] The Salary Worker class includes all the fields and methods specified above.
- [ ] Constructor calls super, passing all the person and worker attributes.
- [ ] Proper display of the end result.
- [ ] Proper usage of Git and GitHub (frequent commits, explanatory commit messages)
- [ ] Although, the assignment covers the “technical” implementation of Inheritance. Do you think it was appropriately implemented? Why or why not? (include your answer in the notes sectiosn of the self assessment in the README file)

**Your Grade:**  /20

**Notes:**


## Lab Goals:
1. Practice using inheritance to create sub-classes.
2. Practice Polymorphism and calling sub-classes when superclasses are expected.

## Final Result:
You will be submitting a git repository with the following naming
convention, `3-inherit-the-wind-<your-github-username>`, (i.e., `3-inherit-the-wind-Ygilany`). The repository contains:
1. one Java Project with the following files:
  - Person.java (a class to represent a person object) - you can copy that from the previous assignment.
  - Worker.java (inherit from Person)
  - SalaryWorker.java (inherit from Worker)
  - ApplicationRunner.java (Java main class).
2. a modified README.md file that includes your self-assessment

----

## Instructions
1. Copy the Person class from the previous assignment.


  |**Person**| | |
  |-------|--|--|
  |*Fields*|||
  ||`String ID;`| |
  ||`String firstName;`| |
  ||`String lastName;`| |
  ||`String title;`| Mr., Mrs., Ms., Prof., Dr., Hon., ... |
  ||`int YOB;`| - Year of Birth <br/> - Range should be 1940-2010 <br/> - make sure validations happen in the constructor as well as the setter method. |
  |*Methods*|||
  ||Constructor| |
  ||Getters and Setters| |
  ||`public String fullName()`| returns a concatenation of the first and last names |
  ||`public String formalName()`| returns a concatenation of the title and the full name |
  ||`public static int getAge(int year)`| - A static method that takes a year and returns an age. <br/> - Use the Calendar Object (Requires a bit of web search)|
  ||`public String toCSVDataRecord()`| - returns a comma separated value (csv) String suitable to writing to a java text file. <br/> - Make sure to use this function when saving data to the file. <br/> - (i.e., 0001,John, Doe,Mr., 2000)|
  
  
  
2. Create a *Worker.java* class (inherit from Person)

  |**Worker**| | |
  |-------|--|--|
  |*Fields*| | |
  ||`double hourlyPayRate;`| |
  |*Methods*| | |
  | |Constructor| - the constructor should set all properties from the Person and Worker class. <br/> - The constructor should call super() to call the constructor for the Person and then go on to set the rest of the fields.|
  | |Getters and Setters| |
  | |`public double calculateWeeklyPay(double hoursWorked)`|  return the pay total. Hours under 40 are at the HourlyRate, hours above 40 are at time and a half (1.5) |
  | |`public String displayWeeklyPay(double hoursWorked)`| should indicate the number of hours of regular pay (40) and the total and the number of hours of overtime pay and the total as well as the total combined pay. |

3. Create a *SalaryWorker* Class (inherit from Worker)

  |**SalaryWorker**|||
  |-------|||
  |*Fields*|||
  ||`double annualSalary;`| |
  |*Methods*|||
  ||Constructor| - sets all properties from the Person, Worker, and SalaryWorker classes <br/> - The constructor for SalaryWorker should use super() to call the constructor for Worker which in turn, calls the constructor for the Person class..|
  ||Getters and Setters| |
  ||`public double calculateWeeklyPay(double hoursWorked)`|  Override calculateWeeklyPay to return the pay total. <br/> - Note that the parameter hoursWorked is not used here but is retained for polymorphism. <br/> - Take the annualSalary and divide by 52 to get the weekly pay. |
  ||`public String displayWeeklyPay(double hoursWorked)`| Override displayWeeklyPay <br/> - The return value should indicate that the weekly pay is a fraction of the yearly salary |

4. Modify the Java Main Class `ApplicationRunner`.
  - Create 3 Worker Instances.
      - Pick reasonable hourly rates.
      - Of course, they have IDs, Names, Titles, and YOBs.

  - Create 3 SalaryWorker Instances.
    - Pick reasonable annual rates.
    - Of course, they have IDs, Names, Titles, and YOBs.

  - Add them to an ArrayList<Worker>
  - Write a loop that simulates 3 Weekly pay periods.
    - Week 1 is a 40 hour week.
    - Week 2 was crunch time and everyone worked 50 hours.
    - Week 3 is back to normal with 40 hours.

- Generate a display showing the weekly pay for each of the workers for each week.
- Output should look something like this…

![Example](https://it2045c.github.io/Labs/Assignments/3.inherit_the_wind/assets/example_output.png)

### Grading

- [ ] The program runs with no errors.
- [ ] The Person class includes all the fields and methods specified above.
- [ ] The Worker class includes all the fields and methods specified above.
- [ ] Constructor calls super, passing all the person attributes.
- [ ] The Salary Worker class includes all the fields and methods specified above.
- [ ] Constructor calls super, passing all the person and worker attributes.
- [ ] Proper display of the end result.
- [ ] Proper usage of Git and GitHub (frequent commits, explanatory commit messages)
- [ ] Although, the assignment covers the “technical” implementation of Inheritance. Do you think it was appropriately implemented? Why or why not? (include your answer in the notes sectiosn of the self assessment in the README file)