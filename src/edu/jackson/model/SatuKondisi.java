package edu.jackson.model;

import java.util.HashSet;
import java.util.Set;

import edu.jackson.model.Customer;
import edu.jackson.model.Address;

public class SatuKondisi {

	public static void main(String[] args) {

		Customer cust = new Customer();
		Customer custmr = new Customer();
		
		cust.setName("Jono");
		cust.setAge(17);
		
		custmr.setName("Joni");
		custmr.setAge(17);
		
		Address rumahPribadiJono = new Address();
		rumahPribadiJono.setNamaJalan("Darma Putra");
		rumahPribadiJono.setNamaKomplek("Kostrad");
		rumahPribadiJono.setNoRumah(17);
		
		Address rumahIstriJono = new Address();
		rumahIstriJono.setNamaJalan("Darma Putra");
		rumahIstriJono.setNamaKomplek("Kostrad");
		rumahIstriJono.setNoRumah(17);
		
		Address rumahPribadiJoni = new Address();
		rumahPribadiJoni.setNamaJalan("Darma Putra");
		rumahPribadiJoni.setNamaKomplek("Kostrad");
		rumahPribadiJoni.setNoRumah(17);
		
		Address rumahIstriJoni = new Address();
		rumahIstriJoni.setNamaJalan("Darma Putra");
		rumahIstriJoni.setNamaKomplek("Kostrad");
		rumahIstriJoni.setNoRumah(17);
		
		Set<Address> koleksiRumahJonos = new HashSet<Address>();
		koleksiRumahJonos.add(rumahPribadiJono);
		koleksiRumahJonos.add(rumahIstriJono);
		cust.setAddresses(koleksiRumahJonos);
		
		Set<Address> koleksiRumahJonis = new HashSet<Address>();
		koleksiRumahJonis.add(rumahPribadiJoni);
		koleksiRumahJonis.add(rumahIstriJoni);
		custmr.setAddresses(koleksiRumahJonis);
		
		
		
	}

}
