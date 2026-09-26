package guia143Ejercicios;

public class ProductoIndustrial {
    private String codigo;
    private String nombre;
    private String categoria;
    private double precioUnitario;
    private int cantidadDisponible;

    public ProductoIndustrial(String codigo,
                              String nombre,
                              String categoria,
                              double precioUnitario,
                              int cantidadDisponible) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
        this.cantidadDisponible = cantidadDisponible;
    }

    public double calcularValorInventario(){
        return this.precioUnitario * cantidadDisponible;
    }

    public boolean coincideConCodigo(String codigo){
        return  this.codigo.equalsIgnoreCase(codigo);
    }
    public boolean coincideContexto(String texto){
        String busqueda = texto.toLowerCase();
        return  this.nombre.toLowerCase().contains(busqueda) || this.categoria.toLowerCase().contains(busqueda);
    }

    public void aumentarStock(int cantidad){
        if (cantidad <= 0){
            System.out.println("Error: La cantidad a agregar debe ser positiva (intentaste ingresar: " + cantidad + ").");
            return;
        }
        int stockAnterior = this.cantidadDisponible;
        this.cantidadDisponible = this.cantidadDisponible + cantidad;

        System.out.println("ENTRADA A LA BODEGA: " + this.nombre);
        System.out.println("Stock anterior: " + stockAnterior + "unidades");
        System.out.println("Cantidad añadida: +" + cantidad + "unidades");
        System.out.println("Stock actual: " + this.cantidadDisponible + "unidades\n");
    }

    public boolean disminuirStock(int cantidad){
        if (cantidad <=0){
            System.out.println("Error: La cantidad a retirar debe ser mayor que cero.");
            return false;
        }
        if (cantidad > this.cantidadDisponible){
            System.out.println("Error: Stock insuficiente. Solo quedan " + this.cantidadDisponible + " unidades.");
            return false;
        }
        this.cantidadDisponible = this.cantidadDisponible - cantidad;
        System.out.println("Stock retirado. Nuevo stock de" + this.nombre +": "+ this.cantidadDisponible);
        return true;
    }
    public boolean tieneStockBajo (int limite){
        return this.cantidadDisponible < limite;
    }


    @Override
    public String toString() {
        return "ProductoIndustrial{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", cantidadDisponible=" + cantidadDisponible +
                '}';
    }

    public void mostrarInformacion(){
        System.out.println(this.toString());
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}




