public class App {
    public static void main(String[] args) throws Exception {
        int [] numeros = {10, 0, -5, 5, 15, 2};
        runBubbleSort();
    }

    public static void runBubbleSort() {
        System.out.println("Método burbuja");
        int [] numeros = {5, 10, 2, 5, 0, 7};
        // instancia de la clase
        BubbleSort bubbleSort = new BubbleSort();
        // clase --- variable --- método
        bubbleSort.printArreglo(numeros);
        // bubbleSort.sortAscendente(numeros);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sortDescendente(numeros);
        // bubbleSort.printArreglo(numeros);
        bubbleSort.sort(numeros, true);
        bubbleSort.printArreglo(numeros);
        bubbleSort.sort(numeros, false);
        bubbleSort.printArreglo(numeros);

    }
}

// clases --- plantilla/estructura
// usarlas ---  instanciar
// ejecutar constructor --- ()