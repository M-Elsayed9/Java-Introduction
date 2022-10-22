Homework 5

instructions for running the program:

1-Download the src file (distanceTraveled.java) & the inputfile (DT_inputFile.txt) into one folder.
2-open the terminal and run the command javac distanceTraveled.java to compile
3-run the command java distanceTraveled to run the program, this will generate 8 different outputfiles with the report for each vehicle
E.g: "Train.txt", "Car.txt", etc... 


Write a program that calculates distance traveled based on vehicle type and its speed and time. Your
program will read a text file with information for each vehicle, its speed, and time and produce a report
for each record in the input file. Below is a sample of an input file; you should create your own version
with different values.

Vehicle,Speed,Time
Train,40,3
Scooter,2,1
Moped,15,2
Truck,60,5
F1, 212,2

The distance a vehicle travels can be calculated as follows: Distance 5 Speed * Time
For example, if a train travels 40 miles-per-hour for three hours, the distance traveled is 120 miles.
Write a method named distance that accepts a vehicle’s speed (in miles-per-hour) and time (number of
minutes) as arguments and returns the distance the vehicle has traveled. Use a loop to display the distance
a vehicle has traveled for each hour of a time-period specified by the user. For example, if a vehicle is
traveling at 40 mph for a three-hour time-period, it should display a report for that vehicle such as:

Hour 		Distance Traveled
-------------------------------
1 		40
2 		80
3 		120

Write a separate method saveAsFile that accepts a filename (String) to print the report to a file. For
example, the above report would print to train.txt.
Input Validation: Do not accept a negative number for speed and do not accept any value less than 1 for
time traveled.
