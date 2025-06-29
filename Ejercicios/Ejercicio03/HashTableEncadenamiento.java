package ejercicio3;

//HashTableEncadenamiento.java
import java.util.LinkedList;

public class HashTableEncadenamiento {
 private LinkedList<Entry>[] table;
 private int size;

 public HashTableEncadenamiento(int size) {
     this.size = size;
     table = new LinkedList[size];
     for (int i = 0; i < size; i++) {
         table[i] = new LinkedList<>();
     }
 }

 private int hash(int key) {
     return key % size;
 }

 public void insert(int key, String name) {
     int index = hash(key);
     table[index].add(new Entry(key, name));  
 }

 public String search(int key) {
     int index = hash(key);
     for (Entry entry : table[index]) {
         if (entry.key == key) {
             return entry.name; 
         }
     }
     return "No encontrado";  
 }

 public void display() {
     System.out.println("Contenido de la tabla hash:");
     for (int i = 0; i < size; i++) {
         if (table[i].isEmpty()) {
             System.out.println("Índice " + i + ": Vacío");
         } else {
             System.out.print("Índice " + i + ": ");
             for (Entry entry : table[i]) {
                 System.out.print("[Clave: " + entry.key + ", Nombre: " + entry.name + "] ");
             }
             System.out.println();  
         }
     }
 }

 static class Entry {
     int key;
     String name;

     Entry(int key, String name) {
         this.key = key;
         this.name = name;
     }
 }
}
