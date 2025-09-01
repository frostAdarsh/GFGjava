package Basic;
class Calculator{
    public int add(int x,int y){
        int r = x + y;
        return  r;
    }
}
public class Basicone {

    public static void main(String[] args) {

        int num1=4;
        int num2=5;

        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
//        int result = num1 + num2;
//        System.out.println(result);
        System.out.println(result);

    }

}


//Object Oriented Pro Programming
//Object -Properties and Behaviours

//Class