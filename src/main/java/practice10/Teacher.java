package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    
	private LinkedList<Klass> klasses;
	
	public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
		super(id, name, age);
		this.klasses = klasses;
	}
    
	public Teacher(int id, String name, int age) {
		super(id, name, age);
	}
	
	public LinkedList<Klass> getClasses(){
		return klasses;
	}
	
	@Override
	public String introduce(){
		StringBuilder klassesNum = new StringBuilder();
		if(klasses != null){
			if(klasses.size() != 0){
				klassesNum.append(klasses.get(0).getNumber());
				for (int i = 1; i < klasses.size(); i++) {
					klassesNum.append(", "+ klasses.get(i).getNumber());
				}
				return super.introduce()+" I am a Teacher. I teach Class " + klassesNum +".";
			}
			return super.introduce()+" I am a Teacher. I teach No Class.";
		} else {
            return super.introduce()+" I am a Teacher. I teach No Class.";			
		}	
	}
	
	public String introduceWith(Student student){
			if(isTeaching(student)){
				return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
			} 
		return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
	}
	
	public boolean isTeaching(Student student){
		return klasses.contains(student.getKlass());
	}
}