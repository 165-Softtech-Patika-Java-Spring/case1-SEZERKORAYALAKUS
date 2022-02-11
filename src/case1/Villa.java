package case1;

public class Villa extends Residence {
	
	private String numberOfFloor;
	
	public String getNumberOfFloor() {
		return numberOfFloor;
	}

	public void setNumberOfFloor(String numberOfFloor) {
		this.numberOfFloor = numberOfFloor;
	}

	public Villa() {
	}

	public Villa(int id, String ilanNo, String address, double price, double squareMeters, int numberOfRooms,
			int numberOfLivingRoom, String numberOfFloor) {
		setId(id);
		setIlanNo(ilanNo);
		setAddress(address);
		setPrice(price);
		setSquareMeters(squareMeters);
		setNumberOfRooms(numberOfRooms);
		setNumberOfLivingRoom(numberOfLivingRoom);
		this.numberOfFloor = numberOfFloor;
	}
	@Override
	public double getHousingPrice() {
		return getPrice();
	}
	@Override
	public double getHousingSquareMeters() {
		return getSquareMeters();
	}
	
	@Override
	public void printHousing() {
		System.out.println("**********************************");
		
		System.out.println("�lan No: " + getIlanNo());
		System.out.println("Adres: " + getAddress());
		System.out.println("Fiyat�: " + getPrice());
		System.out.println("Metre Karesi: " + getSquareMeters());
		System.out.println("Oda Say�s�: " + getNumberOfRooms());
		System.out.println("Oturma Odas� Say�s�: " + getNumberOfLivingRoom());
		System.out.println("Kat Say�s�: " + numberOfFloor);
	}
	@Override
	public void getFilterHousing(int numberOfRooms, int numberOfLivingRoom) {
		if(this.getNumberOfLivingRoom() == numberOfLivingRoom && this.getNumberOfRooms() == numberOfRooms)
			this.printHousing();
		
	}
}
