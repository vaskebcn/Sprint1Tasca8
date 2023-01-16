package tasca8n1exerici8;

public class Tasca8n1exerici8 {

	public static void main(String[] args) {
		
		String word = "programing";
		
		FuncionalInterface f = s -> new StringBuilder(s).reverse().toString();
		
		System.out.println(f.reverse(word));

	}

}
