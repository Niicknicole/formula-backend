package pckproduto;

public class ProdutoService {
    private ProdutoDAO dao;
    public ProdutoService(ProdutoDAO dao) { this.dao = dao; }
    public void criarProduto(String nome) { dao.salvar(new Produto(nome)); }
}