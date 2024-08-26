import java.util.Scanner;

public class loginSystem {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String username = "admin";
        String password = "password";

        System.out.print("Digite o nome de usuario: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Digitr sua senha: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)){
            System.out.println("Login efetuado");
        }else {
            System.out.println("Nome de usuário ou senha incorretos");
        }
    }
}
