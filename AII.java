/**
* Java Level 1. AII
*
*@author Pavel Bulin
*@version 03/22/2019 
*@link https://github.com/PavelBulin/java.git
*/
import java.util.*;

class AII {
		public static int siz = 3;
		public static int[][] m;
		public static int[][] mas;

		
    public static void main(String[] args) {
		int di, dj, x, y, inv, var;
		double ind;
		
		for (int i = 0; i < 2; i++) {
			di = i * (siz - 1);
			for (int j = 1; j < siz - 1; j++) {
				var = siz;
				if (mas[di][j] != 0) { 
					for (int k = 0; k < 2; k++) {
						inv = -i * 2 + 1;
						var = (var == 1)? siz : 1;
						if (m[di][j] == 1) {
							ind = mas[di][j] - siz/siz * var * inv;
							x = (int)ceil(ind / siz);
							y = (int)(ind - x * siz + siz);
							if (m[--x][--y] == 0) {
								m[x][y] = 5;
								mas[di][j] = 0;
								break;
							} 
							ind = mas[di][j] + siz/siz * var * inv;
							x = (int)ceil(ind / siz);
							y = (int)(ind - x * siz + siz);
							if (m[--x][--y] == 0) {
								m[x][y] = 5;
								mas[di][j] = 0;
								break;
							} 
							ind = mas[di][j] + siz/var * inv;
							x = (int)ceil(ind / siz);
							y = (int)(ind - x * siz + siz);
							if (m[--x][--y] == 0) {
								m[x][y] = 5;
								mas[di][j] = 0;
								break;
							}
						}
						di = j ^ di;
						j = di ^ j;
						di = j ^ di;
					}
				}
			}
		}
	}
}