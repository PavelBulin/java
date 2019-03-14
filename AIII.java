/**
* Java Level 1. AIII
*
*@author Pavel Bulin
*@version 03/14/2019 
*@link https://github.com/PavelBulin/java.git
*/
import java.util.*;

class AIII {
		public static int siz = 3;
		public static int[][] m;
		public static int[][] mas;

		
    public static void main(String[] args) {
		int di, dj, x, y, inv;
		double ind;
		
		for (int i = 1; i < siz - 1; i++) {
			for (int j = 1; j < siz - 1; j++) {
				if (mas[i][j] != 0) { 
					for (int k = 0; k < 2; k++) {
						inv = -k * 2 + 1;
						System.out.println("inv = " + inv);
						if (m[i][j] == 1) {
							System.out.println("mas[i][j] = " + mas[i][j]);
							ind = mas[i][j] - 1 * inv;
							System.out.println("ind = " + ind);
							x = (int)Math.ceil(ind / siz);
							y = (int)(ind - x * siz + siz);
							if (m[--x][--y] == 0) {
								m[x][y] = 5;
								break;
							} 
							ind = mas[i][j] - (siz - 1) * inv;
							x = (int)Math.ceil(ind / siz);
							y = (int)(ind - x * siz + siz);
							if (m[--x][--y] == 0) {
								m[x][y] = 5;
								break;
							} 
							ind = mas[i][j] - siz * inv;
							x = (int)Math.ceil(ind / siz);
							y = (int)(ind - x * siz + siz);
							if (m[--x][--y] == 0) {
								m[x][y] = 5;
								break;
							}
							ind = mas[i][j] - (siz + 1) * inv;
							x = (int)Math.ceil(ind / siz);
							y = (int)(ind - x * siz + siz);
							if (m[--x][--y] == 0) {
								m[x][y] = 5;
								break;
							}
						}
					}
					mas[i][j] = 0;
				}
			}
		}
	}
}	
			
			
			
			
			
			