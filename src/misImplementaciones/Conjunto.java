package misImplementaciones;

import miApi.IConjunto;

public class Conjunto implements IConjunto {

    class Nodo{
        int dato;
        Nodo siguiente;
    }

    private Nodo primero;

    @Override
    public void inicializarConjunto() {
        this.primero = null;
    }

    @Override
    public void agregar(int x) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = x;
        nuevoNodo.siguiente = primero;

        this.primero = nuevoNodo;
    }

    @Override
    public void sacar(int x) {
    	
        if(primero.dato == x){
            primero = primero.siguiente;
        } else {
        	Nodo aux=primero;
        	while(aux.siguiente!=null && aux.siguiente.dato!=x){
        		aux=aux.siguiente;
        	}
        	if (aux.siguiente!=null) {
        		aux.siguiente=aux.siguiente.siguiente;
        }
      }
    }

    @Override
    public int obtener() {
        return this.primero.dato;
    }

    @Override
    public boolean conjuntoVacio() {
        return this.primero == null;
    }

    @Override
    public boolean pertenece(int x) {
        Nodo actual = this.primero;

        while(actual != null && actual.dato != x) {
            actual = actual.siguiente;
        }

        return actual != null;
    }
}
