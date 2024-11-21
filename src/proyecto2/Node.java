/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author smoreno
 */
public class Node<T> {
    T data;        // Dato que almacena el nodo
    Node<T> next;  // Apuntador al siguiente nodo

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

