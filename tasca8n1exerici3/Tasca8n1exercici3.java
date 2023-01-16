package tasca8n1exerici3;

import java.util.ArrayList;

public class Tasca8n1exercici3 {
	
	public static void main(String[] args) {
		ArrayList<String> month = new ArrayList<String>();
		
		month.add("January");
		month.add("February");
		month.add("March");
		month.add("April");
		month.add("May");
		month.add("June");
		month.add("July");
		month.add("August");
		month.add("September");
		month.add("October");
		month.add("November");
		month.add("December");

		month.forEach(s->System.out.println(s));
		
	}

}
