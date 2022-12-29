package main;

import java.util.Queue;

import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

import model.Mail;
import model.Histogram;

public class Kata4 {
        
    public static void main(String[] args) {       
        String fileName = "email.txt";
        input(fileName);   
    }
    
    public static void input(String fileName){
        process(MailListReader.read(fileName));
    }
    
    public static void process(Queue<Mail> mailList){
        output(MailHistogramBuilder.build(mailList));
    }
    
    public static void output(Histogram<String> histogram){
        new HistogramDisplay(histogram).execute();
    }
}