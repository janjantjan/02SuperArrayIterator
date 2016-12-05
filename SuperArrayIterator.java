import java.util.Iterator;

public interface SuperArrayIterator{
    private int[] data;
    private int size;

    public SuperArrayIterator(){
	data = new int[10];
	size = 0;
	    
    }
           
    public SuperArrayIterator(int initialCapacity){
	if (initialCapacity < 0) {
	    throw new IllegalArgumentException();}
	data = new int [initialCapacity];
	size = 0;
    }

    public Iterator<Integer> iterator() {
	return new SuperArrayIterator(initialCapacity);}

    public boolean hasNext ();

    public Integer next();

    public void remove();

}

    
   


// To start, write this as a separate class, we can discuss inner classes after you get it to work.

// 2. Now work on your SuperArray!
// -Make your SuperArray implement Iterable<String>
// -Add the iterator() method.  //SORRY! fixed the typo

    
}
