package main;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		Grid grid = new Grid();
		
		try
		{
			String directions = scanner.next();
			
			for(int i=0; i<directions.length(); i++)
			{
				char direction = directions.charAt(i);
				switch (direction) {
				case 'N':
					grid.moveNorth();
					break;
				case 'S':
					grid.moveSouth();
					break;
				case 'E':
					grid.moveEast();
					break;
				case 'O':
					grid.moveWest();
					break;

				default:
					break;
				}
			}
		}
		finally
		{
			scanner.close();
		}
		
		System.out.println(grid.size());
	}
}
