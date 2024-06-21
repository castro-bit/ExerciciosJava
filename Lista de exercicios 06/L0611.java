// Gabriel de Sousa Castro
/*Escreva um programa em Java para ler o número de alunos existentes em uma turma e, 
após isto, ler as notas destes alunos, 
calcular e escrever a média aritmética dessas notas lidas.*/

import java.util.Scanner;

public class L0611{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlunos;
        double somaDasNotas = 0;
        double media;

        System.out.print("Digite o número de alunos na turma: ");
        numAlunos = scanner.nextInt();

        for (int i = 1; i <= numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            somaDasNotas += nota;
        }

        media = somaDasNotas / numAlunos;
        System.out.println("A média aritmética das notas é: " + media);

        
    }
}


    