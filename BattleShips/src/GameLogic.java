import java.util.Scanner;

public class GameLogic {
	public static boolean checkValidPlacement(int startx, int starty, int length, String direction,Grid Grid) {

		switch (direction) {
		case "right":
			if (((startx < 0 || startx > 9) || (starty < 0 || starty > 9))
					|| (startx + length > 9 || starty + length > 9)) {
				System.out.println("Out of Bounds");
				return false;

			} else {

				for (int i = 0; i < length; i++) {

					if (Grid.grid[startx][starty++] == 2) {
						System.out.println("Overlap");
						return false;
					}

				}

			}
			return true;

		case "up":
			if (((startx < 0 || startx > 9) || (starty < 0 || starty > 9))
					|| (startx + length > 9 || starty + length > 9)) {
				System.out.println("Out of Bounds");
				return false;

			} else {

				for (int i = 0; i < length; i++) {

					if (Grid.grid[startx--][starty] == 2) {
						System.out.println("Overlap");
						return false;
					}

				}

			}
			return true;
		case "left":
			if (((startx < 0 || startx > 9) || (starty < 0 || starty > 9))
					|| (startx + length > 9 || starty + length > 9)) {
				System.out.println("Out of Bounds");
				return false;

			} else {

				for (int i = 0; i < length; i++) {

					if (Grid.grid[startx][starty--] == 2) {
						System.out.println("Overlap");
						return false;
					}

				}

			}
			return true;
		case "down":
			if (((startx < 0 || startx > 9) || (starty < 0 || starty > 9))
					|| (startx + length > 9 || starty + length > 9)) {
				System.out.println("Out of Bounds");
				return false;

			} else {

				for (int i = 0; i < length; i++) {

					if (Grid.grid[startx++][starty] == 2) {
						System.out.println("Overlap");
						return false;
					}

				}

			}
			return true;

		}

		return true;
	}

	public static Grid startBoatsAI() {

		Grid aigrid = new Grid();

		Battleship bs11 = new Battleship(5, 4, 3, "up");
		Battleship bs12 = new Battleship(3, 1, 2, "right");

		aigrid.addBattleship(bs11,aigrid);
		aigrid.addBattleship(bs12,aigrid);
		
		return aigrid;

	}

	public static void shoot(Grid g) {
		Scanner q = new Scanner(System.in);
		System.out.println("Type in first coordinate X");

		String tempshotX = q.nextLine();

		System.out.println("Type in first coordinate Y");

		String tempshotY = q.nextLine();

		int shotX = Integer.parseInt(tempshotX);
		int shotY = Integer.parseInt(tempshotY);

		System.out.println(shotX + " " + shotY);
		hitOrMiss(shotX,shotY,g);
		

	}

	public static void hitOrMiss(int a, int b, Grid g) {
		if (g.grid[a][b] == 2) {
			g.grid[a][b] = 1;
			System.out.println("Hit!");
			
		}
		

	}

}
