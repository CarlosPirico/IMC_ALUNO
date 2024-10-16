package models;

public class FuncoesUteis {

    // Verificar CPF válido.
    public static String verificarCpf(String cpf) {
    	// validando se existe dado no paramentro cpf e se possui 12 digitos usando expressão regular.
    	if(cpf != null && cpf.matches("\\d{11}")) {
    		return "Válido";
    	} else {
    		return "Invalido";
    	}
    }

    // Calcular IMC.
    public static String calcularImc(double peso, double altura) {
    	// validando parametros acima de 0.
        if (altura <= 0 || peso <=0) throw new IllegalArgumentException("valores deve ser maior que 0.");
        return String.format("%.2f", peso / (altura * altura));
    }

    // Avaliar aluno.
    public static String avaliarAluno(Aluno aluno) {
    	// Validando nota acima de 5 e presenca acima de 75.
        if (aluno.getNota() >= 5 && aluno.getPercentualPresenca() >= 75) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
