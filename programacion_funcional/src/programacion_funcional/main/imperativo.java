package programacion_funcional.main;

import java.util.ArrayList;
import java.util.List;

public class imperativo {

	public static void main(String[] args) {
        List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
        List<Integer> listaMedia = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > 10) {
            	listaMedia.add(number);
            }
        }
        System.out.println("Números pares: " + listaMedia);
	}

}
