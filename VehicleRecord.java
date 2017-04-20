/**
 * 
 */

/**
 * @author 769578
 *
 */
public class VehicleRecord {
	private String make;
	private String model;
	private int year;
	private char vehicleType;
	
	/**
	 * 
	 */
	public VehicleRecord() {
		this.make = "";
		this.model = "";
		this.year = 0;
		this.vehicleType = 0;
	}

	public final String getMake() {
		return make;
	}

	public final void setMake(String make) {
		this.make = make;
	}

	public final String getModel() {
		return model;
	}

	public final void setModel(String model) {
		this.model = model;
	}

	public final int getYear() {
		return year;
	}

	public final void setYear(int year) {
		this.year = year;
	}

	public final char getVehicleType() {
		return vehicleType;
	}

	public final void setVehicleType(char vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public void processRecord (String record) {
		String[] word;
		word = record.split(",");
		this.make = word[0];
		this.model = word[1];
		this.year = Integer.parseInt(word[2]);
		this.vehicleType = word[3].charAt(0);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
