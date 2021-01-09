package finitestatemachine.impl;

import finitestatemachine.Action;

public class StringActionImpl implements Action{

	private final String string;
	private StringActionImpl(String string) {
		this.string = string;
	}

	public static StringActionImpl newInstance(String string) {
		return new StringActionImpl(string);
	}
	
	public String toString()
	{
		return string;
	}
	
	public boolean equals(Object o)
	{
		return ((StringActionImpl)o).string.equals(string);
	}
	public int hashCode()
	{
		return string.hashCode();
	}

}
