import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args) {
      
        Map<String, Integer> edades = new HashMap<>();

        edades.put("Juan", 30);
        edades.put("Maria", 25);
        edades.put("Pedro", 40);

        System.out.println(edades);

        int edadJuan = edades.get("Juan");
        System.out.println("La edad de Juan es: " + edadJuan);

        if (edades.containsKey("Maria")) {
            System.out.println("Maria está en el mapa.");
        }

        edades.remove("Pedro");

        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            String nombre = entrada.getKey();
            Integer edad = entrada.getValue();
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        }
    }
}
