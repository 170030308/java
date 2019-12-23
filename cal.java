class cal{
public static void main(String[] args){
System.out.println(calculator.powerInt(12,2));
System.out.println(calculator.powerDouble(12,3));
}
}
class calculator
{
static double powerInt(int num1,int num2)
{
  return Math.pow(num1,num2);
}
static double powerDouble(double num1,int num2)
{
    return Math.pow(num1,num2);
}
}