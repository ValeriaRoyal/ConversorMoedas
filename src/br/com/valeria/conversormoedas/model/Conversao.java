package br.com.valeria.conversormoedas.model;

import java.util.Map;

public class Conversao {
    private String base;
    private Map<String, Double> rates;

    public String getBase() {
        return base;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public Double getTaxa(String moedaDestino) {
        return rates.get(moedaDestino);
    }
}
