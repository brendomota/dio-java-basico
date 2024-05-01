import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
        terminal.nextLine();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        terminal.nextLine();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm >= parametroDois) {
            	throw new ParametrosInvalidosException();
        	}

		int contagem = parametroDois - parametroUm;
		for(int i = 1; i <= contagem; i++) {
            	System.out.println("Impriminto o número " + i);
        	}
	}
}
