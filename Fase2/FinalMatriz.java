import java.util.Scanner;
public class FinalMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M, N;
        System.out.print("Matriz heigth: ");
        M = sc.nextInt();
        System.out.print("Matriz width: ");
        N = sc.nextInt();
        int[][] mat = new int[M][N]; //matriz

        //input
        for (int i = 0; i < mat.length; i++) { //linha
            for (int j = 0; j < mat[i].length; j++) { //coluna
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Choose a coordinate to analyse: ");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) { //linha
            for (int j = 0; j < mat[i].length; j++) { //coluna
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + (j-1) + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (j > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[j].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }

                }
            }
        }


        sc.close();
    }
    
}
