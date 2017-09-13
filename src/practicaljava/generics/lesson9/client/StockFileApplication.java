package practicaljava.generics.lesson9.client;

import practicaljava.generics.lesson9.fileprocessors.StockFileData;
import practicaljava.generics.lesson9.fileprocessors.StockFileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StockFileApplication {
	
	public static void main(String args[]) throws IOException{
		StockFileReader fr = new StockFileReader("/Users/manishgiri/Dropbox/Development/Java/JavaSE/Imtiaz-Ahmed/src/practicaljava/generics/lesson9/table.csv");
		
		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();
		System.out.println(dataResult.size());
	}
	/**
	 * Complete the method body so that it returns the given structure needed to 
	 * populate the data field in the StockFileData class. 
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
		List<HashMap<String, Double>> dataResult = new ArrayList<>();
		// Insert your code here..
		for(String line: lines) {
			HashMap<String, Double> map = new HashMap<>();
			String[] fields = line.split(",");
			for(int i = 0; i < fields.length; i++) {
				double fieldValue = Double.parseDouble(fields[i]);
				map.put(headers.get(i), fieldValue);
			}
			dataResult.add(map);
		}
		return dataResult;
	}
	
	
}
