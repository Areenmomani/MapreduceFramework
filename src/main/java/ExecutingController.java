import javafx.util.Pair;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class ExecutingController {
    private Path input;
    private Path output;
    private long startStepTime;
    private long totalTime;
    List<String> Readlines = new ArrayList<>();
    List<String> prepared = new ArrayList<>();
    List<String> splitLines = new ArrayList<>();
    Collection<Pair<String, String>> mapped = new ArrayList<>();
    HashMap<String, ArrayList> shuffled = new HashMap<>();
    TreeMap<String, Integer> reduced = new TreeMap<>();

    ExecutingController(Path input, Path output) {
        this.input = input;
        this.output = output;
        init();
    }

    public void init() {
        //Read file
        startStepTime = System.currentTimeMillis();
        InputReader inputReader = new InputReader(input);
        Readlines = new ArrayList<>();
        Readlines = inputReader.readFile();
        Utils.printDiffTime(startStepTime);


        //removeUnmatchedCharacters & Split
        RemoveUnmatchedCharacters removeUnmatchedCharacters = new RemoveUnmatchedCharacters();
        try {
            prepared = removeUnmatchedCharacters.removeCharacters(Readlines);

        } catch (IOException e) {
            e.printStackTrace();
        }
        startStepTime = System.currentTimeMillis();
        Split split = new Split();
        try {
            splitLines = split.split(prepared);
            Utils.printDiffTime(startStepTime);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //mapper
        Utils.printBeautiful("Mapper phase start");
        startStepTime = System.currentTimeMillis();
        Config config =new Config();

        Utils.printDiffTime(startStepTime);


        //shuffling
        startStepTime = System.currentTimeMillis();
        Shuffling shuffling = new Shuffling();
        shuffled.putAll(shuffling.shuffle(mapped));
        Utils.printDiffTime(startStepTime);


        //Reduce
        Utils.printBeautiful("Reduce phase start");
        startStepTime = System.currentTimeMillis();

        Utils.printDiffTime(startStepTime);


        //Output
        Utils.printBeautiful("Write on Output file ");
        startStepTime = System.currentTimeMillis();
        try {
            OutputWriter outputWriter = new OutputWriter(output, reduced);
            outputWriter.write();
            Utils.printDiffTime(startStepTime);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}



