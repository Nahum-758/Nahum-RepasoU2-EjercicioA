public class Busqueda{

    public static int busquedaLineal(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) {
                return i;
            }
        }
        return -1;
    }

    public static int busquedaBinaria(int[] arr, int objetivo) {
        int inicio = 0;
        int fin = arr.length - 1;
        
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            
            if (arr[medio] == objetivo) {
                return medio;
            } else if (arr[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arreglo = {7, 13, 21, 34, 42, 55, 68, 79};
        int objetivo = 68;

        int resLineal = busquedaLineal(arreglo, objetivo);
        int resBinaria = busquedaBinaria(arreglo, objetivo);

        System.out.println("Arreglo: [7, 13, 21, 34, 42, 55, 68, 79]");
        System.out.println("Buscando el ID: " + objetivo);
        System.out.println("Indice encontrado (Busqueda Lineal):  " + resLineal);
        System.out.println("Indice encontrado (Busqueda Binaria): " + resBinaria);
    }
}