public class CalculoHora {
    public static void main(String[] args){
        int MariaS, ClaudioS, JohnS;
        //serial individual
            MariaS = 22;
            ClaudioS = 11;
            JohnS = 33;
        //horas trabalhadas
        int MariaH, ClaudioH, JohnH;
            MariaH = 50;
            ClaudioH = 46;
            JohnH = 74;
        //salário por hora
        int MariaC, ClaudioC, JohnC;
            MariaC = 12;
            ClaudioC = 11;
            JohnC = 8;
        //salário total
        int MariaT, ClaudioT, JohnT;
            MariaT = MariaH * MariaC;
            ClaudioT = ClaudioH * ClaudioC;
            JohnT = JohnH * JohnC;

        //Calculando o salário
        System.out.printf("SERIAL: %d, HORAS TRABALHADAS: %d, SALÁRIO POR HORA: %d, RENDA TOTAL: %d%n", MariaS,MariaH,MariaC,MariaT);
        System.out.printf("SERIAL: %d, HORAS TRABALHADAS: %d, SALÁRIO POR HORA: %d, RENDA TOTAL: %d%n", ClaudioS,ClaudioH,ClaudioC,ClaudioT);
        System.out.printf("SERIAL: %d, HORAS TRABALHADAS: %d, SALÁRIO POR HORA: %d, RENDA TOTAL: %d%n", JohnS,JohnH,JohnC,JohnT);


    }
}
