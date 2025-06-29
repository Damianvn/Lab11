package ejercicio2;

//HashTableSondeoLineal.java
public class HashTableSondeoLineal {
 private int[] table;
 private int size;

 public HashTableSondeoLineal(int size) {
     this.size = size;
     table = new int[size];
     for (int i = 0; i < size; i++) {
         table[i] = -1; 
     }
 }

 // Hallamos modulo
 private int hash(int key) {
     return key % size;
 }

 public void insert(int value) {
     int index = hash(value);
     int i = 0;

     // Sondeo lineal
     while (table[(index + i) % size] != -1) {
         i++;  
     }
     table[(index + i) % size] = value; 
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
