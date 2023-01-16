package tasca8n1exerici2;

import java.util.ArrayList;
import java.util.List;

public class Tasca8n1exerici2 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		List<String> listaO = new ArrayList<String>();

		lista.add("Over");
		lista.add("Sound");
		lista.add("One");
		lista.add("Folder");
		lista.add("Thing");
		
		lista.stream().map(t -> t.toLowerCase()).filter(t->t.contains("o")).filter(t->t.length()>5)
																		.forEach(t->listaO.add(t));
		
		System.out.println(listaO.toString());
		
		

	}

}
