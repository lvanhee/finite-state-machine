package finitestatemachine.impl;

import finitestatemachine.State;

public class StringStateImpl implements State {
	
	private final String s;

	public StringStateImpl(String string) {s = string;}
	
	public boolean equals(Object o){return ((StringStateImpl)o).s.equals(s);}
	
	public int hashCode(){return s.hashCode();}
	
	public String toString() {return s;};

	public static StringStateImpl newInstance(String string) {return new StringStateImpl(string);}
		
}
