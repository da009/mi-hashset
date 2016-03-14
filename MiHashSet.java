
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

    public boolean add(int valor)
    {
        boolean rep = list.contains(valor);
        if (rep == false)
        {
            list.add(valor);
        }
        return rep;
    }
    
    public void clear()
    {
        list.clear();
    }
    
    public void contains(int elemento)
    {
    }
    
    public void isEmpty()
    {
    }
    
    public void remove(int elemento)
    {
    }
    
    public void size()
    {
    }
    
    public void equals(MiHashSet otroConjunto)
    {
    }
}
