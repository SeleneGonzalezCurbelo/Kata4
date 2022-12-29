package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import model.Mail;

public class MailListReader {
    public static Queue<Mail> read(String fileName){
        Queue<Mail> queue = new LinkedList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            while(true){
                String line = reader.readLine();
                if (line == null) break;
                if(new Mail(line).isEmail()){
                    queue.offer(new Mail(line));
                }
            }
        }
        catch(FileNotFoundException exception){
            System.out.println("ERROR MailListReader::read (FileNotFoundException)" 
                    + exception.getMessage());
        }
        catch(IOException exception){
            System.out.println("ERROR MailListReader::read (IOException)" 
                    + exception.getMessage());
        }
        return queue;
    }
}