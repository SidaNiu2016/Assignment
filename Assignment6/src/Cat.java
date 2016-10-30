import java.util.Calendar;

public class Cat extends Pet implements Boardable {
	private String hairLength;
	private Calendar star = Calendar.getInstance();
	private Calendar end = Calendar.getInstance();

	Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		star.set(year, month-1, day);
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		end.set(year, month-1, day);
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		Calendar board = Calendar.getInstance();
		board.set(year, month-1, day);
		
		return board.after(star) && board.before(end);
	}

	public String getHairLength() {
		return hairLength;
	}

	@Override
	public String toString() {
		return "CAT:\n" + super.toString() + "Hair: " + getHairLength();
	}

}
