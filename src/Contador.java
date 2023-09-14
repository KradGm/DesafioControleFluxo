import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int primeiroValor = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int segundoValor = scanner.nextInt();

        try {
            contar(primeiroValor, segundoValor);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O primeiro valor deve ser maior que o segundo!");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
