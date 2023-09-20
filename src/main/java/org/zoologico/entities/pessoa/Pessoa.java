package org.zoologico.entities.pessoa;

import java.util.Objects;

abstract public class Pessoa {
    private String nome;
    private String email;
    private String senha;
    private int idade;
    private float custo;

    public Pessoa(String nome, String email, String senha, int idade, float custo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", idade=" + idade +
                ", custo=" + custo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Float.compare(custo, pessoa.custo) == 0 && Objects.equals(nome, pessoa.nome) && Objects.equals(email, pessoa.email) && Objects.equals(senha, pessoa.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, senha, idade, custo);
    }
}
