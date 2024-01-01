package oops;

import java.util.ArrayList;

public class Oops {
	
	public class Responce{
		int id=0;
		String name;

	public Responce(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
	public Responce(int id) {
		this.id = id;
	}
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<Responce>();
		al.add(1,"dhamu");
		al.add(1);
		
			
		

	}

}
}
