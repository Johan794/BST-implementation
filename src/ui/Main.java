package ui;

import model.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.addNode(4);
        binarySearchTree.addNode(5);
      /*

        binarySearchTree.addNode(16);
        binarySearchTree.addNode(13);
        binarySearchTree.addNode(20);
        binarySearchTree.addNode(11);
        binarySearchTree.addNode(3);
        binarySearchTree.addNode(1);
        binarySearchTree.addNode(5);


       */
        System.out.println("Metodo add e imprimir: "+binarySearchTree.printInOrder());


        /*
        System.out.println("Caso 1: Se elimina el elemento 5");

        binarySearchTree.delete(5);

        System.out.println("Despues de eiliminar - caso 1: "+ binarySearchTree.printInOrder());

         System.out.println("Caso 3: Se elimina el elemento 12");

        binarySearchTree.delete(12);

        System.out.println("Despues de eiliminar- caso 3: "+ binarySearchTree.printInOrder());

        System.out.println("Buscar");

        System.out.println(binarySearchTree.search(3).getValue());


         */

        System.out.println("Caso 2: se elimina el elemento 10");
       binarySearchTree.delete(5);

       // System.out.println(binarySearchTree.search(5).getParent().getValue());
        System.out.println("Despues de eiliminar - caso 2: "+ binarySearchTree.printInOrder());






    }

}
