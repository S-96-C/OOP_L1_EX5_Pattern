public class Main {
	public static void main(String[] args){

		int N= 5;
		for(int i=1; i<=N; i++){
			for(int j=1; j<=N; j++){
				
				System.out.print("*");
			}
			System.out.println("\n");
		}

    for(int i = 0; i < 5; i++){
			for(int a = 0; a < 5 - i; a++){
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++){
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
}