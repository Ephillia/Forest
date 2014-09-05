package game;

public class Room {
	String name;
	String description;
	String firstDescription;
	boolean IsFirstVisit;
	Room northRoom;
	Room southRoom;
	Room eastRoom;
	Room westRoom;
	boolean canSee;
	
	public Room(String myName, String mydescription, String myfirstDescription, Room mynorthRoom)
	{
		name = myName;
		description = mydescription;
		firstDescription = myfirstDescription;
		IsFirstVisit = true;
		northRoom = mynorthRoom;
		
	}
	
	public Room(String myName, String mydescription, String myfirstDescription){
		name = myName;
		description = mydescription;
		firstDescription = myfirstDescription;
		IsFirstVisit = true;
	}
	
	public String getDescription()
	{
		if (IsFirstVisit)
		{
			return firstDescription;
		}
		return description;
	}

	public String GetDescription() {
		if(IsFirstVisit)
		{
			return firstDescription;
		}
		return null;
	}
	
}
