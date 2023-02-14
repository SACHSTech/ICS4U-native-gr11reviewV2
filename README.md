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

Total distance travelled: 260km
Total amount of gas consumed: 32.5L

```
## Review5.java - Iteration - while loop 1
Write a program that prompts for a `yearly_amount`, annual `compound_interest_rate`, and outputs the number of years .  For compound interest, the interest rate is applied to the existing amount after each year.  


### Sample Run
```
Enter the yearly invested amount: 100
Enter the compound interest rate: 2.5
Enter the target amount: 1800
The target amount will be earned in 15 years.
```

### Explanation
After the first year `$100.00` has been invested and the interest is `2.5/100*100 = $2.50`. Thus the amount of money after the first year is now `$100.00 + $2.50 = $102.50`. 

In the second year another $100.00 is invested for a total of $202.50, and the interest is 2.5/100 * 202.50 = 5.06. The amount after two years is `202.50 + 5.06 =  207.56` ... this continues until the total amount surpasses $1800.  In this case it will be 15 years. 

### Review6.java - Iteration - while loop 2
Create a cash register program similar to the one above, except instead of prompting for the number items, the user is able to keep entering item prices until the enter 0.  Import and use the [`java.text.DecimalFormat`](https://jenkov.com/tutorials/java-internationalization/decimalformat.html) class to output the information in currency format (0.00)

#### Sample Run
```
Enter the price for an item: 2.50
Enter the price for an item: 3.99
Enter the price for an item: 6.99
Enter the price for an item: 7.99
Enter the price for an item: 0
Subtotal: $21.47
Tax: $2.79
Total: $24.26
```

### Review7.java - String Manipulation
Create a program that will input a sentence from the user and store it in a String variable called theSentence. Use the String methods to compute the following about the sentence.
Stats about the sentence:
* There are # characters in the sentence.
* There are # spaces in the sentence.
* There are # letter a in the sentence.
* Taking the odd numbered characters in the sentence produces the following string “---------“

#### Sample Run
```
aaa bbb
There are 7 characters in the sentence.
There are 1 spaces in the sentence.
There are 3 letter a in the sentence.
----
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
