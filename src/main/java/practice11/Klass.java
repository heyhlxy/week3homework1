package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
	
	private int number;
	private Student leader;
	private List<Teacher> teacherList = new ArrayList<Teacher>(); //Observers
	
	public Klass(int number) {
		super();
		this.number = number;
	}
	
	public int getNumber(){
		return number;
	}
	
	public Student getLeader(){
		return leader;
	}
	
	public String getDisplayName(){
		return "Class "+ number;
	}

	public void assignLeader(Student student){
		if(student.getKlass().getNumber()!=number){
			System.out.print("It is not one of us.\n");
			return;
		} 
	    this.leader = student;
		leader.setLeaderStatus(true);
		notifyAllTeachers(student, true);
	}	
	
	public void appendMember(Student student){
		student.setKlass(this);
		notifyAllTeachers(student, false);
	}
	
	public boolean isIn(Student student){
		return this.number == student.getKlass().getNumber();
	}
	
	public void attachTeacher(Teacher teacher){
		teacherList.add(teacher);
	}
	
	public void notifyAllTeachers(Student student, boolean isLeader){
		for(Teacher t : teacherList){
			t.updateStudent(student, isLeader);
		}
	}
}