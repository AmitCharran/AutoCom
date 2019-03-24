package datasource;

import java.util.List;

public class MyDataSource {
	private List<String> allWords;
	private static MyDataSource instance = new MyDataSource();
	
	//Make the private constructor
	private MyDataSource() {
		
	}
	
	public static MyDataSource getInstance() {
		return instance;
	}
	
	public List<String> getAllWordsFromTextFile(String fileName){
		allWords = MyWordReader.getAllWords(fileName);
		return allWords;
	}
	
	public static void main(String [] args) {
		
	}
}
