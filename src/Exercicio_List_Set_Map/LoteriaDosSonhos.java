package Exercicio_List_Set_Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoteriaDosSonhos {
    public static void main(String[] args) {
        Map<Integer,String> cincoNumeros = new HashMap<>();

        cincoNumeros.put(0, "Ovos");
        cincoNumeros.put(1, "Água");
        cincoNumeros.put(2, "Escopeta");
        cincoNumeros.put(3, "Cavalo");
        cincoNumeros.put(4, "Dentista");
        cincoNumeros.put(5, "Fogo");
        System.out.println("======");

        for (Integer chave : cincoNumeros.keySet()){
            System.out.println(cincoNumeros.get(chave));
        }
        Map<String, List<String>> listaDeApelidos = new HashMap<>();
        List<String> apelidosJ = new ArrayList<>();
        List<String> apelidosM = new ArrayList<>();
        List<String> apelidosMa = new ArrayList<>();
        List<String> apelidosL = new ArrayList<>();
//Apeliddos João
        apelidosJ.add("Juan");
        apelidosJ.add("Fissura");
        apelidosJ.add("Maromba");
        //Apelidos Miguel
        apelidosM.add("Night Watch");
        apelidosM.add("Bruce Wayne");
        apelidosM.add("Tampinha");
//Apelidos Maria
        apelidosMa.add("Wonder Woman");
        apelidosMa.add("Mary");
        apelidosMa.add("Marilene");
        //Apelidos Lucas
        apelidosMa.add("Lukinha");
        apelidosMa.add("Jorge");
        apelidosMa.add("George");

        listaDeApelidos.put("João",apelidosJ);
        listaDeApelidos.put("Miguel",apelidosM);
        listaDeApelidos.put("Maria",apelidosMa);
        listaDeApelidos.put("Lucas",apelidosL);
        for (String chave1 : listaDeApelidos.keySet()){
            System.out.println("Os apelidos de " + chave1 + " são:" + "\n");
            for (String apelido : listaDeApelidos.get(chave1)){
                System.out.println("\n" + apelido);
            }
        }

    }

}
