package org.academiadecodigo.bootcamp.javapenos;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    private int width;
    private int height;
    public static final int PADDING = 10;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void init() {
        Rectangle grid = new Rectangle (PADDING, PADDING, getWidth(), getHeight());
        grid.draw();
    }

    // definir imagem de background para a Grid; -> inicia logo com a de start e depois de carregar em start muda

    /*public GridPosition makeGridPosition(int x, int y) {
        return //retornar uma grip position com (x, y, this grid)
    }*/



    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
