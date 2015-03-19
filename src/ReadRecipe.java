import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadRecipe {


    public BufferedReader readFile(String fileName) throws IOException {

        File file = new File(fileName);
        FileReader filereader = new FileReader(file);
        return new BufferedReader(filereader);
    }

    public String readLine(BufferedReader bufferedReader) throws IOException {
        return bufferedReader.readLine();
    }

}
