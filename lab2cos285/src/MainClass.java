
public class MainClass {

    public static void main(String[] args) {
        myArrayList<Fraction> list = new myArrayList<Fraction>();
        list.add(0, new Fraction(1,2));
        list.add(1, new Fraction(3,4));
        list.add(2, new Fraction(5,6));
        
        myArrayList<Fraction>.myListIterator itr = list.getIterator();

        
        System.out.println(itr.hasNext());
        
        System.out.println(itr.hasPrevious());
        
        itr.next().print();
        itr.next().print();
        itr.next().print();
        
        itr.previous().print();
        
        System.out.println(itr.hasNext());
        
        System.out.println(itr.hasPrevious());
    }

}
