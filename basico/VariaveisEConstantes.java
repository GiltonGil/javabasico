package cursoJava.basico;

/**
 * Classe demonstrativa de vari�veis e constantes.
 * 
 * @author Gilton
 *
 */
public class VariaveisEConstantes {

	public static void main(String[] args) {
		
		//Cria��o de constantes.
		
		final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
		
		//Cria��o de vari�vies
		
		String nome = "Jos�";
		
		int idade = 48;
		
		double peso = 73.4, altura = 1.73;
		
		char sexo = 'm', cnh = 'a';
		
		boolean doadorOrgaos = true;
		
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("peso: " + peso);
		System.out.println("altura: " + altura);
		System.out.println("sexo: " + sexo);
		System.out.println("Habilita��o: " + cnh);
		System.out.println("Doador de org�os: " + doadorOrgaos);
		System.out.println("Gravidade na terra �: " + ACELERACAO_GRAVIDADE_TERRA + "m/s2");
		
		
	}

}
