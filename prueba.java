/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;



import java.util.ArrayList;
import java.util.Scanner;
import Reto2.Vehiculo;
import Reto2.Cuarto;
import Reto2.Camion;
/**
 *
 * @author robin
 */
public class prueba {
    
    public int horaActual;

    public ArrayList<String> vehiculos = new ArrayList<String>();
    protected double totalEnvios;
    public prueba(int horaActual, double totalEnvios) {
        this.horaActual = 8;
	this.totalEnvios = totalEnvios;
    }
    public prueba(int horaActual) {
        this.horaActual = 8;
	this.totalEnvios = totalEnvios;
        this.vehiculos=vehiculos;
    }
    
    public static ArrayList<String>creacionVehiculos(){
        ArrayList<String> operarios = new ArrayList<String>();
        Scanner sc = new Scanner (System.in);
        int counter=1;
        int total=19;
        String vehi_asignado="d";
        for (int p=1; p<=19; p++) {
            if (p<=10){
                System.out.println("Bicicleta "+counter+ " ingrese el primer operario:");
                String n = sc.nextLine();
                operarios.add(n);
                counter+=1;
                vehi_asignado="Bicicleta"+counter;
                
            } else if (p>=11&& p<=15){
                if(counter==11){
                    counter=1;
                    System.out.println("Moto "+counter+" ingrese el primer operario:");
                    String n = sc.nextLine();
                    operarios.add(n);
                    counter+=1;
                    vehi_asignado="Moto"+counter;
                }
                else{
                    
                    System.out.println("Moto "+counter+" ingrese el primer operario:");
                    String n = sc.nextLine();
                    operarios.add(n);
                    counter+=1;
                    vehi_asignado="Moto"+counter;
                }
  
            } else if(p>=16 && p<=18) {
                if(counter==6){
                    counter=1;
                    System.out.println("AE " +counter+ " ingrese el primer operario:");
                    String n = sc.nextLine();
                    operarios.add(n);
                    counter+=1;
                    vehi_asignado="AE"+counter;
                }
                else{
                    
                    System.out.println("AE " +counter+ " ingrese el primer operario:");
                    String n = sc.nextLine();
                    operarios.add(n);
                    counter+=1;
                    vehi_asignado="AE"+counter;
                }
    
            }else if(p>=19){
                if(counter==4){
                    counter=1;
                    System.out.println("Camion ingrese el primer operario:");
                    String n = sc.nextLine();
                    operarios.add(n);
                    System.out.println("Camion ingrese segundo operario:");
                    String m = sc.nextLine();
                    operarios.add(m); 
                    counter+=1;
                    vehi_asignado="Camion";
                }
          
            }
        }return operarios;
        //System.out.print(vehi_asignado);
    }     

    public static String presentarMenu(){
        Scanner sc = new Scanner (System.in);
        int h=8;
        System.out.println("1.Recepcion envio \n2.Obtener estado de los vehiculos actualmente \n3.Realizar despachos de la hora");
        String respuesta = sc.nextLine();
        return respuesta;
	
    }
    
    public static  String recepcionEnvio(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa el peso");
        int peso = sc.nextInt();
        System.out.println("1.envio inmediato \n2.envio no inmediato");
        int envio = sc.nextInt();
        String r="B";
        if(peso<=15){           
            r="Bicicleta";
        }
        else if(peso>=16 && peso <=60){
            //count_moto+=1;
            //System.out.println("Sera transportado por:"+"Moto");   
            r="Moto";
            
        }
        else if(peso>=61  && peso <=200){
            //count_moto+=1;
            //System.out.println("Sera transportado por:"+"AE"+count_moto);      
            r="AE";
        }
        else if(peso>=201 && peso <=600){
            //count_moto+=1;
            //System.out.println("Sera transportado por:"+"Camion"+count_moto);    
            r="Camion";
        }
        else{
            System.out.println("El pedido no puede ser tramitado");     
        }
    return r;
    }
    
    public static void reslizarDespachos(){
        int horaActual=8;
        System.out.println(horaActual);
	
    }

