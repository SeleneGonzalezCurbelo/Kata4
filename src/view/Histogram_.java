package view;

import java.util.Set;

public interface Histogram_<T> {
    public Integer get(T key);
    public Set<T> keySet();
    public void increment(T key);
}
