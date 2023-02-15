import java.util.Random;
import java.util.Arrays;
import java.time.Duration;
import java.time.Instant;
// import org.jfree.chart.ChartFactory;
// import org.jfree.chart.JFreeChart;
// import org.jfree.chart.plot.PlotOrientation;
// import org.jfree.data.xy.XYSeries;
// import org.jfree.data.xy.XYSeriesCollection;
// import org.jfree.chart.ChartUtilities;

public class LinearSearch {

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Number of random numbers to generate
        int n = 1000;
        // Key to search for in the array
        int key = 500;
        // Create an array to hold the random numbers
        int[] array = new int[n];
        // Create a random number generator
        Random rand = new Random();
        // Generate n random numbers and store them in the array
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(1000);
        }
        // Sort the array for linear search
        Arrays.sort(array);
        // Create a data series for the search time
        //XYSeries series = new XYSeries("Search Time");
        // Search for the key in the array and measure the time
        Instant start=Instant.now();
        for (int i = 0; i < n; i++) {
            
            linearSearch(array, key);
            Instant end=Instant.now();
            
            series.add(i, searchTime);
        }
        // Create a data set from the series
        //XYSeriesCollection data = new XYSeriesCollection(series);
        // Create a chart from the data set
        //JFreeChart chart = ChartFactory.createXYLineChart("Linear Search Time", "Array Size", "Time (ns)", data, PlotOrientation.VERTICAL, true, true, false);
        // Save the chart as an image file
        // try {
        //     ChartUtilities.saveChartAsPNG(new File("linear_search_time.png"), chart, 800, 600);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }
}
