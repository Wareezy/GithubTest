public class Jody {

    private String name;
    private int A, B;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    @Override
    public String toString() {
        return "Calculate{" + "name=" + name + ", A=" + A + ", B=" + B + '}';
    }

}
