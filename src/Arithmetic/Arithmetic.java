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
        return longify(sum);        //helper method
    }
    public Number subtract(){
        Number difference = num1.doubleValue() - num2.doubleValue();
        return longify(difference);
    }
    public Number multiply(){
        Number product = num1.doubleValue() * num2.doubleValue();
        return longify(product);
    }

    public Number divide(){
        Number quotient = 0.0;
        try{
            quotient = num1.doubleValue() / num2.doubleValue();
        }catch(IllegalArgumentException e){
            System.out.println("Cannot divide " + num1.doubleValue() + "by zero");
        }
        return longify(quotient);
    }

    public Number getMin(){
        Number min;
        if(num1.doubleValue() < num2.doubleValue()) min = num1;
        else min = num2;
        return longify(min);
    }

    public Number getMax(){
        Number max;
        if(num1.doubleValue() > num2.doubleValue()) max = num1;
        else max = num2;
        return longify(max);
    }

    private Number longify(Number num){ //if has no decimal point, make into long
        if(num.doubleValue() % 1 == 0){
            return num.longValue();
        }else return num.doubleValue();
    }
}