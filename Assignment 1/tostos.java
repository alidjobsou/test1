public class Main {
    int m;
    static  int n;
    public Main(int m){
       this.m= m;

    }
    public void display(){
        int y =20;
        n=5;
        System.out.println(y);
        System.out.println(m);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Main m = new Main(10);
        m.display();
    }
}