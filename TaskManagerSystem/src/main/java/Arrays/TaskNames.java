package Arrays;

import org.example.main.TaskManager;

public class TaskNames {
    String _taskName;
    String[] taskNames = new String[100];
    int NameCount = TaskManager.taskCounter;
    public void setTaskNames(String Name){
        this._taskName = Name;
        NameCount++;
    }
    public String getTaskName() {
        return this._taskName;
    }
}
