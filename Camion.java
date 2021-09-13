/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author robin
 */

public class Camion extends Vehiculo {
    LinkedHashMap<String, String> map = new LinkedHashMap<>();
    public int C=18;
    protected double cargaActual;
    
    public Camion(){
        
    }
    
    public Camion(int horaActual,ArrayList<Boolean> disponible_1,ArrayList<Integer> hora_salida) {
        super(horaActual);
        
    }
    public Camion(double peso,int horaActual) {
        super(peso, horaActual);
        this.cargaActual=cargaActual;
    }
    
    public Camion (double capacidadDeCarga, int tiempoRespuesta, double costoEnvio,List <String> operarios,boolean enEnvio, int horaDeSalida,String nombre,double peso,int horaActual){
        super(capacidadDeCarga, tiempoRespuesta,  costoEnvio, operarios,enEnvio,  horaDeSalida,nombre,peso, horaActual);
    }
    
    
    public void Cam(double capacidadDeCarga, int tiempoRespuesta, double costoEnvio,String operarios,boolean enEnvio, int horaDeSalida){
       
        String capa = String.valueOf(capacidadDeCarga);
        String tiempo = String.valueOf(tiempoRespuesta);
        String costo = String.valueOf(costoEnvio);
        String ope = String.valueOf(operarios);
        String Envio = String.valueOf(enEnvio);
        String hora = String.valueOf(horaDeSalida);
        map.put("capacidadDeCarga", capa);
        map.put("tiempoRespuesta", tiempo);
        map.put("costoEnvio", costo);
        map.put("operarios", ope);
        map.put("enEnvio",Envio);
        map.put("horaDeSalida", hora);
        System.out.print("{");
        int c=1;
        int len=6;
        for (Map.Entry pareja : map.entrySet()) {
            String valor = (String)pareja.getValue();
            String clave = (String)pareja.getKey();
            if(c==len){
                System.out.print(clave + ":" + valor);
                c+=1;
            }
            else{ 
                System.out.print(clave + ":" + valor+",");
                c+=1;
            }   
        }
        System.out.print("}\n");

    }
    
    public String cargar_Camion(int horaActual,ArrayList<Boolean> disponible_1,ArrayList<Integer> hora_salida){
        

        if (disponible_1.get(C)==true){
            System.out.print("El pedido no pueder ser tramitado");    
        }
        else{ 
            disponible_1.set(C,true);
            hora_salida.set(C,horaActual);
            C+=1;
            
            
        }
        return "Sera transportado por: Camion\n ";

    }
    public void verificar_Camion(int horaActual,ArrayList<Boolean> disponible_1,ArrayList<Integer> hora_salida){
        if(hora_salida.get(18).equals(horaActual-8)){
            disponible_1.set(18,false);
            hora_salida.set(18,0);
    
                
            }
        
    }
    public void suma_c(Double suma){
        suma+=4000.00;
    
        
    }
    
    @Override
    public boolean cargar(double peso,int horaActual) {
	return true;
    }
}
