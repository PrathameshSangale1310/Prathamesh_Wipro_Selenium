package Assignment6;

enum Difficulty {EASY,MEDIUM,HARD}

class Game {
    private int bullets;

    public Game(Difficulty diff) {
        switch (diff) {
            case EASY:
                bullets = 3000;
                break;
            case MEDIUM:
                bullets = 2000;
                break;
            case HARD:
                bullets = 1000;
                break;
            default:
                bullets = 0;
        }
    }

    public void start() {
        System.out.println("Game started with " + bullets + " bullets.");
    }
}

 
public class Q12 {

	public static void main(String[] args) {
		Game easyGame = new Game(Difficulty.EASY);
        Game mediumGame = new Game(Difficulty.MEDIUM);
        Game hardGame = new Game(Difficulty.HARD);

        easyGame.start();
        mediumGame.start();
        hardGame.start();

	}

}
