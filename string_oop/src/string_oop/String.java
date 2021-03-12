package string_oop;


/**
 * Each instance of this class represents a sequence of text characters
 * 
 * @invar The length is nonnegative
 *    | toArray() != null
 *    
 * @immutable
 */
public class String {

	private char[] characters;
	/**
	 * Returns the sequence of characters represented by this object in an array.
	 * @inspect | this
	 * 
	 * @basic
	 */
	public char[] toArray() {return characters.clone();}

	/**
	 * Returns the length of the sequence of text characters represented by this object
	 * 
	 * @inspects | this
	 * @post | result == toArray().length
	 */
	public int length() {return characters.length;}

	/**
	 * Returns the character at the given index in the sequence of characters represented by this object.
	 * 
	 * @pre | 0 <= index && index < length()
	 * @post | result == toArray()[index]
	 */
	public char charAt(int index) {return characters[index];}
	//not returning a reference to the character, so no point in making a copy in charAt method. 
	//We are just returning a char value

	//We make it into private because it is immutable class
	private String(char[] characters) {
		this.characters = characters;
	}
	/**
	 * Returns a String object that represents the given sequence of characters
	 * 
	 * @inspects | characters
	 * The method should inspect the argument object!  
	 * @pre | characters != null
	 * 
	 */
	//When have a factory method in our API, we do need a constructor to construct the object
	public static String valueOf(char[] characters) {
//		String con = new String(characters.clone());
//		return con;
		return new String(characters.clone());
	}
	
	/**
	 * @pre | other != null
	 */
	public String concatenate(String other) {
		char[] newCharacters = new char[characters.length + other.characters.length];
		System.arraycopy(characters, 0, newCharacters, 0, characters.length);
		System.arraycopy(other.characters, 0, newCharacters, characters.length, other.characters.length);
		return new String(newCharacters);
	}
	
	
}
//Representation exposure!!!
