public class AIGrid {
	public int[][] grid = new int[9][9];

	public void addBattleship(Battleship b,Grid g) { 
		int startX = b.getstartX();
		int startY = b.getstartY();
		if (b.getDirection().equals("right")) {
		
				
				
				if (GameLogic.checkValidPlacement(b.getstartX(), b.getstartY(), b.getLength(), b.getDirection(), g) == true) {
					for (int i = 0; i < b.getLength(); i++) {
						grid[b.getstartX()][startY++] = 2;

					}
				} else {
					System.out.println("Invalid boat placement");

				}

			}
		
		if (b.getDirection().equals("up")) {
			if (((b.getstartX() < 0 || b.getstartX() > 9) || (b.getstartY() < 0 || b.getstartY() > 9))
					|| (b.getstartX() + b.getLength() > 9 || b.getstartY() + b.getLength() > 9)) {
				System.out.println("Out of Bounds");

			} else {

				for (int i = 0; i < b.getLength(); i++) {

					grid[startX--][b.getstartY()] = 2;

				}

			}

		}
		if (b.getDirection().equals("left")) {
			if (((b.getstartX() < 0 || b.getstartX() > 9) || (b.getstartY() < 0 || b.getstartY() > 9))
					|| (b.getstartX() + b.getLength() > 9 || b.getstartY() + b.getLength() > 9)) {
				System.out.println("Out of Bounds");

			} else {

				for (int i = 0; i < b.getLength(); i++) {

					grid[b.getstartX()][startY--] = 2;

				}

			}

		}
		if (b.getDirection().equals("down")) {
			if (((b.getstartX() < 0 || b.getstartX() > 9) || (b.getstartY() < 0 || b.getstartY() > 9))
					|| (b.getstartX() + b.getLength() > 9 || b.getstartY() + b.getLength() > 9)) {
				System.out.println("Out of Bounds");

			} else {

				for (int i = 0; i < b.getLength(); i++) {

					grid[startX++][b.getstartY()] = 2;

				}

			}

		}
	}

	public static void printGrid(Grid g) {
		for (int j = 0; j < 9; j++) {
			System.out.println();
			for (int i = 0; i < 9; i++) {
				System.out.print(g.grid[j][i]);
			}
		}
	}
}