import java.nio.file.Path;

public class Config {
    public Path inputFilePath;
    public Path outputFilePath;
    int numOfMapperNodes;
    int numOfReducerNodes;
  public  Class Mapper;
    Class Reducer;
    Config()
    { }
    public void setInputLocation(Path inputPath){
        this.inputFilePath = inputPath;
    }
    public void setOutputFilePath(Path outputFilePath){this.outputFilePath=outputFilePath;}
    public void setMapperClass(Class<? extends IMapper> theClass){this.Mapper=theClass;}
    public void setReducerClass(Class<? extends IReducer> theClass){this.Reducer=theClass;}

    public void setNumOfMapperNodes(int numOfMapperNodes) {
        this.numOfMapperNodes = numOfMapperNodes;
    }

    public void setNumOfReducerNodes(int numOfReducerNodes) {
        this.numOfReducerNodes = numOfReducerNodes;
    }
    public void execute()   {
        ExecutingController executingController =new ExecutingController(inputFilePath,outputFilePath);
    }


}
