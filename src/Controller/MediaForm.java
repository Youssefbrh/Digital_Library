package Controller;

import Model.Media;

import javax.swing.*;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class MediaForm extends javax.swing.JFrame{

    private JList list1;

    public static void main(String[] args) {
        List<Media> Medias = readBooksFromCSV("Media.txt");
    }

    private static List<Media> readBooksFromCSV(String fileName) { List<Media> books = new ArrayList<>(); Path pathToFile = Paths.get(fileName);
        // create an instance of BufferedReader
        // using try with resource,
        // Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
        {  //read the first line from the text file
            String line = br.readLine();
            // loop until all lines are read
            while (line != null) {
            // use string.split to load a string array with the values from
            // each line of // the file, using a comma as the delimiter
             String[] attributes = line.split(",");
             Media media = new Media(attributes);
            // adding book into ArrayList
                books.add(media);
            // read next line before looping //
            // if end of file reached, line would be null
             line = br.readLine(); } }
            catch (IOException ioe) { ioe.printStackTrace(); }
             return books; }
    private static Media createBook(String[] metadata)
       { String name = metadata[0];
         String author = metadata[1];
         String description = metadata[2];
         int score = Integer.parseInt(metadata[3]);
         int copies = Integer.parseInt(metadata[4]);
         return new Media(name,author,description,score,copies);
       }




}
