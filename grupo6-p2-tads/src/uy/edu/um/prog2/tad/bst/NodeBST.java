package uy.edu.um.prog2.tad.bst;

public class NodeBST<K extends Comparable<K>,T>  {

    K key;
    T data;
    private NodeBST<K,T> leftChild;
    private NodeBST<K,T> rightChild;

    public NodeBST(NodeBST<K, T> leftChild, NodeBST<K, T> rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;

    }

    public NodeBST(K key, T data) {
        this.key = key;
        this.data = data;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeBST<K, T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(NodeBST<K, T> leftChild) {
        this.leftChild = leftChild;
    }

    public NodeBST<K, T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(NodeBST<K, T> rightChild) {
        this.rightChild = rightChild;
    }


}
