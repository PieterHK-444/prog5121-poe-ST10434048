package org.example.main;

import utils.Format;

import java.util.Scanner;

public class TaskManager {
	public static Task[] tasks = new Task[100];
	
	public static int taskCounter = 0; // Auto-Generated Primary Key // Increment when adding to Task[] array




	enum Items {
		
		AddNewTask,
		AddMultipleTask,
		ShowReport,
		ShowTotalDuration,
		Exit,
	}
	public static void promptUser() {
		int choice = Main.scanner.nextInt();
		Main.scanner.nextLine();

		if (choice == 0) {
			System.out.println("\nPlease enter new task info below: ");
			createNewTask();
			promptUser();
			//creates just a single task
		}

		if (choice == 1) {
			System.out.println("\n Create multiple tasks: ");
			createMultipleTasks();
		}
		if (choice == 2) {
//			System.out.println("coming soon");
			Menu.promptReport();
		}
		if(choice==3){
			System.out.println("Total duration of tasks: "+Task.totalDuration());
			showTaskManagerMenuItems();
		}
		if(choice == 4){
			new Kanban();
		}

	}

	// This function invokes the Task class constructor
	public static void createNewTask() {
		String taskName = promptTaskName();

		String description  = TaskManager.promptDescription();
		String date = promptDate();
		if(description == null || date == null) {
			System.out.println("The date or Description do not meet the 0requirements, try again");
			createNewTask();

		}
		int status = promptStatus();
		int duration = promptDuration();
		int taskNumber = taskCounter+1;
		User active_User = Main.current_logged_in_User;
//		User active_User = new User("John_","smith","John","Smith");
		//code for testing purposes
		Task task = new Task(taskName,description,date,active_User,status,taskNumber, duration);
		task.setTaskDuration(duration);
		task.setTaskName(taskName);
		task.setTaskStatus(status);
		task.setDueDate(date);
		task.setTaskCoordinator(active_User);
		task.setTaskDescription(description);
		task.setTaskID(taskNumber,active_User.getLastName(),taskName);
		tasks[taskCounter] = task;
		utils.ArrayController.addToArray(active_User._firstname,taskName,status,task.getTaskID(),duration);
		task.printTask();
		taskCounter++;
		Task.moretask();
	}

	private static int promptDuration() {
		System.out.println("Enter the duration of the task in hours: ");
		return Main.scanner.nextInt();

	}

	private static int promptStatus() {
		Task.showStatusOptions();
        return Main.scanner.nextInt();
	}
	private static String promptTaskName() {
		System.out.println("\nPlease enter the task name: ");
		Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
	}

	private static String promptDate() {
		System.out.println("Please enter the due date bellow in the format yyyy/mm/dd");
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
		if(Format.dateCheck(date)){
			String year = date.substring(0,4);
			String month = date.substring(5,7);
			String day = date.substring(8,10);
            return String.format("%s/%s/%s", year,month,day);
		}
		return null;
	}

	private static String promptDescription() {
		System.out.println("Please enter the task description: ");
		Scanner scanner = new Scanner(System.in);
		String description = scanner.nextLine();
		if(Format.descriptionCheck(description)) {
			return description;
		}
		return null;
	}
	private static String promptDevName(){
		System.out.println("Please enter the task developer's name: ");
		Scanner scanner = new Scanner(System.in);
		String fname = scanner.nextLine();
		System.out.println("Please enter the task developer's surname: ");
		String lname = scanner.nextLine();
        return String.format("%s %s", fname, lname);
	}

	public static void createMultipleTasks() {
		System.out.print("Enter number of tasks you would like to create: ");
		int number_of_tasks = Main.scanner.nextInt();
		int i =0;
		while (i < number_of_tasks) {
			createNewTask();
			i++;
		}
		showTaskManagerMenuItems();

	}

//	// This function will clear the entire Task[] array
	public static void removeAllTasks() {
		for(int i = 0; i < taskCounter; i++) {
			if(tasks[i] != null) {
				tasks[i] = null;
				taskCounter--;
			}else{
				System.out.println("There are no tasks to remove");
				showTaskManagerMenuItems();
			}

		}

	}


