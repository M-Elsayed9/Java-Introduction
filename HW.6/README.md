Instructions for running the program: 

-download the source files "DaysInMonth.java" which contains the main method 
& "Month.java" which contains the Month class and the MonthDys sub-class into one folder
-run the program using javac DaysInMonth.java && java DaysInMonth
-Enter the month and the year as prompted on the screen 
-the output will be generated on the screen


Homework 6

Write a class named Month. The class should have an int field named monthNumber that holds the
number of the month. For example, January would be 1, February would be 2, and so forth. In addition,
provide the following methods:

• A no-arg constructor that sets the monthNumber field to 1.

• A constructor that accepts the number of the month as an argument. It should set the monthNumber
field to the value passed as the argument. If a value less than 1 or greater than 12 is passed, the
constructor should set monthNumber to 1 and throw the appropriate exception using a custom
exception class.

• A constructor that accepts the name of the month, such as “January” or “February” as an argument. It
should set the monthNumber field to the correct corresponding value. Throw an exception when an
invalid string is given for the name of the month using a custom exception class.

• A setMonthNumber method that accepts an int argument, which is assigned to the monthNumber
field. If a value less than 1 or greater than 12 is passed, the method should set monthNumber to 1.

• A getMonthNumber method that returns the value in the monthNumber field.

• A getMonthName method that returns the name of the month. For example, if the monthNumber field
contains 1, then this method should return “January”. This method should use a switch statement to
match monthNumber to monthName.

• A toString method that returns the same value as the getMonthName method.

• An equals method that accepts a Month object as an argument. If the argument object holds the same
data as the calling object, this method should return true. Otherwise, it should return false.
Write a class named MonthDays that extends Month. The class’s constructor should accept two
arguments:

• An integer for the month (1 January, 2 February, etc.).

• An integer for the year
The class should have a method named getNumberOfDays that returns the number of days in the specified
month as an intenger. The method should use the following criteria to identify leap years:

1. Determine whether the year is divisible by 100. If it is, then it is a leap year if and if only it is
divisible by 400. For example, 2000 is a leap year but 2100 is not.

2. If the year is not divisible by 100, then it is a leap year if and if only it is divisible by 4. For
example, 2008 is a leap year but 2009 is not.
Demonstrate the class in a program that asks the user to enter the month (letting the user enter an integer
in the range of 1 through 12) and the year. The program should then display the number of days in that
month.

Here is a sample run of the program:

Enter a month (1-12): 2 [Enter]

Enter a year: 2008 [Enter]

February 2008 has 29 days
