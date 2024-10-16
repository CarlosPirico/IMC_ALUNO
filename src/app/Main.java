package app;

import models.*;

public class Main {
    public static void main(String[] args) {
        // Criando um aluno
        Aluno aluno = new Aluno("Carlos Pirico", "44488844816", 92.0, 1.71, 7.5, 80.0);

        // Verificando CPF
        System.out.println(aluno.toString() + "\n");
        String cpfValido = FuncoesUteis.verificarCpf(aluno.getCpf());
        System.out.println("CPF válido: " + cpfValido + "\n");

        // Calculando IMC
        String imc = FuncoesUteis.calcularImc(aluno.getPeso(), aluno.getAltura());
        System.out.println("IMC de " + aluno.getNome() + ": " + imc + "\n");

        // Avaliando o aluno
        String avaliacao = FuncoesUteis.avaliarAluno(aluno);
        System.out.println("Avaliação do aluno: " + avaliacao);
    }
}
