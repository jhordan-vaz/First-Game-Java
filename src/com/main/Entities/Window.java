package com.main.Entities;

import com.main.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class Window extends JPanel implements Runnable {

    static final int gameWIDTH = 1000;
    static final int gameHEIGHT =(int)(WIDTH * (0.5555));
    static final Dimension screenSize = new Dimension(gameWIDTH, gameHEIGHT);
    static final int ballDiameter = 20;
    static final int paddleWIDTH = 25;
    static final int paddleHEIGTH = 100;
    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    Paddle paddle1;
    Paddle paddle2;
    Ball ball;
    Score score;



    Window() {
        newPaddles();
        newBall();
        score = new Score(gameWIDTH, gameHEIGHT);
        this.setFocusable(true);
        this.addKeyListener(new AL());
        this.setPreferredSize(screenSize);

        gameThread = new Thread(this);
        gameThread.start();
    }

    public void newBall() {

    }

    public void newPaddles() {

    }

    public void painting(Graphics g) {

    }

    public void drawing(Graphics g) {

    }

    public void movement() {

    }

    public void colision() {

    }

    public void running() {

    }

    @Override
    public void run() {

    }

    public class AL extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
        }
        @Override
        public void keyReleased(KeyEvent e) {
            super.keyPressed(e);
        }
    }
}

