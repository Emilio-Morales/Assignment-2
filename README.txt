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

For this problem, I believe the second approach was the best.

With the first approach, I viewed it as inefficient because too many threads could be trying to access the the vase at the same time, even when it is locked. This can lead to inneficient use of our processors because it would be pointless for many threads to continuously keep trying to access inaccesible data. 

With regards to the third approach, I believe it is better than the first, however it could lead to innefficiency if a guest repeatedly wants to keep viewing the vase before others show interest, since it would be possible to hold up the line.

I believe the second approach was the best because although it would be first come first serve, many threads would not be trying to access the data at the same time seeing as how there is a flag informing them of wheter that data is even available in the first place.

The way I implemented this approach is as follows: 

Each thread (Guest) contained three booleans. One to keep track of whether they had already seen the vase, another to show whether they are currently viewing the vase, and one that would be randomly selected to be true or false determinig whether they are interested in seeing the vase.

I also had an ArrayList corresponding to each guests' interest status in the vase.

I had a while loop that would only stop interating once each guest decided they no longer wanted to view the vase. Before a guest could even view the vase, a flag would determine whether the vase was even available to be seen in the first place. If it was, then the guest would commence viewing the vase and this flag would be set to false. A bit of time would pass and then the flag would go back to true, simulating that the guest was done viewing it. 

Whenevr a guest viewed the vase, afterwards it would be randomly selected whether they were still interested in veiwing it or not. I did this to simulate that a guest can visit the vase as many times as they'd like.

I also counted the number of guests that viewed the vase and printed it at the end of the program's execution.


	
