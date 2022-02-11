package case1;

public class Residence  implements Housing{
	private int id;
	private String ilanNo;
	private String address;
	private double price;
	private double squareMeters;
	private int numberOfRooms;
	private int numberOfLivingRoom;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIlanNo() {
		return ilanNo;
	}
	public void setIlanNo(String ilanNo) {
		this.ilanNo = ilanNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSquareMeters() {
		return squareMeters;
	}
	public void setSquareMeters(double squareMeters) {
		this.squareMeters = squareMeters;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public int getNumberOfLivingRoom() {
		return numberOfLivingRoom;
	}
	public void setNumberOfLivingRoom(int numberOfLivingRoom) {
		this.numberOfLivingRoom = numberOfLivingRoom;
	}
	@Override
	public void printHousing() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getFilterHousing(int numberOfRooms, int numberOfLivingRoom) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getHousingPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getHousingSquareMeters() {
		// TODO Auto-generated method stub
		return 0;
	}
}
