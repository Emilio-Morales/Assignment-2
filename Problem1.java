import java.util.*;

public class Problem1 
{

	public static void main(String[] args) 
	{
		int numGuests = 50;
		ArrayList<Guest> guests = new ArrayList<Guest>(numGuests);
		ArrayList<Boolean> hasAte = new ArrayList<Boolean>(numGuests);
	
		// Initializing all threads.
		for (int i = 0; i < numGuests; i++)
		{
			hasAte.add(false);
			guests.add(new Guest());
			guests.get(i).start();
		}

		// This keeps track of the number of guests that have eaten a cupcake.
		int counter = 0;
		
		// A guest enters the labrynth at random. Due to the overriden run method, if a guest
		// has ate a cupcake, then it will not eat it and leave the labrynth. If it has not ate
		// a cupcake, then it will request one if one is missing, and then leave. 
		while (counter < numGuests)
		{
			int guestIdx = (int) Math.floor(Math.random() * (numGuests));// generates from 0 to numGuests;
			Guest currGuest = guests.get(guestIdx);
			currGuest.inMaze = true;
			if (currGuest.ateCupcake == true && !hasAte.get(guestIdx) )
				{
					counter++;
					hasAte.set(guestIdx, true);
				}
		}
		
		System.out.println("All "  + counter + " guests have entered the labrynth and ate a cupcake.");
	}

}// END OF MAIN


class Guest extends Thread
{
	public boolean ateCupcake;	
	public boolean inMaze;
	public boolean changeInAteCupcake;
	
	Guest()
	{
		ateCupcake = false;
		inMaze = false;
		changeInAteCupcake = false;
	}
	
	@Override
	public void run()
	{
		// If a guest has not ate a cupcake, they will eat one.
		// Otherwise, they will just leave the maze
		if (ateCupcake == false)
		{
			ateCupcake = true;
			changeInAteCupcake = true;
		}
		else return;	
	}
}// End of Guest

