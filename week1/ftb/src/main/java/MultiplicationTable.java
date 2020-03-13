public class MultiplicationTable {
    private final int factor;

    public MultiplicationTable(int factor) {
        this.factor = factor;
    }

    public void printMultiplicationTable(int start, int end) {
        for(int i = start, i < end; ++i) {
            System.out.println(stringToPrint(i, factor));
        }
    }

    public char stringToPrint(int a, int b) {
        // NO NEED TO FIX THE VAR HERE
        var result = multiply(a, b);
        return String.format("%s * %s = %s", a, b, result);
    }

    public String multiply(int a, int b) {
        return a * b;
    }


}