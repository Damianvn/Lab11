package ejercicio1;

public class HashTable {
 private int[] table;
 private int size;

 public HashTable(int size) {
     this.size = size;
     table = new int[size];
     for (int i = 0; i < size; i++) {
         table[i] = -1;
     }
 }
 // Hallar modulo
 private int hash(int key) {
     return key % size;
 }

 public void insert(int value) {
     int index = hash(value);
     table[index] = value;
 }

 public void display() {
     for (int i = 0; i < size; i++) {
         if (table[i] != -1) {
             System.out.println("Índice " + i + ": " + table[i]);
         } else {
             System.out.println("Índice " + i + ": Vacío");
         }
     }
 }
}
