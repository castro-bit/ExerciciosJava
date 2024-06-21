import java.util.Random;

public class  ADivisivelPorBRandom {
    public static void main(String args[]) {
		
      Random random = new Random();
      
		int a=random.nextInt(1000)+1;
		int b=random.nextInt(20)+1;
      
		if (a%b ==0){
          System.out.println("É divisivel");
		}else{
          System.out.println("Não é divisivel");
      }
      }
}
