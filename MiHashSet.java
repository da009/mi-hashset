
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // Array de valores
    private ArrayListInt list;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        list = new ArrayListInt();
    }

    /**
     * añade el elemento al conjunto si no estaba. Devuelve verdadero en caso de que el elemento no estuviera 
     * presente en el conjunto y falso en caso contrario.
     */
    public boolean add(int valor)
    {
        boolean rep = list.contains(valor);
        if (rep == false)
        {
            list.add(valor);
        }
        return !rep;
    }
    
    /**
     * vacía el conjunto.
     */
    public void clear()
    {
        list.clear();
    }
    
    /**
     * devuelve verdadero si el conjunto contiene el elemento, falso en caso contrario.
     */
    public boolean contains(int elemento)
    {
        return list.contains(elemento);
    }
    
    /**
     * devuelve verdadero si el conjunto no contiene elementos.
     */
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    /**
     * elimina del conjunto el elemento dado. Si no existiera devuelve falso; si existía en el conjunto
     * devuelve verdadero.
     */
    public boolean remove(int elemento)
    {
        boolean rep = list.contains(elemento);
        if(rep)
        {
            list.remove(list.indexOf(elemento));
        }
        return rep;
    }
    
    /**
     * devuelve el número de elementos del conjunto.
     */
    public void size()
    {
        list.size();
    }
    
    /**
     * devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca y falso en otro caso.
     */
    public void equals(MiHashSet otroConjunto)
    {
    }
}
