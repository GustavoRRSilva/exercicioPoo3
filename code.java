/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Digite o tipo de IQA :");
	    int IQA = scan.nextInt();
	    String classificacaoAr = calculoClassficacao(IQA);
	    String efeito = calculoEfeito(IQA);
	    System.out.printf("A classificacao do ar é: %s\nO efeito para a população e: %s", classificacaoAr, efeito);
	}
	static String calculoClassficacao(int IQA){
	    if(IQA < 50){
	        return "Boa";
	    }
	    else if(IQA > 50 & IQA < 101){
	        return "Regular";
	    }
	    else if(IQA > 100 && IQA < 200){
	        return "Inadequada";
	    }
	    else if(IQA > 199 && IQA < 300){
	        return "Má";
	    }
	    else if(IQA > 299 && IQA < 400){
	        return "Péssima";
	    }
	    else{
	        return "Crítica";
	    }
	}
	static String calculoEfeito(int IQA){
	    if(IQA < 101){
	        return "Ausência de sintomas";
	    }
	    else if(IQA > 100 && IQA < 200){
	        return "Leve agravamento dos sintomas de pessoas suspectíveis";
	    }
	    else if(IQA > 199 && IQA < 300){
	        return "Decréscimo de resistência física e significativo agravamento";
	    }
	    else if(IQA > 299 && IQA < 400){
	        return "Aparecimento prematuro de certas doenças";
	    }
	    else{
	        return "Morte prematura";
	    }
	}
}

