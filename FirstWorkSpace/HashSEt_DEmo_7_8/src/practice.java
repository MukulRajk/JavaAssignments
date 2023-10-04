

	/*
	 abstraction - process of identifying key attributes of an entity and ignoring rest of the attributes
	 
	 encapsulation - 
	 */

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Laptop{
		private int lid;
		private String make;
		private double cost;
		
		
		public int getLid() {
			return lid;
		}
		public void setLid(int lid) {
			this.lid = lid;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}
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
		
		
		


	}


	public class practice {

		public static void main(String[] args) {
			
			Set<Laptop> set=new HashSet<>();
			set.add(new Laptop(101,"Asus",70000));
			set.add(new Laptop(102,"HP",45000));
			set.add(new Laptop(103,"Dell",67700));
			set.add(new Laptop(102,"HP",45000));
			set.add(new Laptop(102,"HP",45000));
			//set.add(new Laptop.getLid(),Laptop.getMake(),Laptop.getCost() ));
			//set.add(Laptop(int lid,String make, double cost));
			System.out.println(set);
		}


	}


