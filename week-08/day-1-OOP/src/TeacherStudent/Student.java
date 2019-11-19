package TeacherStudent;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
    public void learn () {
        System.out.println(name + " is learning something new.");
    }

    public void questionTeacher(Teacher teacher) {
        System.out.println("Student " + name + " question " + teacher.name);
        teacher.answer();
    }

}
