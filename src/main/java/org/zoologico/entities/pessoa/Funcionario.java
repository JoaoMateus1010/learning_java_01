package org.zoologico.entities.pessoa;

import org.zoologico.entities.animal.Animal;
import org.zoologico.entities.comida.Alimento;
import org.zoologico.entities.habitat.Habitat;

public class Funcionario extends Pessoa{
    public Funcionario(String nome, String email, String senha, int idade, float custo) {
        super(nome, email, senha, idade, custo);
    }

    public void alimentaAnimal(Animal animal, Alimento alimento){
        //TODO:
    }

    public void insereAnimalHabitat(Animal animal, Habitat habitat){
        //TODO:
    }

    public void removeAnimalHabitat(Animal animal, Habitat habitat){
        //TODO:
    }

    public void realocaAnimalHabitat(Animal animal, Habitat old_habitat, Habitat new_habitat){
        //TODO:
    }
}
