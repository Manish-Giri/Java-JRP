package practicaljava.lesson6.client;

// import practicaljava.lesson6.*;
import practicaljava.lesson6.aggregators.Aggregator;
import practicaljava.lesson6.aggregators.MeanAggregator;
import practicaljava.lesson6.aggregators.MinAggregator;
//import lesson6.aggregators.Aggregator;
//import aggregators.MeanAggregator;
//import aggregators.MinAggregator;

public class Application {

	public static void main(String[] args) {
		
		Aggregator values = new MeanAggregator();
		values.add(100.93);
		values.add(101.32);
		values.add(103.41);
		values.add(107.87);
		values.add(100.90);
		values.add(98.76);
		
		Aggregator minValue = new MinAggregator(values.getValues());
				
		double result = minValue.calculate();
		
		System.out.println(result);
		
	}

}
