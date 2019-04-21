package Exercicio4_List_Set_Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

       GuardaVolumes gVolumes = new GuardaVolumes();
       Map<Integer, List<Peca>> pecas = new HashMap<>();
       List<Peca> adicionarpeca = new ArrayList<>();
       Peca tenis = new Peca ("Nike","Running");
       Peca tenis2 = new Peca ("Adidas","Esportivo");

       adicionarpeca.add(tenis);
       adicionarpeca.add(tenis2);

      gVolumes.guardarPecas(adicionarpeca,pecas);
      gVolumes.mostrarPecas(pecas);
      gVolumes.devolverPecas(1,pecas);
      gVolumes.mostrarPecas(pecas);

    }
}
