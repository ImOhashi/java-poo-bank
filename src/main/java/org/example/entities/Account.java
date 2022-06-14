package org.example.entities;

public class Account {

    public Account(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    private String name;
    private final String cpf;
    private Double money = 0.0;

    public void deposit(Double value) {
        if (value > 0) {
            this.money += value;
            System.out.println("R$ " + value + " depositado com sucesso!");
        } else {
            System.out.println("Valor menor ou igual a zero, impossível realizar operação!");
        }
    }

    public Double withdrawMoney(Double value) {
        if (value > 0 && value <= this.money) {
            System.out.println("R$ " + value + " retirado com sucesso!");
            this.money -= value;
            return value;
        }

        System.out.println("Valor solicitado inválido!");
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getMoney() {
        return money;
    }


}
