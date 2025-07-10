package Arrays;

import org.example.main.TaskManager;

public class Status {
    int _status;
    int[] status = new int[100];
    int statusCount = TaskManager.taskCounter;
    public void set_status(int status){
        this._status = status;
        statusCount++;
    }
}
