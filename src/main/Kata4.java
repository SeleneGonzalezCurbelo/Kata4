package main;

import java.util.List;
import model.Mail;
import view.HistogramDisplay;
import model.Histogram;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4 {
        
    public static void main(String[] args) {       
        String fileName = "email.txt";
        List<Mail> mailList = MailListReader.read(fileName); 
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
