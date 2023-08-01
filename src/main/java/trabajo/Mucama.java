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
    public int Sueldo;
    public Mucama (String Id, String Nombre, String Fec_Nac, int Jornada, int Sueldo){
        super(Id, Nombre, Fec_Nac, Jornada);
        this.Sueldo = Sueldo;
    }
    
    
    // polimorfismo
    @Override
    public int sueldo(int hrs){
        int extra = 0;
        hrs = hrs*6;
        int hrsext = hrs - 36;
        
        if (hrs <= 36){
            hrs = hrs * 100;
        }
        
        if (hrsext >= 0){
            extra = hrsext * 200;
        }
        
        int s = hrs + extra;
        
        return s;
    }
    
    // abstraccion

    @Override
    public void Obligaciones() {
        System.out.println("/t Limpiar y ordenar" + 
                           "/t Brindar un excelente servicio a cliente" +
                           "/t Mantener el equipo en buenas condiciones.");
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    
}
