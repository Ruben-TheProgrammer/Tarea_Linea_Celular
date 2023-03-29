# Tecnologia_Tarea_2
Tarea de línea de celular.
Actividad I.
Desarrolla la siguiente clase en Java
LineaCelular
Atributos
       Numero  Int
       Titular  String
       Costo por Minuto  Int (Ej: 120 guaranies por minuto)
       Saldo  Int
       Minutos Libres  Int
Métodos
 Recargar (int monto)
      o Debe sumar el importe recibido al saldo
      o En caso de que los minutos libres fueran negativos (Ver metodo llamar para cuando este
      caso se pueda dar) primeramente se pagaran estos y el resto sera asignado al saldo

 AsignarMinutosLibres (int minutos)
      o Debe sumar los minutos asignados a MinutosLibres
 Llamar (int Minutos)
      o En base a los minutos hablados se descontará primeramente del saldo y lo restante si
      fuese necesario de minutos libres
 Los minutos libres pueden quedar en negativo

 ConsultarSaldo
      o Devuelve el Saldo disponible actualmente
 ConsultarMinutos
      o Devuelve el Saldo disponible actualmente
 CambiarTitular(String Nombre)
      o Actualiza el nombre del Titular de la línea

Se debe crear el código para probar la clase desarrollada así como sus métodos.
