package Exercicio3_List_Set_Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        int questoes, erros, digitar;
        double vNota, total = 10.0;
        List<Double> inteiros = new ArrayList<>();
        Prova nota = new Prova ();

        System.out.println("================" + "\n" + "Coloque o número de questões" + "\n" + "================");
        Scanner sc = new Scanner(System.in);
        questoes = sc.nextInt();
        vNota = total/questoes;//calcula o valor de cada questão pelo número de questões
        for (int i = 0; i<questoes;i++){
        inteiros.add(vNota);}
        System.out.println("valor de cada questão é " + vNota);
        System.out.println("Prova com " + inteiros.size() + " questões");
        System.out.println("================" + "\n" + "Coloque o número de questões erradas" + "\n" + "================");
        Scanner sc1 = new Scanner(System.in);
        erros = sc1.nextInt();

        while (erros>questoes){
            System.out.println("================" + "\n" + "O números de questões erradas não pode ser maior que o número de questões totais!!!" + "\n" + "Coloque o número de questões erradas" + "\n" + "================");
            erros = sc1.nextInt();
        }

        for (int i = 0; i<erros;i++){
            inteiros.remove(vNota);}
        nota.somaTotal(inteiros);
        if (nota.soma >= 5.00){
        System.out.println("================" + "\n" + "Passa de ano!" + "\n" + "================");}
        else{
        System.out.println("================" + "\n" + "Não passa de ano!" + "\n" + "================");
        System.out.println("Dar uma ajudinha??? Digite (0) Sim (1) Não");
        Scanner sc2 = new Scanner(System.in);
        digitar = sc2.nextInt();
            while(digitar <0 || digitar>1){//controla o número digitado
                System.out.println("Erro!!!!  Digite (0) Sim (1) Não");
                digitar = sc2.nextInt();}
        if(digitar == 0){
            for (double i = nota.soma; i<5;i = i + vNota ){
            nota.soma = nota.soma + vNota;}
            System.out.println("Sua nota é "  + nota.soma + "\n" + "Passo mizeravi!");
        }
        if(digitar == 1){
                System.out.println("Estuda mais para o próximo ano");
            }
        }
    }
}
