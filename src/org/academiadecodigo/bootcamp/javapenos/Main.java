package org.academiadecodigo.bootcamp.javapenos;

public class Main {
    public static void main(String[] args) {

        Player player = new Player(400, 790);
        Grid grid = new Grid(500, 800);

        grid.init();
        player.getP1();
        player.getP1().draw();
        player.keyboardStart();

    }
}
