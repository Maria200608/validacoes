import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite seu cpf (somente números): ");
        Scanner tcd = new Scanner(System.in);
        String cpf = tcd.nextLine();

        if (Util.validaCPF(cpf)) {
            System.out.println("CPF OK");
        } else {
            System.out.println("CPF Inválido!");
        }

        tcd.close();
    }
}
