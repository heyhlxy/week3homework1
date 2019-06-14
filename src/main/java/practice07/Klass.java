package practice07;

public class Klass {
	
	private int number;
	
	public int getNumber(){
		return number;
	}
	
	public String getDisplayName(){
		return "Class "+ number;
	}

	public Klass(int number) {
		super();
		this.number = number;
	}
}