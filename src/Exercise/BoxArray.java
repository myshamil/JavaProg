package Exercise;
//288~9
class Box2 {
	private String conts;
	Box2(String cont){
		this.conts = cont;
	}
	public String toString() {
		return conts;
	}
}
public class BoxArray {
	public static void main(String[] args) {
	Box2[] ar =new Box2[3];
	
	ar[0] = new Box2("First");
	ar[1] = new Box2("Second");
	ar[2] = new Box2("Third");
	
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	System.out.println(ar[2]);
	}

}
