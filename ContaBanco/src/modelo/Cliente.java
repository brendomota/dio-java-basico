package modelo;

public class Cliente {
    
    private int numero;
    private String nome;
    private String agencia;
    private double saldo;

    public Cliente() {
    }

    public Cliente(int numero, String nome, String agencia, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return ("Cliente{ numero = " + this.numero + ", nome = " + this.nome + ", agencia = " + this.agencia + ", saldo = " + this.saldo);
    }
}
