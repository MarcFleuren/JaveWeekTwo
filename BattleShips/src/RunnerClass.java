
public class RunnerClass {
	public static void main(String[] args) {
		Grid grid = new Grid();
		Grid aigrid = GameLogic.startBoatsAI();		
		
		Battleship bs1 = new Battleship(5,4,3,"up");
		Battleship bs2 = new Battleship(3,1,2,"right");
		
		
		grid.addBattleship(bs1,grid);
		grid.addBattleship(bs2,grid);
		
		
		grid.printGrid(grid);
		
		System.out.println(" ");
		
		grid.printGrid(aigrid);
		
		GameLogic.shoot(aigrid);
		
		grid.printGrid(aigrid);
		
	}
}
// next add check if battleships overlap.