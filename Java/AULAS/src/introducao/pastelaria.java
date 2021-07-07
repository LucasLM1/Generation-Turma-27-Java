package introducao;

import java.util.Scanner;
public class pastelaria {

	public static void main(String[] args) {
	 Scanner leia = new Scanner (System.in);
				String nome;
				String sabores[] = {"QUEIJO", "PRESUNTO", "BANANA", "EDTUDO", "FRANGO" , "PIZZA", "PRESTIGIO", "CARNE", "ROMEUJULIETA", "CAMARAO"};
				String cod[] = {"G4-01", "G4-02", "G4-03", "G4-04", "G4-05", "G4-06", "G4-07", "G4-08", "G4-09", "G4-10" };
				int preco[] = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
				// String aux; 
				int estoque[] = new int[10];


				System.out.println("BEM VINDO A PASTELARIA DO ED+");
				final  int  LIMITE = 4 ;
				Sistema . para fora . println ( " Cadastro de notas " );
				for ( int x = 0 ; x < alunos . comprimento; x ++ ) {
					Sistema . para fora . println ( " Aluno " + (x + 1 ));
					matrícula [x] =   " MAT- " + (x + 1 );
					Sistema . para fora . print ( " Matrícula " + matrícula [x] + " alune " + alunos [x] . toUpperCase () + " : " );
					notas [x] = leia . nextInt ();
					
				}
				Sistema . para fora . println ( " BOLETIM " );
				para ( int x = 0 ; x < LIMITE ; x ++ ) {
					if (notas [x] > = 5 ) {
						Sistema . para fora . printf ( " % s -% s nota:% d APROVADO \ n " , matrícula [x], alunos [x] . toUpperCase (), notas [x]);
					} else {
						Sistema . para fora . printf ( " % s -% s nota:% d AINDA NAO, CONTINUAR ESTUDANDO !!! \ n " , matrícula [x], alunos [x] . toUpperCase (), notas [x]);
					}
					
				}
				
				Sistema . para fora . println ( " Escolha o aluno que deseja pesquisar a nota pela matrícula " );
				Sistema . para fora . println ( " Digite a matricula " );
				aux = leia . próximo () . toUpperCase ();
				
				para ( int x = 1 ; x < 4 ; x ++ ) {
					// if (matrícula [x] .equals (aux)) {
					if (matrícula [x] . igual (aux)) {
						if (notas [x] > = 5 ) {
							Sistema . para fora . printf ( " % s -% s nota:% d APROVADO \ n " , matrícula [x], alunos [x] . toUpperCase (), notas [x]);
						} else {
							Sistema . para fora . printf ( " % s -% s nota:% d AINDA NAO, CONTINUAR ESTUDANDO !!! \ n " , matrícula [x], alunos [x] . toUpperCase (), notas [x]);
						}
					}
				}
				
				
			}

		}
}
				
