import java.util.Scanner;

public class TesteSeguranca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaDeSeguranca sistema = new SistemaDeSeguranca();

        while (!sistema.isAutenticado()) {
            System.out.print("Usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            if (sistema.login(usuario, senha)) {
                System.out.println("Bem-vindo ao sistema!");
            } else {
                System.out.println("Usuário ou senha incorretos. Tente novamente.");
            }
        }

        System.out.print("Deseja sair? (s/n): ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            sistema.logout();
        }

        scanner.close();
    }
}
