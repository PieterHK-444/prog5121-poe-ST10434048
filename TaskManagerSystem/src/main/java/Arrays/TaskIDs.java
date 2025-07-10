package Arrays;

import org.example.main.TaskManager;

public class TaskIDs {
    String _TaskID;
    String[] taskid = new String[100];
    int idCount = TaskManager.taskCounter;
    public void set_TaskID(String TaskID){
        this._TaskID = TaskID;
        idCount++;
    }


}
