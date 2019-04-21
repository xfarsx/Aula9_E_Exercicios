package Exercicio4_List_Set_Map;


public class Peca {

    private String marca;
    private String modelo;
    private Integer posicao;

    public Peca() {
    }

    public Peca(String marca, String modelo, Integer posicao) {
        this.marca = marca;
        this.modelo = modelo;
        this.posicao = posicao;
    }

    public Peca(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }
}
