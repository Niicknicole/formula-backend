package pckproduto;

import java.util.*;

public class ProdutoDAOEmMemoria implements ProdutoDAO {
    private Map<String, Produto> db = new HashMap<>();

    public void salvar(Produto p) { db.put(p.getNome(), p); }
    public Produto buscar(String nome) { return db.get(nome); }
    public List<Produto> listar() { return new ArrayList<>(db.values()); }
    public void atualizar(Produto p) { db.put(p.getNome(), p); }
    public void deletar(String nome) { db.remove(nome); }
}