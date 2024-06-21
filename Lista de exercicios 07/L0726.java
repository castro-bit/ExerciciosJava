/*
Escreva um programa para gerar aleatoriamente uma String com 100 letras minúsculas.
Apresentar, caso haja:
- as letras do alfabeto que NÃO constam na sequência;
- a maior sequência de letras repetidas;
- a maior sequência de vogais; e
- a maior sequência alfabética.
 */

import java.util.Random;
public class L0726 {
	
	public static void main (String[] args) {
		Random random = new Random();
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		String sequencia = "";
		String maiorSequencia = "";
		String maiorSequenciaVogais = "";
		String maiorSequenciaAlfabetica = "";
		int maiorSequenciaRepetida = 0;
		int maiorSequenciaVogaisTamanho = 0;
		int maiorSequenciaAlfabeticaTamanho = 0;
		int[] letras = new int[26];
		int[] vogais = new int[5];
		int[] alfabetica = new int[26];
		for (int i = 0; i < 100; i++) {
			int letra = random.nextInt(26);
			sequencia += alfabeto.charAt(letra);
			letras[letra]++;
			if (i > 0) {
				if (sequencia.charAt(i) == sequencia.charAt(i - 1)) {
					letras[letra]++;
				}
			}
			if (sequencia.charAt(i) == 'a' || sequencia.charAt(i) == 'e' || sequencia.charAt(i) == 'i' || sequencia.charAt(i) == 'o' || sequencia.charAt(i) == 'u') {
				vogais[letra]++;
				if (i > 0) {
					if (sequencia.charAt(i) == sequencia.charAt(i - 1)) {
						vogais[letra]++;
					}
				}
			}
			if (i > 0) {
				if (sequencia.charAt(i) == sequencia.charAt(i - 1) + 1) {
					alfabetica[letra]++;
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			if (letras[i] > maiorSequenciaRepetida) {
				maiorSequenciaRepetida = letras[i];
				maiorSequencia = "" + alfabeto.charAt(i);
			}
