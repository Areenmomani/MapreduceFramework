import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//import main.Utils;

public class RemoveUnmatchedCharacters {

	public  List<String> removeCharacters(List<String> lines) throws IOException {

		List<String> lines_clean = new ArrayList<String>();
		for (String line : lines) {

				if (line.length() != 0) {

					lines_clean.add(line);

			}
		}
		return lines_clean;
	}
}
