import edu.jsu.mcis.*;
public class Squirrel {
	Parser p;
	
	public Squirrel() {
		p = new Parser();
	}
	
	public static void main(String[] args){
		Squirrel squirrel = new Squirrel();
		String[] names = {"length", "width", "height"};
		String[] type = {"type", "box"};
		String[] values = {"--type", "ellipsoid", "--digits", "1", "7", "3", "2"};
		squirrel.p.addOptionalArgument(type);
		squirrel.p.parseValues(values);
		
	}
}
