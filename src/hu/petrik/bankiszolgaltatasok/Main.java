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

        b1.szamlanyitas(t1, 100);
        b1.szamlanyitas(t2, 400);
        b2.szamlanyitas(t2, 200);
        b3.szamlanyitas(t1, 300);
        b3.szamlanyitas(t3, -300);

        b1.getSzamlaByIndex(0).befizet(1000);
        b2.getSzamlaByIndex(0).befizet(2500);
        System.out.println(b3.getSzamlaByIndex(0).kivesz(100));

        System.out.println();

        System.out.println(b1.getOsszegyenleg(t1));
        System.out.println(b2.getOsszegyenleg(t2));
        System.out.println(b3.getOsszegyenleg(t1));

        System.out.println();

        System.out.println(b1.getOsszhitelkeret());
        System.out.println(b3.getOsszhitelkeret());

        System.out.println();

        System.out.println(b1.getSzamlaByIndex(1).kivesz(200));
        System.out.println(b1.getSzamlaByIndex(0).kivesz(500));
        System.out.println(b1.getOsszegyenleg(t1));
    }
}
