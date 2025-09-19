class Calculator
{
    public int add(int num1 , int num2)
    {
        return num1 + num2;
    }
}

class Demo
{
    public static void main(String args[])
    {
        int num1 = 5;
        int num2 = 10;
        
        Calculator calc = new Calculator();

        int result = calc.add(num1 , num2);
        System.out.println("The sum is: " + result);
    }
}
