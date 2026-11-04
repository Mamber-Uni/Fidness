package com.fidness.fidness;

public class Fidness {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });

    }
}
