package pckproduto;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FormulaService {

    public TreeNode buildTree(List<ItemFormula> itens) {
        Map<String, TreeNode> mapa = new HashMap<>();
        TreeNode raiz = null;
        for (ItemFormula item : itens) mapa.put(item.getNome(), new TreeNode(item));
        for (ItemFormula item : itens) {
            if (item.getPai() == null) raiz = mapa.get(item.getNome());
            else mapa.get(item.getPai()).filhos.add(mapa.get(item.getNome()));
        }
        return raiz;
    }

    public void printTree(TreeNode node, int nivel) {
        if (node == null) return;
        System.out.println("  ".repeat(nivel) + "- " + node.item.getNome() + " (R$ " + node.item.getCusto() + ")");
        for (TreeNode f : node.filhos) printTree(f, nivel + 1);
    }

    public double calcularTotal(TreeNode node) {
        double total = node.item.getCusto();
        for (TreeNode f : node.filhos)
            total += f.item.getQuantidade() * calcularTotal(f);
        return total;
    }

    public void atualizarPreco(TreeNode node, String nomeComp, double novoValor) {
        if (node.item.getNome().equals(nomeComp)) node.item.setCusto(novoValor);
        for (TreeNode f : node.filhos) atualizarPreco(f, nomeComp, novoValor);
    }
}