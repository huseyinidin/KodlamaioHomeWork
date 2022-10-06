package multiDimensionalArrayDemo;

public class Main {
	
	public static void main(String[] args) {

		String[][] citys = new String[3][3];

		citys[0][0] = "İzmir";
		citys[0][1] = "Aydın";
		citys[0][2] = "Manisa";
		citys[1][0] = "İstanbul";
		citys[1][1] = "Bursa";
		citys[1][2] = "Bilecik";
		citys[2][0] = "Ankara";
		citys[2][1] = "Konya";
		citys[2][2] = "Kırıkkale";

		for (int i = 0; i <= 2; i++) {
			System.out.println("-----------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(citys[i][j]);
			}
		}
	}

}
