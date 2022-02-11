package case1;

import java.util.ArrayList;
import java.util.List;

public class testHousing {

	public static void main(String[] args) {
		HousingMenager houseManager = new HousingMenager();
		HousingMenager villaManager = new HousingMenager();
		HousingMenager cottageManager = new HousingMenager();
		HousingMenager housingManager = new HousingMenager();
		
		//Evler ile ilgili veriler burada tanýmlandý.
		List<House> houses = new ArrayList<House>();
		houses.add(new House(1, "ilan1", "Istanbul", 450000, 95, 2, 1));
		houses.add(new House(2, "ilan2", "Kocaeli", 550000, 105, 2, 1));
		houses.add(new House(3, "ilan3", "Zonguldak", 350000, 115, 3, 1));
		
		
		for(House house: houses) {
			houseManager.addHousingElement(house);//sadece evler için
			housingManager.addHousingElement(house);//tüm konutlar için
		}
		
		List<Villa> villas = new ArrayList<Villa>();
		villas.add(new Villa(4, "ilan4", "Istanbul", 450000, 95, 2, 1, "2"));
		villas.add(new Villa(5, "ilan5", "Kocaeli", 550000, 105, 2, 1, "3"));
		villas.add(new Villa(6, "ilan6", "Zonguldak", 350000, 115, 3, 1, "2"));
		
		for(Villa villa: villas) {
			villaManager.addHousingElement(villa);
			housingManager.addHousingElement(villa);
		}
		
		List<Cottage> cottages = new ArrayList<Cottage>();
		cottages.add(new Cottage(7, "ilan7", "Istanbul", 450000, 95, 2, 1));
		cottages.add(new Cottage(8, "ilan8", "Kocaeli", 550000, 105, 2, 1));
		cottages.add(new Cottage(9, "ilan9", "Zonguldak", 350000, 115, 3, 1));
		
		for(Cottage cottage: cottages) {
			cottageManager.addHousingElement(cottage);
			housingManager.addHousingElement(cottage);
		}
		
		printIt("Konutlarýn", housingManager);
		printIt("Evlerin", houseManager);
		printIt("Villalarýn", villaManager);
		printIt("Yazlýklarýn", cottageManager);
	}
	
	public static void printIt(String type, HousingMenager housingManager) {
		System.out.println("------------------------------------------------");
		System.out.println(type + " Toplam Deðeri: " + housingManager.getHousingListTotalPrice());
		System.out.println(type + " Ortalama Metre Karesi: " + housingManager.getHousingListTotalSquareMeters());
		System.out.println("\n\nTüm " + type.substring(0, type.length() - 2));
		housingManager.printHousingList();
		System.out.println("\n\n2 Oda - 1 Salon olan Tüm " + type.substring(0, type.length() - 2));
		housingManager.getFilterHousingList(2, 1);
	}

}
