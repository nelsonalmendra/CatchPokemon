package main;

import java.util.HashMap;

public class Grid
{
	private Point currentLocation;
	private HashMap<String, Boolean> locations;
	
	public Grid()
	{
		currentLocation = new Point(0, 0);
		locations = new HashMap<String, Boolean>();
		locations.put(currentLocation.toString(), true);
	}
	
	public void moveNorth()
	{
		currentLocation.y--;
		storecurrentLocation();
	}
	
	public void moveSouth()
	{
		currentLocation.y++;
		storecurrentLocation();
	}
	
	public void moveEast()
	{
		currentLocation.x++;
		storecurrentLocation();
	}
	
	public void moveWest()
	{
		currentLocation.x--;
		storecurrentLocation();
	}
	
	private void storecurrentLocation()
	{
		String key = currentLocation.toString();
		if(!locations.containsKey(key))
			locations.put(key, true);
	}
	
	public int size()
	{
		return locations.size();
	}
}
