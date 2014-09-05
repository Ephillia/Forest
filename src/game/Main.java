package game;

import game.Health;
import game.Room;
import javax.swing.*;

public class Main {

	public static void main(String[] args)
	{
		Health obj = new Health(10);
		System.out.println(obj.GetMyInt());
		obj.SetMyInt(7);
		System.out.println(obj.GetMyInt());

		Room myCave = new Room("Cave","A cave", "You enter the cave and see it was recently inhabited by some animal within the last few days.");
		Room myForest = new Room("Forest","A forest", "You wake up in a forest.",myCave);

		JOptionPane.showMessageDialog(null,"Welcome to Forest Crawler Alpha Version 0.1_2, by Incorruptable!");
		
	Main myGame = new Main();
	myGame.Gameloop(myForest);

	}

	public Main()
	{
		
	}
	
	public void Gameloop(Room startRoom)
	{
		String input;
		boolean notDead = false;
		int count = 0;
		
		Room myCave = new Room("Cave","A cave", "You enter the cave and see it was recently inhabited by some animal within the last few days.");
		Room myForest = new Room("Forest","A forest", "You wake up in a forest.",myCave);

		
		Room currentRoom = startRoom;
		
		while(!notDead)
		{
			//Shows description of the room
		input = JOptionPane.showInputDialog(null, currentRoom.getDescription() + " What do you do? \n(l)ook around\n(g)rab a stick\n(s)leep.");
		
		
		
		if(input.equalsIgnoreCase("s"))
		{
			JOptionPane.showMessageDialog(null, "You go back to sleep. As time passes, a bear finds you and kills you in your sleep. Game over.");
			notDead = true;
		}
		if(input.equalsIgnoreCase("g"))
		{
			JOptionPane.showMessageDialog(null,"You pick up a stick.");
			input = JOptionPane.showInputDialog(null,"Now what do you do?\n(s)leep\n(w)ander\n(l)ook around.");
		}
		if(input.equalsIgnoreCase("l"))
		{
			input = JOptionPane.showInputDialog(null,"You see trees and a cave. Do you want to go into the cave? \n(y)es \n(n)o");
			if(input.equalsIgnoreCase("y"))
			{
				Room currentRoom1 = myCave;
				input = JOptionPane.showInputDialog(null,currentRoom1.getDescription() + " Do you want to set up a camp?\n(y)es\n(n)o");
				if(input.equalsIgnoreCase("y"))
				{
					JOptionPane.showMessageDialog(null,"You make the cave into your camp by shifting a few rocks around to make a windbreaker.");
					while(!notDead)
					{
						input = JOptionPane.showInputDialog(null,"The cave still is not home yet. Would you like to \n(s)leep \n(w)ander \n(m)ake a bed \nmake a (f)ire");

							if(input.equalsIgnoreCase("s"))
							{
								JOptionPane.showMessageDialog(null,"You sleep in the cave and feel very cold");
								count ++;
								if(count == 2)
								{
									JOptionPane.showMessageDialog(null,"You slept in the cave and died from the cold.");
									notDead = false;
								}
							}	
							else
							{
								break;
							}
		
							}
						
					}
					if(input.equalsIgnoreCase("w"))
					{
						JOptionPane.showMessageDialog(null,"You wander around the cave and see nothing different.");
						while(!notDead)
						{
							input = JOptionPane.showInputDialog(null,"The cave still is not home yet. Would you like to \n(s)leep \n(m)ake a bed \nmake a (f)ire");

								if(input.equalsIgnoreCase("s"))
								{
									JOptionPane.showMessageDialog(null,"You sleep in the cave and feel very cold");
									count ++;
									if(count == 2)
									{
										JOptionPane.showMessageDialog(null,"You slept in the cave and died from the cold.");
										notDead = false;
									}
								}	
								else
								{
									break;
								}
									break;
								}
					}
					if(input.equalsIgnoreCase("m"))
					{
						JOptionPane.showMessageDialog(null,"You make a bed out of rocks for a frame, leaves as padding, and sticks to hold the leaves off the ground");
					}
					if(input.equalsIgnoreCase("f"))
					{
						JOptionPane.showMessageDialog(null,"You make a fire out of leaves and sticks from outside the mouth of the cave.");
					}
				}
				if(input.equalsIgnoreCase("n"))
				{
					
				}
			}
			if(input.equalsIgnoreCase("n"))
			{
				JOptionPane.showMessageDialog(null, "This feature of the game has not been implemented yet. Thank you for alpha testing.");
			}
		JOptionPane.showMessageDialog(null,"Thank you for testing the Alpha version of this game. The choice you made was not yet coded. Thank you!");
		notDead = true;
		}
	}
	
}