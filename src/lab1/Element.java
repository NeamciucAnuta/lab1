package lab1;

public interface Element {
	public default  void add(Element e){
        throw new UnsupportedOperationException();
    }

    public default void remove(Element e){
        throw new UnsupportedOperationException();
    }

    public default Element get(int pos){
        throw new UnsupportedOperationException();
    }
    
    public void print();

}
