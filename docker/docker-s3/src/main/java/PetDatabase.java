
public interface PetDatabase {
	
	String getOwner(String petName);
	
	void setOwner(String petName, String ownerName);

}
