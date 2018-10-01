package lab4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Huto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1200589124344641127L;
	private ArrayList<Beer> sordoboz = new ArrayList<Beer>();

	public Huto() {
		// TODO Auto-generated constructor stub
	}

	public void add(String s1, String s2, String s3) {
		Beer beer = new Beer(s1, s2, s3);
		sordoboz.add(beer);
	}

	public void list() {
		for (int i = 0; i < sordoboz.size(); i++) {
			sordoboz.get(i).kiir();

		}
	}

	public void list(String s1) {

		if (s1.equals("name")) {
			Collections.sort(sordoboz, Beer.NameComp());
		} else if (s1.equals("style")) {
			Collections.sort(sordoboz, Beer.styleComp());

		} else if (s1.equals("str")) {
			Collections.sort(sordoboz, Beer.strComp());

		}
		for (int i = 0; i < sordoboz.size(); i++) {
			sordoboz.get(i).kiir();

		}

	}

	public  void save(String s1){
		try {
			FileOutputStream f = new FileOutputStream(s1);
			ObjectOutputStream of= new ObjectOutputStream(f);
			of.writeObject(sordoboz);
			of.close();
			
			
		} catch (IOException ex){
			
		}
	}
	
	public  void load(String s1){
		try {
			FileInputStream f = new FileInputStream(s1);
			ObjectInputStream of= new ObjectInputStream(f);
			sordoboz = (ArrayList<Beer>) of.readObject();
			of.close();
			
			
		} catch (IOException ex){
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
	}
}
