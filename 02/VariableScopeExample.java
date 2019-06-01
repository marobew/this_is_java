public class VariableScopeExample {
    public static void main(String args[]) {
        int v1=15;
        if(v1>10) {
            int v2=v1-10;
        }
        // error
        int v3=v1+v2+5;
    }
}