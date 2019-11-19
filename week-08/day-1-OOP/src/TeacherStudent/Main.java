package TeacherStudent;


//Create Student and Teacher classes
//        Student
//        learn() -> prints the student is learning something new
//        question(teacher) -> calls the teachers answer method
//        Teacher
//        teach(student) -> calls the students learn method
//        answer() -> prints the teacher is answering a question
//        Instantiate a Student and Teacher object
//        Call the student's question() method and the teacher's teach() method

public class Main {
    public static void main(String[] args) {

        Student kati = new Student("Kati");
        Student peti = new Student("Peti");

//        kati.learn();
//        peti.learn();

        Teacher aristotel = new Teacher("Aristotel");

//        aristotel.answer();

        kati.questionTeacher(aristotel);
        aristotel.teach(kati);


    }
}
