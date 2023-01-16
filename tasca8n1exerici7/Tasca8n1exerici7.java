package tasca8n1exerici7;

import java.util.ArrayList;
import java.util.Comparator;

public class Tasca8n1exerici7 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
			list.add("12");
			list.add("2340");
			list.add("435690");
			list.add("123456789");
			list.add("hello");
			list.add("abc");
			list.add("abcdef");
			list.add("printing");
		
		list.sort(Comparator.comparing(s->s.toString().length()).reversed());
		
		list.forEach(System.out::print);

	}

}
