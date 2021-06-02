public class App {

public static void main(String[] args) 
{    
    Konto konto1 = new Konto();
    ausgabe("Konto1: " + Integer.toString(konto1.kontostand));
    ausgabe("Konto1, neu: " + (konto1.kontostandNew("konto1"))); 

    Konto konto2 = new Konto();
    ausgabe("Konto2: " + Integer.toString(konto1.kontostand));
    ausgabe("Konto2, neu: " + (konto2.kontostandNew("konto2"))); 

    Konto konto3 = new Konto();
    ausgabe("Konto3: " + Integer.toString(konto1.kontostand));
    ausgabe("Konto3, neu: " + (konto3.kontostandNew("konto3"))); 
}


public static void ausgabe(String outputStr) 
{
    System.out.println(outputStr);
}
    
}




