public class myListIterator {

    private myArrayList<Fraction> list;
    private int currentIndex;

	
	// made by nikan
    public boolean hasNext() {
        return currentIndex < list.size(); // Returns true if there is a next element in the list
    }
    //made by nikan
    public boolean hasPrevious() {
        return currentIndex > 0; // Returns true if there is a previous element in the list
    }


	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	}

}
