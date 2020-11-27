package net.codejava.networking;
 
import java.io.File;
import java.io.IOException;
import java.util.List;
 
/**
 * This program demonstrates a usage of the MultipartUtility class.
 * @author www.codejava.net
 *
 */
public class MultipartFileUploader {
 
    public static void main(String[] args) {
        String charset = "UTF-8";
        File uploadFile1 = new File("/directory/of/attach");
        String requestURL = "https://localhost8080/teste";
        String apiKey = "apiKey";
        String userEmail = "userEmail";
 
        try {
            MultipartUtility multipart = new MultipartUtility(requestURL, charset, apiKey, userEmail);
             
            multipart.addFilePart("file", uploadFile1);
 
            List<String> response = multipart.finish();
             
            System.out.println("SERVER REPLIED:");
             
            for (String line : response) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}