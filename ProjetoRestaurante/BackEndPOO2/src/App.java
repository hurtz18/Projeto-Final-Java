import java.util.ArrayList;

import models.Cozinheiro;
import models.Cliente;
import models.EnumTipo;
import models.Gerente;
import models.Mesa;
import models.Garcom;

public class App {
    public static void main(String[] args) {
        System.out.println("Restaurante java" + "\n");

        Garcom garcom1 = new Garcom("Gabriel", "83986662531", "987654321-09");

        garcom1.saberAnotarPedidos();
        garcom1.saberServirBebidas();

        Cozinheiro cozinheiro1 = new Cozinheiro("Joao", "839094324", "456787654-87");

        cozinheiro1.prepararPratoPrincipal();
        cozinheiro1.limparAreaDeTrabalho();

        Gerente gerente1 = new Gerente("Pedro", "8399743248", "12792264470");
        gerente1.saberFalarIngles();

        Mesa mesa1 = new Mesa("27", 4, EnumTipo.VIP);
        Mesa mesa2 = new Mesa("36", 8, EnumTipo.RESERVADA);

        System.out.println(mesa2);

        Cliente cliente1 = new Cliente("Jose", "839123553123", "123456789-01", 42);
        Cliente cliente2 = new Cliente("Rebeca", "839123235123", "123456789-02", 17);
        Cliente cliente3 = new Cliente("Izabella", "83915252323123", "123456789-03", 21);
        Cliente cliente4 = new Cliente("Mathes", "8395253123", "123456789-04", 36);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        System.out.println(clientes.size());
    }
}