	public static void showTaskManagerMenuItems() {
		System.out.println("Please enter your choice: ");
		for (int i = 0; i < Items.values().length; i++) {
			System.out.println(i + ") " + Items.values()[i]);
		}
		promptUser();
	}
	

	public static void showDoneTasks() {
		for(Task task : tasks) {
			if(task != null) {
				if (task.getTaskStatus() == 1) {
					String form = String.format("Developer: %s \nTask name: %s \nDuration: %d \n", task.getTaskCoordinator(), task._taskName, task.getTaskDuration());
					System.out.print(form);
				}
			}
		}
	}
	static Task[] sort() {
		for (int i = 0; i < tasks.length - 1; i++) {
			for (int j = 0; j < tasks.length - i - 1; j++) {
				if (tasks[j] != null && tasks[j + 1] != null && tasks[j]._taskDuration > tasks[j + 1]._taskDuration) {
					Task temp = tasks[j];
					tasks[j] = tasks[j + 1];
					tasks[j + 1] = temp;
				}
			}
		}
		return tasks;
	}
	public static void showLongestTask() {
		Task[] sortedTasks = sort();
		int len = sortedTasks.length;
		for (int i = 0; i < len; i++) {
			if (sortedTasks[i] == null) {
				i--;
				Task longest = sortedTasks[i];
				System.out.println("Task duration: "+longest.getTaskDuration() +"\t"+"Task Developer: "+ longest.getTaskCoordinator());
				break;
			}
		}

	}
	public static void searchTasksByName() {
		String taskName = promptTaskName();
		if(taskName!=null){
			String flag = "N";
			for (int i = 0; i < taskCounter; i++) {
			Task task = tasks[i];
				if (task != null && task.getTaskName().equals(taskName)) {
				System.out.println("Task name: "+task.getTaskName());
				System.out.println("Developer: "+task.getTaskCoordinator());
				System.out.println("Task status: "+task.convertStatus());
				flag = "Y";
				}
			}if(flag.equals("N")){
				System.out.println("No Task Found Named " + taskName);
			}
		}

	}

	public static void searchTasksByDevName() {
		String devName = promptDevName();
		if(devName != null){
			String flag = "N";
			for (int i = 0; i < taskCounter; i++) {
				if(tasks[i] != null && tasks[i].getTaskCoordinator().equals(devName)) {
					System.out.println("\nTask name: " + tasks[i].getTaskName());
					System.out.println("Developer: " + tasks[i].getTaskCoordinator());
					System.out.println("Task status: " + tasks[i].convertStatus());
					flag = "Y";
				}
//				}else if(tasks[i] != null && !tasks[i].getTaskCoordinator().equals(devName)){
//					System.out.println("No Task Found for " + devName);
//				}else if(tasks[i] ==null){
//					System.out.println("No Tasks Found");
//
//				}
			}if(flag.equals("N")){
				System.out.println("No Task Found for " + devName);
			}
		}
	}


	public static void deleteTaskByName() {
		String taskName = promptTaskName();
		int index = taskByNameIndex(taskName);
		if (index != -1) {
			tasks[index] = null;
			for (int i = 0; i < taskCounter; i++) {
				if(tasks[i] == null){
					for (int x = 0; x < tasks.length - 1; x++) {
						for (int j = 0; j < tasks.length - i - 1; j++) {
							if (tasks[j] != null && tasks[j + 1] != null && tasks[j]._taskDuration < tasks[j + 1]._taskDuration) {
								Task temp = tasks[j];
								tasks[j] = tasks[j + 1];
								tasks[j + 1] = temp;
							}
						}
					}
				}
//				tasks[i] = tasks[i + 1];
			}
			taskCounter--;
			System.out.println("Task deleted: "+taskName);
			Menu.promptReport();
		}else{
			System.out.println("No Task Found");
			Menu.promptReport();
		}
	}

	private static int taskByNameIndex(String taskName) {
		for (int i = 0; i < taskCounter; i++) {
			if (tasks[i] != null && tasks[i].getTaskName().equals(taskName)) {
				return i;
			}
		}return -1;
	}

	public static void fullReport() {
		for (int i = 0; i < taskCounter; i++) {
			if(tasks[i] != null){
				System.out.println(" ");
				tasks[i].reportPrint();
			}

		}

	}


}