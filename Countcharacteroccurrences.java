import java.util.Map;
import java.util.stream.Collectors;


public class Main
{
	public static void main(String[] args) {
		String s = "banana";
		Map<Character, Long> map =
		    s.chars()
		    .mapToObj(c -> (char) c)
		    .collect(Collectors.groupingBy(
		                 c -> c,
		                 Collectors.counting()
		             ));
		 System.out.println(map);
	}
}
