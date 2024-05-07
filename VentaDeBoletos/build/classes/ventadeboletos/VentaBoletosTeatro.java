/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventadeboletos;

/**
 *
 * @author Marcelo B
 */
import java.util.Scanner;

public class VentaBoletosTeatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir la cantidad de asientos disponibles
        int asientosDisponibles = 100;
        
        // Mostrar la cantidad de asientos disponibles
        System.out.println("Bienvenido a la venta de boletos del Teatro Morol");
        System.out.println("Asientos disponibles: " + asientosDisponibles);
        
        // Solicitar la cantidad de boletos a comprar
        System.out.print("Ingrese la cantidad de boletos que desea comprar: ");
        int cantidadBoletos = scanner.nextInt();
        
        // Verificar si hay suficientes asientos disponibles
        if (cantidadBoletos > asientosDisponibles) {
            System.out.println("Lo sentimos, no hay suficientes asientos disponibles.");
        } else {
            // Calcular el total a pagar
            double precioBoleto = 50.0; // Precio por boleto
            double totalPagar = cantidadBoletos * precioBoleto;
            
            // Mostrar el total a pagar
            System.out.println("Total a pagar: $" + totalPagar);
            
            // Confirmar la compra
            System.out.print("¿Desea confirmar la compra? (S/N): ");
            String confirmacion = scanner.next();
            
            if (confirmacion.equalsIgnoreCase("S")) {
                // Restar la cantidad de boletos vendidos de los asientos disponibles
                asientosDisponibles -= cantidadBoletos;
                
                // Mostrar mensaje de compra exitosa
                System.out.println("¡Compra realizada con éxito!");
                System.out.println("Asientos disponibles actualizados: " + asientosDisponibles);
            } else {
                System.out.println("Compra cancelada.");
            }
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}