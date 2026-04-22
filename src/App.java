public class App {
    public static void main(String[] args) throws Exception {
        //int [] numeros = {10, 0, -5, 5, 15, 2};
        runBubbleSortAvz();
    }
    //     runBubbleSort();
    // }

    // public static void runBubbleSort() {
    //     System.out.println("Método burbuja");
    //     int [] numeros = {5, 10, 2, 5, 0, 7};
    //     // instancia de la clase
    //     BubbleSort bubbleSort = new BubbleSort();
    //     // clase --- variable --- método
    //     bubbleSort.printArreglo(numeros);
    //     // bubbleSort.sortAscendente(numeros);
    //     // bubbleSort.printArreglo(numeros);
    //     // bubbleSort.sortDescendente(numeros);
    //     // bubbleSort.printArreglo(numeros);
    //     bubbleSort.sort(numeros, true);
    //     bubbleSort.printArreglo(numeros);
    //     bubbleSort.sort(numeros, false);
    //     bubbleSort.printArreglo(numeros);
    // }

    public static void runBubbleSortAvz() {
        int [] array = {9, 2, 3, 0, 8, 5, 10, 50, 100};
        BubbleSortAvz bSortAvz = new BubbleSortAvz(array);
        bSortAvz.printArray();
        bSortAvz.sort(true);
        bSortAvz.printArray();

    }
}

// clases --- plantilla/estructura
// usarlas ---  instanciar
// ejecutar constructor --- ()
// this