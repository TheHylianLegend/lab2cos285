import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class myArrayList<E> {
    // made by nikan
    private static final int INITIAL_CAPACITY = 50;
    private static final double GROWTH_POLICY = 0.2;
    private Fraction[] array;
    private static int size;

     // Constructor made by nikan
        public myArrayList() {
         array = new Fraction[INITIAL_CAPACITY];
         size = 0;
     }

     // Add methods to implement the ArrayList functionality.
 
     // IndexOf Method
     // Written by Colby
     int indexOf(Fraction input)
     {
         for(int i = 0; i < array.length; i++)
         {
             if(input.compare((Fraction) array[i]) == 0)
             {
                 return i;
             }
         }
     
         return -1;
     }
 
     // Made by Ashley
     void add(int index, Fraction input) {
         if (index > size || index < 0)
             throw new IndexOutOfBoundsException(index);
     
         int s;

         if((s = size) == array.length) {
             int old_capacity = array.length;
             int new_capacity = (int) (old_capacity + (old_capacity * GROWTH_POLICY));
             array = Arrays.copyOf(array, new_capacity);
         }
         System.arraycopy(array, index, array, index + 1, s - index);
         array[index] = input;
         size = s + 1;
     }

     public static int size() {
    	return size;
    }
     
    
     

      class myListIterator implements Iterator<Fraction>{
         private int currentIndex;

         myListIterator() {currentIndex = -1;}

         
         // made by nikan
         public boolean hasNext() {
             return currentIndex < size(); // Returns true if there is a next element in the list
         }
         //made by nikan
         public boolean hasPrevious() {
             return currentIndex > 0; // Returns true if there is a previous element in the list
         }
         
         // made by ashley
         public Fraction next(){
             if (this.hasNext() != true)
                 throw new NoSuchElementException();
             currentIndex++;
             return array[currentIndex];
                 
         }
         
         // made by ashley
         public Fraction previous() {
             if (this.hasPrevious() != true)
                 throw new NoSuchElementException();
             currentIndex--;
             return array[currentIndex];
         }

     }

     // made by ashley
     public myListIterator getIterator(){
            return new myListIterator();
     }
     
}

