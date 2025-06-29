package actividad2;
import actividad1.Register;
import java.util.LinkedList;

public class HashO {
    private LinkedList<Register>[] table;
    private int size;

    public HashO(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % size;
    }

    public void insert(Register reg) {
        int index = hash(reg.getKey());
        table[index].add(reg);
    }

    public Register search(int key) {
        int index = hash(key);
        for (Register reg : table[index]) {
            if (reg.getKey() == key) {
                return reg;
            }
        }
        return null;  // No encontrado
    }

    public void delete(int key) {
        int index = hash(key);
        LinkedList<Register> list = table[index];
        for (Register reg : list) {
            if (reg.getKey() == key) {
                list.remove(reg);
                System.out.println("Registro con clave " + key + " eliminado.");
                return;
            }
        }
        System.out.println("Registro con clave " + key + " no encontrado.");
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (table[i].isEmpty()) {
                System.out.println(i + ": Vacío");
            } else {
                System.out.print(i + ": ");
                for (Register reg : table[i]) {
                    System.out.print(reg + " ");
                }
                System.out.println();
            }
        }
    }
}
