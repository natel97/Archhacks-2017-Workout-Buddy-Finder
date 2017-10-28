package archhacks.io.workoutbuddy;

/**
 * Created by natel on 10/28/2017.
 */

public class Person {
    private int age;
    private String name;
    private String[] workouts;
    private String bio;


    public Person(int Age, String Name, String[] Workouts, String Bio){
        this.age = Age;
        this.name = Name;
        this.workouts = Workouts;
        this.bio = Bio;
    }

    public int getAge(){return age;}
    public String getName(){return name;}
    public String[] getWorkouts(){return workouts;}
    public String getBio(){return bio;}
}
