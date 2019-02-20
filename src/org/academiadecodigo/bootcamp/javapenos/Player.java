package org.academiadecodigo.bootcamp.javapenos;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player implements KeyboardHandler {

    private double x;
    private double y;
    private Position position;

    Picture p1;

    public Player(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Picture getP1() {
        return p1 = new Picture(100, 100, "boneco2_130x188.png");
    }

    public void keyboardStart() {
        Keyboard kb1 = new Keyboard(this);

        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        rightPressed.setKey(KeyboardEvent.KEY_D);

        kb1.addEventListener(rightPressed);


        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        leftPressed.setKey(KeyboardEvent.KEY_A);

        kb1.addEventListener(leftPressed);


        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        upPressed.setKey(KeyboardEvent.KEY_W);

        kb1.addEventListener(upPressed);


        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        downPressed.setKey(KeyboardEvent.KEY_S);

        kb1.addEventListener(downPressed);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_A:
                p1.translate(-25, 0);
                break;

            case KeyboardEvent.KEY_D:
                p1.translate(25, 0);
                break;

            case KeyboardEvent.KEY_S:
                p1.translate(0,25);
                break;

            case KeyboardEvent.KEY_W:
                p1.translate(0,-25);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_A:
                //p1.translate(-25, 0);
                break;

            case KeyboardEvent.KEY_D:
                //p1.translate(25, 0);
                break;

            case KeyboardEvent.KEY_S:
                //p1.translate(0,25);
                break;

            case KeyboardEvent.KEY_W:
                p1.translate(0,25);
                break;
        }
    }
}
