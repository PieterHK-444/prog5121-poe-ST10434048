package Arrays;

import org.example.main.TaskManager;

public class Duration {
    int _duration;
    int[] duration = new int[100];
    int durationCount = TaskManager.taskCounter;
    public void set_duration(int duration){
        this._duration= duration;
        durationCount++;
    }
}
