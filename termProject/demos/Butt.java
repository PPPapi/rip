import edu.jsu.mcis.*;
public class Butt {
	Parser p;
	public Butt(){
		p = new Parser();
	}
	
	public static void main(String[] args){
		Butt butt = new Butt();
		String[] names = {"length", "width", "height"};
		String[] type = {"type", "box"};
		String[] digits = {"digits", "4"};
		String[] values = {"--type", "ellipsoid", "7", "3", "--digits", "1", "2"};
		butt.p.addArguments(names);
		butt.p.addOptionalArgument(type);
		butt.p.addOptionalArgument(digits);
		String fuck = "--type";
		String temp = fuck.replace("-", "");
		System.out.println(temp);
		System.out.println(butt.p.getOptionalArgumentsList());
		
		butt.p.parseValues(values);
	}
}