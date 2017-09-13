package practicaljava.generics.lesson9.aggregators;

import practicaljava.generics.lesson9.fileprocessors.*;

import java.io.IOException;
import java.util.List;

public class AggregatorProcessor<T extends Aggregator> {

    private T aggregator;
    private String fileName;

    public AggregatorProcessor(T aggregator, String fileName) {
        this.aggregator = aggregator;
        this.fileName = fileName;
    }


    public double runAggregator(int i) {

        StockFileReader stockFileReader = new StockFileReader(fileName);
        try {
            List<String> fileData = stockFileReader.readFileData();
            for(String s: fileData) {
                int col = i - 1;
                aggregator.numbers.add(Double.parseDouble(s.split(",")[col]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return aggregator.calculate();

    }
}
