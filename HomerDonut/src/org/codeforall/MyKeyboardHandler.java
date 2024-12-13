package org.codeforall;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MyKeyboardHandler implements KeyboardHandler {

    private Keyboard keyboard;
    private Game game;
    private int starter = 0;

    public MyKeyboardHandler(Game game){
        keyboard = new Keyboard(this);
        setKeyboardEvents();
        this.game = game;
    }

    public void setKeyboardEvents() {
        KeyboardEvent quit = new KeyboardEvent();
        quit.setKey(KeyboardEvent.KEY_Q);
        quit.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(quit);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(space);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            game.getBox().moveBoxLeft();
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
            game.getBox().moveBoxRight();
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            game.setGameStage(1);
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_Q) {
            game.setGameStage(2);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getStarter() {
        return starter;
    }
}
