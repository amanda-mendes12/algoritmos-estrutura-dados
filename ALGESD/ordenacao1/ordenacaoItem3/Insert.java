import java.util.Arrays;

public class Insercao {

	public static void main(String[] args) {
		String vet[] = {"Daniel", "Marcos", "Ana", "Bia"};
		System.out.println("Antes: " + Arrays.toString(vet));
		insertDebug(vet);
		System.out.println("Depois: " + Arrays.toString(vet));
		int vet2[] = {0,-5,63,48,266,1};
		insert(vet2);
		System.out.println("Crescente: " + Arrays.toString(vet2));
		insertDecresc(vet2);
		System.out.println("Decrescente: " + Arrays.toString(vet2));
		
	}
	
	public static void insert(int vet[])
    {
       for(int i=1; i<vet.length; i++)
       {
          int aux = vet[i];
          int j = i-1;        
          while(j>=0 && vet[j]>aux)
          {
             vet[j+1] = vet[j];
             j--;
          }
          vet[j+1] = aux;
       }
    }
	
	public static void insertDecresc(int vet[])
    {
       for(int i=1; i<vet.length; i++)
       {
          int aux = vet[i];
          int j = i-1;        
          while(j>=0 && vet[j]<aux)
          {
             vet[j+1] = vet[j];
             j--;
          }
          vet[j+1] = aux;
       }
    }
	
	public static void insertString(String vet[])
    {
       for(int i=1; i<vet.length; i++)
       {
          String aux = vet[i];
          int j = i-1;        
          while(j>=0 && vet[j].compareTo(aux) > 0)
          {
             vet[j+1] = vet[j];
             j--;
          }
          vet[j+1] = aux;
          
       }
    }
	
	public static void insertDebug(String vet[])
    {
       for(int i=1; i<vet.length; i++)
       {
          String aux = vet[i];
          int j = i-1;        
          while(j>=0 && vet[j].compareTo(aux) > 0)
          {
             vet[j+1] = vet[j];
             System.out.println("DEBUG: " + Arrays.toString(vet));
             j--;
          }
          vet[j+1] = aux;
       }
    }

}