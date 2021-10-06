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


   public LinkedList(){
        current = null;
    }

    public boolean isEmpty() { //dor
       return current ==null;
    }


    public ListInterface<E> init() {
        current = null;
        return this;
    } //thijs


    public int size() {
       int count = 0;
       goToFirst();
       while (current != null){
           current = current.next;
           count++;
       }
       return count;
    } //dor


    public ListInterface<E> insert(E d) {
        current = current.next;
        current = new Node(d, current.prior, null);
        return this;
    } //thijs

    @Override
    public E retrieve() {
        return current.data;
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
        goToFirst();
        while (current.next != null){
            if (current.data == d){
                return true;
            }
            current = current.next;
        }
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
        if(isEmpty()){
            return false;
        }
        while(current.prior != null){
            current = current.prior;
        }
        return true;
    }//dor

    @Override
    public boolean goToNext() {
        if(isEmpty() || current.next == null){ // als die empty is .next == null toch?
            return false;
        }
        current = current.next;
        return true;
    }//thijs

    @Override
    public boolean goToPrevious() {
        if(current.next == current.prior){
            return false;
        }
        current = current.prior;
        return true;
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