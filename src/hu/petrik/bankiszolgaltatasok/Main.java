package hu.petrik.bankiszolgaltatasok;

public class Main {

    public static void main(String[] args) {
        Teszt();
    }

    public static void Teszt() {
        Tulajdonos t1 = new Tulajdonos("Teszt Elek");
        Tulajdonos t2 = new Tulajdonos("Gipsz Jakab");
        Tulajdonos t3 = new Tulajdonos("Valaki Neve");
        Bank b1 = new Bank(3);
        Bank b2 = new Bank(5);
        Bank b3 = new Bank(10);
    }
}
