import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm;
        System.out.println("Digite o primeiro parâmetro");
        parametroUm = terminal.nextInt();
        int parametroDois;
        System.out.println("Digite o segundo parâmetro");
        parametroDois = terminal.nextInt();

        terminal.close();
        try {
            
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException e) {
        
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        
        for (int x = 0; x <= contagem; x++) {
            System.out.println(parametroUm + x);
        }
    }
}