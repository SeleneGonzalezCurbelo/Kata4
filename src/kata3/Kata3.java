package kata3;

public class Kata3 {
    
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        new HistogramDisplay(histogram).execute();
    }
    
}
