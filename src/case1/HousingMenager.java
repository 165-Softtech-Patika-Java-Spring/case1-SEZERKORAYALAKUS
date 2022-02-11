package case1;

import java.util.ArrayList;
import java.util.List;

public class HousingMenager {
	private List<Housing> housings = new ArrayList<Housing>();

	public HousingMenager() {
		
	}
	
	//toplu eklemeye çalýþýrken listin tipi(housing) sorun yaratýyor.
	/*public void addHousingElements(List<Housing> housings) {
		for(Housing housing: housings) {
			this.housings.add(housing);
		}
	}*/
	
	public void addHousingElement(Housing housing) {
		this.housings.add(housing);
	}
	
	public void printHousingList() {
		for(Housing housing: housings) {
			housing.printHousing();
		}
	}
	
	public void getFilterHousingList(int numberOfRooms, int numberOfLivingRoom) {
		for(Housing housing: housings) {
			housing.getFilterHousing(numberOfRooms, numberOfLivingRoom);
		}
	}
	
	public double getHousingListTotalPrice() {
		double result = 0;
		for(Housing housing: housings) {
			result += housing.getHousingPrice();
		}
		
		return result;
	}
	
	public double getHousingListTotalSquareMeters() {
		double result = 0;
		for(Housing housing: housings) {
			result += housing.getHousingSquareMeters();
		}
		
		result /= housings.size();
		
		return result;
	}
}
