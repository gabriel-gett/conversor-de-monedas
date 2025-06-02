import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConsultarMoneda {
    //implementando la direccion API
    public Monedas buscarMoneda(String monedaBase, String monedaTarget) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/7101998b908ff9f9aae90502/pair/"+monedaBase+"/"+monedaTarget);
    //contruyendo el cliente y la solicitud HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
    }
}
