/**
* Java Level 1. AII
*
*@author Pavel Bulin
*@version 03/05/2019 
*@link https://github.com/PavelBulin/java.git
*/
import java.util.*;

class AII {
		public static int[][] m;
		public static int[][] mas;

		
    public static void main(String[] args) {
		int ind, di, dj, x, y, siz, inv;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j < (siz - 1) - 1; j++) {
				inv = i * (-2) + 1;
				di = i * (siz - 1));
				ind = mas[di][j];
				if (mas[di][j] != 0) { 
					if (m[di][j] == 1) {
						ind = mas[di][j] - 1;
						x = (int)Math.ceil(ind / siz);
						y = ind - x * siz + siz;
						if (m[x][y] == 0) {
							m[x][y] = 5;
						} 
						ind = mas[di][j] + 1;
						x = (int)Math.ceil(ind / siz);
						y = ind - x * siz + siz;
						if (m[x][y] == 0) {
							m[x][y] = 5;
						} 
						ind = mas[di][j] + siz;
						x = (int)Math.ceil(ind / siz);
						y = ind - x * siz + siz;
						if (m[x][y] == 0) {
							m[x][y] = 5;
						}
						mas[di][j] = 0;
					}
				}
			}
		}
		
		for (int j = 0; j < 2; j++) {
			for (int i = 1; i < (siz - 1) - 1; i++) {
				inv = j * (-2) + 1;
				dj = i * (siz - 1));
				ind = mas[i][dj];
				if (mas[i][dj] != 0) { 
					if (m[i][dj] == 1) {
						ind = mas[i][dj] - siz;
						x = (int)Math.ceil(ind / siz);
						y = ind - x * siz + siz;
						if (m[x][y] == 0) {
							m[x][y] = 5;
						} 
						ind = mas[di][j] + siz;
						x = (int)Math.ceil(ind / siz);
						y = ind - x * siz + siz;
						if (m[x][y] == 0) {
							m[x][y] = 5;
						} 
						ind = mas[di][j] + 1;
						x = (int)Math.ceil(ind / siz);
						y = ind - x * siz + siz;
						if (m[x][y] == 0) {
							m[x][y] = 5;
						}
					}
					mas[di][dj] = 0;
				}
			}
		}
	}
}





