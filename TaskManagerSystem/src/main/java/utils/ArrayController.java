package utils;

import Arrays.*;

import static Arrays.Developer.developers;

public class ArrayController {
    public static void addToArray(String Developer, String TaskName, int Status, String ID, int duration){
        for (String s : developers) {
            if (Developer.equals(s)) {
                System.out.println("that developer already exists proceeding");
            }
        }
        System.out.println("Adding developer");
        Developer developer = new Developer();
        developer.setDeveloper(Developer);
        System.out.println(developer.getDeveloper());
        TaskNames taskname = new TaskNames();
        taskname.setTaskNames(TaskName);
        Status status = new Status();
        status.set_status(Status);
        TaskIDs taskid = new TaskIDs();
        taskid.set_TaskID(ID);
        Duration duration1 = new Duration();
        duration1.set_duration(duration);

        }
    }

