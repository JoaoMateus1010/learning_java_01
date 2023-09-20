package org.zoologico.entities;

public enum TiposHabitat {
    terrestre("Terrestre"),
    aquatico("Aquático"),
    aereo("Aéreo");

    private String tipo;

    TiposHabitat(String tipo) {
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
        return "TiposHabitat{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
