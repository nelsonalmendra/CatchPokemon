package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Grid;

public class ApplicationTests
{
	@Test
	public void testInput1()
	{
		Grid grid = new Grid();
		grid.moveEast();
		
		assertEquals(2, grid.size());
	}
	
	@Test
	public void testInput2()
	{
		Grid grid = new Grid();
		grid.moveNorth();
		grid.moveEast();
		grid.moveSouth();
		grid.moveWest();
		
		assertEquals(4, grid.size());
	}
	
	@Test
	public void testInput3()
	{
		Grid grid = new Grid();
		grid.moveNorth();
		grid.moveSouth();
		grid.moveNorth();
		grid.moveSouth();
		grid.moveNorth();
		grid.moveSouth();
		grid.moveNorth();
		grid.moveSouth();
		grid.moveNorth();
		grid.moveSouth();
		
		assertEquals(2, grid.size());
	}
}
