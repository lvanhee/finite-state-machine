package finitestatemachine.examples;

import java.util.HashMap;
import java.util.Map;

import finitestatemachine.Action;
import finitestatemachine.State;
import finitestatemachine.TransitionFunction;
import finitestatemachine.impl.StringActionImpl;
import finitestatemachine.impl.StringStateImpl;
import finitestatemachine.impl.TransitionFunctionMapImpl;

public class MinimalMain {
	
	public static void main(String args[])
	{
		Map<State, Map<Action, State>> map = new HashMap<>();
		State s0 = StringStateImpl.newInstance("s0");
		State s1 = StringStateImpl.newInstance("s1");
		
		Action stay = StringActionImpl.newInstance("stay");
		Action swap = StringActionImpl.newInstance("swap");
		
		map.put(s0, new HashMap<>());
		map.put(s1, new HashMap<>());
		map.get(s0).put(stay, s0);
		map.get(s0).put(swap, s1);
		map.get(s1).put(stay, s1);
		map.get(s1).put(swap, s0);
		
		TransitionFunction<State, Action> transition = TransitionFunctionMapImpl.newInstance(map);
		
		System.out.println("Action in:"+s0+" are "+transition.getAllowedActions(s0));
	}

}
