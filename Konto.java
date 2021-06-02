public class Konto {
    
    public int kontostand = 10000;
    

    public String kontostandNew(String calculate) {
        switch (calculate) 
        {
            case "konto1":
                return Integer.toString(this.kontostand * 2); 
            case "konto2":
                return Integer.toString(this.kontostand * 3); 
            case "konto3":
                return Integer.toString(this.kontostand * 10); 
            default:
                return "error"; 
        }
    }
}


