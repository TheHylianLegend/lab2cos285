import java.util.Arrays;

public class myArrayList<E> {
// made by nikan
 private static final int INITIAL_CAPACITY = 50;
 private static final double GROWTH_POLICY = 0.2;
 private Object[] array;
 private int size;

 // Constructor made by nikan
 public myArrayList() {
     array = new Object[INITIAL_CAPACITY];
     size = 0;
 }

 // Add methods to implement the ArrayList functionality.
 
 // Made by Ashley
 void add(int index, Fraction input) {
     if (index > size || index < 0)
         throw new IndexOutOfBoundsException(index);
     
     int s;
     Object[] array;
     if((s = size) == (array = this.array).length) {
         int old_capacity = array.length;
         int new_capacity = (int) (old_capacity + (old_capacity * GROWTH_POLICY));
         array = Arrays.copyOf(array, new_capacity);
     }
     System.arraycopy(array, index, array, index + 1, s - index);
     array[index] = input;
     size = s + 1;
 }
 
}
