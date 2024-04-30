package demo;

import modelo.Cliente;
import utilitario.Teclado;

public class App {
    public static void main(String[] args) throws Exception {
        
        Teclado teclado = new Teclado();

        System.out.println("Informe o seu número: ");
        int numero = teclado.lerInteiro();

        System.out.println("Informe seu nome: ");
        String nome = teclado.lerString();

        System.out.println("Informe sua agência: ");
        String agencia = teclado.lerString();

        System.out.println("Informe seu saldo: ");
        double saldo = teclado.lerDouble();

        Cliente cliente = new Cliente(numero, nome, agencia, saldo);

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
