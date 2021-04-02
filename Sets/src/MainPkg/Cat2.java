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
	public boolean equals(Object o){
	Cat2 c = (Cat2) o;
	return this.name==c.name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int hash=1;
		return prime * hash + ((name == null) ? 0 : name.hashCode());
	}
	
	
	
	public static void main(String args[]) {
		Set<Cat2> cats = new HashSet<Cat2>();
		Cat2 fido = new Cat2("Fido");
		Cat2 phideaux = new Cat2("Phideaux");
		Cat2 fido2 = new Cat2("Fido");
		
		
		cats.add(fido);
		cats.add(phideaux);
		cats.add(fido2);
		System.out.println(cats);
		
		Set<Cat2> cats1 = new HashSet<Cat2>();
		Set<Cat2> cats2 = new HashSet<Cat2>();
		
		Cat2 lucy = new Cat2("Lucy");
		
		cats1.add(fido);
		cats1.add(phideaux);
		
		cats2.add(lucy);
		cats2.add(phideaux);
		
		Set<Cat2> allCats = new HashSet<Cat2>();
		allCats.addAll(cats1);
		allCats.addAll(cats2);
		
		System.out.println(allCats);
	}
	
	
}
