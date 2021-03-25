package Git1;

import java.util.ArrayList;
import java.util.List;

public class Git1Main {

	public static void main(String[] args) {
		
		List list = new ArrayList<String>();

		list.add("Hola");
		list.add("Mundo");
		list.add("Modificado");
		list.add("Para segundo");
		list.add("Commit");
		
		list.stream().forEach(System.out::println);
		
		System.out.println("Hola Mundo desde Sysout");
		
	}

}
