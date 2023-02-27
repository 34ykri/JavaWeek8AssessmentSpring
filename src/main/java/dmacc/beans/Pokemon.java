/**
 * 
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author akvang - Alexander Vang
 * CIS175 - Spring 2023
 * Feb 27, 2023
 */
@Entity
public class Pokemon {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String nickname;
	private int level;
	@Autowired
	private Type type;
	public Pokemon() {
		super();
		this.name = "Pikachu";
		this.level = 5;
		this.nickname = "No Nickname";
		// TODO Auto-generated constructor stub
	}
	
	public Pokemon(String name) {
		super();
		this.name = name;
	}

	public Pokemon(String name, String nickname, int level) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.level = level;
	}

	public Pokemon(int id, String name, String nickname, int level) {
		super();
		this.id = id;
		this.name = name;
		this.nickname = nickname;
		this.level = level;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + ", nickname=" + nickname + ", level=" + level + ", type=" + type
				+ "]";
	}

}
