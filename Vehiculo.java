/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2;

import java.util.List;

/**
 *
 * @author robin
 */
public class Vehiculo {
    protected double capacidadDeCarga;
    protected int tiempoRespuesta;
    protected double costoEnvio;
    protected List <String> operarios;
    protected boolean enEnvio;
    public int horaDeSalida;
    protected String nombre;
    protected double peso;
    public int horaActual;

    
    public Vehiculo(double capacidadDeCarga, int tiempoRespuesta, double costoEnvio,List <String> operarios,boolean enEnvio, int horaDeSalida,String nombre,double peso,int horaActual) {
        this.capacidadDeCarga = capacidadDeCarga;
	this.tiempoRespuesta = tiempoRespuesta;
        this.costoEnvio = costoEnvio;
	this.operarios = operarios;
        this.enEnvio = enEnvio;
	this.horaDeSalida = horaDeSalida;
        this.peso = peso;
	this.horaActual = 8;
    }
    
    public Vehiculo(double peso,int horaActual) {
        this.peso = peso;
	this.horaActual = 7;
    }
    public Vehiculo(int horaActual) {
        this.horaActual = 8;
     
    }
    
    public Vehiculo() {
        this.horaActual = 8;
    }
     
    
    public boolean cargar(double peso,int horaActual) {
	return true;
    }


    public int despachar_1(){
       // horaActual +=1;
        return horaActual ;
    }
    public int despachar(int horaActual){
        this.horaActual +=1;
        return horaActual ;
    }
    public void finalizarEnvio(){
	
    }
    
    @Override
    public String toString(){
        return null;
        	
    }
}