    public static void main(String[] args) {
        
        Vehiculo suma_hora = new Vehiculo();
        Cuarto Bici = new Cuarto();
        Cuarto Moto = new Cuarto();
        Cuarto AE = new Cuarto();
        Camion Cami = new Camion();
        int horaActual=1;
        int horaTotal=20;
        Bici.bici_operarios();
        
        
        while (horaActual < horaTotal){
            System.out.println("Hora actual "+suma_hora.despachar_1());
            horaActual=suma_hora.despachar_1();
            String eleccion=presentarMenu();
            ArrayList<Integer>hora_s=Bici.hora_salida;
            ArrayList<Boolean>e_envio=Bici.disponible_1;
            if(eleccion.equals("1")){ 
                Bici.verificar_dBici(suma_hora.despachar_1());
                Bici.verificar_dmoto(suma_hora.despachar_1());
                Bici.verificar_dAE(suma_hora.despachar_1());
                String re=recepcionEnvio();
                if(re.equals("Bicicleta")){
                    System.out.print(Bici.cargar_bici(horaActual));
                    //Bici.lista_operarios();         
                }
                else if(re.equals("Moto")){
                    System.out.print(Bici.cargar_moto(horaActual));
                    //Bici.lista_operarios();         
                }
                else if(re.equals("AE")){
                    System.out.print(Bici.cargar_AE(horaActual));
                   // Bici.lista_operarios();         
                }
                else if(re.equals("Camion")){
                    Bici.suma+=4000.00;
                    ArrayList<String>lista_opera=Bici.ope;
                    System.out.print(Cami.cargar_Camion(horaActual, e_envio, hora_s));
                  //  Bici.lista_operarios();         
                }
            }  
            
            else if(eleccion.equals("2")){
                Bici.verificar_dBici(suma_hora.despachar_1());
                Bici.verificar_dmoto(suma_hora.despachar_1());
                Bici.verificar_dAE(suma_hora.despachar_1());
                Cami.verificar_Camion(horaActual, e_envio, hora_s);
                ArrayList<String>lista_opera=Bici.ope;
                Bici.bicicleta(15.0, 2,5500,lista_opera.get(0),e_envio.get(0), hora_s.get(0));
                Bici.bicicleta(15.0, 2,5500,lista_opera.get(1),e_envio.get(1), hora_s.get(1));
                Bici.bicicleta(15.0, 2,5500,lista_opera.get(2),e_envio.get(2), hora_s.get(2));
                Bici.bicicleta(15.0, 2,5500,lista_opera.get(3),e_envio.get(3), hora_s.get(3));
                Bici.bicicleta(15.0, 2,5500,lista_opera.get(4),e_envio.get(4), hora_s.get(4));
                Bici.bicicleta(15.0, 2,5500,lista_opera.get(5),e_envio.get(5), hora_s.get(5));
                Bici.bicicleta(15.0, 2,5500,lista_opera.get(6),e_envio.get(6), hora_s.get(6));
                Bici.bicicleta(15.0, 2,5500,lista_opera.get(7),e_envio.get(7), hora_s.get(7));
                Bici.bicicleta(15.0, 2,5500,lista_opera.get(8),e_envio.get(8), hora_s.get(8));
                Bici.bicicleta(15.0, 2,5500,lista_opera.get(9),e_envio.get(9), hora_s.get(9));
                Moto.bicicleta(60.0, 1,6000,lista_opera.get(10),e_envio.get(10), hora_s.get(10));
                Moto.bicicleta(60.0, 1,6000,lista_opera.get(11),e_envio.get(11), hora_s.get(11));
                Moto.bicicleta(60.0, 1,6000,lista_opera.get(12),e_envio.get(12), hora_s.get(12));
                Moto.bicicleta(60.0, 1,6000,lista_opera.get(13),e_envio.get(13), hora_s.get(13));
                Moto.bicicleta(60.0, 1,6000,lista_opera.get(14),e_envio.get(14), hora_s.get(14));
                AE.bicicleta(200.0, 3,8000,lista_opera.get(15),e_envio.get(15), hora_s.get(15));
                AE.bicicleta(200.0, 3,8000,lista_opera.get(16),e_envio.get(16), hora_s.get(16));
                AE.bicicleta(200.0, 3,8000,lista_opera.get(17),e_envio.get(17), hora_s.get(17));
                Cami.Cam(600.0, 8, 4000, lista_opera.get(18), e_envio.get(18),hora_s.get(18));
            }
            else if (eleccion.equals("3")){
                Bici.verificar_dBici(suma_hora.despachar_1());
                Bici.verificar_dmoto(suma_hora.despachar_1());
                Bici.verificar_dAE(suma_hora.despachar_1());
                suma_hora.despachar(suma_hora.despachar_1());
                
            }
             
                
        }
        System.out.print("El valor total de dia fue:"+Bici.suma);
    }
}




