package practice08;

public class Student extends Person{
    
    private Klass klass;
	private boolean isLeader = false;
	
	public Student(int id, String name, int age, Klass klass) {
		super(id, name, age);
		this.klass = klass;
	}
    
	public Klass getKlass(){
		return klass;
	}
	
	public void setLeaderStatus(boolean isLeader){
		this.isLeader = isLeader;
	}
	
	@Override
	public String introduce(){
		if(isLeader){
			return super.introduce()+" I am a Student. I am Leader of " + klass.getDisplayName() + ".";
		} else{
			return super.introduce()+" I am a Student. I am at " + klass.getDisplayName() +".";
		}
	}
}