package pacoteArvoreAVL;

import pacoteArvoreAVL.BinaryTreeModel;
import pacoteArvoreAVL.BinaryTreePrinter;

public class BinaryTreeDemo {

    public static void main(String[] args) {

        BinaryTreeModel tree = new BinaryTreeModel("A");
        tree.setLeft(new BinaryTreeModel("B"));
        tree.setRight(new BinaryTreeModel("C"));
        tree.getLeft().setLeft(new BinaryTreeModel("D"));
        tree.getLeft().setRight(new BinaryTreeModel("E"));
        tree.getRight().setLeft(new BinaryTreeModel("F"));
        tree.getRight().setRight(new BinaryTreeModel("G"));

        BinaryTreePrinter printer = new BinaryTreePrinter(tree);
        printer.print(System.out);

    }

}
