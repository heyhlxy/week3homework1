package practice08;

public class Klass {
    
	private int number;
	private Student leader;
	
	public int getNumber(){
		return number;
	}
	
	public Student getLeader(){
		return leader;
	}
	
	public String getDisplayName(){
		return "Class "+ number;
	}

	public Klass(int number) {
		super();
		this.number = number;
	}
	
	public void assignLeader(Student student){
		 this.leader = student;
		 leader.setLeaderStatus(true);
	}	
}