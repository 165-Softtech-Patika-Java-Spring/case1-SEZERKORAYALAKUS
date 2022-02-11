package case1;

public class Cottage extends Residence {
	public Cottage() {
	}

	public Cottage(int id, String ilanNo, String address, double price, double squareMeters, int numberOfRooms,
			int numberOfLivingRoom) {
		setId(id);
		setIlanNo(ilanNo);
		setAddress(address);
		setPrice(price);
		setSquareMeters(squareMeters);
		setNumberOfRooms(numberOfRooms);
		setNumberOfLivingRoom(numberOfLivingRoom);
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
		
	}
	@Override
	public void getFilterHousing(int numberOfRooms, int numberOfLivingRoom) {
		if(this.getNumberOfLivingRoom() == numberOfLivingRoom && this.getNumberOfRooms() == numberOfRooms)
			this.printHousing();
		
	}
}
