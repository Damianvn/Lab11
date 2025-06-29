package ejercicio2;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Crear la tabla hash de tamaño 6
     HashTableSondeoLineal hashTable = new HashTableSondeoLineal(6);

     // Insertar valores y mostrar la tabla paso a paso
     System.out.println("Insertando 12...");
     hashTable.insert(12);
     hashTable.display();

     System.out.println("\nInsertando 18...");
     hashTable.insert(18);
     hashTable.display();

     System.out.println("\nInsertando 24...");
     hashTable.insert(24);
     hashTable.display();

     System.out.println("\nInsertando 30...");
     hashTable.insert(30);
     hashTable.display();
 }
}
