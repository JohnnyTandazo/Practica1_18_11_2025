class Producto {
    // Atributos privados (Encapsulamiento)
    private String nombre; 
    private double precio; 
    private int cantidad; 
 
    // Constructor
    public Producto(String nombre, double precio, int cantidad) { 
        this.nombre = nombre; 
        this.precio = precio; 
        this.cantidad = cantidad;
    }
 
    // Método para calcular el total
    public double calcularTotal() { 
        return precio * cantidad; 
    }
 
    // Método para mostrar la información
       public void mostrarInfo() { 
        System.out.println("\nProducto: " + nombre); 
        System.out.println("Precio unitario: $" + precio); 
        System.out.println("Cantidad: " + cantidad); 
        System.out.println("Total: $" + calcularTotal()); 
    }
}
