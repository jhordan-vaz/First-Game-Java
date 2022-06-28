package com.main;


import com.main.Entities.BallOBJ;
import com.main.Entities.Paddle;
import com.main.Entities.Score;

import java.awt.*;



// i need draw Paddles, ball etc.. so i need Canvas.
// Runnable is to say this class is going to be a functional object.
public class Game extends Canvas implements Runnable {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = WIDTH * 9/16;

    public boolean running = false;
    private Thread gameThread;

    private BallOBJ Ball;
    private Paddle paddle1;
    private Paddle paddle2;

    public Game () {

        canvasSetup();

        new Window("PingPong", this);

    }

    private void canvasSetup() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    public void run() {

    }
    public void start() {

    }

    public static void main(String[] args) {
        new Game();
    }
}
