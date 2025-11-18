import java.util.Scanner; 
 
public class TiendaApp { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("=== REGISTRO DE PRODUCTOS ==="); 
 
        // Crear un array para dos productos
        Producto[] productos = new Producto[2]; 
        double totalGeneral = 0; 
 
// Bucle para registrar dos productos
        for (int i = 0; i < 2; i++) { 
            System.out.println("\nProducto #" + (i + 1)); 
            
            System.out.print("Nombre: "); //
            String nombre = sc.nextLine(); //
 
            System.out.print("Precio: "); //
            double precio = sc.nextDouble(); //
            
            System.out.print("Cantidad: "); //
            int cantidad = sc.nextInt(); //
            sc.nextLine(); 
 
            // Crear y almacenar el objeto Producto[span_53](end_span)
            productos[i] = new Producto(nombre, precio, cantidad); 
        }
 
        System.out.println("\n=== RESUMEN DE INVENTARIO ==="); //
        // Iterar sobre los productos para mostrar info y sumar totales
        for (Producto p : productos) { //
            p.mostrarInfo(); 
            totalGeneral += p.calcularTotal(); 
        }
 
        System.out.println("\nTOTAL GENERAL DEL INVENTARIO: $" + //
                           totalGeneral); //
 
        sc.close();
    }
}
