package org.codeforall;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        Background background = new Background();
        DonutGenerator donutGen = new DonutGenerator();
        CollisionDetector collisionDetector = new CollisionDetector();
        DonutBox donutBox = new DonutBox();
        MyKeyboardHandler keyboard = new MyKeyboardHandler(game);
        Score score = new Score();
        Menu menu = new Menu();
        ScreenController screenController = new ScreenController();
        FileManager fileManager = new FileManager();

        game.setDonutGen(donutGen);
        game.setBox(donutBox);
        game.setScore(score);
        game.setScreenController(screenController);
        game.setFileManager(fileManager);

        collisionDetector.setDonGen(donutGen);
        collisionDetector.setDonutBox(donutBox);
        collisionDetector.setScore(score);
        collisionDetector.setScreenController(screenController);

        screenController.setDonutGen(donutGen);
        screenController.setMenu(menu);
        screenController.setBackground(background);
        screenController.setGame(game);

        donutGen.setDetector(collisionDetector);
        keyboard.setGame(game);
        score.setFileManager(fileManager);

        game.init();

    }

}
