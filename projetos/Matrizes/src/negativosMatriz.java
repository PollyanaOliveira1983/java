import java.util.Locale;
import java.util.Scanner;

public class negativosMatriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int n = sc.nextInt();
				
		int [][] mat = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("Elemento [%d,%d]: ",i,j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					System.out.printf("%d\n", mat[i][j]);
				}
			}
		}
		
		
		sc.close();

	}

}
