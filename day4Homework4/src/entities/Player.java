package entities;

public class Player extends BaseClass {
	
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int birthYear;
	
	// About profile,
	private String nickname;
	private String email;
	
	// About game,
	private Game[] gameLibrary = new Game[10];
	private int counter;
	
	public Player(int id, String firstName, String lastName, String nickname, String email, String nationalityId, int birthYear) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.birthYear = birthYear;
		this.counter = 0;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void addToLibrary(Game game)
	{
		if(counter < 10)
		{
			System.out.println("Added to library successfully.");
			this.gameLibrary[this.counter] = game;
			counter++;
		}
		else
			System.out.println("The library is full.");
	}
	
	public Game[] getGameLibrary() {
		return gameLibrary;
	}
	
}
