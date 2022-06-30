package com.main.Entities;

import com.main.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class GameFrame extends JFrame {

    GameFrame panel;

    public GameFrame() {
        panel = new GameFrame();
        this.add(panel);
        this.setTitle("Ping-Pong Game");
        this.setResizable(false);
        this.setBackground(Color.magenta);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);


    }

}
