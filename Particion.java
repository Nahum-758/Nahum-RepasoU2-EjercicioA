public class Particion {

    public static int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = inicio - 1;

        for (int j = inicio; j <= fin - 1; j++) {
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i]; // Intercambia arr[i] con arr[j]
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }

        int temp = arr[i + 1]; // Coloca el pivote en su posición correcta (después de los menores)
        arr[i + 1] = arr[fin];
        arr[fin] = temp;

        return i + 1; // Devuelve el índice final del pivote
    }

    public static void main(String[] args) {
        int[] arr = {42, 7, 19, 3, 25, 8, 15, 30}; // Arreglo de trabajo de la actividad
        
        System.out.println("Arreglo original:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        int indicePivote = particion(arr, 0, arr.length - 1);

        System.out.println("\nResultado despues de la primera particion:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println("\nEl pivote (30) quedo en el indice: " + indicePivote);
    }
}