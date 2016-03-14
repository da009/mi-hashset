
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

    public void add(int valor)
    {
        if (list.contains(valor) == false)
        {
            list.add(valor);
        }
    }
    
    public void clear()
    {
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
