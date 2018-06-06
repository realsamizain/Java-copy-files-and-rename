import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;
 
public class copyFiles
{
    public static void main(String[] args) throws IOException
    {
        Path temp = Files.move
        (Paths.get("AhmedCV.pdf"), 
        Paths.get("D:\\445.pdf")); //copy and rename AhmedCv.pdf  and paste in D:\ Drive.
 
        if(temp != null) 
        {
            System.out.println("File renamed and moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }
    }
}