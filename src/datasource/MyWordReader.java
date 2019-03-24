package datasource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MyWordReader {
	
	public static List<String> getAllWords(String fileName){
        List<String> allWords = new ArrayList<>();
        BufferedReader reader;
        try {
            FileReader fileReader = new FileReader(fileName);
            reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null) { // while there is still another line to read
                allWords.add(line);
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allWords;
	}
}
