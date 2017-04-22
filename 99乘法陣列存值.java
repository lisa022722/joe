package week5;

public class array {

	public static void main(String[] args) {
		
		int a[][]=new int [9][9];
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				a[i-1][j-1]=i*j;
				System.out.print(i+"*"+j+"="+a[i-1][j-1]+"\t");
			}
			System.out.print("\n");
		}
	}

}
