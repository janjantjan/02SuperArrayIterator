import java.util.Iterator;

public class SuperArray implement Iterable<String> {
  private String[] data;
  private int size;

    public SuperArray(){
	data = new String[10];
	size = 0;
	    
    }

           /** public SuperArray(int initialCapacity)
           *Constructs an empty list with the specified initial capacity.
           *Parameters: initialCapacity - the initial capacity of the list
           *Throws: IllegalArgumentException - if the specified initial capacity is negative*/
    
    public SuperArray(int initialCapacity){
	if (initialCapacity < 0) {
	    throw new IllegalArgumentException();}
	data = new String [initialCapacity];
	size = 0;
    }


  public int size(){
    return size;
  }

    public void add(String n){
      data[size] = n;
      size = size +1;      
  }

/

  public void grow(){
      String[] nata = new String[data.length + 1];
      for(int i = 0; i < data.length; i++){
	  nata[i] = data [i];
      }
      data = nata;
  }

    public String toString(){
      String x = "[ ";
      for(int i = 0; i < data.length; i++){
	  if (i < data.length-1){
	  x = x + data[i] + ", ";
	  }
	  else { x = x + data[data.length-1] + "]";}
      }
      return x;
  }
		



    public String toStringDebug(){
      String x = "[ ";
      for(int i = 0 ; i < data.length; i++){
	  if (i < size){
	  x = x + data[i] + ", ";
	  }
	  else{
	      if(i < data.length-1){
		  x = x + "_, ";
	      }
	      else {
		  if (i == data.length-1) {
		      x = x + "_]";}
		  
	      }
	  }
      }
      return x;
    }

   
    public String get(int index) {
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException(""+index);}
	
	return data[index];
    }

    public void clear() {
	String[] nata = new String[data.length];
	size = 0;
	data = nata;
    }


    public boolean isEmpty() {
	return size == 0;
    }

  
    public String set(int index, String element){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();}
        String y = data[index];
	data[index] = element;
	return y;
    }

    public void add(int index, String element){
	if (index  < 0 || index > size()){
	  throw new IndexOutOfBoundsException("" + index);}
	for (int i = size-1 ; i >= index ; i--) {
	    data [i+1] = data[i];
	}
	data[index] = element;
	size = size +1;
	
    }
 
    public String remove (int index) {
	if  (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();}
	String lolli = data[index];
	for (int i = index ; i < size ; i++) {
	    
	    data [i] = data[i+1];
	}
	
	size--;
	return lolli;
    }
	
    

    
    public String[] toArray(){
	String[] nata = new String[data.length];
	for(int i = 0; i < data.length; i++){
	  nata[i] = data [i];
      }
	return nata;
    }

    public int indexOf(String i){
	int x = 0;
	    while(data[x] != i){
		x ++ ;}
	    return x;	  
      }
    

  

    public int lastIndexOf(String i) {
	int y = data.length-1;
	while (data[y] != i){
	    y--;}
	return y;
    }


    public Iterator<Integer> iterator(){
	return new SuperArrayIterator(this);
  }

    
    
}
