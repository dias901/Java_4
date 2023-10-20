package Main;

import Model.Exception.DomainException;

public class Conta {

	private Integer number;
	private String holder;
	private Double balance;
	private Double saque_limite;
	
	public Conta() {
		
	}
	
	public Conta(Integer number,String holder, Double balance, Double saque) {
		this.number=number;
		this.holder=holder;
		this.balance=balance;
		saque_limite=saque;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number){
		this.number=number;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getSaque_limite() {
		return saque_limite;
	}

	public void setSaque_limite(Double saque_limite) {
		this.saque_limite = saque_limite;
	}

	public void deposito(Double amount) {
		balance+=amount;
	}
	
	public void saque(Double amount) throws DomainException {
		if(amount>saque_limite) {
		throw new DomainException("Valor de saque atingiu o limite");
		}
		if(balance==0 || amount>balance) {
		throw new DomainException("Não existe Saldo suficiente em sua conta");
		}
		balance-=amount;
	}
}
