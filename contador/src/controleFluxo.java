import java.util.Scanner;
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

public class controleFluxo {
    
        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            try {
                
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            
            }catch (RuntimeException e) {
                    System.out.println("O segundo parametro deve ser maior que o primeiro");

                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            }
            
        }
        static void contar(int parametroUm, int parametroDois ) throws  ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            int contagem = parametroDois - parametroUm;
            for (int i = parametroDois, j = parametroUm; i <= parametroUm && j >= parametroDois; i++, j--);
            //realizar o for para imprimir os números com base na variável contagem
            System.out.println("i = " + parametroDois + ", j = " + parametroUm);
        }
    }
}  
