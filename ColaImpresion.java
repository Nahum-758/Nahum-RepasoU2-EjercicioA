public class ColaImpresion {
	private String[] documentos = new String[10];

	private int frente = 0;
	private int fin = -1;

	public void encolar(String doc) {
		if (fin < documentos.length - 1) {
            		fin = fin + 1;
			documentos[fin] = doc;
        	}
    	}

    	public String desencolar() {
        	if (frente <= fin) {
            		String doc = documentos[frente];
            		frente = frente + 1;
            		return doc;
        	}
        	return null;
    	}

	public void imprimirTodo() {
        	while (frente <= fin) {
            		System.out.println("Imprimiendo: " + desencolar());
        	}
    	}

    	public static void main(String[] args) {
        	ColaImpresion cola = new ColaImpresion();
        	cola.encolar("Tarea");
        	cola.encolar("Examen");
		cola.encolar("Boleta");
        
        	cola.imprimirTodo();
    		}
	}