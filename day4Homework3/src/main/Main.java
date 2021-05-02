package main;


import concrete.BaseCustomerManager;
import concrete.ExampleCheckManager;
import concrete.TestCheckManager;
import concrete.StarbucksCustomerManager;
import entities.*;

public class Main {

	public static void main(String[] args) {
		
		Customer musteri1 = new Customer();
		musteri1.nationalitId = "12345678910";
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new ExampleCheckManager());
		customerManager.save(musteri1);

	}

}
