package has_a_relationship;

public class Engine {
	int hp;
	int strokes;
	String type;
	Engine(){
		
	}
	Engine(int hp,int strokes,String type){
		this.hp=hp;
		this.strokes=strokes;
		this.type=type;
	}
	public void start() {
		System.out.println("Start the engine");
	}
	public void displayEngine() {
		System.out.println("Engine hp is : "+hp);
		System.out.println("Engine Strokes is : "+strokes);
		System.out.println("Engine type is : "+type);
		System.out.println("==============================");
	}
}
