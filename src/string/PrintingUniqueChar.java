package string;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintingUniqueChar {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	Map<String, Long>map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	for(Map.Entry<String, Long> entry:map.entrySet()) {
		if(entry.getValue()==1)
		System.out.print(entry.getKey());
		
	}
}
}

