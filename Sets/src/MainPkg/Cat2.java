package MainPkg;

import java.util.HashSet;
import java.util.Set;

public class Cat2 {
	String name;
	
	
	
	public Cat2(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	@Override 
	public boolean equals(Cat2 o){
		if(this.name == o.name){
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		
	}
	
	public static void main(String args[]) {
		Set<Cat2> cats = new HashSet<Cat2>();
		Cat2 fido = new Cat2("Fido");
		Cat2 phideaux = new Cat2("Phideaux");
		Cat2 fido2 = new Cat2("Fido");
		
		cats.add(fido);
		cats.add(phideaux);
		cats.add(fido2);
	}
	
}
