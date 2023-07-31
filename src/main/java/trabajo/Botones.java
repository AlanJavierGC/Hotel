/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 *
 * @author Familiar
 */
public class Botones extends Empleado{
    
    public String Peso;
    public int Sueldo;
    public Botones (String Id, String Nombre, String Fec_Nac, int Jornada, String Peso, int Sueldo){
    super(Id, Nombre, Fec_Nac, Jornada);
    this.Peso =  Peso;
    this.Sueldo = Sueldo;
    }
    
    // polimorfismo
    @Override
    public int sueldo(int hrs){
        int extra = 0;
        int hrsext = hrs - 48;
        
        if (hrs <= 48){
            hrs = hrs * 80;
        }
        
        int s = hrs;
        
        return s;
    }
    
    // abstraccion
    public void Obligaciones(){
        System.out.println("/t Lleva maletas a las habiatciones" +
                           "/t Te lleva a tu habitacion" +
                           "/t Te ayuda con lo que puede");
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }
        
    
        
}
