/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 *
 * @author Familiar
 */
public class Cocinero extends Empleado{
    String Puesto;
    public Cocinero (String Id, String Nombre, String Fec_Nac, String Puesto, int Jornada){
        super(Id, Nombre, Fec_Nac, Puesto, Jornada);
    }
    
    // sueldo polimorfismo
    @Override
    public int sueldo(int hrs){
        int extra = 0;
        int hrsext = (hrs*6) - 48;
        
        if (hrs <= 48){
            hrs = hrs * 160;
        }
        
        if (hrsext >= 0){
            extra = hrsext * 320;
        }
        
        int s = hrs + extra;
        
        return s;
    }
    
    public void setEspec(String especialidasd){
        this.Puesto = especialidasd;
    }
    public String getEspec(){
        return Puesto;
    }
    
    
    // abstraccion
    public void Obligaciones(){
        System.out.println("/t Prepara los desayunos" + 
                           "/t Pepara la comida" +
                           "/t Escupir en la sopa");
    }
}
