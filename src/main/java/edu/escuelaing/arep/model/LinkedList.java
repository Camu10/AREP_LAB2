package edu.escuelaing.arep.model;
import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {
    private Node<E> head = new Node<E>();
    private int size = 0;

    /**
     * Agrega un nuevo nodo a la LinkedList.
     * @param node El nuevo nodo a agregar
     * @return boolean
     */
    public boolean add(E node) {
        Node<E> actual = new Node<E>(node);
        if (size == 0) {
            head.setPrior(actual);
            head.setNext(actual);
        } else {
            head.getNext().setNext(actual);
            head.setNext(actual);
        }
        size++;
        return true;
    }

    /**
     * Obtiene el elemento dentro de la LinkedList.
     * @param index El indice que indica la posición del elemento que se quiere obtener.
     * @return Dato del nodo
     */
    public E get(int index) {
        if (index < 0 || index < size) {
            int pos = 0;
            Iterator<E> iterador = iterator();
            while (pos != index) {
                iterador.next();
                pos++;
            }
            return iterador.next();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Obtiene el tamaño que tiene la linkedList.
     * @return El tamaño que tiene la linkedList.
     */
    public int getSize() {
        return size;
    }

    /**
     * Crea un iterador para desplazarce entre los elementes de la LinkedList.
     * @return LinkedListIterator
     */
    public Iterator<E> iterator()
    {
        return new LinkedListIterator<E>(head.getPrior());
    }
}
