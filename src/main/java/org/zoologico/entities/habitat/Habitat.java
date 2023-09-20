package org.zoologico.entities.habitat;

import org.zoologico.entities.TiposHabitat;
import org.zoologico.entities.animal.Animal;

import java.util.ArrayList;
import java.util.Objects;

public class Habitat {
    private final String nome;
    private final float largura;
    private final float altura;
    private final float comprimento;
    private float ocupado_largura;
    private float ocupado_altura;
    private float ocupado_comprimento;
    private final TiposHabitat tipo_habitat;

    private ArrayList<Animal> animais;

    public void insereAnimal(Animal animal)throws Exception{
        //TODO:
    }

    public void removeAnimal(Animal animal)throws Exception{
        //TODO:
    }

    public Habitat(String nome, float largura, float altura, float comprimento, TiposHabitat tipo_habitat, ArrayList<Animal> animais) {
        this.nome = nome;
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
        this.tipo_habitat = tipo_habitat;
        this.animais = animais;
    }

    public String getNome() {
        return nome;
    }

    public float getLargura() {
        return largura;
    }

    public float getAltura() {
        return altura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public float getOcupado_largura() {
        return ocupado_largura;
    }

    public void setOcupado_largura(float ocupado_largura) {
        this.ocupado_largura = ocupado_largura;
    }

    public float getOcupado_altura() {
        return ocupado_altura;
    }

    public void setOcupado_altura(float ocupado_altura) {
        this.ocupado_altura = ocupado_altura;
    }

    public float getOcupado_comprimento() {
        return ocupado_comprimento;
    }

    public void setOcupado_comprimento(float ocupado_comprimento) {
        this.ocupado_comprimento = ocupado_comprimento;
    }

    public TiposHabitat getTipo_habitat() {
        return tipo_habitat;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habitat habitat = (Habitat) o;
        return Float.compare(largura, habitat.largura) == 0 && Float.compare(altura, habitat.altura) == 0 && Float.compare(comprimento, habitat.comprimento) == 0 && Float.compare(ocupado_largura, habitat.ocupado_largura) == 0 && Float.compare(ocupado_altura, habitat.ocupado_altura) == 0 && Float.compare(ocupado_comprimento, habitat.ocupado_comprimento) == 0 && Objects.equals(nome, habitat.nome) && tipo_habitat == habitat.tipo_habitat && Objects.equals(animais, habitat.animais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, largura, altura, comprimento, ocupado_largura, ocupado_altura, ocupado_comprimento, tipo_habitat, animais);
    }

    @Override
    public String toString() {
        return "Habitat{" +
                "nome='" + nome + '\'' +
                ", largura=" + largura +
                ", altura=" + altura +
                ", comprimento=" + comprimento +
                ", ocupado_largura=" + ocupado_largura +
                ", ocupado_altura=" + ocupado_altura +
                ", ocupado_comprimento=" + ocupado_comprimento +
                ", tipo_habitat=" + tipo_habitat +
                ", animais=" + animais +
                '}';
    }
}
