class Coda {
    private Nodo head;
    private Nodo inCoda;
    private int counter;

    public Coda() {
        this.head = null;
        this.inCoda = null;
        this.counter = 0;
    }

    public boolean èVuota() {
        return this.counter == 0;
    }

    public int dimensioneCoda() {
        return this.counter;
    }

    public void stampa(){
        Nodo current = this.head;

        System.out.printf("[%d] ", this.dimensioneCoda());

        while (current != null) {
            System.out.printf("%d --> ", current.val);
            current = current.next;
        }
        System.out.printf("NULL\n");
    }

    public void mettiInCoda(int val){
        Nodo temp = new Nodo(val);

        this.counter++;

        if (this.head == null) {
            this.head = temp;
        } else {
            this.inCoda.next = temp;
        }

        this.inCoda = temp;
    }

    
    public int RimuoviDaCoda(){
        int valore;

        valore = this.head.val;

        this.head = this.head.next;

        if (this.head == null) {
            this.inCoda = null;
        }

        this.counter--;

        return valore;
    }
}