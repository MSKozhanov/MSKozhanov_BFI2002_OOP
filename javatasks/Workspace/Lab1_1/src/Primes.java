
public class Primes {

	// �������� �� ��, �������� �� ����� �������
	public static boolean isPrime(int n){
		
		for (int i = 2; i < n; i++){
			
			if ((n%i)==0) {
				return false;
			}
			
		}
		return true;
	}

	
	// ����� ������� �����
	public static void main(String[] args) {
		for(int i=2; i<=100; i++) {
			if(isPrime(i) == true)
				System.out.println(i); 
		}
	}

}
