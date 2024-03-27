package Arithmetic;

public class Arithmetic<X extends Number, Y extends Number> {
    X num1;
    Y num2;
    public Arithmetic(X num1, Y num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public Number add(){
        Number sum = num1.doubleValue() + num2.doubleValue();
        if(sum.doubleValue() % 1 == 0){
            return sum.longValue();
        }else return sum.doubleValue();
    }
    public Number subtract(){
        Number sum = num1.doubleValue() - num2.doubleValue();
        if(sum.doubleValue() % 1 == 0){
            return sum.longValue();
        }else return sum.doubleValue();
    }
    public Number multiply(){
        Number sum = num1.doubleValue() * num2.doubleValue();
        if(sum.doubleValue() % 1 == 0){
            return sum.longValue();
        }else return sum.doubleValue();
    }

    public Number divide(){
        Number sum = 0.0;
        try{
            sum = num1.doubleValue() / num2.doubleValue();
        }catch(IllegalArgumentException e){
            System.out.println("Cannot divide " + num1.doubleValue() + "by zero");
        }
        if(sum.doubleValue() % 1 == 0){
            return sum.longValue();
        }else return sum.doubleValue();
    }

    public Number getMin(){
        Number min;
        if(num1.longValue() < num2.longValue()) min = num1;
        else min = num2;
        if(min.doubleValue() % 1 == 0){
            return min.longValue();
        }else return min.doubleValue();
    }

    public Number getMax(){
        Number max;
        if(num1.longValue() > num2.longValue()) max = num1;
        else max = num2;
        if(max.doubleValue() % 1 == 0){
            return max.longValue();
        }else return max.doubleValue();
    }
}