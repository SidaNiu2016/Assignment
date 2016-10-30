import java.util.Calendar;

public class Dog extends Pet implements Boardable {
	private String size;
	private Calendar star;
	private Calendar end;

	Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size = size;
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

	public String getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "DOG:\n" + super.toString() + "Size: " + getSize();
	}

}
