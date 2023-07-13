/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 *
 * @author Familiar
 */
public class Mucama extends Empleado {
    public Mucama (String Id, String Nombre, String Fec_Nac, String Puesto, int Jornada){
        super(Id, Nombre, Fec_Nac, Puesto, Jornada);
    }
    
    
    // polimorfismo
    @Override
    public double sueldo(int hrs){
        int extra = 0;
        int hrsext = hrs - 36;
        
        if (hrs <= 36){
            hrs = hrs * 100;
        }
        
        if (hrsext >= 0){
            extra = hrsext * 200;
        }
        
        double s = hrs + extra;
        
        return s;
    }
    
    // abstraccion

    @Override
    public void Obligaciones() {
        System.out.println("/t Limpiar y ordenar" + 
                           "/t Brindar un excelente servicio a cliente" +
                           "/t Mantener el equipo en buenas condiciones.");
    }
}
