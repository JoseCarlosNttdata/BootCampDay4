package programacion_funcional.carrito;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import java.util.stream.Collectors;

public class carritoCompra {

	public static void main(String[] args) {
		List<Product> shopping = List.of(
                new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
                new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
                new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
                new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
                new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
                new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
		
	    BigDecimal total = shopping.stream()
	            .map(product -> product.price.multiply(BigDecimal.valueOf(1 + (double) product.tax.percent / 100)))
	            .reduce(BigDecimal.ZERO, BigDecimal::add);
	
		System.out.println("Coste total con impuestos incluidos: " + total + "€");
		System.out.println("Coste total con impuestos incluidos: " + total.round(new MathContext(2)) + "€");
		
		List<String> productsFounds = shopping.stream()
		                             .filter(product -> product.name.startsWith("C"))
		                             .map(product -> product.name)
		                             .sorted()
		                             .collect(Collectors.toList());
		
		System.out.println("Productos que empiezan por C: " + String.join(", ", productsFounds));
		
	}
}
