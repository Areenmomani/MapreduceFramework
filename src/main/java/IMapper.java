import java.util.Collection;
import java.util.List;

public interface IMapper {
    public Collection<Pair<String, String>> map (List<String> splittedLines);

}
