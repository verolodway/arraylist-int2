
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    //Array que tiene los números enteros
    private int[] numerosEnteros;
    //Array de números añadidos
    private int[] numerosEnterosAñadidos;
    //Tamaño del Array
    private int tamañoDelArray;
    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt(int cantidadDeNumerosDelArray)
    {
        numerosEnterosAñadidos = new int[cantidadDeNumerosDelArray];
        tamañoDelArray = cantidadDeNumerosDelArray;
        cantidadDeNumerosDelArray = numerosEnterosAñadidos.length;
    }

    /**
     * Método que nos permite añadir al array un número entero
     */
    public void add(int elemento){
        numerosEnterosAñadidos = new int[(tamañoDelArray+1)];
        numerosEnterosAñadidos[tamañoDelArray] = elemento;
    }

    /**
     * Método que nos permite añadir al array en una posicion un número entero
     */
    public void add(int index, int elemento){
        numerosEnterosAñadidos = new int [(tamañoDelArray+1)];
        if (index >= 0 && index < (tamañoDelArray+1)){
            numerosEnterosAñadidos[index] = elemento;
            for(int cont = 0; numerosEnterosAñadidos.length > cont; cont++){
                numerosEnterosAñadidos[cont] = numerosEnterosAñadidos[cont+1];
            }
        }
    }
    
    /**
     * Método que vacia una colección
     */
    public void clear(){
        for(int cont = 0; numerosEnterosAñadidos.length > cont; cont++){
            numerosEnterosAñadidos[cont] = 0;
            tamañoDelArray = 0;
        }
    }
    
    /**
     * Método que devuelve true si la colección contiene ese elemento, false en cualquier otro caso.
     */
    public boolean contains(int elemento){
        boolean encontrado = false;
        for(int cont = 0; numerosEnterosAñadidos.length > cont; cont++){
            if(numerosEnterosAñadidos[cont] == elemento){
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    /**
     * Método que devuelve el elemento existente en la posición indicada. 
     * Si el valor de index no es válido, entonces devuelve -1.
     */
    public int get(int index){
        int numero = -1;
        if(index >= 0 && index < numerosEnterosAñadidos.length){
            numerosEnterosAñadidos[index] = numero;
        }
        return numero;
    }
    
    /**
     * Método que reemplaza el elemento en la posición index con el valor de element. 
     * Si el índice no es válido, no hace nada.
     */
    public void set(int index, int element){
        if (index >= 0 && index < numerosEnterosAñadidos.length){
            numerosEnterosAñadidos[index] = element;
        }
    }
    
    /**
     * Método que devuelve el indice en el que aparece la primera ocurrencia del elemento especificado 
     * o -1 en caso de que la colección no contenga el elemento especificado
     */
    public int indexOf(int elemento){
        int cont = 0;
        int indice = -1;
        while (cont < numerosEnterosAñadidos.length){
            if (numerosEnterosAñadidos[cont] == elemento){
                indice = cont;
            }
            cont++;
        }
        return indice;
    }
    
    /**
     * Método que devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty(){
        boolean estaVacio = false;
        if (tamañoDelArray == 0){
            estaVacio = true;
        }
        return estaVacio;
    }
    
    /**
     * Método que elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento. 
     * Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public int remove(int index){
        int elemento = numerosEnterosAñadidos[index];
        numerosEnterosAñadidos[index] = 0;
        return elemento;
    }
    
    /**
     * Método que devuelve el número de elementos de la colección.
     */
    public int size(){
        int tamaño = numerosEnterosAñadidos.length;
        return tamaño;
    }
}
