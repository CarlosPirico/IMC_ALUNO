package models;

// criando a subclasse Aluno da superclasse Pessoa
public class Aluno extends Pessoa {
    // criando os atributos privados.
	private double nota;
    private double percentualPresenca;

    // criando o contrutro da subclasse herdando os atributos da superclasse Pessoa
    public Aluno(String nome, String cpf, double peso, double altura, double nota, double percentualPresenca) {
        super(nome, cpf, peso, altura);
        this.nota = nota;
        this.percentualPresenca = percentualPresenca;
    }

    // metodo para consulta.
    public double getNota() {
        return nota;
    }

    public double getPercentualPresenca() {
        return percentualPresenca;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nota: " + nota + ", Presença: " + percentualPresenca + "%";
    }
}
