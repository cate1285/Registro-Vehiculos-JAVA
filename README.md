# Reto-2-JAVA
Usted cuenta con una empresa de mensajería y desea registrar los distintos vehículos que tiene en su empresa, donde tiene los siguientes tipos:

 

Camión (1 camión)

Automóvil eléctrico (3 Autos)

Moto (5 motos)

Bicicleta (10 bicicletas)

 

Cada uno tiene las siguientes propiedades representadas en el diagrama de clases, teniendo como particular:

-       Capacidad de carga (El camión permite varios envíos con una capacidad máxima de 600 kilos, Los demás vehículos solo pueden llevar una carga de máximo AE 200k, Moto 60K y bicicleta 15K)

-       Tiempo de respuesta (El camión es de 8 horas, AE es de 2 horas, Moto 1 hora, Bicicleta 2 hora)

-       Costo de envió (Camión $4.000, AE $8.000, Moto $6.000 y bicicleta $5.500)

-       Operarios (Camión 2, el resto de vehículos 1)

-       Se encuentra en envió o en espera.

-       Nombre del vehiculo

 

Y todos tienen los siguientes métodos:

-       Cargar, dónde recibirá el peso a cargar, devolviendo verdadero o falso en caso que pueda llevar el envió.

-       Despachar, en caso del camión solo será despachado a las 11 am, el resto de  vehículos pueden ser despachados cualquier hora del día.

-       toString, sobrescribir el método como se desea tener.

 

En la empresa se despacha de 8 am a 8 pm, pero se despacha el camión hasta las 11 am con el fin que se cargue el camión.

 

Crear una clase principal (Main), que tenga las siguientes atributos:

 

-       Hora actual, con valor inicial de 8

-       Listado de vehículos

-       Valor total en envíos

 

Y con los siguientes métodos:

-       Creación de vehículos

-       Presentar menú:

1.     Recepción de envió

2.     Obtener estado de los vehículos actualmente

3.     Realizar despachos de la hora.

-       Recepción de envió, dónde se ingresa el peso del envió, si es envió inmediato y se retorna el vehículo que transportará el pedido y se imprimirá el valor del pedido. Si indica que el envió no es de inmediato y es antes de las 11 am, se cargará al camión si aun tiene capacidad de carga, en otro caso se buscará llevar con el menor valor posible, al asignar el vehículo se debe informar cual realizará el pedido.

-       Obtener estado de los vehículos: se debe entregar todos los parámetros en pantalla como si fuera JSON de la siguiente manera: 

{capacidadDeCarga:600.0, tiempoRespuesta:8, costoEnvio:4000.0, operarios:{nombre1, nombre2}, enEnvio:true, horaDeSalida:11}

-       Realizar despachos de la hora, enviar a todos los vehículos que se encuentren listos para envíos, de retorno tendrá listos los vehículos que finalizaron la entrega.

Al finalizar el programa debe mostrar el valor que se gano durante todo el día.
