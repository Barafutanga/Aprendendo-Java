import java.util.Scanner;
public class matriz {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);    

    int n = sc.nextInt();
    int[][] mat = new int[n][n]; //matriz

    //o programa reconhece a ação "espaço" como inserção do próximo valor no eixo das colunas
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            mat[i][j] = sc.nextInt();
        }
    }

    System.out.println("Main Diagonal");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
    System.out.println();
    
    /*
    int count = 0;
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            if (mat[i][j] < 0) {
                count ++;   
            }
        }    
    }
    
    System.out.println("Negative numbers = " + count);
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            if (mat[i][i] < 0); {
                System.out.print(mat[i][i] + " ");
            } System.out.println();
            if (mat[j][j] < 0); {
                System.out.print(mat[j][j] + " ");
            } System.out.println();
        }
    }
    */

    sc.close();
    }
}

