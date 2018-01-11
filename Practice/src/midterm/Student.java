package midterm;

public class Student {
    private String name;
    private double lectureMark;
    private double labMark;
    private double average;
    public Student(String name, double lectureMark, double labMark, double average) {
        this.name = name;
        this.lectureMark = lectureMark;
        this.labMark = labMark;
        this.average = average;
    }
    public String getName() {
        return this.name;
    }
    public double getLectureMark() {
        return this.lectureMark;
    }
    public double getLabMark() {
        return this.labMark;
    }
    public double getAverage() {
        return this.average = (((this.labMark * 2) + this.lectureMark)/3);
    }
    public void show() {
        System.out.println(this.name + "\t" + this.lectureMark + "\t" + this.labMark + "\t" + this.average);
    }
}
