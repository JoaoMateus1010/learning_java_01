package org.zoologico.entities.pessoa;

import org.zoologico.entities.animal.Animal;
import org.zoologico.entities.comida.Alimento;
import org.zoologico.entities.zoologico.Zoologico;

public class Administrador extends Pessoa{
    private final Zoologico zoologico_to_adm;
    public Administrador(String nome, String email, String senha, int idade, float custo, Zoologico zoologico) {
        super(nome, email, senha, idade, custo);
        this.zoologico_to_adm = zoologico;
    }

    public void comprarAnimal(Animal animal) throws Exception{
        //TODO:
    }
    public void venderAnimal(Animal animal) throws Exception{
        //TODO:
    }
    public void comprarAlimento(Alimento alimento) throws Exception{
        //TODO:
    }
    public void contratarFuncionario(Funcionario funcionario) throws Exception{
        //TODO:
    }
}
