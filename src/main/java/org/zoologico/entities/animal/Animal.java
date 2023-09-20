package org.zoologico.entities.animal;

import org.zoologico.entities.TiposDeAlimentacao;
import org.zoologico.entities.TiposHabitat;
import org.zoologico.entities.comida.Alimento;

import java.text.ParseException;
import java.util.Objects;

public abstract class Animal {
    private String nome;
    private String raca;
    private float largura;
    private float altura;
    private float comprimento;
    private float saciedade;
    private TiposDeAlimentacao tipo_alimentacao;
    private TiposHabitat tipo_habitat;

    public abstract String locomover() throws ParseException;

    public void comer(Alimento alimento) throws ParseException{
        //TODO:
    }
    public String dormir() throws ParseException {
        return "Zzz...";
    }

    public Animal() {
    }

    public Animal(String nome, String raca, float largura, float altura, float comprimento, float saciedade, TiposDeAlimentacao tipo_alimentacao, TiposHabitat tipo_habitat) {
        this.nome = nome;
        this.raca = raca;
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
        this.saciedade = saciedade;
        this.tipo_alimentacao = tipo_alimentacao;
        this.tipo_habitat = tipo_habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getSaciedade() {
        return saciedade;
    }

    public void setSaciedade(float saciedade) {
        this.saciedade = saciedade;
    }

    public TiposDeAlimentacao getTipo_alimentacao() {
        return tipo_alimentacao;
    }

    public void setTipo_alimentacao(TiposDeAlimentacao tipo_alimentacao) {
        this.tipo_alimentacao = tipo_alimentacao;
    }

    public TiposHabitat getTipo_habitat() {
        return tipo_habitat;
    }

    public void setTipo_habitat(TiposHabitat tipo_habitat) {
        this.tipo_habitat = tipo_habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Float.compare(largura, animal.largura) == 0 && Float.compare(altura, animal.altura) == 0 && Float.compare(comprimento, animal.comprimento) == 0 && Float.compare(saciedade, animal.saciedade) == 0 && Objects.equals(nome, animal.nome) && Objects.equals(raca, animal.raca) && tipo_alimentacao == animal.tipo_alimentacao && tipo_habitat == animal.tipo_habitat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, raca, largura, altura, comprimento, saciedade, tipo_alimentacao, tipo_habitat);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", largura=" + largura +
                ", altura=" + altura +
                ", comprimento=" + comprimento +
                ", saciedade=" + saciedade +
                ", tipo_alimentacao=" + tipo_alimentacao +
                ", tipo_habitat=" + tipo_habitat +
                '}';
    }
}
