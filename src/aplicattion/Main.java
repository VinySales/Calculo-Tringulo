package aplicattion;

import entities.Triagulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triagulo t1 = new Triagulo();
		
		t1.setX(2);
		t1.setY(2);
		t1.setZ(2);
		
		System.out.println(t1.area());
	}

}
