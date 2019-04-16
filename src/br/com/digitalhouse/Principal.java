package br.com.digitalhouse;
import java.util.*;

public class Principal {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa0 = new Pessoa("Fernando","Santos",30);
        Pessoa pessoa1 = new Pessoa("Tairo","Roberto",30);
        Pessoa pessoa2 = new Pessoa("Jessica","Milena",18);
        //adiciona pessoa.
        pessoas.add(pessoa0);
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

       /* for (Pessoa pessoa : pessoas){//para cada objeto do tipo Pessoa irei percorrer a lista pessoas e imprimir o objeto pessoa.
            System.out.println("Nome: " +pessoa.getNome() + " Sobrenome: " + pessoa.getSobrenome() + " Idade:" + pessoa.getIdade());
        }*/
       Set<Pessoa> pessoaSet = new HashSet<>();

       pessoaSet.add(pessoa0);
       pessoaSet.add(pessoa1);
       pessoaSet.add(pessoa2);

        /*for (Pessoa pessoa : pessoaSet) {
            System.out.println("Nome: " + pessoa.getNome() + " Sobrenome: " + pessoa.getSobrenome() + " Idade:" + pessoa.getIdade());

        }
        System.out.println("Pessoas Cadastradas" + pessoaSet.size());*/

        Map<String,Pessoa> pessoaMap = new HashMap<>();

        pessoaMap.put("Fernando",pessoa0);
        pessoaMap.put("Tairo",pessoa1);
        pessoaMap.put("Jessica",pessoa2);
        pessoaMap.put("Jessica",pessoa2);
        pessoaMap.put("Jessica",pessoa2);

        for (String chave : pessoaMap.keySet()){
            System.out.println("Nome: " + pessoaMap.get(chave).getNome() + " Sobrenome: " + pessoaMap.get(chave).getSobrenome());
        }
    }


}
