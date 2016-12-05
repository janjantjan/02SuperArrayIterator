public class SuperArray implement Iterable<String> {
  private String[] data;
  private int size;

//CONSTRUCTORS_________________________________________________________________


            //constructor make an empty superArray should make size 0, 
            //but the data capacity 10.

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



//METHODS__________________________________________________________________________

  public int size(){
    return size;
  }

//1
/**add the value n to the next available slot in the superArray.
 *this will change the size. This function should always work
 *And will resize the SuperArray if needed.*/

    public void add(String n){
      data[size] = n;
      size = size +1;      
  }

  //2
/**Resize the data, by making a new array, then copying over elements, use this as your data.
*/

  public void grow(){
      String[] nata = new String[data.length + 1];
      for(int i = 0; i < data.length; i++){
	  nata[i] = data [i];
      }
      data = nata;
  }

  //3
   /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
    *commas between... square bracket start/end and no comma at end.*/


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
		

				
	   

  //4
    /**format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]   
    *(capacity is 10, but only 6 are used)
    *commas between... square bracket start/end and no comma at end.
    *unused slots should be printed as _ (underscores) */

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

    //5. int get(int index)Returns the element at the specified position in this list.
    //Throws:IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())

    public String get(int index) {
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException(""+index);}
	
	return data[index];
    }

    // 6. void clear() Removes all of the elements from this list.

    public void clear() {
	String[] nata = new String[data.length];
	size = 0;
	data = nata;
    }

    //7. boolean isEmpty() Returns true if this list contains no elements.

    public boolean isEmpty() {
	return size == 0;
    }

    
    //8. int set(int index, int element) Replaces the element at the specified position in this list with the specified element. Returns the value of the element replaced.

    public String set(int index, String element){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();}
        String y = data[index];
	data[index] = element;
	return y;
    }

    /**9. void add(int index, int element)
     *Inserts the specified element at the specified position in this list.
     *Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).*/

    public void add(int index, String element){
	if (index  < 0 || index > size()){
	  throw new IndexOutOfBoundsException("" + index);}
	for (int i = size-1 ; i >= index ; i--) {
	    data [i+1] = data[i];
	}
	data[index] = element;
	size = size +1;
	
    }
    
    /**10. int remove(int index)
     *Removes the element at the specified position in this list. 
     *Shifts any subsequent elements to the left (subtracts one from their indices). 
     *The value returned is the value of the element removed.*/
    
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
	
    

    /**11. int[] toArray()
     *Returns an array containing all of the elements in this list in proper sequence (from first to last element).*/
    
    public String[] toArray(){
	String[] nata = new String[data.length];
	for(int i = 0; i < data.length; i++){
	  nata[i] = data [i];
      }
	return nata;
    }
	
    /**12. int indexOf(int i)
     *Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.*/

    public int indexOf(String i){
	int x = 0;
	    while(data[x] != i){
		x ++ ;}
	    return x;	  
      }
    

    /**13. int lastIndexOf(int i)
     *Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.*/


    public int lastIndexOf(String i) {
	int y = data.length-1;
	while (data[y] != i){
	    y--;}
	return y;
    }


      
}
