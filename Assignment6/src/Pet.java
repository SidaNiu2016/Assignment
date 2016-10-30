
public class Pet {

	private String name;
	private String ownerName;
	private String color;
	protected int sex;

	public static final int MALE = 0, FEMALE = 1, SPAYED = 2, NEUTERED = 3;

	Pet(String name, String ownerName, String color) {
		this.name = name;
		this.ownerName = ownerName;
		this.color = color;
	}

	public String getPetName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getColor() {
		return color;
	}

	public void setSex(int sexid) {
		if (sexid < 0 || sexid > 3) {
			System.out.println(
					"Please input valid number for sex ->  " + "MALE = 0, FEMALE = 1, SPAYED = 2, NEUTERED = 3");
		}

		sex = sexid;
	}

	public String getSex() {
		if (sex == MALE) {
			return "MALE";
		}
		if (sex == FEMALE) {
			return "FEMALE";
		}
		if (sex == SPAYED) {
			return "SPAYED";
		}
		if (sex == NEUTERED) {
			return "NEUTERED";
		}
		return "";
	}

	@Override
	public String toString() {
		return name + " owned by " + ownerName + "\nColor: " + color + "\nSex: " + getSex();
	}

}
