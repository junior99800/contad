import java.util.concurrent.ThreadLocalRandom;

public class candidatura {
    public static void main(String[] args) {
        
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual =0;
        double salarioBase=2000.0;
        while (candidatosSelecionados < 5 ){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("candidato" + candidato +"solicitou este valor de salario" + salarioPretendido );
            if (salarioBase >= salarioPretendido) {
                System.out.println("o candidato " + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase> salarioPretendido) {
            System.out.println("Ligar para candidato");
        }else if(salarioBase==salarioPretendido)
            System.out.println("Ligar para candidato com contra proposta");
        else {
            System.out.println("aguardando o resultado dos demais candidatos");
        }
    }
}
