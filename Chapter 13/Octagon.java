/*
Author: Dylan Bartlett
Date: 3/20/19





*/

public class Octagon extends AbstractGeometricObject implements Cloneable, Comparable<Octagon> {
		
		private double side;
		
		public Octagon() {
			super();
			this.side = 1;
		}
		
		public Octagon(double s) {
			super();
			this.side = s;
			
		}
		
		
		public double getArea() {
			double area = (2 + (4 / Math.sqrt(2))) * side * side;
			return area;
		}
		
		public double getPerimeter() {
			double perimeter = (side * 8);
			return perimeter;
		}
		
		@Override
		public Object clone() {
			//shallow copy
			//return super.clone();
			try {
			// deep copy
			Octagon copy = (Octagon)super.clone();
			copy.side = this.side;
				return copy;
			}
			catch (CloneNotSupportedException ex){
				return null;
			}
		}
		
		@Override
		public int compareTo(Octagon o){
			if (this.side > o.side) {
				return 1;
			}
			else if (this.side == o.side) {
				return 0;
			}
			else {
				return -1;
			}
		}
}