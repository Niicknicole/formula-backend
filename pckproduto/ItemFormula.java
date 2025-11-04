package pckproduto;

public class ItemFormula {
    private String nome;
    private String pai;
    private int quantidade;
    private double custo;

    public ItemFormula(String nome, String pai, int quantidade, double custo) {
        this.nome = nome;
        this.pai = pai;
        this.quantidade = quantidade;
        this.custo = custo;
    }

    public String getNome() { return nome; }
    public String getPai() { return pai; }
    public int getQuantidade() { return quantidade; }
    public double getCusto() { return custo; }

    public void setCusto(double c) { this.custo = c; }
}