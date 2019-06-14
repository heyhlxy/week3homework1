package practice09;

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
		if(student.getKlass().getNumber()!=number){
			System.out.print("It is not one of us.\n");
			return;
		} 
	    this.leader = student;
		leader.setLeaderStatus(true);
	}	
	
	public void appendMember(Student student){
		student.setKlass(this);
	}
}