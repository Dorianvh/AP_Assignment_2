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

    public LinkedList(){
        current = null;
    }

    public boolean isEmpty() { //dor
       return this.size() == 0;
       //current = current.prior = current.next == null
    }


    public ListInterface<E> init() {
        goToLast();
        while(this.current != null){
            this.remove();
            goToPrevious();
        }
        return this;
    } //thijs


    public int size() {
       int count = 0;
       goToFirst();
       while (current != null){
           count++;
           current = current.next;
       }
       return count;
    } //dor


    public ListInterface<E> insert(E d) {
        if(isEmpty()){
            current = new Node(d);
            return this;
        }
        if(current.next == null){
            current.next = new Node(d, current, null);
            current = current.next;
            return this;
        }
        current.next = current.next.prior = new Node(d, current, current.next);
        current = current.next;
        return this;
    } //thijs

    @Override
    public E retrieve() {
       if(isEmpty()){
           return null;
       }
       return current.data;
    } //dor

    @Override
    public ListInterface<E> remove() {
        if(isEmpty() || current.next == null && current.prior == null){
            return null;
        }
        if(current.next == null){
            current.prior.next = null;
            current = current.prior; //wijst hij nu naar het nieuwe laatste element?
            return this;
        }
        current.prior.next = current.next;
        current.next.prior = current.prior;
        current = current.next;//juiste verwijzing
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
            current = current.next;
        }
        return true;
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
        if(isEmpty() || current.prior == null){
            return false;
        }
        current = current.prior;
        return true;
    }//dor

    @Override
    public ListInterface<E> copy() {
        goToFirst();
        LinkedList result = new LinkedList();
        while(this.current != null){
            result.insert(this.current.data);
            result.current = result.current.next;
            this.current = this.current.next;
        }
        return result;
    }//thijs
}