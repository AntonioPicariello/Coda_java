public class Main
{
	public static void main(String[] args) {
		
        Coda coda = new Coda();
        int valore;

        System.out.printf("E'vuota? %s\n", coda.èVuota() ? "SI" : "NO");
        coda.stampa();
        System.out.println();

        
        coda.mettiInCoda(10);
        
        System.out.printf("E'vuota? %s\n", coda.èVuota() ? "SI" : "NO");
        coda.stampa();
        System.out.println();

        
        coda.mettiInCoda(20);
        
        System.out.printf("E' vuota? %s\n", coda.èVuota() ? "SI" : "NO");
        coda.stampa();
        System.out.println();

       
        coda.mettiInCoda(30);
      
        System.out.printf("E'vuota? %s\n", coda.èVuota() ? "SI" : "NO");
        coda.stampa();
        System.out.println();

       
        coda.mettiInCoda(40);
        
        System.out.printf("E'vuota? %s\n", coda.èVuota() ? "SI" : "NO");
        coda.stampa();
        System.out.println();

       
        if (!coda.èVuota()) {
            valore = coda.RimuoviDaCoda();
            System.out.printf("Elemento: %d\n", valore);
        }
        
        
        System.out.printf("E'vuota? %s\n", coda.èVuota() ? "SI" : "NO");
        coda.stampa();
        System.out.println();

        
        if (!coda.èVuota()) {
            valore = coda.RimuoviDaCoda();
            System.out.printf("Elemento: %d\n", valore);
        }
       
        System.out.printf("E'vuota? %s\n", coda.èVuota() ? "SI" : "NO");
        coda.stampa();
        System.out.println();
	}
}
