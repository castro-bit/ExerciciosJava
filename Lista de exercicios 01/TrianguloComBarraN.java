// Gabriel de Sousa Castro


public class TrianguloComBarraN {
    public static void main(String[] args) {
		int linhas = 5;
        String triangulo = "";
		for (int i = 1; i <= linhas; i++) {
        for (int j = 1; j <= i; j++) {
                triangulo += "*";
            }
		triangulo += "\n";
        }
		System.out.print(triangulo);
    }
}
