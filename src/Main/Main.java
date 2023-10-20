package Main;

import java.util.Scanner;

import Model.Exception.DomainException;

public class Main {
	
	public static void main(String[] args) {
		metodo();
	}
	public static void metodo() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Insira dados da conta");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("identidade: ");
			String nome = sc.nextLine();
			System.out.print("Saldo inicial: ");
			Double balance = sc.nextDouble();
			System.out.print("Limite de saque: ");
			Double saque = sc.nextDouble();
			Conta cc = new Conta(number,nome,balance,saque);
			
			System.out.print("\nInsira quantidade para sacar: ");
			Double amount = sc.nextDouble();
			cc.saque(amount);
			System.out.println("Novo Saldo: "+cc.getBalance());
			}catch(DomainException e) {
			System.out.println(e.getMessage());
			}
			catch(RuntimeException e){
				System.out.println("Digite um valor acertivo");
			}
			sc.close();
		}
}
