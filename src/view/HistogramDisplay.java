package view;

import java.awt.Dimension;
import javax.swing.JPanel;

import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import model.Histogram;

public class HistogramDisplay extends ApplicationFrame {
    
    public final Histogram<String> histogram;
    private static final int CHART_WIDTH = 500;
    private static final int CHART_HEIGHT = 400;
    
    public HistogramDisplay(Histogram<String> histogram){
        super("HISTOGRAMA");
        if (histogram == null) {
            throw new IllegalArgumentException("Histogram cannot be null");
        }
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }

    public void execute() {
        setVisible(true);
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart", "Dominios email", "Nº de emails", dataSet, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    public DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        histogram.keySet().stream().forEach((key) -> {
            dataSet.addValue(histogram.get(key), "", key);
        });
        return dataSet;
    }

    
    private JPanel createPanel(){
        DefaultCategoryDataset dataSet = createDataSet();
        JFreeChart chart = createChart(dataSet);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(CHART_WIDTH, CHART_HEIGHT)); 
        return chartPanel;
    }
}