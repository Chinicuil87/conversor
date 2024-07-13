package api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Cambio {
    private static final String API_KEY = "7a965ef90b42e0b13fb2fe28";

    public static double getExchangeRate(String baseCurrency, String targetCurrency) {
        // Construir la URL para la solicitud
        String url = "https://v6.exchangerate-api.com/v6/"+API_KEY+"/pair/"+baseCurrency+"/"+targetCurrency;

        try {
            // Enviar solicitud GET a la API
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder() .uri(URI.create(url)) .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Procesar la respuesta JSON y obtener la tasa de conversión
            JsonObject jsonResponse = new Gson().fromJson(response.body(), JsonObject.class);
            return jsonResponse.get("conversion_rate").getAsDouble();

        } catch (Exception e) {
            // Registrar si se produce un error
            System.err.println("Error al obtener la tasa de cambio: " + e.getMessage());
            throw new RuntimeException("Error al obtener la tasa de cambio.");
        }
    }
}
