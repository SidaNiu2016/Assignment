import java.util.List;

public class AnimalHospital {
	List<Pet> petList;

	public AnimalHospital(String inputFile) {

	}

	public void printPetInfoByName(String name) {
		for (Pet p : petList) {
			if (p.getPetName().equals(name)) {
				System.out.println(p.toString());
			}
		}
	}

	public void printPetInfoByOwner(String name) {
		for (Pet p : petList) {
			if (p.getOwnerName().equals(name)) {
				System.out.println(p.toString());
			}
		}
	}

	public void printPetsBoarding(int month, int day, int year) {
		for (Pet p : petList) {
			if (p instanceof Boardable) {
				if (((Boardable) p).boarding(month, day, year)) {
					System.out.println(p.toString());
				}
			}
		}

	}

}
