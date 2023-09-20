package org.zoologico.entities.comida;

import org.zoologico.entities.TiposDeAlimentacao;

public record Alimento(String nome, float restaura_saciedade, TiposDeAlimentacao tipo_de_comida) {

}
