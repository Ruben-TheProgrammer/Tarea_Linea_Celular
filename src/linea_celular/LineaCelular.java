package linea_celular;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class LineaCelular {

    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);
        Linea nuevaLinea = new Linea();
        
        String nomTitular;
        System.out.print("Introduzca nombre: ");
        nomTitular = teclado.nextLine();
        nuevaLinea.setTitular(nomTitular);
        
        int num;
        System.out.print("Introduzca Numero: ");
        num = teclado.nextInt();
        nuevaLinea.setNumero(num);
        
        int cost;
        System.out.print("Costo llamada: ");
        cost = teclado.nextInt();
        nuevaLinea.setCost(cost);
        
        int saldo;
        System.out.print("Ingrese saldo: ");
        saldo = teclado.nextInt();
        nuevaLinea.setSaldot(saldo);
        
        int free;
        System.out.print("Ingrese minutos libres: ");
        free = teclado.nextInt();
        nuevaLinea.setFree(free);

         System.out.println("---------------------------------------------------");

        
        System.out.println("Titular: " + nuevaLinea.getTitular());
        System.out.println("Numero: " + nuevaLinea.getNumero());
        System.out.println("costo de llamadas: " + nuevaLinea.getCosto() + "Gs");
        System.out.println("Saldo: " + nuevaLinea.getSaldo());
        System.out.println("Minutos Libre: " + nuevaLinea.getMinutos());

        
        System.out.println("---------------------------------------------------");
        
        
        int opcion;
        System.out.println("1- Cambiar Titular");
        System.out.println("2- Recargar Saldo");
        System.out.println("3- Asignar Minutos");
        System.out.println("4- Llamar");
        System.out.println("5- Consultar Saldo");
        System.out.println("6- Consultar Minutos");

        
        System.out.print("Elija una Opcion: ");
        opcion = teclado.nextInt();
        
    switch (opcion) { 
    case 1:
        String nuevoN;
        System.out.print("Introduzca nombre: ");
        nuevoN = teclado.next();
        nuevaLinea.nuevoNombre(nuevoN);
        System.out.println("Nombre Titular actualizado: " + nuevaLinea.getCambioN());
     break;
    case 2:
        int monto;
        System.out.print("Introduzca recarga: ");
        monto = teclado.nextInt();
        nuevaLinea.recargar(monto);
        System.out.println("Saldo actualizado: "+nuevaLinea.getSaldo());
     break;
    case 3 :
         int minutos;
        System.out.print("Introduzca minutos: ");
        minutos = teclado.nextInt();
        nuevaLinea.minutosfree(minutos);
        System.out.println("Minutos Actualizados: " + nuevaLinea.getMinutos());
     break;
    case 4:
        int llamada;
        System.out.print("Introduzca minutos en llamada: ");
        llamada = teclado.nextInt();
        nuevaLinea.llamar(llamada);
        System.out.println("Saldo restante: "+nuevaLinea.getSaldo());
        break;
    case 5:
                System.out.println("Saldo actual: " + nuevaLinea.getSaldo());
        break;
    case 6:
                 System.out.println("Minutos Libre disponibles: " + nuevaLinea.getMinutos());
        break;
    default:
            System.out.println("Opcion incorrecta");

  }

        
    }
    
}
