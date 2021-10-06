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

    private Node current;
    private LinkedList a;


    LinkedList(){
        current = null;
    }

    public boolean isEmpty() { //dor
        return if   LinkedList == null;
    }

    @Override
    public ListInterface<E> init() {
        current = null;
    } //thijs

    @Override
    public int size() {
        return 0;
    } //dor

    @Override
    public ListInterface<E> insert(E d) {
        current.next = new Node(d, current.prior, null);
        current = current.next;
        return this;
    } //thijs

    @Override
    public E retrieve() {
        return null;
    } //dor

    @Override
    public ListInterface<E> remove() {
        if(isEmpty()){
            return null;
        }
        current.prior.next = current.next;
        current.next.prior = current.prior;
        return this;
    } //thijs

    @Override
    public boolean find(E d) {
        return false;
    }//dor

    @Override
    public boolean goToFirst() {
        if(isEmpty()){
            return false;
        }
        while(current.prior != null){
            current = current.prior;
        }
        return true;
    }//thijs

    @Override
    public boolean goToLast() {
        return false;
    }//dor

    @Override
    public boolean goToNext() {
        if(isEmpty() || current.next == null){
            return false;
        }
        current = current.next;
        return true;
    }//thijs

    @Override
    public boolean goToPrevious() {
        return false;
    }//dor

    @Override
    public ListInterface<E> copy() {
        goToFirst();
        LinkedList result = new LinkedList();
        while(current.next != null){
            result.current = current;
            this.current = this.current.next; //this nodig?
        }
        return result;
    }//thijs
}