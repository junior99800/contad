import java.util.Scanner;
public class ClasseScanner {
    
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        double str;
        System.out.println("entre com seu nome:");
        str = texto.nextDouble();
        System.out.println("bem vindo " + str);

        texto.close();
    }
}
