
package factura;

/**
 *
 * @author cacer
 */
public class Factura {

    private String ruc,empresa;
    private int unidades;
    private double precioUni;
    
    private static int cantidad;
    
    static 
    {
    cantidad = 0;
    }
      
    
    private static double sumaImporteFaturado;
    
    
    static{
        sumaImporteFaturado =0;
    }

    public Factura(String ruc, String empresa, int unidades, double precioUni) {
        this.ruc = ruc;
        this.empresa = empresa;
        this.unidades = unidades;
        this.precioUni = precioUni;
        cantidad++;
        sumaImporteFaturado = sumaImporteFaturado + (unidades * precioUni);    }

    public Factura() {
        this("10256985474","BACKUS  & JHONSTON");
    }

    public Factura(String ruc, String empresa) {
        this(ruc,empresa,100, 50.0);
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecioUni() {
        return precioUni;
    }

    public void setPrecioUni(double precioUni) {
        this.precioUni = precioUni;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        Factura.cantidad = cantidad;
    }

    public static double getSumaImporteFaturado() {
        return sumaImporteFaturado;
    }

    public static void setSumaImporteFaturado(double sumaImporteFaturado) {
        Factura.sumaImporteFaturado = sumaImporteFaturado;
    }
    
    
    public double importeFacturado()
    {
        return (unidades *  precioUni);
    }
    
    
}
