import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.TreeMap;

public class OutputWriter {
    private BufferedWriter bufferedWriter;
    private Path output;
    TreeMap<String,Integer> finalResult;
    public OutputWriter(Path outputFile,TreeMap<String,Integer> finalResult) throws IOException
    {
        bufferedWriter=new BufferedWriter(new FileWriter(outputFile.toFile()));
        this.output=outputFile;
        this.finalResult=finalResult;
    }
    public boolean checkIfFileIsExist()
    {
       return (output.toFile().exists());
    }
    public void write()
    {
        try
        {
        if(checkIfFileIsExist())
            finalResult.forEach((key, value) -> {
                try {
                    bufferedWriter.append(key.replaceAll("[0-9]*",""));
                    bufferedWriter.append(",");
                    bufferedWriter.append(value.toString());
                    bufferedWriter.append("\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        bufferedWriter.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


}
