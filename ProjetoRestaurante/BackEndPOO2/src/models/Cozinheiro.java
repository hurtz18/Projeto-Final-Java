package models;

import interfaces.ICozinheiro;

public class Cozinheiro extends Pessoa implements ICozinheiro {

    public Cozinheiro(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void prepararPratoPrincipal() {
        System.out.println("Sei preparar o prato principal!");
    }
    
    @Override
    public void limparAreaDeTrabalho() {
        System.out.println("Sei limpar a área de trabalho!");
    }

}
