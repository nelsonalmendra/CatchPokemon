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
	
	@Test
	public void testNoMoves()
	{
		Grid grid = new Grid();
		
		assertEquals(1, grid.size());
	}
	
	@Test
	public void testNMovesSameDirection()
	{
		final int n = 100000;
		
		Grid grid = new Grid();
		
		for(int i=0; i<n; i++)
			grid.moveNorth();
		
		assertEquals(n+1, grid.size());
	}
	
	@Test
	public void testNMovesOpositeDirection()
	{
		final int n = 100000;
		
		Grid grid = new Grid();
		
		for(int i=0; i<n; i++)
			grid.moveNorth();
		
		for(int i=0; i<n; i++)
			grid.moveSouth();
		
		assertEquals(n+1, grid.size());
	}
	
	@Test
	public void testNMoves()
	{
		final int n = 100000;
		
		Grid grid = new Grid();
		
		for(int i=0; i<n; i++)
			grid.moveNorth();
		
		grid.moveEast();
		
		for(int i=0; i<n; i++)
			grid.moveSouth();
		
		assertEquals((n+1)*2, grid.size());
	}
}
