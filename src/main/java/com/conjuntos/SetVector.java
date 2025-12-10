package com.conjuntos;

/**
 * Esta clase representa un conjunto usando un vector de enteros.
 * No permite elementos repetidos y controla su tamaño.
 */
public class SetVector {

    private int[] data; // Vector donde se guardan los datos
    private int size; // Cantidad real de elementos guardados

    public SetVector(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
    }

    /**
     * Agrega un valor al conjunto si no existe.
     */
    public void add(int value) {
        if (!contains(value)) {
            data[size] = value;
            size++;
        }
    }

    /**
     * Verifica si el conjunto contiene un valor.
     */
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Obtiene el tamaño actual del conjunto.
     */
    public int getSize() {
        return size;
    }

    /**
     * Devuelve el vector interno hasta la cantidad real de elementos.
     */
    public int[] getElements() {
        int[] copy = new int[size];
        for (int i = 0; i < size; i++) {
            copy[i] = data[i];
        }
        return copy;
    }

    /**
     * Imprime el conjunto en formato {a, b, c}
     */
    @Override
    public String toString() {
        String result = "{ ";
        for (int i = 0; i < size; i++) {
            result += data[i];
            if (i < size - 1)
                result += ", ";
        }
        return result + " }";
    }
}
