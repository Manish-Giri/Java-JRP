package practicaljava.collections.lesson6.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import practicaljava.collections.lesson6.fileprocessors.StockFileData;
import practicaljava.collections.lesson6.fileprocessors.StockFileReader;

public class StockFileApplication {
	
	public static void main(String args[]) throws IOException{
		StockFileReader fr = new StockFileReader("C:\\Users\\hi\\Documents\\GitHub\\Java-JRP\\src\\practicaljava\\lesson6\\table.csv");
		
		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();
		System.out.println(dataResult.size());
	}
	/**
	 * TODO
	 * Complete the method body so that it returns the given structure needed to 
	 * populate the data field in the StockFileData class. 
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
		List<HashMap<String, Double>> dataResult = new ArrayList<>();


        /**
         * Iterate through list of lines read
         * split each line on comma, insert each field as value in HashMap
         * add each hashmap in final list
         */

        for(String line: lines) {
            HashMap<String, Double> map = new HashMap<>();
            String[] fields = line.split(",");
            for(int i = 0; i < fields.length; i++) {
                double fieldValue = Double.parseDouble(fields[i]);
                map.put(headers.get(i), fieldValue);
            }
            dataResult.add(map);
        }

		// Insert your code here..
		return dataResult;
	}
	
	
}
