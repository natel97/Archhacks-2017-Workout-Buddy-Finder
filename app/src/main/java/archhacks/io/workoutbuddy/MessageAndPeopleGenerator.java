package archhacks.io.workoutbuddy;

import android.content.Context;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by natel on 10/28/2017.
 */

public class MessageAndPeopleGenerator implements Runnable {

    private int people;
    Random ran = new Random();
    String[] workouts;
    String[] names;
    String[] bios;
    String[] wTypes;
    String[] girlNames;
    Context con;
    String[] guyNames;
    List<Person> peopleList;

    MessageAndPeopleGenerator(int amountOfPeople, Context c){
        workouts = new String[] {"Off", "Legs and Pectorals", "Abs and Back", "Biceps and Triceps", "Easy Jog", "Distance Run", "Sprints", "Yoga", "Hiking", "Short Bike Ride", "Mid-Distance Bike Ride", "Long Distance Bike Ride", "Waling"};
        wTypes = new String[]{"Running", "Hiking", "Biking", "Walking", "Lifting", "Yoga"};
        guyNames = new String[] {"Samuel","Carter","Anthony","John","Dylan","Luke","Henry","Andrew","Isaac","Christopher","Joshua","Wyatt","Sebastian","Owen","Caleb","Nathan","Ryan","Jack"};
        girlNames = new String[]{"Natalie","Hannah","Layla","Brooklyn","Alexa","Zoe","Penelope","Riley","Leah","Audrey","Savannah","Allison","Samantha","Nora","Skylar","Camila","Anna","Paisley"};
        con = c;
        //bios = new String[]{};
        people = amountOfPeople;
        peopleList = new LinkedList<>();
    }
    @Override
    public void run() {
        DatabaseHelper db = new DatabaseHelper(con);
        for(int x = 0; x < people; x++){
            boolean isBoy = ran.nextInt(2) == 1;
            peopleList.add(new Person(18 + ran.nextInt(30), isBoy ? guyNames[ran.nextInt(guyNames.length)] : girlNames[ran.nextInt(girlNames.length)], new String[]{wTypes[ran.nextInt(wTypes.length)],
                    wTypes[ran.nextInt(wTypes.length)], wTypes[ran.nextInt(wTypes.length)]}, "I am an amazing person!",
                    ran.nextInt(40),"Email@Example.com",new String[]{
                    workouts[ran.nextInt(workouts.length)], workouts[ran.nextInt(workouts.length)],
                    workouts[ran.nextInt(workouts.length)], workouts[ran.nextInt(workouts.length)],
                    workouts[ran.nextInt(workouts.length)], workouts[ran.nextInt(workouts.length)],
                    workouts[ran.nextInt(workouts.length)]}, false, ran.nextInt(60), new Date(), isBoy ? "b" + String.valueOf(ran.nextInt(15) + 1) + ".png": "g" + String.valueOf(ran.nextInt(3) + 1))
                    );
                Person p = peopleList.get(x);
                db.addPerson(p.getName(),p.getLocation(),p.getAge(),p.getEmailAddress(),"Password",p.getWorkouts().toString(),p.getSchedule().toString(),p.isFlagged(),p.getImage());
            }
        }


    }
