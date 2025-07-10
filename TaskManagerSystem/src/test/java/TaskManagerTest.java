import Arrays.Developer;
import org.example.main.Task;
import org.example.main.TaskManager;
import org.example.main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {
@Test
    public void testTotalDurationWithNonNullTasks() {
        // Create an array of tasks with known durations
        Task[] tasks = new Task[3];
        User active_User = new User("John_","smith","John","Smith");
        tasks[0] = new Task("Task 1", "Description 1", "2020/02/20", active_User, 0, 1,10 );
        tasks[1] = new Task("Task 2", "Developer 2", "2020/02/20", active_User, -1, 2, 20);
        tasks[2] = new Task("Task 3", "Developer 3", "2020/02/20", active_User, 1, 3, 30);

        // Set the taskArr in Task class to the array of tasks
    TaskManager.tasks = tasks;


        // Call the totalDuration method
        int total = Task.totalDuration();

        // Verify that the total duration is calculated correctly
        assertEquals(60, total); // Total should be 10 + 20 + 30 = 60
    }

    @Test
    public void testTotalDurationWithNullTasks() {
        // Set the taskArr in Task class to an array with null elements
        TaskManager.tasks = new Task[3];

        // Call the totalDuration method
        int total = Task.totalDuration();

        // Verify that the total duration is 0 when taskArr has null elements
        assertEquals(0, total); // Total should be 0
    }
    @Test
    public void testDevArray(){

        Task[] tasks = new Task[4];
        User active_User1 = new User("John_","smith","Mike","Smith");
        User active_User2 = new User("John_","smith","Edward","Harrison");
        User active_User3 = new User("John_","smith","Samantha","Paulson");
        User active_User4 = new User("John_","smith","Glenda","Oberholzer");

        tasks[0] = new Task("Create Login", "Description 1", "2020/02/20", active_User1, -1, 1,5 );
        tasks[0].setTaskID(1,active_User1.getFirstName(),"Create Login");
        utils.ArrayController.addToArray(active_User1.getFirstName() + " " + active_User1,tasks[0].getTaskName(),tasks[0].getTaskStatus(),tasks[0].getTaskID(),tasks[0].getTaskDuration());

        tasks[1] = new Task("Create Add Features", "Developer 2", "2020/02/20", active_User2, -1, 2, 20);
        tasks[1].setTaskID(2,active_User2.getFirstName(),tasks[1].getTaskName());
        utils.ArrayController.addToArray(active_User2.getFirstName() + " " + active_User2.getLastName(),tasks[1].getTaskName(),tasks[1].getTaskStatus(),tasks[1].getTaskID(),tasks[1].getTaskDuration());

        tasks[2] = new Task("Create Arrays", "Developer 3", "2020/02/20", active_User3, 1, 3, 30);
        tasks[2].setTaskID(3,active_User3.getFirstName(),tasks[2].getTaskName());
        utils.ArrayController.addToArray(active_User3.getFirstName() + " " + active_User3.getLastName(),tasks[2].getTaskName(),tasks[2].getTaskStatus(),tasks[2].getTaskID(),tasks[2].getTaskDuration());

        tasks[3] = new Task("Add arrays", "Developer 3", "2020/02/20", active_User4, 1, 3, 30);
        tasks[3].setTaskID(4,active_User4.getFirstName(),tasks[3].getTaskName());
        utils.ArrayController.addToArray(active_User4.getFirstName()  + " " + active_User4.getLastName(),tasks[3].getTaskName(),tasks[3].getTaskStatus(),tasks[3].getTaskID(),tasks[3].getTaskDuration());

        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        Developer developer3 = new Developer();
        Developer developer4 = new Developer();
        developer1.setDeveloper(active_User1.getFirstName()  + " " + active_User1.getLastName());
        developer2.setDeveloper(active_User2.getFirstName()  + " " + active_User2.getLastName());
        developer3.setDeveloper(active_User3.getFirstName()  + " " + active_User3.getLastName());
        developer4.setDeveloper(active_User4.getFirstName()  + " " + active_User4.getLastName());


        assertEquals("Mike Smith",developer1.getDeveloper());
        assertEquals("Edward Harrison",developer2.getDeveloper());
        assertEquals("Samantha Paulson",developer3.getDeveloper());
        assertEquals("Glenda Oberholzer",developer4.getDeveloper());
    }
    @Test
    public void testsearch(){

        Task[] tasks = new Task[4];
        User active_User1 = new User("John_","smith","Mike","Smith");
        User active_User2 = new User("John_","smith","Edward","Harrison");
        User active_User3 = new User("John_","smith","Samantha","Paulson");
        User active_User4 = new User("John_","smith","Glenda","Oberholzer");

        tasks[0] = new Task("Create Login", "Description 1", "2020/02/20", active_User1, -1, 1,5 );
        tasks[0].setTaskID(1,active_User1.getFirstName(),"Create Login");
        utils.ArrayController.addToArray(active_User1.getFirstName() + " " + active_User1,tasks[0].getTaskName(),tasks[0].getTaskStatus(),tasks[0].getTaskID(),tasks[0].getTaskDuration());

        tasks[1] = new Task("Create Add Features", "Developer 2", "2020/02/20", active_User2, -1, 2, 20);
        tasks[1].setTaskID(2,active_User2.getFirstName(),tasks[1].getTaskName());
        utils.ArrayController.addToArray(active_User2.getFirstName() + " " + active_User2.getLastName(),tasks[1].getTaskName(),tasks[1].getTaskStatus(),tasks[1].getTaskID(),tasks[1].getTaskDuration());

        tasks[2] = new Task("Create Arrays", "Developer 3", "2020/02/20", active_User3, 1, 3, 30);
        tasks[2].setTaskID(3,active_User3.getFirstName(),tasks[2].getTaskName());
        utils.ArrayController.addToArray(active_User3.getFirstName() + " " + active_User3.getLastName(),tasks[2].getTaskName(),tasks[2].getTaskStatus(),tasks[2].getTaskID(),tasks[2].getTaskDuration());

        tasks[3] = new Task("Add arrays", "Developer 3", "2020/02/20", active_User4, 1, 3, 30);
        tasks[3].setTaskID(4,active_User4.getFirstName(),tasks[3].getTaskName());
        utils.ArrayController.addToArray(active_User4.getFirstName()  + " " + active_User4.getLastName(),tasks[3].getTaskName(),tasks[3].getTaskStatus(),tasks[3].getTaskID(),tasks[3].getTaskDuration());

        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        Developer developer3 = new Developer();
        Developer developer4 = new Developer();
        developer1.setDeveloper(active_User1.getFirstName()  + " " + active_User1.getLastName());
        developer2.setDeveloper(active_User2.getFirstName()  + " " + active_User2.getLastName());
        developer3.setDeveloper(active_User3.getFirstName()  + " " + active_User3.getLastName());
        developer4.setDeveloper(active_User4.getFirstName()  + " " + active_User4.getLastName());
        TaskManager.searchTasksByName();
        // didnt know how to use print out for testing

    }
    @Test
    public void testSearchDev(){

        Task[] tasks = new Task[4];
        User active_User1 = new User("John_","smith","Mike","Smith");
        User active_User2 = new User("John_","smith","Edward","Harrison");
        User active_User3 = new User("John_","smith","Samantha","Paulson");
        User active_User4 = new User("John_","smith","Glenda","Oberholzer");

        tasks[0] = new Task("Create Login", "Description 1", "2020/02/20", active_User1, -1, 1,5 );
        tasks[0].setTaskID(1,active_User1.getFirstName(),"Create Login");
        utils.ArrayController.addToArray(active_User1.getFirstName() + " " + active_User1,tasks[0].getTaskName(),tasks[0].getTaskStatus(),tasks[0].getTaskID(),tasks[0].getTaskDuration());

        tasks[1] = new Task("Create Add Features", "Developer 2", "2020/02/20", active_User2, -1, 2, 20);
        tasks[1].setTaskID(2,active_User2.getFirstName(),tasks[1].getTaskName());
        utils.ArrayController.addToArray(active_User2.getFirstName() + " " + active_User2.getLastName(),tasks[1].getTaskName(),tasks[1].getTaskStatus(),tasks[1].getTaskID(),tasks[1].getTaskDuration());

        tasks[2] = new Task("Create Arrays", "Developer 3", "2020/02/20", active_User3, 1, 3, 30);
        tasks[2].setTaskID(3,active_User3.getFirstName(),tasks[2].getTaskName());
        utils.ArrayController.addToArray(active_User3.getFirstName() + " " + active_User3.getLastName(),tasks[2].getTaskName(),tasks[2].getTaskStatus(),tasks[2].getTaskID(),tasks[2].getTaskDuration());

        tasks[3] = new Task("Add arrays", "Developer 3", "2020/02/20", active_User4, 1, 3, 30);
        tasks[3].setTaskID(4,active_User4.getFirstName(),tasks[3].getTaskName());
        utils.ArrayController.addToArray(active_User4.getFirstName()  + " " + active_User4.getLastName(),tasks[3].getTaskName(),tasks[3].getTaskStatus(),tasks[3].getTaskID(),tasks[3].getTaskDuration());

        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        Developer developer3 = new Developer();
        Developer developer4 = new Developer();
        developer1.setDeveloper(active_User1.getFirstName()  + " " + active_User1.getLastName());
        developer2.setDeveloper(active_User2.getFirstName()  + " " + active_User2.getLastName());
        developer3.setDeveloper(active_User3.getFirstName()  + " " + active_User3.getLastName());
        developer4.setDeveloper(active_User4.getFirstName()  + " " + active_User4.getLastName());
        TaskManager.searchTasksByDevName();
        // didnt know how to use print out for testing

    }
    @Test
    public void testDelete(){

        Task[] tasks = new Task[4];
        User active_User1 = new User("John_","smith","Mike","Smith");
        User active_User2 = new User("John_","smith","Edward","Harrison");
        User active_User3 = new User("John_","smith","Samantha","Paulson");
        User active_User4 = new User("John_","smith","Glenda","Oberholzer");

        tasks[0] = new Task("Create Login", "Description 1", "2020/02/20", active_User1, -1, 1,5 );
        tasks[0].setTaskID(1,active_User1.getFirstName(),"Create Login");
        utils.ArrayController.addToArray(active_User1.getFirstName() + " " + active_User1,tasks[0].getTaskName(),tasks[0].getTaskStatus(),tasks[0].getTaskID(),tasks[0].getTaskDuration());

        tasks[1] = new Task("Create Add Features", "Developer 2", "2020/02/20", active_User2, -1, 2, 20);
        tasks[1].setTaskID(2,active_User2.getFirstName(),tasks[1].getTaskName());
        utils.ArrayController.addToArray(active_User2.getFirstName() + " " + active_User2.getLastName(),tasks[1].getTaskName(),tasks[1].getTaskStatus(),tasks[1].getTaskID(),tasks[1].getTaskDuration());

        tasks[2] = new Task("Create Arrays", "Developer 3", "2020/02/20", active_User3, 1, 3, 30);
        tasks[2].setTaskID(3,active_User3.getFirstName(),tasks[2].getTaskName());
        utils.ArrayController.addToArray(active_User3.getFirstName() + " " + active_User3.getLastName(),tasks[2].getTaskName(),tasks[2].getTaskStatus(),tasks[2].getTaskID(),tasks[2].getTaskDuration());

        tasks[3] = new Task("Add arrays", "Developer 3", "2020/02/20", active_User4, 1, 3, 30);
        tasks[3].setTaskID(4,active_User4.getFirstName(),tasks[3].getTaskName());
        utils.ArrayController.addToArray(active_User4.getFirstName()  + " " + active_User4.getLastName(),tasks[3].getTaskName(),tasks[3].getTaskStatus(),tasks[3].getTaskID(),tasks[3].getTaskDuration());

        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        Developer developer3 = new Developer();
        Developer developer4 = new Developer();
        developer1.setDeveloper(active_User1.getFirstName()  + " " + active_User1.getLastName());
        developer2.setDeveloper(active_User2.getFirstName()  + " " + active_User2.getLastName());
        developer3.setDeveloper(active_User3.getFirstName()  + " " + active_User3.getLastName());
        developer4.setDeveloper(active_User4.getFirstName()  + " " + active_User4.getLastName());
        TaskManager.deleteTaskByName();
        // didnt know how to use print out for testing

    }
    @Test
    public void testreport(){

        Task[] tasks = new Task[4];
        User active_User1 = new User("John_","smith","Mike","Smith");
        User active_User2 = new User("John_","smith","Edward","Harrison");
        User active_User3 = new User("John_","smith","Samantha","Paulson");
        User active_User4 = new User("John_","smith","Glenda","Oberholzer");

        tasks[0] = new Task("Create Login", "Description 1", "2020/02/20", active_User1, -1, 1,5 );
        tasks[0].setTaskID(1,active_User1.getFirstName(),"Create Login");
        utils.ArrayController.addToArray(active_User1.getFirstName() + " " + active_User1,tasks[0].getTaskName(),tasks[0].getTaskStatus(),tasks[0].getTaskID(),tasks[0].getTaskDuration());

        tasks[1] = new Task("Create Add Features", "Developer 2", "2020/02/20", active_User2, -1, 2, 20);
        tasks[1].setTaskID(2,active_User2.getFirstName(),tasks[1].getTaskName());
        utils.ArrayController.addToArray(active_User2.getFirstName() + " " + active_User2.getLastName(),tasks[1].getTaskName(),tasks[1].getTaskStatus(),tasks[1].getTaskID(),tasks[1].getTaskDuration());

        tasks[2] = new Task("Create Arrays", "Developer 3", "2020/02/20", active_User3, 1, 3, 30);
        tasks[2].setTaskID(3,active_User3.getFirstName(),tasks[2].getTaskName());
        utils.ArrayController.addToArray(active_User3.getFirstName() + " " + active_User3.getLastName(),tasks[2].getTaskName(),tasks[2].getTaskStatus(),tasks[2].getTaskID(),tasks[2].getTaskDuration());

        tasks[3] = new Task("Add arrays", "Developer 3", "2020/02/20", active_User4, 1, 3, 30);
        tasks[3].setTaskID(4,active_User4.getFirstName(),tasks[3].getTaskName());
        utils.ArrayController.addToArray(active_User4.getFirstName()  + " " + active_User4.getLastName(),tasks[3].getTaskName(),tasks[3].getTaskStatus(),tasks[3].getTaskID(),tasks[3].getTaskDuration());

        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        Developer developer3 = new Developer();
        Developer developer4 = new Developer();
        developer1.setDeveloper(active_User1.getFirstName()  + " " + active_User1.getLastName());
        developer2.setDeveloper(active_User2.getFirstName()  + " " + active_User2.getLastName());
        developer3.setDeveloper(active_User3.getFirstName()  + " " + active_User3.getLastName());
        developer4.setDeveloper(active_User4.getFirstName()  + " " + active_User4.getLastName());
        TaskManager.fullReport();

        // didnt know how to use print out for testing
    }

}
