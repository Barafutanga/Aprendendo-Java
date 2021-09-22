package src;
import java.util.Scanner;

public class HorasDeJogo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int horaini, horafin;
        horaini = sc.nextInt();
        horafin = sc.nextInt();

        int duracao;
        if (horaini < horafin) {
            duracao = horafin - horaini;
        } else { duracao = 24 - horaini + horafin; }

        System.out.printf("O jogo durou %d horas", duracao);

        sc.close();
    }
}
