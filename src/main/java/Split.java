import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Split {
	
	public List<String> split(List<String> inputContent) throws IOException{
		Utils.printBeautiful("SPLIT Phase Start");
		System.out.println("File to send contains "+inputContent.size()+" lines.");
		

		List<String> bloc = new ArrayList<String>();
		
		for (int k=0; k< inputContent.size(); k++){
			String line = inputContent.get(k);
			bloc.add(line);

			}

		System.out.println("Created "+bloc.size()+" splits to send.");
		return bloc;
	}
}
