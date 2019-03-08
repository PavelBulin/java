/**
* Java Level 1. AI
*
*@author Pavel Bulin
*@version 03/04/2019 
*@link
*/
import java.util.*;

class AI {
		public static int[][] m;
		public static int[][] mas;

		
    public static void main(String[] args) {
		int di, dj, x, y, inv;
		double ind;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				inv = i * (-2) + 1;
				di = i * (siz - 1);
				dj = j * (siz - 1);
				ind = mas[di][dj];
				if (mas[di][dj] != 0) { 
					if (m[di][dj] == 1) {
						if (i == j) { 
							ind = ind + 1 * inv;
							x = (int)Math.ceil(ind / siz);
							y = (int)(ind - x * siz + siz);
							if (m[--x][--y] == 0) {
								m[x][y] = 5;
								break;
							} 
							ind = ind + (siz - 1) * inv;
							x = (int)Math.ceil(ind / siz);
							y = (int)(ind - x * siz + siz);
							if (m[--x][--y] == 0) {
								m[x][y] = 5;
								break;
							} 
							ind = ind + 1 * inv;
							x = (int)Math.ceil(ind / siz);
							y = (int)(ind - x * siz + siz);
							if (m[--x][--y] == 0) {
								m[x][y] = 5;
								break;
							}
							
						} else if (i != j) { 
							ind = ind - 1 * inv;
							x = (int)Math.ceil(ind / siz);
							y = (int)(ind - x * siz + siz);
							if (m[--x][--y] == 0) {
								m[x][y] = 5;
								break;
							} 
							ind = ind + (siz + 1) * inv;
							x = (int)Math.ceil(ind / siz);
							y = (int)(ind - x * siz + siz);
							if (m[--x][--y] == 0) {
								m[x][y] = 5;
								break;
							} 
							ind = ind - 1 * inv;
							x = (int)Math.ceil(ind / siz);
							y = (int)(ind - x * siz + siz);
							if (m[--x][--y] == 0) {
								m[x][y]
								= 5;
								break;
							}
						}
						mas[di][dj] = 0;
					}
				}
			}
		}
	}
}



