/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author smoreno
 */
public class Cola<T> {

    private Node<T> front; // Apuntador al frente de la cola
    private Node<T> rear;  // Apuntador al final de la cola
    private int size;      // Tamaño de la cola

    public Cola() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Método para agregar un elemento a la cola
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = rear = newNode; // Si está vacía, el nuevo nodo es tanto el frente como el final
        } else {
            rear.next = newNode; // El último nodo apunta al nuevo nodo
            rear = newNode;      // El nuevo nodo es ahora el final
        }
        size++;
    }

    // Método para retirar el primer elemento de la cola
    public T dequeue() {
        if (isEmpty()) {
            System.err.println("La cola esta vacia");
            //throw new IllegalStateException("Queue is empty!");
        }
        T data = front.data;     // Obtener el dato del frente
        front = front.next;      // Mover el frente al siguiente nodo
        if (front == null) {     // Si la cola queda vacía, rear también debe ser null
            rear = null;
        }
        size--;
        return data;
    }

    // Método para ver el primer elemento sin retirarlo
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        return front.data;
    }

    // Método para ver el primer nodo sin retirarlo
    public Node<T> nodePeek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        return front;
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        return size;
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return size == 0;
    }

    // Método para recorrer e imprimir todos los elementos de la cola
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Método para recorrer e imprimir todos los elementos de la cola
    public void printQueueName(String prefix, boolean salto) {

        Node<Personaje> current = (Node<Personaje>) front;

        StringBuilder s = new StringBuilder();
        s.append(prefix);
        if (salto) {
            s.append("\n");
        }
        while (current != null) {
            s.append(current.data.getNombre()).append("\n");
            //System.out.print(current.data.getNombre() + ", ");
            current = current.next;
        }
        System.out.print(s.toString());
        System.out.println();
    }

    public String getQueueName(String prefix, boolean salto) {
        if (isEmpty()) {
//            System.out.println(prefix);
//            throw new IllegalStateException("Queue is empty!");

//            return;
        }
        Node<Personaje> current = (Node<Personaje>) front;

        StringBuilder s = new StringBuilder();
        s.append(prefix);
        if (salto) {
            s.append("\n");
        }
        while (current != null) {
            s.append(current.data.getNombre()).append(", ");
            //System.out.print(current.data.getNombre() + ", ");
            current = current.next;
        }
        return s.toString();
    }

    public static <T> void desordenarCola(Cola<T> cola) {
        // Paso 1: Determinar el tamaño de la cola
        int size = cola.size();

        // Paso 2: Extraer los elementos y almacenarlos en un arreglo
        @SuppressWarnings("unchecked")
        T[] elementos = (T[]) new Object[size]; // Crear un arreglo genérico
        for (int i = 0; i < size; i++) {
            elementos[i] = cola.dequeue();
        }

        // Paso 3: Desordenar el arreglo
        for (int i = size - 1; i > 0; i--) {
            int j = (int) Math.floor(Math.random() * i); // Índice aleatorio entre 0 y i
            // Intercambiar elementos[i] con elementos[j]
            T temp = elementos[i];
            elementos[i] = elementos[j];
            elementos[j] = temp;
        }

        // Paso 4: Insertar los elementos nuevamente en la cola
        for (int i = 0; i < size; i++) {
            cola.enqueue(elementos[i]);
        }
    }
}
