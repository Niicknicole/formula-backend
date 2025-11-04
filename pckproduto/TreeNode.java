package pckproduto;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public ItemFormula item;
    public List<TreeNode> filhos = new ArrayList<>();

    public TreeNode(ItemFormula item) {
        this.item = item;
    }
}