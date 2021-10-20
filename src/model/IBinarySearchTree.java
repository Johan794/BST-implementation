package model;

public interface IBinarySearchTree<T extends Comparable<T>> {
    void addNode(T element);
    void delete(T element);
    boolean isEmpty();
    Node<T> search(Node<T> root,T key);
    Node<T> successor(Node<T> current);
    Node<T> min(Node<T> node);
    Node<T> max(Node<T> node);
}
