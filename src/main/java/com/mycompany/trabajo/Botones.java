/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author Familiar
 */
public class Botones extends Empleado{
    
    public Botones (String Id, String Nombre, String Fec_Nac, String Puesto, int Jornada){
    super(Id, Nombre, Fec_Nac, Puesto, Jornada);
    }
    
    // polimorfismo
    @Override
    public double sueldo(int hrs){
        int extra = 0;
        int hrsext = hrs - 48;
        
        if (hrs <= 48){
            hrs = hrs * 80;
        }
        
        double s = hrs;
        
        return s;
    }
    
    //     
    public void Obligaciones(){
        System.out.println("/t Lleva maletas a las habiatciones" +
                           "/t Te lleva a tu habitacion" +
                           "/t Te ayuda con lo que puede");
    }
        
    
        
}
