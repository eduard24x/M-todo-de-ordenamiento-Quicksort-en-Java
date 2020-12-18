
package métodoquicksort;

/**
 *
 * @author Eduardo
 */
public class Quicksort {
    public void ordenarQuicksort(int[] array) {//método ordenarQuicksort
        array = quicksort1(array);//Cambia el arreglo que recibe como parámetro al arreglo ordenado
    }

    public int[] quicksort1(int numeros[]) {//Método que retorna el arreglo ya ordenado
        return quicksort2(numeros, 0, numeros.length - 1);//Retorna el método quicksort2 
    }

    public int[] quicksort2(int numeros[], int izq, int der)//Método quicksort2
    {
        if (izq >= der)
            return numeros;//Retorna numeros
        int i = izq, d = der;
        
        if (izq != der)
        {
        int privote;
        int aux;//Variable aux
        privote = izq;
        while (izq != der)//Mientras izq y der sean diferentes
        {
            while (numeros[der] >= numeros[privote] && izq < der) 
                    der--;//Decrementa der
                while (numeros[izq] < numeros[privote] && izq < der) 
                    izq++;//Incrementa izq
                        
            if (der != izq)
            {
                    aux = numeros[der];//Cambio de posición de los elementos
                numeros[der] = numeros[izq];
                numeros[izq] = aux;
            }
            if (izq == der) {
                quicksort2(numeros, i, izq - 1);//Recursividad del método con punteros diferentes
                quicksort2(numeros, izq + 1, d);
            }
            }
        }else{
                return numeros;//Retorna numeros
        }
        return numeros;//Retorna numeros

    }
}
