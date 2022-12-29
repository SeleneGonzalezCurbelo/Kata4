package view;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Histogram<T> implements Histogram_<T>{
    
    public final Map<T, Integer> histogram;

    public Histogram() {
        this.histogram =  new HashMap<T, Integer>();
    }

    @Override
    public Integer get(T key) {
        return histogram.get(key);
    }

    @Override
    public Set<T> keySet() {
        return histogram.keySet();
    }

    @Override
    public void increment(T key) {
        histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
    }
}