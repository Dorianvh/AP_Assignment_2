package nl.vu.labs.phoenix.ap;

public class LinkedList<E extends Comparable<E>> implements ListInterface<E> {

    private class Node {

        E data;
        Node prior, next;

        public Node(E data) {
            this(data, null, null);
        }

        public Node(E data, Node prior, Node next) {
            this.data = data == null ? null : data;
            this.prior = prior;
            this.next = next;
        }

    }


    public boolean isEmpty() { //dor
        return if   LinkedList == null;
    }

    @Override
    public ListInterface<E> init() {
        return null;
    } //thijs

    @Override
    public int size() {
        return 0;
    } //dor

    @Override
    public ListInterface<E> insert(E d) {
        return null;
    } //thijs

    @Override
    public E retrieve() {
        return null;
    } //dor

    @Override
    public ListInterface<E> remove() {
        return null;
    } //thijs

    @Override
    public boolean find(E d) {
        return false;
    }//dor

    @Override
    public boolean goToFirst() {
        return false;
    }//thijs

    @Override
    public boolean goToLast() {
        return false;
    }//dor

    @Override
    public boolean goToNext() {
        return false;
    }//thijs

    @Override
    public boolean goToPrevious() {
        return false;
    }//dor

    @Override
    public ListInterface<E> copy() {
        return null;
    }//thijs
}