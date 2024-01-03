import java.util.ArrayList;

class Comida {
    private String nombreRestaurante;
    private String platoTipico;
    private int numeroOrden;

    public Comida(String nombreRestaurante, String platoTipico, int numeroOrden) {
        this.nombreRestaurante = nombreRestaurante;
        this.platoTipico = platoTipico;
        this.numeroOrden = numeroOrden;
    }

    // Setters
    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public void setPlatoTipico(String platoTipico) {
        this.platoTipico = platoTipico;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    // Getters
    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public String getPlatoTipico() {
        return platoTipico;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void mostrarInformacion() {
        System.out.println("NOMBRE RESTAURANTE: " + nombreRestaurante);
        System.out.println("NOMBRE DEL PLATO: " + platoTipico);
        System.out.println("SU NUMERO DE ORDEN ES: " + numeroOrden);
    }
}

class DatosExtra extends Comida {
    private String numeroTarjeta;
    private int codigoTarjeta;

    public DatosExtra(String nombreRestaurante, String platoTipico, int numeroOrden,
                      String numeroTarjeta, int codigoTarjeta) {
        super(nombreRestaurante, platoTipico, numeroOrden);
        this.numeroTarjeta = numeroTarjeta;
        this.codigoTarjeta = codigoTarjeta;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("NUMERO TARJETA: " + numeroTarjeta);
        System.out.println("CODIGO TARJETA: " + codigoTarjeta);
    }
}

class Factura extends Comida {
    private String nombreCliente;
    private int cedula;
    private String direccion;
    private float precioPlato;
    private String pagoTarjetaEfectivo;
    private int numeroFactura;

    public Factura(String nombreRestaurante, String platoTipico, int numeroOrden,
                   String nombreCliente, int cedula, String direccion,
                   float precioPlato, String pagoTarjetaEfectivo, int numeroFactura) {
        super(nombreRestaurante, platoTipico, numeroOrden);
        this.nombreCliente = nombreCliente;
        this.cedula = cedula;
        this.direccion = direccion;
        this.precioPlato = precioPlato;
        this.pagoTarjetaEfectivo = pagoTarjetaEfectivo;
        this.numeroFactura = numeroFactura;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("   ****   NUMERO DE FACTURA  **** " + numeroFactura);
        System.out.println("NOMBRE: " + nombreCliente);
        System.out.println("CEDULA: " + cedula);
        System.out.println("DIRECCION DOMICILIARIA: " + direccion);
        System.out.println("PRECIO DEL PLATO: " + precioPlato);
        System.out.println("PAGO EN EFECTIVO O TARJETA: " + pagoTarjetaEfectivo);
    }
}

public class Main {
    public static void main(String[] args) {
        try {

            Comida comida = new Comida("Salsitas y Uno", "PAPAS CON CUERO", 12);
            DatosExtra datosExtra = new DatosExtra("Restaurante", "Plato", 1, "1234-5678-9012-3456", 123);
            Factura factura = new Factura("Restaurante", "Plato", 1, "Cliente", 123456789, "Dirección", 20.5f, "Efectivo", 1001);


            ArrayList<Comida> listaComidas = new ArrayList<>();
            listaComidas.add(comida);
            listaComidas.add(datosExtra);
            listaComidas.add(factura);


            for (Comida c : listaComidas) {
                c.mostrarInformacion();
                System.out.println("--------");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
