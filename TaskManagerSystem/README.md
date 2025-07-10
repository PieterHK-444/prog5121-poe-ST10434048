# Task Manager System

A comprehensive Java-based task management application that allows users to create, track, and manage tasks with user authentication and reporting capabilities.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Testing](#testing)
- [Technical Details](#technical-details)
- [Contributing](#contributing)

## 🎯 Overview

The Task Manager System is a console-based application built in Java that provides a complete task management solution. It features user authentication, task creation and management, comprehensive reporting, and a Kanban board view for visual task organization.

## ✨ Features

### 🔐 User Management
- **User Registration**: Create new user accounts with username, password, first name, and last name
- **User Login**: Secure authentication system
- **User Profiles**: Manage user information and credentials

### 📝 Task Management
- **Create Tasks**: Add individual tasks with detailed information
- **Bulk Task Creation**: Create multiple tasks at once
- **Task Properties**:
  - Task name and description
  - Due date (YYYY/MM/DD format)
  - Task status (To Do, In Progress, Complete)
  - Duration in hours
  - Task coordinator assignment
  - Auto-generated task ID

### 📊 Reporting & Analytics
- **Task Reports**: Comprehensive reporting system with multiple options
- **Done Tasks Display**: View all completed tasks
- **Longest Task Analysis**: Find the task with the longest duration
- **Task Search**: Search tasks by name or developer
- **Task Removal**: Delete specific tasks or remove all tasks
- **Duration Tracking**: Total duration calculation for all tasks

### 🎯 Kanban Board
- Visual task organization using Kanban methodology
- Task status visualization
- Drag-and-drop style task management

## 🛠️ Prerequisites

- **Java 22** or higher
- **Maven** 3.6+ for dependency management
- **JUnit** for testing (included in pom.xml)

## 📦 Installation

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd TaskManagerSystem
   ```

2. **Compile the project**:
   ```bash
   mvn compile
   ```

3. **Run the application**:
   ```bash
   mvn exec:java -Dexec.mainClass="org.example.main.Main"
   ```

## 🚀 Usage

### Starting the Application

1. Run the main class: `org.example.main.Main`
2. The application will display the main menu with options:
   - **0) Login** - Access existing account
   - **1) Register** - Create new account
   - **2) Exit** - Terminate application

### User Registration

1. Select option **1) Register**
2. Enter your details:
   - Username
   - Password
   - First Name
   - Last Name

### User Login

1. Select option **0) Login**
2. Enter your username and password
3. Upon successful login, you'll access the task management system

### Task Management

After logging in, you can:

1. **Create Single Task** (Option 0):
   - Enter task name
   - Provide description
   - Set due date (YYYY/MM/DD format)
   - Select status (0=To Do, 1=In Progress, 2=Complete)
   - Specify duration in hours

2. **Create Multiple Tasks** (Option 1):
   - Specify number of tasks to create
   - Follow the same process for each task

3. **View Reports** (Option 2):
   - Display done tasks
   - Show longest task
   - Search tasks by name
   - Search tasks by developer
   - Remove tasks
   - Display all tasks

4. **View Total Duration** (Option 3):
   - See total duration of all tasks

5. **Kanban Board** (Option 4):
   - Visual task management interface

## 📁 Project Structure

```
TaskManagerSystem/
├── pom.xml                          # Maven configuration
├── src/
│   ├── main/java/
│   │   ├── Arrays/                  # Array management classes
│   │   │   ├── Developer.java
│   │   │   ├── Duration.java
│   │   │   ├── Status.java
│   │   │   ├── TaskIDs.java
│   │   │   └── TaskNames.java
│   │   ├── org/example/main/        # Core application classes
│   │   │   ├── Main.java           # Application entry point
│   │   │   ├── User.java           # User model
│   │   │   ├── Task.java           # Task model
│   │   │   ├── TaskManager.java    # Task management logic
│   │   │   ├── Menu.java           # Menu system
│   │   │   ├── Login.java          # Authentication
│   │   │   ├── Registration.java   # User registration
│   │   │   ├── AccountManager.java # Account management
│   │   │   ├── Kanban.java         # Kanban board
│   │   │   ├── Prompt.java         # User input handling
│   │   │   └── UserManager.java    # User management
│   │   └── utils/                   # Utility classes
│   │       ├── ArrayController.java # Array operations
│   │       └── Format.java         # Input validation
│   └── test/java/                   # Test classes
│       ├── LoginTest.java
│       └── TaskManagerTest.java
```

## 🧪 Testing

The project includes comprehensive unit tests using JUnit:

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=LoginTest
mvn test -Dtest=TaskManagerTest
```

### Test Coverage

- **LoginTest.java**: Tests user authentication functionality
- **TaskManagerTest.java**: Tests task management operations

## 🔧 Technical Details

### Core Classes

#### `Main.java`
- Application entry point
- Manages global scanner and user session
- Controls main application loop

#### `User.java`
- User model with authentication details
- Username, password, first name, last name
- Getter/setter methods for all properties

#### `Task.java`
- Task model with comprehensive properties
- Auto-generated task ID system
- Status management (To Do, In Progress, Complete)
- Duration tracking and total calculation

#### `TaskManager.java`
- Core task management functionality
- Task creation, modification, and deletion
- Array-based task storage
- Sorting and searching capabilities

#### `Menu.java`
- Menu system management
- User input handling
- Navigation between different application sections

### Data Validation

The application includes robust input validation:

- **Date Format**: YYYY/MM/DD format validation
- **Description Length**: Minimum length requirements
- **Status Values**: Valid status selection (0-2)
- **Duration**: Positive integer validation

### Task ID Generation

Tasks are assigned unique IDs using the format:
```
{First 2 letters of task name}:{Task number}:{Last 3 letters of coordinator's last name}
```

Example: `Ta:1:ith` for task "Task1" assigned to coordinator "Smith"

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is part of the PROG5121 POE (Portfolio of Evidence) for student ST10434048.

## 👨‍💻 Author

**Student ID**: ST10434048  
**Course**: PROG5121  
**Institution**: Varsity College Sandton

---

**Note**: This application is designed for educational purposes and demonstrates object-oriented programming concepts, user interface design, and data management in Java. 