package prueba;

import java.util.Random;

public class Tienda {

    public static void main(String[] args) {
        Random random = new Random();
        Articulos[] aArticulo = new Articulos[100];
        double precioTotal = 0;//variable para almacenar el total del precio
        int stockTotal = 0; //variable para almacenar el total del inventario
        int contadorPeso = 0; //variable para contar la cantidad de articulos inferiores a 5 kg
        aArticulo[0] = new Articulos(1, 10, 12.50, 23.25);
        aArticulo[1] = new Articulos(2, 12, 50.50, 32.50);
        aArticulo[2] = new Articulos(3, 36, 60.50, 26.50);

        /**
         * Este for sirve para sumar las variables de los 3 articulos creados de
         * manera manual que se irán sumando al for siguiente
         */
        for (int i = 0; i < 3; i++) {
            precioTotal += aArticulo[i].getPrecio();
            stockTotal += aArticulo[i].getStock();
            if (aArticulo[i].getPeso() < 5) {
                contadorPeso++;
            }
        }
        /**
         * En este for realizamos la creación de los 97 articulos restantes y
         * creamos sus variables al azar despues las sumamos al total para dar
         * el valor de todas
         */
        for (int i = 3; i < aArticulo.length; i++) {
            int stock = random.nextInt(0,50);
            double precio = random.nextDouble(10, 100);
            double peso = random.nextDouble(1, 20);
            aArticulo[i] = new Articulos(i, stock, precio, peso);
            precioTotal += aArticulo[i].getPrecio();
            stockTotal += aArticulo[i].getStock();

            if (aArticulo[i].getPeso() < 5) {
                contadorPeso++;
            }

        }

        System.out.format("""
                          El precio es: %.2f$
                          """, precioTotal);
        System.out.println("Los objetos con menos de 5 kilos de peso son: " + contadorPeso);
        System.out.println("En total hay: " + stockTotal + " objetos ");


    }
    
}
