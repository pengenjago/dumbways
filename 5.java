
public class Lima {
	public static void main(String[] args) {
		drawLine("MAGER");
	}
	
	static void drawLine(String data) {
		int tab = 0;
		for(int i = 0; i < data.length(); i++) {
			for(int j = 0; j < tab; j++) {
				System.out.print("\t");
			}
			
			System.out.println(data.charAt(i));
			
			tab += 1;
		}
	}
}
