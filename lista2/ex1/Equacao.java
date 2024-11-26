package lista2.ex1;

public class Equacao {
    private Double a;
    private Double b;
    private Double c;

    public Equacao(){}

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double delta(){
        return Math.pow(this.b, 2) - (4 * this.a * this.c); // delta = b^2 - 4ac
    }

    public Double retornaX1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return ((-1) * this.b + Math.sqrt(this.delta()))/(2*this.a); // (-b + √Δ)/2a = x'
    }

    public Double retornaX2(){
        return ((-1) * this.b - Math.sqrt(this.delta()))/(2*this.a); // (-b + √Δ)/2a = x''
    }
}
