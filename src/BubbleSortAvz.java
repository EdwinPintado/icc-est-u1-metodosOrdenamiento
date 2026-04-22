public class BubbleSortAvz {
    //Varianble global
    int [] array; // no tiene valor, se le asigna en el constructor

    public BubbleSortAvz(int [] arreglo) {
        // 1ra darle valor directo
        // array = new int [] {10, 5, 0};
        // 2da darle valor en base a parametro
        this.array = arreglo;
    }

    public void sort(boolean asc) {
        int tam = array.length;
        boolean hubointercambio;
        int contComparaciones = 0;
        for (int i=0; i<tam -1; i++) {
            hubointercambio = false;
            for (int j=0; j<tam -1 -i; j++) {
                contComparaciones++;
                // -1 para que no salga del arreglo y -i para que no compare los elementos ya ordenados
                if(array[j] > array[j+1]) {
                    hubointercambio = true;
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;

                }
            }
            if (!hubointercambio) {
                break;
            }
        }
        System.out.println("Comparaciones totales: " +contComparaciones);

    }
        
    public void printArray() {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

