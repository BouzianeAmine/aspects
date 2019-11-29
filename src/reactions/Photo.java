package reactions;

import java.util.ArrayList;

public class Photo extends Reactable implements Published<Photo>{
	String url="";
	ArrayList<React> reactions;
	public Photo(String url) {
		this.url=url;
		this.reactions=new ArrayList<React>();
	}
	@Override
	public React reaction(React react) {
		// TODO Auto-generated method stub
		this.reactions.add(react);
		return react;
	}

	@Override
	public Photo value() {
		// TODO Auto-generated method stub
		return null;
	}

}
