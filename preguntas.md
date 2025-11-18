1. ¿Qué ventajas observas en la versión orientada a objetos?
Ventaja principal: Organización y Orden.
En lugar de tener instrucciones sueltas (Programación Estructurada), la POO usa objetos (Producto) que son bloques completos. Cada bloque ya trae consigo sus datos (color, forma, precio, cantidad) y sus acciones (calcular total).  
Esto hace que el programa sea más limpio y fácil de entender.
2. ¿Qué parte del código resultó más clara o fácil de mantener?
La lógica de cada producto.
En la POO, si quieres saber el total de un producto, solo le pides al producto: producto1.calcularTotal(). El producto ya sabe su precio y cantidad.  
En la versión estructurada, tenías que darle todos los datos a una función: calcularTotal(precio1, cantidad1). La POO simplifica quién hace qué.
3. ¿Cómo podrías extender el programa para manejar más productos?
Usando una "lista de compras" dinámica.
En lugar de crear un espacio fijo para solo 2 productos (como una caja que solo cabe 2), usarías una Lista Dinámica (ArrayList).  
Esto permite agregar productos infinitamente sin tener que cambiar el código que ya funciona.
4. ¿Podrías agregar una clase Tienda que contenga los productos y calcule el total?
Sí, es como contratar un Gerente.
La clase Tienda actuaría como un Gerente. En lugar de que la aplicación principal (TiendaApp) revise producto por producto, el Gerente (Tienda) se encarga de:  
Guardar todos los productos.
Saber cuántos hay en total.
Esto hace que la aplicación principal se preocupe solo por interactuar con el Gerente, no con cada producto individual.