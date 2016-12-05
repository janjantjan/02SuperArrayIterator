import java.util.Iterator;



public class SuperArrayIterator implements Iterator<String>{

    SuperArray ary  = new SuperArray();
    
    public SuperArrayIterator(SuperArray X) {
        this.ary = X;
    }
    
      
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
    

