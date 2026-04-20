public class BubbleSort {
    //constructor
    public BubbleSort() {
        System.out.println("Se creo una clase en el constructor");
    }
    public void sortAscendente ( int numeros[]){
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j< numeros.length; j++) {
                // comparacion
                if (numeros[i] > numeros[j]) {
                    // si cumple --> intercambio
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
    }

    public void sortDescendente ( int[] numeros ){
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j< numeros.length; j++) {
                // comparacion
                if (numeros[i] < numeros[j]) {
                    // si cumple --> intercambio
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        
    }
    public void printArreglo(int[] numeros) {
        for (int i : numeros) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void sort (int[] numeros, boolean asc) {
        if (asc) {
            System.out.println("Orden ascendente:");
            sortAscendente(numeros);
        } else {
            System.out.println("Orden descendente:");
            sortDescendente(numeros);
        }
    }
       
}
