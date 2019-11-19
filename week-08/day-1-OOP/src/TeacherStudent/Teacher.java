package TeacherStudent;

public class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void answer() {
        System.out.println("Teacher " + name + " is answering a question");
    }

    public void teach(Student student) {
        student.learn();
    }
}
