public class Triangulo {

    private int Lado1;
    private int Lado2;
    private int Lado3;

    public Triangulo(int lado1, int lado2, int lado3){
        this.Lado1 = lado1;
        this.Lado2 = lado2;
        this.Lado3 = lado3;

    }

    public int getLado1() {
        return Lado1;
    }

    public int getLado2() {
        return Lado2;
    }

    public int getLado3() {
        return Lado3;
    }

    public void setLado1(int lado1) {
        Lado1 = lado1;
    }

    public void setLado2(int lado2) {
        Lado2 = lado2;
    }

    public void setLado3(int lado3) {
        Lado3 = lado3;
    }
}
