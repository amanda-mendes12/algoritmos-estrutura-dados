import java.util.Arrays;

public class Select {

	public static void main(String[] args) {
		String vet[] = {"Amanda", "Gui", "Mari", "Joao"};
		System.out.println("\nAntes: " + Arrays.toString(vet));
		selectDebug(vet);
		System.out.println("Depois: " + Arrays.toString(vet)+"\n");
		int vet2[] = {0,-5,63,48,266,1};
		select(vet2);
		decrescente(vet2);
		select2(vet2);
	}
	
	public static int indiceMenorElemento(int vet[], int inicio) {
		int indMenor = inicio;
		for(int j=inicio+1; j<vet.length; j++){
           if(vet[j] < vet[indMenor])
              indMenor = j;
        }
		return indMenor;
	}
	
	public static void select2(int vet[]) {
		for(int i=0; i<vet.length-1; i++)
	       {
	          int indMenor = indiceMenorElemento(vet, i);
	          int aux = vet[i];
	          vet[i] = vet[indMenor];
	          vet[indMenor] = aux;
	       }
	       System.out.println("Ordenado pela seleção 2: " + Arrays.toString(vet));
	}
	
	public static void decrescente(int vet[])
    {
       for(int i=0; i<vet.length-1; i++)
       {
          int indMaior = i;
          for(int j=i+1; j<vet.length; j++)
          {
             if(vet[j] > vet[indMaior])
            	 indMaior = j;
          }
          int aux = vet[i];
          vet[i] = vet[indMaior];
          vet[indMaior] = aux;
       }
       System.out.println("Ordenado pela seleção decrescente: " + Arrays.toString(vet));
    }
	
	public static void select(int vet[])
    {
       for(int i=0; i<vet.length-1; i++)
       {
          int indMenor = i;
          for(int j=i+1; j<vet.length; j++)
          {
             if(vet[j] < vet[indMenor])
                indMenor = j;
          }
          int aux = vet[i];
          vet[i] = vet[indMenor];
          vet[indMenor] = aux;
       }
    }
	
	public static void select(String vet[])
    {
       for(int i=0; i<vet.length-1; i++)
       {
          int indMenor = i;
          for(int j=i+1; j<vet.length; j++)
          {
             if(vet[j].compareTo(vet[indMenor]) < 0)
                indMenor = j;
          }
          String aux = vet[i];
          vet[i] = vet[indMenor];
          vet[indMenor] = aux;
       }
    }
	
	public static void selectDebug(String vet[])
    {
       for(int i=0; i<vet.length-1; i++)
       {
          int indMenor = i;
          for(int j=i+1; j<vet.length; j++)
          {
             if(vet[j].compareTo(vet[indMenor]) < 0)
                indMenor = j;
          }
          String aux = vet[i];
          vet[i] = vet[indMenor];
          vet[indMenor] = aux;
          System.out.println("\tDEBUG: " + Arrays.toString(vet));
       }
    }

}