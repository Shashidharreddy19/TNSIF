package Abstractions;

public class abstractdemo {

	public static void main(String[] args) {
		square sq = new square(8);
		sq.calArea();
		sq.show();
		rectangle r = new rectangle(9,3);
		r.calArea();
		r.show();
	}

}
