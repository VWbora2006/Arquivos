class TesteAnimais {
    public static void main(String[] args) {
            Animal gato = new Gato();
            gato.locomover();
            gato.emitirSom();
            gato.locomover(10);
            gato.locomover("grama");

            Animal cachorro = new Cachorro();
            cachorro.locomover();
            cachorro.emitirSom();
            cachorro.locomover(15);
            cachorro.locomover("terra");

            Animal tartaruga = new Tartaruga();
            tartaruga.locomover();
            tartaruga.emitirSom();
            tartaruga.locomover(1);
            tartaruga.locomover("areia");

            Animal cobra = new Cobra();
            cobra.locomover();
            cobra.emitirSom();
            cobra.locomover(20);
            cobra.locomover("folhas");

            Animal pato = new Pato();
            pato.locomover();
            pato.emitirSom();
            pato.locomover(5);
            pato.locomover("lago");

            Animal pardal = new Pardal();
            pardal.locomover();
            pardal.emitirSom();
            pardal.locomover(25);
            pardal.locomover("céu");
        }
    }