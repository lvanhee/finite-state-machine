package finitestatemachine.impl;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

import finitestatemachine.Action;
import finitestatemachine.State;
import finitestatemachine.TransitionFunction;

public class TransitionFunctionMapImpl<S extends State, A extends Action> implements TransitionFunction<S, A> {
	
	private final Map<S, Map<A, S>> map;
	
	private TransitionFunctionMapImpl(Map<S, Map<A, S>> map) { this.map = map;}

	@Override
	public Set<A> getAllowedActions(S s) {return map.get(s).keySet();}

	@Override
	public S getConsequence(S s, A a) {return map.get(s).get(a);}

	@Override
	public Set<S> getPredecessors(S s) {throw new Error();}

	public static TransitionFunction<State, Action> newInstance(Map<State, Map<Action, State>> map) {return new TransitionFunctionMapImpl<>(map);}

}
