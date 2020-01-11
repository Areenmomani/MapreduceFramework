import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class InputReader  {

    private Path inputFilePath;
    private List<String> lines = new ArrayList<String>();

    public InputReader (Path inputFilePath)
    {
        this.inputFilePath=inputFilePath;

    }
   private boolean isTextFile()
    {
       return inputFilePath.getFileName().toString().endsWith(".txt");
    }
   public List<String> readFile()
   {
       if(isTextFile()) {
           try {
               lines = Files.readAllLines(inputFilePath, StandardCharsets.UTF_8);
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
       else
       {
          //throws new  unmatchedfiletype;
       }
       return lines;
   }

}
