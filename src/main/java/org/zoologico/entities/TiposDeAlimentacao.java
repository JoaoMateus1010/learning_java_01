package org.zoologico.entities;

public enum TiposDeAlimentacao {
    herbivoro("Herbívoro"),
    carnivoro("Carnívoro"),
    onivoros("Onívoro");

    private String tipo;

    TiposDeAlimentacao(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TiposDeAlimentacao{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
