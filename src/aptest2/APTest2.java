/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Hailey.Jones
 */
public class APTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a website's URL.");
        String web = scan.next();

        try {
            URL url = new URL(web);

            InputStream inputStream = url.openStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            int count = 0;

            while ((line = bufferedReader.readLine()) != null) {

                for (int i = 0; i < line.length(); i++) {
                    int ascii = line.charAt(i);

                    if (ascii == 97) {
                        count = count + 1;
                    }
                }
            }    
            System.out.println(count);
            
        } catch (MalformedURLException ex) {
            System.out.println("MalformedURLException");
        }
    }

}
