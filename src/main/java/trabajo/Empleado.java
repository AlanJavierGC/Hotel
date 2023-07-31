/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 *
 * @author Familiar
 */
public abstract class Empleado {
    private String ID;
    private String Nombre;
    private String Fec_Nac;
    private int Jornada;
 //Este es el "main"//
    
    public Empleado (String num, String nom, String date, int jor){
        this.ID = num;
        this.Nombre = nom;
        this.Fec_Nac = date;
        this.Jornada = jor;
    }
    
    public abstract void Obligaciones();
    
    public int sueldo(int hrs){
        int sueldo = hrs * 80;
        return sueldo;
    }

    public void SetID (String id){
        this.Nombre = id;
    }
    
    public String GetID() {
        return ID;
    }
    //--------------------------//
    public void SetNombre (String nom){
        this.Nombre = nom;
    }
    
    public String GetNombre() {
        return Nombre;
    }
    //--------------------------//
    public void SetFecha (String date){
        this.Fec_Nac = date;
    }
    
    public String GetFecha() {
        return Fec_Nac;
    }
    //--------------------------//
    public void SetJornada (int jor){
        this.Jornada = jor;
    }
    
    public int GetJornada() {
        return Jornada;
    }
}
