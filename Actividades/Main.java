package actividad2;
import actividad1.Register;
public class Main {
    public static void main(String[] args) {
        HashO hashTable = new HashO(10);  // Tabla de tamaño 10

        // Insertar elementos
        hashTable.insert(new Register(34, "Alice"));
        hashTable.insert(new Register(3, "Bob"));
        hashTable.insert(new Register(7, "Charlie"));
        hashTable.insert(new Register(30, "David"));
        hashTable.insert(new Register(11, "Eve"));
        hashTable.insert(new Register(8, "Frank"));
        hashTable.insert(new Register(7, "Grace"));  // Colisión
        hashTable.insert(new Register(23, "Hannah"));
        hashTable.insert(new Register(41, "Isaac"));
        hashTable.insert(new Register(16, "Jack"));
        hashTable.insert(new Register(34, "Kara"));  // Clave repetida

        System.out.println("Estado actual de la tabla:");
        hashTable.display();

        // Eliminar un elemento
        hashTable.delete(30);  // Eliminar clave 30

        System.out.println("\nEstado de la tabla después de eliminar clave 30:");
        hashTable.display();

        // Buscar un elemento
        Register reg = hashTable.search(23);  // Buscar clave 23
        if (reg != null) {
            System.out.println("\nRegistro encontrado: " + reg);
        } else {
            System.out.println("\nRegistro no encontrado.");
        }
    }
}
