package complete;

import java.util.Arrays;
import java.util.Collection;

import java.util.stream.Stream;

public class MyStreamApi {
	public static void main(String args[])
	{
		Stream<String> stream=Stream.empty();
		Collection<String> collections= Arrays.asList("a","b","c");
			
	for (String str:collections)
	{
		System.out.println(str);
	}
	
	Stream<String>
}
}