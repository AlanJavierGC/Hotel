/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author Familiar
 */
public class Recepcionista extends Empleado{
    
    public Recepcionista (String Id, String Nombre, String Fec_Nac, String Puesto, int Jornada){
        super(Id, Nombre, Fec_Nac, Puesto, Jornada);
    }
    
    // polimorfismo
    @Override
    public double sueldo(int hrs){
        int extra = 0;
        int hrsext = hrs - 48;
        
        if (hrs <= 48){
            hrs = hrs * 150;
        }
        
        if (hrsext >= 0){
            extra = hrsext * 300;
        }
        
        double s = hrs + extra;
        
        return s;
    }
    
    // abstraccion
    public void Obligaciones(){
        System.out.println("/t Dan la bienvenida" + 
                           "/t Registran las entradas y salidas de huespedes" +
                           "/t Entregan llaves de habitacion");
    }
}
