public class HistorialNavegacion {
    private String[] paginas = new String[15];
    private int tamanio = 0;

    public void add(String url) {
        if (tamanio < paginas.length) {
            paginas[tamanio] = url;
            tamanio = tamanio + 1; //aumenta el tamaño en 1
        }
    }

    public void remove(String url) {
        for (int i = 0; i < tamanio; i++) {
            if (paginas[i].equals(url)) {
                for (int j = i; j < tamanio - 1; j++) {
                    paginas[j] = paginas[j + 1];
                }
                paginas[tamanio - 1] = null;
                tamanio = tamanio - 1;
                break;
            }
        }
    }

    public void mostrarHistorial() {
        for (int i = 0; i < tamanio; i++) {
            System.out.println((i + 1) + ". " + paginas[i]);
        }
    }

    public static void main(String[] args) {
        HistorialNavegacion historial = new HistorialNavegacion();
        historial.add("escuela.edu");
        historial.add("biblioteca.org");
        historial.add("noticias.com");
        
        System.out.println("--- Historial antes de borrar ---");
        historial.mostrarHistorial();
        
        historial.remove("biblioteca.org");
        
        System.out.println("\n--- Historial despues de borrar biblioteca.org ---");
        historial.mostrarHistorial();
    }
}