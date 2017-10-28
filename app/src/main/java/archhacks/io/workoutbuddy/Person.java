package archhacks.io.workoutbuddy;

import android.location.Location;

import java.util.Date;

/**
 * Created by natel on 10/28/2017.
 */

public class Person {
    private int age;
    private String name;
    private String[] workouts;
    private String bio;
    private int location;
    private String emailAddress;
    private String[] schedule;
    private boolean flagged;
    private int lastOnline;
    private Date accountCreated;


    public Person(int Age, String Name, String[] Workouts, String Bio, int Location, String Email, String[] Schedule, boolean Flag, int LastOnline, Date AccountCreated){
        this.age = Age;
        this.name = Name;
        this.workouts = Workouts;
        this.bio = Bio;
        this.location = Location;
        this.emailAddress = Email;
        this.schedule = Schedule;
        this.flagged = Flag;
        this.lastOnline = LastOnline;
        this.accountCreated = AccountCreated;
    }


    public int getAge(){return age;}
    public String getName(){return name;}
    public String[] getWorkouts(){return workouts;}
    public String getBio(){return bio;}

    public int getLocation() {
        return location;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public int getLastOnline() { return lastOnline;}

    public Date getAccountCreated() {return accountCreated;}
}
