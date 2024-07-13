package modulos;

import java.util.ArrayList;
import java.util.List;

public class Consulta {
    // Lista para almacenar las conversiones realizadas
    private List<Conversion> conversiones;

    //Constructor por defecto - Inicializa la lista de conversiones como una nueva lista vacía.
    public Consulta() {
        conversiones = new ArrayList<>();
    }

    //Agrega una nueva conversión al historial
    public void agregarConversion(Conversion conversion) {
        conversiones.add(conversion);
    }

    //Obtiene el historial completo de conversiones
    public List<Conversion> obtenerHistorial() {
        return conversiones;
    }

    //Muestra el historial completo de conversiones por la consola
    public void mostrarHistorial() {
        List<Conversion> historial = obtenerHistorial();
        for (Conversion conversion : historial) {
            System.out.println(conversion);
        }
    }
}
}
