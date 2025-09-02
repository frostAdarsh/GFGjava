package Basic;

public class OneClass {
    int a=10;
    String b = "Adarsh";
    void  Show(){
        System.out.println(a +" "+b);
    }
}


class  Test{

    public static void main(String[] args) {
        OneClass r = new OneClass();
        r.Show();
    }
}
