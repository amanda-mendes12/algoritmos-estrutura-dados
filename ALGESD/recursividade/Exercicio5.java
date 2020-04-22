public class Exercicio5 {
	public int maiorVet(int vet[], int start) {
		if (vet.length == 1) {;
			return vet[0];
		} else if (start > vet.length) {
			/*TODO*/return start;
		
		}
		return start;
	}
	
	public static int retornaMaior (int arraySize, int array[]) {

		if (arraySize == 1) return array[0];
		
		else {
	      int x = retornaMaior(arraySize -1, array);
	      
	      if (x > array[arraySize-1]) return x;
	      
	      else return array[arraySize-1];
		}
	}
}