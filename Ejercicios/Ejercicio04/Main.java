package ejercicio4;

public class Main {
    public static void main(String[] args) {
        HashTableSondeoLinealEliminacion hashTable = new HashTableSondeoLinealEliminacion(7);

        System.out.println("Insertando valores...");
        hashTable.insert(5);
        hashTable.insert(12);
        hashTable.insert(19);

        System.out.println("Estado de la tabla después de insertar 5, 12 y 19:");
        hashTable.display();

        System.out.println("\nEliminando la clave 12");
        hashTable.delete(12);

        System.out.println("Estado de la tabla después de eliminar la clave 12:");
        hashTable.display();

        System.out.println("\nBuscando la clave 19 después de la eliminación");
        hashTable.search(19);
    }
}
