package models;

import interfaces.ICozinheiro;
import interfaces.IGarcom;

public class Gerente extends Pessoa implements ICozinheiro, IGarcom {

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void saberAnotarPedidos() {
        System.out.println("Sei anotar pedidos!");
    }

    @Override
    public void saberServirBebidas() {
        System.out.println("Sei servir bebidas!");
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
