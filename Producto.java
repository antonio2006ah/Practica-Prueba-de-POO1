class Producto{
    private String nombre;
    private double precio;
    private int stock;

    public Producto (String nombre, double precio, int stock){
    this.nombre = nombre;
    if(precio >= 0){
        this.precio = precio;
       
    }else{
        this.precio = 0.0;
    }
        
    if(stock >= 0){
        this.stock = stock;
    }else{
        
        this.stock = 0;
    }
    }

    public void actualizarStock(int cantidad){
        
        if (this.stock + cantidad >=0) {
            this.stock += cantidad;
            System.out.println("stock actualizado: "+ this.stock);
        }else{
            System.out.println("No hay suficiente stock");
        }
    }

    public void mostrarDtos(){
        System.out.println("nombre: "+ nombre);
        System.out.println("precio: "+ precio);
        System.out.println("stock: "+ stock);

    }
    public static void main(String[] args){
    Producto producto1 = new Producto("Remera",1500.1,10);
    producto1.mostrarDtos();
    producto1.actualizarStock(-3);
    producto1.mostrarDtos();
}

}


