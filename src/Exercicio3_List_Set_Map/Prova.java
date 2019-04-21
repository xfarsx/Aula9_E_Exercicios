package Exercicio3_List_Set_Map;
import java.util.List;


public class Prova {

    double soma = 0;

        public void somaTotal(List<Double> conjuntoDeInteiros){
                    for (Double inteiro : conjuntoDeInteiros){
                      soma = soma + inteiro;
                    }
            System.out.println("A soma da nota é " + soma);
        }
}
