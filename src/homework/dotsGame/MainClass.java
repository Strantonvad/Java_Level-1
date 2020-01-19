package homework.dotsGame;

import homework.dotsGame.view.GameView;

public class MainClass {
    private static GameView game = new GameView();

    public static void main(String[] args) {
        game.initGame();
    }
}
