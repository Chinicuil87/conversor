package modulos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conversion {
    private String divisaBase;
    private String divisaObjetivo;
    private double cantidad;
    private double tasaCambio;
    private LocalDateTime fecha;


    //Constructor de la clase Conversion
    public Conversion(String divisaBase, String divisaObjetivo, double cantidad,
                      double tasaCambio, LocalDateTime fecha) {
        this.divisaBase = divisaBase;
        this.divisaObjetivo = divisaObjetivo;
        this.cantidad = cantidad;
        this.tasaCambio = tasaCambio;
        this.fecha = fecha;
    }


    //Devuelve una representación de cadena de la conversión, incluyendo todos los detalles
    @Override
    public String toString() {
        // Formatear la fecha en una representación legible para el usuario
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = fecha.format(formatter);

        // Construir la representación de cadena de la conversión
        return String.format("Conversion: De %s a %s, Cantidad: %.2f, Tasa de cambio: %.2f, Fecha: %s",
                divisaBase, divisaObjetivo, cantidad, tasaCambio, fechaFormateada);
    }


    // Getters y setters para acceder y modificar los atributos de la conversión
    public String getDivisaBase() {
        return divisaBase;
    }

    public void setDivisaBase(String divisaBase) {
        this.divisaBase = divisaBase;
    }

    public String getDivisaObjetivo() {
        return divisaObjetivo;
    }

    public void setDivisaObjetivo(String divisaObjetivo) {
        this.divisaObjetivo = divisaObjetivo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(double tasaCambio) {
        this.tasaCambio = tasaCambio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
}
