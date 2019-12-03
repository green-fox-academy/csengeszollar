package GreenFoxInheritance;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super();
        this.previousOrganization = "The school of Life";
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("\nBe a junior software developer.");
    }

    public void introduce() {
        super.introduce();
        System.out.printf("from %s who skipped %d days from the course already. ", this.previousOrganization, this.skippedDays);
    }


    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

}

