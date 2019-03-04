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
		int ind, di, dj, x, y;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				di = i * (siz - 1));
				dj = j * (siz - 1));
				ind = mas[di][dj]
				if (mas[di][dj] != 0) { 
					if (m[di][dj] == 1) {
						if (i == j) { 
							ind = ind + 1;
							x = (int)Math.ceil(ind / siz);
							y = ind - x * siz + siz;
							if (m[x][y] == 0) {
								m[x][y] = 5;
							} 
							ind = ind + siz - 1;
							x = (int)Math.ceil(ind / siz);
							y = ind - x * siz + siz;
							if (m[x][y] == 0) {
								m[x][y] = 5;
							} 
							ind = ind + 1;
							x = (int)Math.ceil(ind / siz);
							y = ind - x * siz + siz;
							if (m[x][y] == 0) {
								m[x][y] = 5;
							}
							
						} else if (i != j) { 
							ind = ind + 1;
							x = (int)Math.ceil(ind / siz);
							y = ind - x * siz + siz;
							if (m[x][y] == 0) {
								m[x][y] = 5;
							} 
							ind = ind + siz - 1;
							x = (int)Math.ceil(ind / siz);
							y = ind - x * siz + siz;
							if (m[x][y] == 0) {
								m[x][y] = 5;
							} 
							ind = ind + 1;
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
}




