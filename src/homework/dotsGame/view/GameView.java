package homework.dotsGame.view;

import homework.dotsGame.controller.Controller;
import homework.dotsGame.model.GameMap;

public class GameView {
    public Controller gameCtrl = new Controller();
    public GameMap gameMap = new GameMap();

    public void initGame() {
        gameCtrl.initMap();
        gameCtrl.printMap();
        while (true) {
            gameCtrl.humanTurn();
            gameCtrl.printMap();
            if (gameCtrl.checkWin(gameMap.getDOT_X())) {
                System.out.println("Победил человек");
                break;
            }
            if (gameCtrl.isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            gameCtrl.aiTurn();
            gameCtrl.printMap();
            if (gameCtrl.checkWin(gameMap.getDOT_O())) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (gameCtrl.isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
}
