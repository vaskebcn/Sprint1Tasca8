package tasca8n1exerici1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tasca8n1exerici1 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		List<String> listaO = new ArrayList<String>();

		lista.add("Over");
		lista.add("Sound");
		lista.add("One");
		lista.add("Folder");
		lista.add("Thing");

		listaO = lista.stream().map(String::toLowerCase).filter(s->s.contains("o")).collect(Collectors.toList());
		
		System.out.println(listaO.toString());

	}

}
