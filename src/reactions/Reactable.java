package reactions;

import java.util.ArrayList;

//peut etre une classe abstract c'est mieux
public abstract class Reactable {
	ArrayList<React> reactions;
	public abstract React reaction(React react);
}
