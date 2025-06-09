package br.com.valeria.conversormoedas.service;

import br.com.valeria.conversormoedas.model.Conversao;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorService {

    private final String apiKey;
    private final HttpClient client;

    public ConversorService(String apiKey) {
        this.apiKey = apiKey;
        this.client = HttpClient.newHttpClient();
    }

    public double converter(String moedaOrigem, String moedaDestino, double valor) throws IOException, InterruptedException {
        String url = String.format("https://api.apilayer.com/exchangerates_data/latest?base=%s&symbols=%s", moedaOrigem, moedaDestino);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("apikey", apiKey)
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        if (response.statusCode() != 200) {
            throw new IOException("Erro na API: " + response.statusCode() + " - " + response.body());
        }
        
        Gson gson = new Gson();
        Conversao conversao = gson.fromJson(response.body(), Conversao.class);
        Double taxa = conversao.getTaxa(moedaDestino);
        
        if (taxa == null) {
            throw new IOException("Moeda não encontrada ou não suportada pela API");
        }

        return valor * taxa;
    }
}
