package arrayobj.EJ5;

public class Articulo {


    private String codigo;
    private String descripcion;
    private double precVenta;
    private double precCompra;
    private int stock;
    private String precCompraString;
    private String precVentaString;
    private String stockDepositString;


    public String getCodigo(){
        return codigo;
    }

    void setCodigo(String codigo){
        this.codigo=codigo;
    }

    public String getDescripcion(){
        return descripcion;

    }

    void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    public double getPrecVenta(){
        return precVenta;
    }

    void setPrecVenta(double precVenta){
        this.precVenta=precVenta;
    }


    public double getPrecCompra(){
        return precCompra;
    }

    void setPrecCompra(double precCompra){
        this.precCompra=precCompra;
    }

    void setPrecCompraString(String precCompraString){
        this.precCompraString=precCompraString;
    }

    void setPrecVenta(String precVentaString){
        this.precVentaString=precVentaString;
    }

    void setStockDepositString(String stockDepositString){
        this.stockDepositString=stockDepositString;
    }

    public int getStock(){
        return stock;
    }

    void setStock(int stock){
        this.stock=stock;
    }


    

    public String toString() {
        String cadena = "------------------------------------------";
        cadena += "\nCÓDIGO: " + this.codigo;
        cadena += "\nDESCRIPCION: " + this.descripcion;
        cadena += "\nPRECIO COMPRA: " + this.precCompra;
        cadena += "\nPRECIO VENTA: " + this.precVenta;
        cadena += "\nSTOCK: " + this.stock + " unidades";
        cadena += "\n------------------------------------------";
        return cadena;
    }




    
}
