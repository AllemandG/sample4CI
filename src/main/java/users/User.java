package users;

public class User {
	
	private static Long idGenerator = 1L;
	private final Long id;

	private String lastName;

	private String firstName;
	
	public User() {
		this.id = User.idGenerator++;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Long getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		User user = (User) o;

		return id.equals(user.id);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName;
	}
}
