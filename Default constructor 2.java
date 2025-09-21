class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        length = 8;
        breadth = 28;
    }
    void math(){
        System.out.println(length*breadth);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Rectangle obj = new Rectangle();
	    obj.math();
	}
}