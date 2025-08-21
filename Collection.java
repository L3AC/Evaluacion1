import java.util.*;

public class EjemploCollection {
    public static void main(String[] args) {
        Collection<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Pedro");

        nombres.remove("Pedro");

        nombres.clear();

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        Iterator<String> it = nombres.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
      
        nombres.forEach(n -> System.out.println(n));
    }
}
