public class DesafioControleFluxo {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Por favor, passe dois parâmetros.");
            System.out.println("Uso: <param1> <param2>");
            return;
    }
    
        try{
            int param1 = Integer.parseInt(args[0]);
            int param2 = Integer.parseInt(args[1]);

            for (int i = 0; i < param2; i++){
                param1++;
                System.out.println("primeiro numero" + (i+1) + ":segundo numero = "+ param1);

            }
        } catch (NumberFormatException e) {
            System.out.println("os parametros devem ser numeros interios");

        }
        
       
    }
    
}
