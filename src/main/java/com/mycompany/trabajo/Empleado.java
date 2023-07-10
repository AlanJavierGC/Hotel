/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author Familiar
 */
public abstract class Empleado {
    private String ID;
    private String Nombre;
    private String Fec_Nac;
    private String Puesto;
    private int Jornada;
 
    
    public Empleado (String num, String nom, String date, String puesto, int jor){
        this.ID = num;
        this.Nombre = nom;
        this.Fec_Nac = date;
        this.Puesto = puesto;
        this.Jornada = jor;
    }
    
    public abstract void Obligaciones();

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
    public void SetPuesto (String puesto){
        this.Puesto = puesto;
    }
    
    public String GetPuesto() {
        return Puesto;
    }
    //--------------------------//
    public void SetJornada (int jor){
        this.Jornada = jor;
    }
    
    public int GetJornada() {
        return Jornada;
    }
    //
}
