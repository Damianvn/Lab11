package ejercicio3;

public class Main {
 public static void main(String[] args) {
     HashTableEncadenamiento hashTable = new HashTableEncadenamiento(5);

     hashTable.insert(10, "Juan");
     hashTable.insert(15, "Ana");
     hashTable.insert(20, "Luis");
     hashTable.insert(25, "Rosa");

     hashTable.display();

     System.out.println("\nNombre asociado a la clave 20: " + hashTable.search(20));
     System.out.println("Nombre asociado a la clave 30: " + hashTable.search(30));
 }
}
