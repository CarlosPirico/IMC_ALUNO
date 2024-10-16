package models;

public class Pessoa {
	// declarando os atributos em protected porque nao quero que pessoa seja instanciada.
    protected String nome;
    protected String cpf;
    protected double peso;
    protected double altura;

    // criando o construtor.
    public Pessoa(String nome, String cpf, double peso, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    // criando metodos basicos para consulta.
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Peso: " + peso + "kg, Altura: " + altura + "m";
    }
}