package string_oop.stringlists;

import java.util.Arrays;

import string_oop.String;

/**
 * Each instance of this class stores a sequence of strings.
 *
 */
public class StringList {

	/**
	 * @invar | elements != null
	 * @invar Elements of the elements should not be null at the same time
	 *        | Arrays.stream(elements).allMatch(e -> e != null)
	 *        
	 * @representationObject
	 */
	private String[] elements;
	
	public String[] getElements() {return elements.clone();}
	
	public String getConcatenation() {
		String[] elements = getElements();
		String result = String.valueOf(new char[0]);
		for (String element : elements) {
			result = result.concatenate(element);
		}
		return result;
	}
	
	public StringList(String[] elements) {this.elements = elements.clone();}
}


//clone: if not: allow the client to break the mutability;  
//allow the client to break the representation invariants of a mutable class;
//allow 
