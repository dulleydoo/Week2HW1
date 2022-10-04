public class Student {
    public Boolean backPack;
    public int grade;
    public int age;
    public String name;
    public int id;

    public Student(Boolean backPack, int grade, int age, String name, int id){
        this.backPack = backPack;
        this.grade = grade;
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public String getStudentID(){
        return (name + "\n" + grade + "\n" + id);
    }
}
