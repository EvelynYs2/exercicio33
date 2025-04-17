package principal;

import model.Cliente;
import model.PessoaFisica;
import model.PessoaJuridica;

public class Empresa {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[4];

        clientes[0] = new PessoaFisica("João Silva", "Rua A", "1234-5678", "111.222.333-44", "MG-12.345.678", 3500.00);
        clientes[1] = new PessoaJuridica("Empresa XPTO", "Av. Central", "2345-6789", "12.345.678/0001-90", "123456789", 15000.00);
        clientes[2] = new PessoaFisica("Maria Souza", "Rua B", "3456-7890", "222.333.444-55", "SP-98.765.432", 5000.00);
        clientes[3] = new PessoaJuridica("Comércio ABC", "Rua das Flores", "4567-8901", "98.765.432/0001-10", "987654321", 12000.00);

        Cliente maior = clientes[0];

        for (int i = 1; i < clientes.length; i++) {
            if(clientes[i].getRendimento() > maior.getRendimento()) {
                maior = clientes[i];

            }
        }
        System.out.println("Cliente com maior rendimento: ");
        System.out.println("nome: " + maior.getNome());
        System.out.println("tipo: " + maior.getTipo());
        System.out.printf("Rendimento: R$ %.2f\n", maior.getRendimento());
    }
}
