Instructions for compiling
---------------------------

To compile, ensure you are in the appropriate directory.

Then, type javac Problem1.java
After hitting enter, type java Problem1

Follow the same instructions for problem 2, but replace "Problem1" with "Problem2".



My approach
-------------

PROBLEM 1

The only strategy I could think of for the guests to coordinate so that each one can eat a cupcake despite them not being able to communicate was for each one to agree to only eating a cupcake once. After that, if they were to be put in the maze, they would not eat a cupcake if they had already done so. 

I attempted to implement this by having a thread for each guest, stored in an ArrayList. Each thread contained a boolean to determine whether or not they have already ate a cupcale. Once a guest entered the maze, if this flag was false, meaning they had not ate a cupcake, they would eat it and this flag then became true. Otherwise, they would just leave the maze.

I also had an ArrayList corresponding to each thread in the ArrayList for guests.This would keep track of wether or not a guest has already ate a cupcake in the past. 

I had a counter to keep track of the number of guests that had ate a cupcake, and a while loop that would keep iterating until this counter would be the same as the total number of guests at the party.

Once a guest would be called to be in the maze, I then would check to see if they had already ate a cupcake. If they hadnt, then they would eat one, and the counter would increase.

The program terminates and prints out how many guests ate a cupcake, which due to my implementation is every guest. 



PROBLEM 2
