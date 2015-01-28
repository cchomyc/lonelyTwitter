package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class User extends Object implements UserLike {
	protected String name;
	//access modifiers: public, private,
	//protected (this class and any subclasses),
	//[none] (this package and any subclasses)

	public String getName() {
		return name;
	}

	public abstract void setName(String x) throws IOException;

	public User(String name) {
		super();
		this.name = name;
	}
	
	public User() {
		super();
		this.name = "?";
	}
}