package Exercicio4_List_Set_Map;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {


    public void guardarPecas(List<Peca> listadePeca, Map<Integer, List<Peca>> pecas) {
        int i;
        for (i = 0; i < listadePeca.size(); i++) {

            pecas.put(i, listadePeca);
            listadePeca.get(i).setPosicao(i);
            System.out.println("Peça guardada!\n===================================\nPosição: "
                    + listadePeca.get(i).getPosicao() + "\nMarca: " + listadePeca.get(i).getMarca() + "\nModelo: "
                    + listadePeca.get(i).getModelo() + "\n===================================");
        }
        System.out.println("Total de peças guardadas: " + i);
    }
    public void mostrarPecas( Map<Integer, List<Peca>> vPecas)
    {
        System.out.println("================================\nLista de peças guardadas!\n================================");
        for (Integer key : vPecas.keySet())
        {
            System.out.println("================================\nPosição: " + vPecas.get(key).get(key).getPosicao() +
                    "\nMarca: " + vPecas.get(key).get(key).getMarca() + "\nModelo: "
                    + vPecas.get(key).get(key).getModelo() + "\n================================" );
        }
    }
    public void devolverPecas(Integer num,Map <Integer,List<Peca>> pecas) {
        System.out.println("Pecas removida!\n===================================" + "\nPosição: " + pecas.get(num).get(num).getPosicao() +
                "\nMarca: " + pecas.get(num).get(num).getMarca() + "\nModelo: " + pecas.get(num).get(num).getModelo() + "\n===================================");
        pecas.remove(num);
    }
}