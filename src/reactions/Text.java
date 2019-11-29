package reactions;

import java.util.ArrayList;

public class Text extends Reactable implements Published<String> {
	String value;
	ArrayList<React> reactions;
	
	public Text(String value) {
		this.value=value;
		reactions=new ArrayList<React>();
	}
	@Override
	public React reaction(React react) {
		// TODO Auto-generated method stub
		reactions.add(react);
		return react;
	}

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return value;
	}

}
