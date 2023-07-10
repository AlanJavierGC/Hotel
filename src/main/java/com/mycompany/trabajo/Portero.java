/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author Familiar
 */
public class Portero extends Empleado {
    public Portero (String Id, String Nombre, String Fec_Nac, String Puesto, int Jornada){
        super(Id, Nombre, Fec_Nac, Puesto, Jornada);
    }
    
    // polimorfismo
    @Override
    public double sueldo(int hrs){
        int extra = 0;
        int hrsext = hrs - 28;
        
        if (hrs <= 28){
            hrs = hrs * 90;
        }
        
        if (hrsext >= 0){
            extra = hrsext * 180;
        }
        
        double s = hrs + extra;
        
        return s;
    }
    
    // abstraccion

    @Override
    public void Obligaciones() {
        System.out.println("/t Abrir o cerrar las puertas del hotel" + 
                           "/t Dar la bienvenida y despedida del cliente" +
                           "/t Ayudar al visitante con su equipaje hasta la recepcion.");
    }

}

