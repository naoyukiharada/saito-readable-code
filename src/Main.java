import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ReadRecipe readRecipe = new ReadRecipe();

	String fileName = "../resource/file/recipe-data.txt";
	String recipe = "";

	try{
	BufferedReader bufferedReader = readRecipe.readFile(fileName);

	recipe = readRecipe.readLine(bufferedReader);
	}
	catch (IOException e) {
	}

        System.out.println(recipe);
    }
}
