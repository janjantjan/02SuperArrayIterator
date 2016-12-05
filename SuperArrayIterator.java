import java.util.Iterator;



public class SuperArrayIterator implement Iterator<String>{

    SuperArray ary  = new SuperArray();
    
    public SuperArrayIterator(SuperArray X) {
        this.ary = name;
    }
    
       the rest of the code is very very similar to his just with like sa.get() or sa.size() instead of start/end/whatever  
   

    public Iterator<Integer> iterator() {
	return new SuperArrayIterator(initialCapacity);}

    public boolean hasNext (int index){
	return index < ary.size();
    }

    public Integer next(int index){
	if(hasNext(index)){
	    index++;
	    return get(index);
	}else{
	    throw new NoSuchElementException();
    }
    };

    public void remove(){
	throw new UnsupportedOperationException();
    }


}

 
    
   
//Thanks to JT Tao to helping me thru this!!!
    

