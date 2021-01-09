package finitestatemachine;

import java.util.Set;

public interface TransitionFunction<S extends State, A extends Action> {
	Set<A> getAllowedActions(S state);

	S getConsequence(S s, A a);

	Set<S> getPredecessors(S s);
}
