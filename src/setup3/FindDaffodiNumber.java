package setup3;

public class FindDaffodiNumber {

    public static void main(String[] args) {
        int a, b, c;
        for (int i = 100; i < 1000; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;
            if (i == (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3))) {
                System.out.println("水仙花数为：" + i);
            }
        }

/*		for(int i=1;i<10;i++){
			for(int j=0;j<10;j++){
				for(int k=0;k<10;k++){
					if((i*100+j*10+k*1)==(Math.pow(i, 3)+Math.pow(j, 3)+Math.pow(k, 3))){
						System.out.println("水仙花数为："+(i*100+j*10+k*1));
					}
				}
			}
		}	*/

    }
}