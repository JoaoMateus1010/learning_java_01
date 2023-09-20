package org.zoologico.entities.zoologico;

import org.zoologico.entities.comida.Alimento;
import org.zoologico.entities.habitat.Habitat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Zoologico {
    private String nome;
    private String descricao;
    private float saldo;

    ArrayList<Alimento> alimentos;
    ArrayList<Habitat> habitats;

    public Zoologico(String nome, String descricao, float saldo, ArrayList<Alimento> alimentos, ArrayList<Habitat> habitats) {
        this.nome = nome;
        this.descricao = descricao;
        this.saldo = saldo;
        this.alimentos = alimentos;
        this.habitats = habitats;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public ArrayList<Habitat> getHabitats() {
        return habitats;
    }

    public void setHabitats(ArrayList<Habitat> habitats) {
        this.habitats = habitats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoologico zoologico = (Zoologico) o;
        return Float.compare(saldo, zoologico.saldo) == 0 && Objects.equals(nome, zoologico.nome) && Objects.equals(descricao, zoologico.descricao) && Objects.equals(alimentos, zoologico.alimentos) && Objects.equals(habitats, zoologico.habitats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, saldo, alimentos, habitats);
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", saldo=" + saldo +
                ", alimentos=" + alimentos +
                ", habitats=" + habitats +
                '}';
    }
}
