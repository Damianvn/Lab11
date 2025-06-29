package ejercicio1;

public class Main {
 public static void main(String[] args) {
     HashTable hashTable = new HashTable(7);

     hashTable.insert(3);
     hashTable.insert(10);
     hashTable.insert(17);
     hashTable.insert(24);

     System.out.println("Tabla Hash final (sin colisiones):");
     hashTable.display();
 }
}
