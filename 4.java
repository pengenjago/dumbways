import java.util.Arrays;

public class Empat {
	public static void main(String[] args) {
		String[] dataKey = {"out","stand","king","and"};
		String word = "outstanding";
		
		check(dataKey, word);
	}
	
	static void check(String[] array, String word) {
		for(int i = 0; i < array.length; i++) {
			if(word.indexOf(array[i]) != -1) {
				System.out.println(array[i] + " " + true);
			}else {
				System.out.println(array[i] + " " + false);
			}
		}
	}
}
