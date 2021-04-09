import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int opc = 0;
		boolean passou = false;
		int fileiras = 0, cadeiras = 0;
		float prInteira = 0; 
		int numCadeira=0, numFileira=0;
		char teatro[][] = new char[30][50];
		while (opc!= 99) {
			System.out.println("******** Menu Principal ******");
			System.out.println("[1] - Inicializar Variaveis ");
			System.out.println("[2] - Mapa do Teatro ");
			System.out.println("[3] - Venda de Lugares");
			System.out.println("[4] - Reserva de Lugares");
			System.out.println("[99] - Finalizar o programa");
			opc = ler.nextInt();
			if (opc!= 99){
				if ((opc == 1) && (passou == false)) {
					while (fileiras < 1 || fileiras >30) {
						System.out.println("Informe o número de linhas que estarao disponiveis: ");
						fileiras = ler.nextInt();
					}
					while (cadeiras < 1 || cadeiras > 50) {
						System.out.println("Informe o número de cadeiras por linha que estarao disponiveis: ");
						cadeiras = ler.nextInt();
					}
					System.out.println("Informe o preço do Ingresso inteiro: ");
					prInteira = ler.nextFloat();					
					passou = true;
					for(int f = 0; f < fileiras; f++) {
						for (int c = 0; c < cadeiras; c++) {
							teatro[c][f] = 'L';
						}
					}
				}
				else {
					if ((opc == 2) && (passou == true)) {
						for(int f = 0; f < fileiras; f++) {
							for (int c = 0; c < cadeiras; c++) {
								System.out.print(teatro[c][f] + " ");
							}
							System.out.println();
						} 
					}
					else {
						if((opc == 3) && (passou == true)) {
							System.out.println("Venda de Ingressos");
							System.out.print("Informe a fileira que deseja comprar: ");
							numFileira= ler.nextInt();
							System.out.print("Informe a cadeira que deseja comprar: ");
							numCadeira = ler.nextInt();
							teatro[numCadeira-1][numFileira-1] = 'V';
							//adicionar 1 a vendidas inteiras
							//adicionar prInteira ao total
						}
					}
				}
				
			}
			else {
				System.out.println("O programa vai ser encerrado...");
			}
		}
		
	}

}
