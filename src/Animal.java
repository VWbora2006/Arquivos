abstract class Animal {

    public abstract void locomover();
    public abstract void emitirSom();


    public void locomover(int velocidade) {
        System.out.println("Movendo-se a " + velocidade + " km/h");
    }

    public void locomover(String terreno) {
        System.out.println("Movendo-se no terreno " + terreno);
    }
}
