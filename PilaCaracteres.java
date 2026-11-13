public class PilaCaracteres {
    	private char[] pila = new char[20];
	private int tope = -1;

    	public void push(char c) {
        	if (tope < pila.length - 1) {
            		tope = tope + 1;
            	pila[tope] = c; // Coloca “c” en la posición tope + 1 y actualiza el tope
        	}
    	}

    	public char pop() {
        	if (tope >= 0) {
            		char c = pila[tope];
		        tope = tope - 1;
            		return c;
        	}
        	return '\0'; // Es el valor predeterminado en caso de que esté vacía
    	}

    	public String revertir(String texto) {
        	String resultado = "";
        	for (int i = 0; i < texto.length(); i++) {
            		push(texto.charAt(i));
        	}
        	while (tope >= 0) {
            		resultado += pop();
        	}
        	return resultado;
    	}

    	public static void main(String[] args) {
        	PilaCaracteres pila = new PilaCaracteres();
	        String original = "HOLA";
        	System.out.println("Texto original: " + original);
	        System.out.println("Texto revertido: " + pila.revertir(original));
    	}
}