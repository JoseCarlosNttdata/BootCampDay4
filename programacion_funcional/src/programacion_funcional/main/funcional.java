package programacion_funcional.main;

import java.util.List;
import java.util.stream.Collectors;

public class funcional {

	public static void main(String[] args) {
        List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

        List<Integer> listaMedia = numbers.stream()
            .filter(number -> number > 10)
            .collect(Collectors.toList());

        System.out.println("Números pares: " + listaMedia);

	}

}
