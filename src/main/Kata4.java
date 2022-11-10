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
        input(fileName);   
    }
    
    public static void input(String fileName){
        process(MailListReader.read(fileName));
    }
    
    public static void process(List<Mail> mailList){
        output(MailHistogramBuilder.build(mailList));
    }
    
    public static void output(Histogram<String> histogram){
        new HistogramDisplay(histogram).execute();
    }
}