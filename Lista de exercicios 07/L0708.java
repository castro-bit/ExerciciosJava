// Gabriel de Sousa Castro

/*Escreva um programa para ler uma frase fornecida pelo usuário e contar a
quantidade de cada caractere do alfabeto, imprimindo ao final uma listagem onde
consta o caractere e na frente a quantidade de ocorrências. Caso a quantidade de
ocorrências de um caractere seja zero, não apresentar o caractere na listagem. Não
diferenciar maiúsculo de minúsculo.*/
    import java.util.Scanner;

    public class L0708 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            String frase;
            int contador = 0;
    
            System.out.println("Digite uma frase");
            frase = scanner.nextLine().toLowerCase();
    
            for (char letra = 'a'; letra <= 'z'; letra++) {
                contador = 0;
                for (int i = 0; i < frase.length(); i++) {
                    if (frase.charAt(i) == letra) {
                        contador++;
                    }
                }
                if (contador > 0) {
                    System.out.println(letra + ": " + contador);
                }
            }
        }
    }