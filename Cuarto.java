/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author robin
 */
public class Cuarto extends Vehiculo {
    
    public int cargar_bici;
    LinkedHashMap<String, String> mapa = new LinkedHashMap<>();
    public ArrayList<Integer> disponible = new ArrayList<>();
    public ArrayList<Boolean> disponible_1 = new ArrayList<>();
    public ArrayList<String> ope = new ArrayList<>();
    public int b_disponible;
    public int m_disponible;
    public int AE_disponible;
    public Double suma;
    public int v=0;
    public int m=10;
    public int A=15;
    public int ocupado=1;
    public  ArrayList<Integer> hora_salida = new ArrayList<>();
    
    public Cuarto() {
        this.b_disponible=0;
        this.m_disponible=0;
        this.AE_disponible=0;
        this.ope=ope;
        this.suma= 0.0;
        
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        hora_salida.add(0);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible_1.add(false);
        disponible.add(1);
        disponible.add(2);
        disponible.add(3);
        disponible.add(4);
        disponible.add(5);
        disponible.add(6);
        disponible.add(7);
        disponible.add(8);
        disponible.add(9);
        disponible.add(10);
        disponible.add(1);
        disponible.add(2);
        disponible.add(3);
        disponible.add(4);
        disponible.add(5);
        disponible.add(1);
        disponible.add(2);
        disponible.add(3);
    

    }
    public Cuarto(int horaActual) {
        super(horaActual);
        
    }
  
    public Cuarto(double peso,int horaActual) {
        super(peso, horaActual);
     
    }
    
    public Cuarto (double capacidadDeCarga, int tiempoRespuesta, double costoEnvio,List <String> operarios,boolean enEnvio, int horaDeSalida,String nombre,double peso,int horaActual){
        super(capacidadDeCarga, tiempoRespuesta,  costoEnvio, operarios,enEnvio,  horaDeSalida,nombre,peso, horaActual);
    }
    
    public void bici_operarios(){
        Scanner sc = new Scanner (System.in);
        int counter=1;
        String vehi_asignado="d";
        for (int p=1; p<=19; p++) {
            if (p<=10){
                System.out.println("Bicicleta "+counter+ " ingrese el primer operario:");
                String n = sc.nextLine();
                ope.add(n);
                counter+=1;
                vehi_asignado="Bicicleta"+counter;
            }
            else if (p>=11&& p<=15){
                if(counter==11){
                    counter=1;
                    System.out.println("Moto "+counter+" ingrese el primer operario:");
                    String n = sc.nextLine();
                    ope.add(n);
                    counter+=1;
                    vehi_asignado="Moto"+counter;
                }
                else{
                    
                    System.out.println("Moto "+counter+" ingrese el primer operario:");
                    String n = sc.nextLine();
                    ope.add(n);
                    counter+=1;
                    vehi_asignado="Moto"+counter;
                }
  
            } else if(p>=16 && p<=18) {
                if(counter==6){
                    counter=1;
                    System.out.println("AE " +counter+ " ingrese el primer operario:");
                    String n = sc.nextLine();
                    ope.add(n);
                    counter+=1;
                    vehi_asignado="AE"+counter;
                }
                else{
                    
                    System.out.println("AE " +counter+ " ingrese el primer operario:");
                    String n = sc.nextLine();
                    ope.add(n);
                    counter+=1;
                    vehi_asignado="AE"+counter;
                }
    
            }else if(p>=19){
                if(counter==4){
                    ArrayList<String> o_Camion = new ArrayList<>();
                    counter=1;
                    System.out.println("Camion ingrese el primer operario:");
                    String n = sc.nextLine();
                    o_Camion.add(n);
                    System.out.println("Camion ingrese segundo operario:");
                    String l = sc.nextLine();
                    o_Camion.add(l); 
                    counter+=1;
                    String ver ="{"+n+", "+l+"}";
                    vehi_asignado="Camion";
                    ope.add(ver);
                  
                }
            }
        }
        
    }
    
    public void lista_operarios(){
        System.out.println(disponible_1);
        System.out.println(hora_salida);
        System.out.println(ope);
        System.out.println(disponible);
    }

    public void bicicleta(double capacidadDeCarga, int tiempoRespuesta, double costoEnvio,String operarios,boolean enEnvio, int horaDeSalida){
       
        String capa = String.valueOf(capacidadDeCarga);
        String tiempo = String.valueOf(tiempoRespuesta);
        String costo = String.valueOf(costoEnvio);
        String ope = String.valueOf(operarios);
        String Envio = String.valueOf(enEnvio);
        String hora = String.valueOf(horaDeSalida);
        mapa.put("capacidadDeCarga", capa);
        mapa.put("tiempoRespuesta", tiempo);
        mapa.put("costoEnvio", costo);
        mapa.put("operarios", ope);
        mapa.put("enEnvio",Envio);
        mapa.put("horaDeSalida", hora);
        System.out.print("{");
        int c=1;
        int len=6;
        for (Map.Entry pareja : mapa.entrySet()) {
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
    public void verificar_dBici(int horaActual){
        for (int p=0; p<=9; p++) {
            if(hora_salida.get(p).equals(horaActual-2)){
                disponible_1.set(p,false);
                hora_salida.set(p,0);
                v=0;
                b_disponible=v;
                
            }
        }
    }
    
    public String cargar_bici(int horaActual){
        

        if (disponible_1.get(v)==true){
            v+=1; 
            disponible_1.set(v,true);
            hora_salida.set(v,horaActual);
            suma+= 5500.0;
            return "Sera transportado por: Bicicleta "+disponible.get(v)+"\n";
        }
        else{ 
            suma+= 5500.0;
            disponible_1.set(v,true);
            hora_salida.set(v,horaActual);
            v+=1;
           
            return "Sera transportado por: Bicicleta "+disponible.get(v-1)+"\n";
        }
        //return "Sera transportado por: Bicicleta "+disponible.get(v-1)+"\n";

                   
    }
    public String cargar_moto(int horaActual){

        if (disponible_1.get(m)==true){
            m+=1;    
            disponible_1.set(m,true);
            hora_salida.set(m,horaActual);
            suma+= 6000.0;
            return "Sera transportado por: Moto "+disponible.get(m)+"\n";
        }
        else{
            suma+= 6000.0;
            disponible_1.set(m,true);
            hora_salida.set(m,horaActual);
            m+=1;
            m_disponible+=1;     
            return "Sera transportado por: Moto "+disponible.get(m-1)+"\n";
        }
        
    }
    public void verificar_dmoto(int horaActual){
        for (int p=10; p<=14; p++) {
            if(hora_salida.get(p).equals(horaActual-1)){
                disponible_1.set(p,false);
                hora_salida.set(p,0);
                m=10;
                m_disponible=1;
                
            }
        }
    }
    public String cargar_AE(int horaActual){
        
        if (disponible_1.get(A)==true){
            A+=1;    
            disponible_1.set(A,true);
            hora_salida.set(A,horaActual);
            suma+= 8000.0;
            return "Sera transportado por: AE "+disponible.get(A)+"\n";
        }
        else{ 
            suma+= 8000.0;
            disponible_1.set(A,true);
            hora_salida.set(A,horaActual);
            A+=1;
            AE_disponible+=1; 
            return "Sera transportado por: AE "+disponible.get(A-1)+"\n";
        }
        
    }
    public void verificar_dAE(int horaActual){
        for (int p=15; p<=17; p++) {
            if(hora_salida.get(p).equals(horaActual-3)){
                disponible_1.set(p,false);
                hora_salida.set(p,0);
                A=15;  
                AE_disponible=A;
            }
        }
    }


}
