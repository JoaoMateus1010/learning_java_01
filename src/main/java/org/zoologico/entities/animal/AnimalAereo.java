package org.zoologico.entities.animal;

import org.zoologico.entities.TiposDeAlimentacao;
import org.zoologico.entities.TiposHabitat;

import java.text.ParseException;

public class AnimalAereo extends Animal{
    public AnimalAereo() {
    }

    public AnimalAereo(String nome, String raca, float largura, float altura, float comprimento, float saciedade, TiposDeAlimentacao tipo_alimentacao, TiposHabitat tipo_habitat) {
        super(nome, raca, largura, altura, comprimento, saciedade, tipo_alimentacao, tipo_habitat);
    }

    @Override
    public String locomover() throws ParseException {
        return "Voando...";
    }
}
