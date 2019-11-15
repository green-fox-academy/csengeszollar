public class Human {
    private String name;
    private int age;
    private boolean isLeftHanded;
    Integer height;
    private String gender;
    private boolean isAlive;
    private int humansCreatedNonStatic;
    private static int humansCreatedStatic;

    public Human(){
        this.name = "jani";
        this.age = 22;
        humansCreatedNonStatic++;
        humansCreatedStatic++;
        this.height = 50;
    }

    public Human(String name){
        this.name = name;
        this.age = 22;
    }

    public Human(String name, int age2, int height){
        this.name = name;
        this.height = height;
        this.age = age2;
    }

    public static void sleeping(){
        System.out.println("zzzzzzzzzz");
    }

    public void fight(Human human){
        if (this.age > human.age){
            System.out.println(this.name + "wins");
            human.isAlive = false;
        }else if(this.age < human.age){
            System.out.println(human.name + "wins");
            this.isAlive = false;
        }else{
            System.out.println("Draw, everybody is dead");
            this.isAlive = false;
            human.isAlive = false;
        }
    }

    public void setHeight(int height){
        if (height > 100){
            this.height = height;
        }else {
            System.out.println("invalid height, set to default value 100");
            this.height = 100;
        }
    }

    public int getHeight(){
        return this.height;
    }
}
