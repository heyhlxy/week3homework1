package practice09;

public class Teacher extends Person{
    
	private Klass klass;
	
	public Teacher(int id, String name, int age, Klass klass) {
		super(id, name, age);
		this.klass  =klass;
	}
    
	public Teacher(int id, String name, int age) {
		super(id, name, age);
	}
	
	public Klass getKlass(){
		return klass;
	}
	
	@Override
	public String introduce(){
		if(klass != null){
			return super.introduce()+" I am a Teacher. I teach " + klass.getDisplayName() +".";
		} else {
            return super.introduce()+" I am a Teacher. I teach No Class.";			
		}	
	}
	
	public String introduceWith(Student student){
		if(klass.getDisplayName().equals(student.getKlass().getDisplayName())){
			return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
		} else {
			return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
		}
	}
}