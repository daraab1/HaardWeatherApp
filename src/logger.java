import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class logger {
    public static void log(String s){
        try {
            FileWriter myWriter = new FileWriter("/Users/daraabhamid/CIT368/src/log.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
