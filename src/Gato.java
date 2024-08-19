class Gato extends Mamifero {
    @Override
    public void locomover() {
        System.out.println("O gato caminha silenciosamente.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato mia.");
    }
}