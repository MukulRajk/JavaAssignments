

	/*
	 abstraction - process of identifying key attributes of an entity and ignoring rest of the attributes
	 
	 encapsulation - 
	 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Laptop implements Comparable<Laptop>{
		private int lid;
		private String make;
		private double cost;
		
		
		public Laptop(){   // default constructor
			lid=101;
			make="ASUS";
			cost=87400;
		}
		public Laptop(int lid,String make, double cost) { //parameterized constructor
		this.lid=lid;   //this -refere to laptop->private->lid
		this.make=make;
		this.cost=cost;
		
		
		}

		
		
		
		
		public void show() {
			System.out.println(lid+" "+make+" "+cost);
		}




// generate toString using IDE
		@Override
		public String toString() {
			return "Laptop [lid=" + lid + ", make=" + make + ", cost=" + cost + "] \n";
		}




// generate hashcode using IDE
		@Override
		public int hashCode() {
			return Objects.hash(cost, lid, make);
		}




// generate equals using IDE
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Laptop other = (Laptop) obj;
			return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && lid == other.lid
					&& Objects.equals(make, other.make);
		}
		@Override
		public int compareTo(Laptop o) {   //l1.compareTo(l2)
			if(this.cost<o.cost)
				return -1;
			else if(this.cost>o.cost)
				return 1;
			else
				return 0;	
		}
		public int getLid() {
			return lid;
		}
		
		
		


	}

class LaptopCompare implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		if(o1.getLid()<o2.getLid())
		return -1;
		else if (o1.getLid()>o2.getLid())
		return 1;
		else 
        return 0;			

	}
	
}

	public class test {

		public static void main(String[] args) {
			//for comparable
			Set<Laptop> set=new TreeSet<>();
			set.add(new Laptop(101,"Asus",70000));
			set.add(new Laptop(102,"HP",45000));
			set.add(new Laptop(103,"Dell",67700));
			
			
			System.out.println(set);
			System.out.println("\n ");
			//for Comparator
			List<Laptop> list=new ArrayList<>();
			list.add(new Laptop(101,"Asus",70000));
			list.add(new Laptop(102,"HP",45000));
			list.add(new Laptop(103,"Dell",67700));
			
			Collections.sort(list,new LaptopCompare());
			System.out.println(list);
			
		}


	}


