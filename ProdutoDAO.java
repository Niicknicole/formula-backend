package pckproduto;

import java.util.List;

public interface ProdutoDAO {
    void salvar(Produto p);
    Produto buscar(String nome);
    List<Produto> listar();
    void atualizar(Produto p);
    void deletar(String nome);
}