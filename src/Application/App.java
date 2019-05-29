package Application;

import Entities.Cliente;
import Entities.SomadorEsperado;
import Entities.SomadorVetor;

public class App {
    public static void main(String[] args) {
        SomadorEsperado somador = new SomadorVetor();
        Cliente cliente = new Cliente(somador);


        System.out.println("Bem vindo");
        System.out.println("Testando um Adapter de somador");

        cliente.executar();
    }
}
