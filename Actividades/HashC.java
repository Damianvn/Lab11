package actividad1;

public class HashC {
    private Register[] table;
    private int size;

    public HashC(int size) {
        this.size = size;
        this.table = new Register[size];
    }
    private int hash(int key) {
        return key % size;
    }

    public void insert(Register reg) {
        int index = hash(reg.getKey());
        int i = 0;
        while (table[(index + i) % size] != null) {
            i++;
            if (i == size) {
                System.out.println("Tabla llena, no se puede insertar.");
                return;
            }
        }
        table[(index + i) % size] = reg;
    }

    public Register search(int key) {
        int index = hash(key);
        int i = 0;
        while (table[(index + i) % size] != null) {
            if (table[(index + i) % size].getKey() == key) {
                return table[(index + i) % size];
            }
            i++;
        }
        return null;  
    }

    public void delete(int key) {
        int index = hash(key);
        int i = 0;
        while (table[(index + i) % size] != null) {
            if (table[(index + i) % size].getKey() == key) {
                table[(index + i) % size] = null;
                System.out.println("Registro con clave " + key + " eliminado.");
                return;
            }
            i++;
        }
        System.out.println("Registro con clave " + key + " no encontrado.");
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                System.out.println(i + ": " + table[i]);
            } else {
                System.out.println(i + ": Vacío");
            }
        }
    }
}
