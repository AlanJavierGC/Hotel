/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 *
 * @author Familiar
 */
public class Portero extends Empleado {
    public String TurnoNoche;
    public int Sueldo;
    public Portero (String Id, String Nombre, String Fec_Nac, int Jornada, String TurnoNoche, int Sueldo){
        super(Id, Nombre, Fec_Nac, Jornada);
        this.TurnoNoche = TurnoNoche;
        this.Sueldo = Sueldo;
    }
    
    // polimorfismo
    @Override
    public int sueldo(int hrs){
        int extra = 0;
        hrs = hrs * 6;
        int hrsext = hrs - 28;
        
        if ((hrs - hrsext) <= 28){
            hrs = (hrs - hrsext) * 90;
        }
        
        if (hrsext >= 0){
            extra = hrsext * 180;
        }
        
        int s = hrs + extra;
        return s;
    }
    
    // abstraccion

    @Override
    public void Obligaciones() {
        System.out.println("/t Abrir o cerrar las puertas del hotel" + 
                           "/t Dar la bienvenida y despedida del cliente" +
                           "/t Ayudar al visitante con su equipaje hasta la recepcion.");
    }

    public String getTurnoNoche() {
        return TurnoNoche;
    }

    public void setTurnoNoche(String TurnoNoche) {
        this.TurnoNoche = TurnoNoche;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    
}

