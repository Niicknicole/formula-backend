package pckproduto;

import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<ItemFormula> itens = Arrays.asList(
            new ItemFormula("Caneta", null, 1, 2.50),
            new ItemFormula("Tinta", "Caneta", 1, 0.80),
            new ItemFormula("Pigmento", "Tinta", 1, 0.30),
            new ItemFormula("Solvente", "Tinta", 1, 0.50),
            new ItemFormula("Corpo", "Caneta", 1, 1.00),
            new ItemFormula("Plástico", "Corpo", 1, 0.70),
            new ItemFormula("Clip", "Corpo", 1, 0.30),
            new ItemFormula("Tampa", "Caneta", 1, 0.70),
            new ItemFormula("Plástico", "Tampa", 1, 0.50),
            new ItemFormula("Vedação", "Tampa", 1, 0.20)
        );

        FormulaService s = new FormulaService();
        TreeNode raiz = s.buildTree(itens);

        System.out.println("Árvore da fórmula da caneta:");
        s.printTree(raiz, 0);

        double total = s.calcularTotal(raiz);
        System.out.printf("\nValor total: R$ %.2f\n", total);

        s.atualizarPreco(raiz, "Plástico", 1.00);
        System.out.println("\nApós atualizar preço do Plástico:");
        double total2 = s.calcularTotal(raiz);
        System.out.printf("Novo valor: R$ %.2f\n", total2);
    }
}