package com.main.Entities;

import com.main.Game;

import javax.swing.*;

public class Window {

    public Window (String tittle, Game game) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when press 'ESC' exit the game;
        frame.setResizable(false);  //this means i don't want resize the window.
        frame.add(game); //game ll be a component in a interface.
        frame.pack();   //Fit all the textures and similar stuffs.
        frame.setLocationRelativeTo(null); //This will center the window.
        frame.setVisible(true); // Visibility to the window.

        game.start();
    }

}
