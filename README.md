# AlaskaAirSeatingExercise
In this coding exercise that I was given by Alaska Air, the instructions were to write code that takes in a string of letter/number combinations that represent seat numbers on an airplane and print out how many families of four can be accomodated (given a specific description of where a family of four can sit).

I felt that the question was fairly straightforward, so the only question I had was whether to return an integer and then print out the method call in the driver or to simply print out the integer as part of the method call. I chose the latter at first, because it would be easier for the client (driver) to run tests in main, but in my final refactor I chose to return the integer.

The instructions told me to assume correctly formatted input. After reviewing the question, I discovered that if seat "A" or "K" were reserved, it was irrelevant to where a family of four could sit, so I assumed that it was okay not to take those seats into consideration in my approach.

I chose JAVA as my coding language and IntelliJ as my IDE because that is the language and IDE with which I am most familiar.

My first instinct was to simply get a working solution quickly in a rather brute-force sort of way. I wanted to see the pattern, so that I could refactor it into cleaner code. When I was given the string and asked to analyze pieces of it, my first thought was to parse it and store it in an array and then sort the array so that the rows would always be in order and use if statements to check conditionals. I considered using a map or a set, and I also considered coding it in JavaScript using a switch statement, but ultimately my first decision was to stick with familiarity just to get a working solution.

Once I had a fully functional, highly redundant solution, I could easily see that a for loop could condense my code immensely. As I was working on that, I considered that since java has a ".contains" method built in, I didn't need to parse the string or sort the array, I could just itterate through it to see if certain seats were reserved. 

In addition to my original code being clunky, it was also not scalable, and I wanted to be sure that my solution had some scalability to it, so when I refactored, I created a constant for the number of rows which could be easily changed without changing any other code.

Once I had it refactored, I made a few other small changes. First, I made it so that the number of rows being checked didn't have to be changed in the class, but could be changed by the client (driver). I did this by taking in the number of rows as a parameter instead of having it as a constant. I also changed the return type from "void" (with a print statement in the method) to "int" (the print statement had to be called in the driver to print out the number), so that if there were other methods later that needed to access the number, it could be accessed by calling the method and storing the int returned.

Even after I had a fairly clean, working, scalable method, I still saw some redundancy in the code. This is because there are four scenerios in which you can put a family in three possible sections with a maximum of two families per row. So I had to check the third section twice. I thought about setting a boolean for each section and then checking conditionals against my booleans, but this ended up being more convoluted than my original solution. 
