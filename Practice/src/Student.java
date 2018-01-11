public class Student {
    private static Integer currentStudentID = 0;
    public Integer studentID;
    public String name;
    public Student() {
    	Student.currentStudentID++;
    	this.studentID = Student.currentStudentID;
    	this.name = "Unknown";
    }
    public Student(String name) {
    	Student.currentStudentID++;
    	this.studentID = Student.currentStudentID;
    	this.name = name;
    }
	public void sayStudentInfo() {
    	System.out.println("My ID is: " + this.studentID +
    			           ". My name is: " + this.name);
    }
    public static void main(String[] argv) {
    	Student st1 = new Student("Vinh Le");
    	st1.sayStudentInfo();
    	Student st2 = new Student("Kiet Tiet");
    	st2.sayStudentInfo();
    	Student st3 = new Student();
    	st3.sayStudentInfo();
    }
}