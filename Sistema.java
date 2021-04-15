import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in); //leia do portugol
		int opc = 0; //menu de escolhas
		boolean passou = false; //obrigar o cliente a abrir o teatro
		int fileiras = 0, cadeiras = 0;
		float prInteira = 0; //preço do ingresso inteiro
		int numCadeira=0, numFileira=0; 
		char teatro[][] = new char[30][50]; // tamanho total do teatro
		while (opc!= 99) {
			System.out.println("******** Menu Principal ******");
			System.out.println("[1] - Inicializar Variaveis ");
			System.out.println("[2] - Mapa do Teatro ");
			System.out.println("[3] - Venda de Lugares");
			System.out.println("[4] - Reserva de Lugares");
			System.out.println("[5] - Reserva de Lugares");
			System.out.println("[6] - Devolver Lugares");
			System.out.println("[7] - Verificar Vendas");
			System.out.println("[8] - Encerrar Vendas");
			
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
							teatro[f][c] = 'L';
						}
					}
				}
				else {
					if ((opc == 2) && (passou == true)) {
						for(int f = 0; f < fileiras; f++) {
							for (int c = 0; c < cadeiras; c++) {
								System.out.print(teatro[f][c] + " ");
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
							teatro[numFileira-1][numCadeira-1] = 'V';
							//adicionar 1 a vendidas inteiras
							//adicionar prInteira ao total
						}
						else {
							if ((opc == 8) && (passou == true)){
								System.out.println("Realizando o encerramento do teatro..." );
								passou = false;
								fileiras = 0;
								cadeiras = 0;
							}
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
