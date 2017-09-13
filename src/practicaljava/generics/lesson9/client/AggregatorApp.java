package practicaljava.generics.lesson9.client;

import practicaljava.generics.lesson9.aggregators.*;

import java.io.IOException;

public class AggregatorApp {

	public static void main(String[] args) throws IOException {
		
		/**
			You'll need to uncomment the below code. You'll notice it does not compile!
			
			There are 2 objectives in this assignment.
			
			1).  Make sure the code compiles correctly after you uncomment it below.
			2).  Make sure it runs as explained in the assignment video!
			
			-->> YOUR WORK SHOULD BE DONE IN THE AggregatorProcessor CLASS. 
		**/

		String fileName = "/Users/manishgiri/Dropbox/Development/Java/JavaSE/Imtiaz-Ahmed/src/practicaljava/generics/lesson9/table.csv";

		//MinAggregator agg = new MinAggregator();
        MaxAggregator agg = new MaxAggregator();
		AggregatorProcessor<MaxAggregator> aggsProcessor = new AggregatorProcessor<>(agg, fileName);
		double value = aggsProcessor.runAggregator(2);
		System.out.println(value);
	

	}

}
