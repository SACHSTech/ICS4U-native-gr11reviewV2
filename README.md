# Grade 11 Java Review

## Instructions
Program the solutions for each problem in their respective files found in the `src/gr11review/part1 directory`.  You are required to:
* code your solutions in repl.it or VS Code
* commit and push your changes to github
* use proper style conventions for variable names and comments.
* Full marks awarded for matching the sample runs EXACTLY AS SHOWN


## Part 1
### Review1.java - Decisions-if
Create a program that asks the user to enter a month number (1 = January, 2 = February etc.) and day and then prints the day of the year and the zodiac sign based on the day number. Assume that it is not a leap year.
 
The Zodiac Sign Dates are as follows 
* Aries (March 21 – April 19)
* Taurus (April 20 – May 20)
* Gemini (May 21 – June 20)
* Cancer (June 21 – July 22)
* Leo (July 23 – August 22)
* Virgo (August 23 – September 22)
* Libra (September 23 – October 22)
* Scorpio (October 23 – November 21)
* Sagittarius (November 22 – December 21)
* Capricorn (December 22 – January 19)
* Aquarius (January 20 – February 18)  
* Pisces (February 19 – March 20) 
#### Sample Run 1
```
Enter the month number: 2
Enter the day number: 13
Day 44, Aquarius
```

#### Sample Run 2
```
Enter the month number: 5
Enter the day number: 17
Day 137, Taurus
```

### Review2.java - Decisions - switch/case
Create a program that prints out a statement of options. Allow the user to select an option and react appropriately to the option selection using a switch case structure. The options should be as follows:  

0. Print a joke about your hair
1. Print a joke about your feet
2. Print a joke about your clothes 
3. Print a joke about your teacher.  
If an invalid option number is entered (i.e `4`), output `Invalid menu option`.

#### Sample Run 1
```
0. Print a joke about your hair
1. Print a joke about your feet
2. Print a joke about your clothes
3. Print a joke about your teacher
Choose a menu option: 0
Why do bees have sticky hair?
They always use honeycombs.
```

#### Sample Run 2
```
0. Print a joke about your hair
1. Print a joke about your feet
2. Print a joke about your clothes
3. Print a joke about your teacher
Choose a menu option: 4
Invalid menu option
```

### Review3.java - Iteration - for loop 1
Create a program that prints the EVEN numbers from 20 to 200 and prints the numbers from 40 to 3 in decreasing order. You will need to create two separate loops with a blank line between them.

### Review4.java - Iteration - for loop 2
Create a program that asks the user how many trips they would like to make and the fuel efficiency of their car in litres per 100km. The distance traveled for each trip and outputs total distance travelled and the amount of gas consumed. 

#### Sample Run
```
Enter the number of trips: 4
Enter the fuel efficency of the vehicle (in L/100km):  12.5
Enter the distance travelled for trip 1: 45 
Enter the distance travelled for trip 2: 38  
Enter the distance travelled for trip 3: 75  
Enter the distance travelled for trip 4: 102  
Total distance travelled is 260km
Total amount of gas consumed: 32.5L

```
## Review5.java - Iteration - while loop 1
Write a Java program that calculates the remaining amount of a substance after a certain number of half-lives have passed.  

The half-life of a substance is the amount of time it takes for half of it to decay. The formula to calculate the remaining amount of the substance after `n` half-lives is:  
<br>
`remaining = initialAmount * Math.pow(0.5, n)`.  
<br>
where `initialAmount` is the initial amount of the substance and `n` is the number of half-lives that have passed.  
<br>
Your program should ask the user for the initial amount of the substance, and then output how many half-lives it takes for the substance to completely decay.  We can say that a substance has completely decayed if the remaining amount is less than or equal to 0.1.

#### Sample Run
```
Enter the initial amount of substance: 100
The substance has decayed completely after 9 half-lives.
```

### Review6.java - Iteration - while loop 2
Create a fuel efficiency program  similar to the one above, except instead of prompting for the number of trips, the user is able to keep entering trip distances until a distance of 0 is entered.

#### Sample Run
```
Enter the fuel efficency of the vehicle (in L/100km):  12.5

Enter the distance travelled for trip 1: 45 
Enter the distance travelled for trip 2: 38  
Enter the distance travelled for trip 3: 75  
Enter the distance travelled for trip 4: 102
Enter the distance travelled for trip 5: 0

Total distance travelled is 260km
Total amount of gas consumed: 32.5L
```

### Review7.java - String Manipulation
Create program that gets a string from the user and outputs the numbers of letters, digits, spaces, and other characters in the sentence.  

#### Sample Run
```
Enter a string:  There are 12 months in a year.
# Letters: 21
# Digits: 2
# Spaces: 6
# Other: 1
```

### Review8.java - Pre-defined methods - Random
Create a program that simulates 1000 pulls of a slot machine, such that 3 random numbers (between 0 and 8) are generated for each pull.  Output the result of each pull on a single line (a space separating the 3 numbers) and the total count of the number times a triple (all 3 numbers equal) was pulled.

#### Sample Run
```
2 6 8
2 2 0
4 3 3
0 8 1
3 0 6
6 4 2
7 0 6
...
2 8 3
0 8 5
5 8 7
1 2 8
2 8 7
0 2 0
0 4 2
3 0 0
14
```
