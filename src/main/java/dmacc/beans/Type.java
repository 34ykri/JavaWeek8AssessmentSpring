/**
 * 
 */
package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author akvang - Alexander Vang
 * CIS175 - Spring 2023
 * Feb 27, 2023
 */
@Embeddable
public class Type {
	private String type1;
	private String type2;
	public Type() {
		super();
		this.type1 = "Electric";
		this.type2 = "No Second Type";
		// TODO Auto-generated constructor stub
	}
	
	public Type(String type1) {
		super();
		this.type1 = type1;
		this.type2 = "No Second Type";
	}

	public Type(String type1, String type2) {
		super();
		this.type1 = type1;
		this.type2 = type2;
	}

	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2 = type2;
	}

	@Override
	public String toString() {
		return "Type [type1=" + type1 + ", type2=" + type2 + "]";
	}
	
}
