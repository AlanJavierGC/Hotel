/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author Familiar
 */
public class Cocinero extends Empleado{
    
    public Cocinero (String Id, String Nombre, String Fec_Nac, String Puesto, int Jornada){
        super(Id, Nombre, Fec_Nac, Puesto, Jornada);
    }
    
    // sueldo polimorfismo
    @Override
    public double sueldo(int hrs){
        int extra = 0;
        int hrsext = hrs - 48;
        
        if (hrs <= 48){
            hrs = hrs * 160;
        }
        
        if (hrsext >= 0){
            extra = hrsext * 320;
        }
        
        double s = hrs + extra;
        
        return s;
    }
    
    public void Obligaciones(){
        System.out.println("/t Prepara los desayunos" + 
                           "/t Pepara la comida" +
                           "/t Escupir en la sopa");
    }
}
