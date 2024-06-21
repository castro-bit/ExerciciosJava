// Gabriel de Sousa Castro

/*Escreva um programa validador de senhas. A regra para a criação de uma senha forte é
que a senha deve ser de tamanho mínimo 10. A senha deve conter letras maiúsculas, letras
minúsculas, números e caracteres especiais/símbolos (!@#$%&*()+). Outra regra, deve ter
pelo menos 3 caracteres (maiúsculo ou minúsculo), pelo menos 3 números e pelo menos 2
símbolos. O programa deve solicitar uma senha forte ao usuário até ele conseguir uma senha
que respeite esses critérios. Após cada senha digitada, apresentar as regras e se a senha
passou pelos quesitos ou não.
Ex:
Senha: senha123
Regras
Tamanho 10: 8 (x)
Letras 3: 5 (ok)
Números 3: 3 (ok)
Símbolos 2: 0 (x)
Senha reprovada! Tente novamente.
Senha: Bgp2Ip4*@1
Regras
Tamanho 10: 10 (ok)
Letras 3: 5 (ok)
Números 3: 3 (ok)
Símbolos 2: 2 (ok)
Senha aprovada! Parabéns! */

import java.util.Scanner;
public class L0725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira uma senha
        System.out.println("Digite uma senha forte:");
        String senha = scanner.nextLine();
        
        int tamanho = senha.length();
        int letras = 0;
        int numeros = 0;
        int simbolos = 0;
        
        // Verifica se a senha é forte
        for (int i = 0; i < tamanho; i++) {
            char c = senha.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    letras++;
                } else {
                    letras++;
                }
            } else if (Character.isDigit(c)) {
                numeros++;
            } else {
                simbolos++;
            }
        }
        
        // Exibe o resultado
        System.out.println("Regras");
        System.out.println("Tamanho 10: " + tamanho + (tamanho >= 10 ? " (ok)" : " (x)"));
        System.out.println("Letras 3: " + letras + (letras >= 3 ? " (ok)" : " (x)"));
        System.out.println("Números 3: " + numeros + (numeros >= 3 ? " (ok)" : " (x)"));
        System.out.println("Símbolos 2: " + simbolos + (simbolos >= 2 ? " (ok)" : " (x)"));
        
        if (tamanho >= 10 && letras >= 3 && numeros >= 3 && simbolos >= 2) {
            System.out.println("Senha aprovada! Parabéns!");
        } else {
            System.out.println("Senha reprovada! Tente novamente.");
        }
    }
    
}
