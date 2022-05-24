package ceasarcipher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderWriter {
    BufferedReader reader;
    {
        try {
            reader = new BufferedReader(new FileReader(InteractionsWithUser.getFileName()));    // getFileName z interactionswthuser
            while(reader.readLine() != null) {
                System.out.println(reader);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
