/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

/**
 *
 * @author pc1
 */
public class Practica2 {
    public static void main(String[] args) {
        // Inicia la ventana en el hilo de eventos de Swing
        java.awt.EventQueue.invokeLater(() -> {
            new InterfazUsuario().setVisible(true);
        });
    }
}
