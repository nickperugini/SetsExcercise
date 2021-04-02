package MainPkg;

import java.util.HashSet;
import java.util.Set;

public class Cat1 {

	String name;
	
	
	
	public Cat1(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	public static void main(String args[]) {
		Set<Cat1> cats = new HashSet<Cat1>();
		Cat1 fido = new Cat1("Fido");
		Cat1 phideaux = new Cat1("Phideaux");
		Cat1 fido2 = new Cat1("Fido");
		
		cats.add(fido);
		cats.add(phideaux);
		cats.add(fido2);
		System.out.println(cats);
	}
	
}