import java.util.Scanner;
 
public class TiendaEstructurada {
 
    public static void main(String[] args) { // La sintaxis correcta incluye []
        Scanner sc = new Scanner(System.in);
        
        // 1. Pida al usuario el nombre, precio y cantidad
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese el precio unitario: ");
        double precio = sc.nextDouble();
        
        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();
 
        // 2. Calcule el valor total
        double total = calcularTotal(precio, cantidad); // Llamada al método
        
        // 3. Muestre un resumen
        mostrarResumen(nombre, precio, cantidad, total); // Llamada al método
        
        sc.close(); // Buena práctica: cerrar el scanner
    }
 
    /**
     * Calcula el valor total de un producto (precio x cantidad).
     */
    public static double calcularTotal(double precio, int cantidad) {
        return precio * cantidad; // Operación de cálculo
    }
 
    /**
     * Muestra el resumen del producto.
     */
    public static void mostrarResumen(String nombre, double precio, int
                                      cantidad, double total) {
        System.out.println("\n=== RESUMEN DE PRODUCTO ===");
        System.out.println("Producto: " + nombre);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: $" + total);
    }
}
