package Exercise;

public class MainPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d = new Doctor();
		d.doMedicine();
		
		Doctor.doMedicine();
		GeneralPractitioner.doMedicine();
		
		Surgeon.doMedicine();
		GeneralPractitioner.makeHousecall();
		Surgeon.performSurgery();

	}

}
