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
	public int length() {return characters.clone().length;}
	
	/**
	 * Returns the character at the given index in the sequence of characters represented by this object.
	 * 
	 * @pre | 0 <= index && index < length()
	 * @post | result == toArray()[index]
	 */
	public char charAt(int index) {return characters.clone()[index];}
	
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
		return new String(characters.clone());
}

}
//representation exposure!!!
