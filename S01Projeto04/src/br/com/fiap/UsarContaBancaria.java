package br.com.fiap;

public class UsarContaBancaria {
    public static void main(String[] args) {
        Person person = new Person("Raphael Splinter", "12312312344");
        ContaBancaria contaBancaria = new ContaBancaria("0001", "123456", person);

        System.out.println(contaBancaria);

        contaBancaria.depositar(150.0);
        contaBancaria.depositar(400.0);
        contaBancaria.sacar(12.75);

        System.out.println(contaBancaria);

        contaBancaria.mostrarSaldo();
    }
}
