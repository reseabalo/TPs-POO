class Tablero {
    private String[][] casillas;

    private static final String RESET = "\u001B[0m";
    private static final String MARRON = "\u001B[43m";  
    private static final String BLANCO = "\u001B[47m";  
    private static final String NEGRO_TEXTO = "\u001B[30m";  
    private static final String BLANCO_TEXTO = "\u001B[37m";  

    public Tablero() {
        this.casillas = new String[8][8];
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = "vacío"; 
            }
        }
    }

    // Metodo para colocar 
    public void colocarElemento(String elemento, int fila, int columna) {
        casillas[fila][columna] = elemento;
    }

    // Metodo para imprimir todas las casillas con color
    public void imprimirElementosPorTipo(String color) {
        System.out.println("Elementos del color " + color + ":");
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if (casillas[i][j] != null && casillas[i][j].contains(color)) {
                    // Imprimir los detalles del elemento
                    System.out.println("Elemento: " + casillas[i][j] +
                                       " | Posición: (" + i + ", " + j + ")");
                }
            }
        }
    }

    // Metodo para imprimir tablero 
    public void imprimirTableroVacio() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(BLANCO + "   " + RESET);
                } else {
                    System.out.print(MARRON + "   " + RESET);
                }
            }
            System.out.println();  
        }
    }
}