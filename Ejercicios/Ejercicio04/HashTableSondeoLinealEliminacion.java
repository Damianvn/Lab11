package ejercicio4;
public class HashTableSondeoLinealEliminacion {
    private int[] table;
    private int size;
    private final int EMPTY = -1; // Marcador de celda vacía
    private final int DELETED = -2; // Marcador de celda eliminada

    public HashTableSondeoLinealEliminacion(int size) {
        this.size = size;
        table = new int[size];
        for (int i = 0; i < size; i++) {
            table[i] = EMPTY;
        }
    }

    //Hallar modulo
    private int hash(int key) {
        return key % size;
    }

    public void insert(int value) {
        int index = hash(value);
        int i = 0;
        while (table[(index + i) % size] != EMPTY && table[(index + i) % size] != DELETED) {
            i++; 
        }
        table[(index + i) % size] = value; 
    }

    public void delete(int value) {
        int index = hash(value);
        int i = 0;
        while (table[(index + i) % size] != EMPTY) {
            if (table[(index + i) % size] == value) {
                table[(index + i) % size] = DELETED; 
                return; 
            }
            i++; 
        }
    }

    public void search(int value) {
        int index = hash(value);
        int i = 0;
        while (table[(index + i) % size] != EMPTY) {
            if (table[(index + i) % size] == value) {
                System.out.println("Valor encontrado: " + value);
                return;
            }
            i++;
        }
        System.out.println("Valor no encontrado: " + value);
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (table[i] == EMPTY) {
                System.out.println("Indice " + i + ": Vacío");
            } else if (table[i] == DELETED) {
                System.out.println("Indice " + i + ": Eliminado");
            } else {
                System.out.println("Indice " + i + ": " + table[i]);
            }
        }
    }
}

