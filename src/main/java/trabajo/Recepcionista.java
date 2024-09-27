/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 *
 * @author Familiar
 */
public class Recepcionista extends Empleado{
    public String TurnoNoche;
    public int Sueldo;
    public Recepcionista (String Id, String Nombre, String Fec_Nac, int Jornada, String TurnoNoche, int Sueldo){
        super(Id, Nombre, Fec_Nac, Jornada);
        this.TurnoNoche = TurnoNoche;
        this.Sueldo = Sueldo;
    }
    
    // polimorfismo
    @Override
    public int sueldo(int hrs){
        int extra = 0;
        int hrsext = hrs - 48;
        
        if (hrs <= 48){
            hrs = hrs * 150;
        }
        
        if (hrsext >= 0){
            extra = hrsext * 300;
        }
        
        int s = hrs + extra;
        
        return s;
    }
    
    // abstraccion
    public void Obligaciones(){
        System.out.println("/t Recibir a las personas" + 
                           "/t Checar entrada y salida de las personas" +
                           "/t Dar la llave de la habitacion");
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
