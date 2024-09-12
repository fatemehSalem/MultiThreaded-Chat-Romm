package other;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandlingExample {
    public void performTask() {
        try {
            readFile();
            connectToDatabase();
        } catch (FileNotFoundException e) {
            // Handle FileNotFoundException
            System.err.println("File not found: " + e.getMessage());
            // Specific handling logic for FileNotFoundException
        } catch (SQLException e) {
            // Handle SQLException
            System.err.println("Database connection failed: " + e.getMessage());
            // Specific handling logic for SQLException
        } catch (IOException e) {
            // Handle other IOExceptions
            System.err.println("An I/O error occurred: " + e.getMessage());
            // Specific handling logic for IOException
        }
    }
    private void readFile() throws FileNotFoundException, IOException {
        // Code that might throw FileNotFoundException or IOException
    }
    private void connectToDatabase() throws SQLException {
        // Code that might throw SQLException
    }
    public static void main(String[] args) {
        ExceptionHandlingExample example = new ExceptionHandlingExample();
        example.performTask();
    }
}
