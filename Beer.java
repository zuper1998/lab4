package lab4;

import java.io.Serializable;
import java.util.Comparator;

public class Beer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1947800562682242165L;
	/**
	 * 
	 */
	String name = new String();
	String style = new String();
	String str = new String();

	public Beer() {
		// TODO Auto-generated constructor stub
	}

	public Beer(String s1, String s2, String s3) {
		name = s1;
		style = s2;
		str = s3;
	}

	public void kiir() {
		System.out.println(name + " " + style + " " + str);
	}

	static Comparator<Beer> NameComp() {
		return new Comparator<Beer>() {

			public int compare(Beer o1, Beer o2) {
				return o1.name.compareTo(o2.name);
			}

		};

	}

	static Comparator<Beer> styleComp() {
		return new Comparator<Beer>() {

			public int compare(Beer o1, Beer o2) {
				return o1.style.compareTo(o2.style);
			}

		};
	}

	static Comparator<Beer> strComp() {
		return new Comparator<Beer>() {

			public int compare(Beer o1, Beer o2) {

				return Integer.parseInt(o1.str) - Integer.parseInt(o2.str);
			}

		};
	}
}
