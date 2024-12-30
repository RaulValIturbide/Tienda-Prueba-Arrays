
package prueba;


public class Articulos {
    private int id;
    private static int contadorID = 0;
    private int stock;
    private double precio;
    private double peso;
    
    public  Articulos (int id, int stock, double precio, double peso){
        this.id = ++contadorID;
        this.stock = stock;
        this.precio = precio;
        this.peso = peso;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setStock(int stock){
        this.stock  = stock;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public int getID(){
    return id;
    }
    public int getStock(){
    return stock;
    }
    
    public double getPrecio(){
    return precio;
    }
    
    public double getPeso(){
    return peso;
    }
    public void mostrarInfo(){
        System.out.format("""
                          *******************************
                          El id de este articulo es: %d
                          El stock de este articulo es: %d
                          El precio de este articulo es de: %.2f$
                          El peso de este articulo es de: %.2fkg
                          *******************************
                          *******************************
                          """,id,stock,precio,peso);    
    }
    
}
