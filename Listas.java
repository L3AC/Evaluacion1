import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        //Declarar lista
        List<String> nombres = new ArrayList<>();

        nombres.add("Daniela");      
        nombres.add("Héctor");      
        nombres.add(0, "Héctor");   

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un nombre: ");
        String nombre = sc.nextLine(); 
        nombres.add(nombre);         
        System.out.println("Lista actual: " + nombres);

        nombres.remove("Daniela");   
        nombres.remove(0);            
        nombres.clear();  
        sc.close();
    }
}
