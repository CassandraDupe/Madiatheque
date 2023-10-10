package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
		/*for (Item i : items){
			i.accept(new CataloguePrinter());
		}*/
	}
	
	public void printOnlyBooks() {
		for (Item i :items){
			i.accept(new BookPrinter());
		}
	}

	public void printOnlyCDs() {
		for (Item i :items){
			i.accept(new CDsPrinter());
		}
	}
}
