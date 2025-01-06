# Time Management and Task Prioritization System

## Project Description
The **Time Management and Task Prioritization System** is designed to help users efficiently manage their time by prioritizing tasks based on deadlines and importance. The system also tracks the time spent on each task, enabling users to stay organized and enhance their productivity.

## Features
- **Task Prioritization**: Easily set priorities for tasks by entering details such as name, deadline, and importance level.
- **Time Tracking**: Log the start and end times for each task, providing accurate records of time spent.
- **Progress Review**: Review task status and time spent to gain valuable insights into progress and time management.

## Database Schema
The database consists of the following key tables:
- **User**: Stores user information.
- **Task**: Contains task details, including name, deadline, and importance level.
- **TimeLog**: Logs the time spent on each task.

## Setup Instructions
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/vansh1505/PriortizeMejava.git
   ```

2. **Install MySQL**:
   Ensure that MySQL is installed on your machine. Create a database and run the SQL scripts provided in the `/sql` directory to set up the tables.

3. **Configure Database Connection**:
   Update the database connection settings in the `DBUtil` class to match your MySQL configuration.

4. **Run the Project**:
   - Open the project in your preferred IDE (e.g., IntelliJ IDEA or Eclipse).
   - Build and run the project on a local server (e.g., Apache Tomcat).

## Acknowledgements
- [MySQL](https://www.mysql.com/) for the database management system.
- [Apache Tomcat](http://tomcat.apache.org/) for the web server.
- Tailwind for front-end styling.

### By Team - 9
