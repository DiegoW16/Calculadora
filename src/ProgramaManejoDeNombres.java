public class ProgramaManejoDeNombres {
    public static void main(String[] args){
        // Definir directamente los nombres como variables individuales
        String nombre1 = "Bernardo";
        String nombre2 = "Dildo";
        String nombre3 = "Bayron";

        // Procesar cada nombre
        String procesado1 = procesarNombre(nombre1);
        String procesado2 = procesarNombre(nombre2);
        String procesado3 = procesarNombre(nombre3);

        // Concatenar los resultados con guión bajo
        String resultado = procesado1 + "_" + procesado2 + "_" + procesado3;

        // Imprimir el resultado final
        System.out.println(resultado);


    }
    // Metodo para procesar nombres
    private static String procesarNombre(String nombre){
        // Tomar el segundo caracter en mayúscula
        char segundoCaracter = Character.toUpperCase(nombre.charAt(1));

        // Obtener los dos ultimos caracteres
        String ultimosDos = nombre.substring(nombre.length() - 2);

        // Concatenar el segundo carácter con los últimos dos, separados por un punto
        return segundoCaracter + "." + ultimosDos;
    }
}
