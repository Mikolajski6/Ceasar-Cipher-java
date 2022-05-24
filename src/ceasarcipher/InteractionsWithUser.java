package ceasarcipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InteractionsWithUser {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static String fileName;

    {
        try {
            fileName = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String getFileName() {
        return fileName;
    }

}
