package archhacks.io.workoutbuddy;

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
    List<Person> peopleList;

    MessageAndPeopleGenerator(int amountOfPeople){
        workouts = new String[] {"Off", "Legs and Pectorals", "Abs and Back", "Biceps and Triceps", "Easy Jog", "Distance Run", "Sprints", "Yoga", "Hiking", "Short Bike Ride", "Mid-Distance Bike Ride", "Long Distance Bike Ride", "Waling"};
        wTypes = new String[]{"Running", "Hiking", "Biking", "Walking", "Lifting", "Yoga"};
        names = new String[]{};
        bios = new String[]{};
        people = amountOfPeople;
        peopleList = new LinkedList<>();
    }
    @Override
    public void run() {
        for(int x = 0; x < people; x++){
            peopleList.add(new Person(18 + ran.nextInt(30), names[ran.nextInt(names.length)], new String[]{wTypes[ran.nextInt(wTypes.length)],
                    wTypes[ran.nextInt(wTypes.length)], wTypes[ran.nextInt(wTypes.length)]}, bios[ran.nextInt(bios.length)],
                    ran.nextInt(40),"Email@Example.com",new String[]{
                    workouts[ran.nextInt(workouts.length)], workouts[ran.nextInt(workouts.length)],
                    workouts[ran.nextInt(workouts.length)], workouts[ran.nextInt(workouts.length)],
                    workouts[ran.nextInt(workouts.length)], workouts[ran.nextInt(workouts.length)],
                    workouts[ran.nextInt(workouts.length)]}, false, ran.nextInt(60), new Date())
                    );

            }
        }


    }
