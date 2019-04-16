package Exercicio2_List_Set_Map;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {
    public static void main(String[] args) {

        List<Integer> listaDeNumeros = new ArrayList<>();

        listaDeNumeros.add(1);
        listaDeNumeros.add(5);
        listaDeNumeros.add(5);
        listaDeNumeros.add(6);
        listaDeNumeros.add(7);
        listaDeNumeros.add(8);
        listaDeNumeros.add(8);
        listaDeNumeros.add(8);
        System.out.println("Lista (1)" + "\n");
        for (Integer listaDeNumero : listaDeNumeros) {
            System.out.println(listaDeNumero);

        }
        System.out.println("\n" + "==================" + "\n");
        Set<Integer> listaDeNums = new HashSet<>();

        listaDeNums.add(1);
        listaDeNums.add(5);
        listaDeNums.add(5);
        listaDeNums.add(6);
        listaDeNums.add(7);
        listaDeNums.add(8);
        listaDeNums.add(8);
        listaDeNums.add(8);
        System.out.println("Lista (2)" + "\n");
        for (Integer listaDeNum : listaDeNums) {
            System.out.println(listaDeNum);
        }

    }
}
