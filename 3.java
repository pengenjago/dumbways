
public class Tiga {
	public static void main(String[] args) {
		bilang(6, 5);
	}

	static void bilang(int kolom, int baris) {
		int len = kolom * baris;
		int[] arr = new int[len];
		int flag2 = 0;

		prima: for (int i = 2; i <= 999; i++) {
			int flag = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) { 
				arr[flag2] = i;

				flag2 += 1;

				if (flag2 == len) {
					break prima;
				}
			}
		}
		
		int flag3 = 0;
		for (int a = 1; a <= baris; a++) {
			for (int b = 1; b <= kolom; b++) {
				System.out.print(arr[flag3] + ", ");
				
				flag3 += 1;
			}

			System.out.println();
		}
	}
}
