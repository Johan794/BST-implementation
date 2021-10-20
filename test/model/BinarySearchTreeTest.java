package model;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
    
    private BinarySearchTree<Integer> tree;
    
    public void setup1() {
        tree = new BinarySearchTree<>();
    }

    public void setup2() {
        tree = new BinarySearchTree<>();
        tree.addNode(3);
        tree.addNode(5);
    }
    @Test
    public void addNode1(){
        setup1();
        tree.addNode(3);
        tree.addNode(5);
        assertFalse(tree.isEmpty());
    }
    @Test
    public void delete(){
        setup2();
        tree.delete(5);
        System.out.println("Luego de borrar "+tree.printInOrder());
        assertEquals(1,tree.getWeight());
    }



}
