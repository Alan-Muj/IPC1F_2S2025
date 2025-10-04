/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

import javax.swing.JOptionPane;

/**
 *
 * @author pc1
 */
public class Personaje {
    
    private String nombre ;
    private String arma ;
    private int hp ;
    private int nivelAtaque ;
    private int agilidad ;
    private int defensa ;
    private int id ;
    
    public Personaje(String nombre, String arma ) {
        this.nombre = nombre;
        this.arma = arma;
        
    }
    
    public Personaje(int hp, int nivelAtaque, int agilidad, int defensa ) {
        this.hp = hp;
        this.nivelAtaque = nivelAtaque;
        this.agilidad = agilidad;
        this.defensa = defensa;
    
    }
    
    
    public Personaje() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
   

}//fin clase
