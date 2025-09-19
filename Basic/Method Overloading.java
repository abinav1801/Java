class Calculator
{
    public int add(int num1 , int num2 , int num3)
    {
        return num1 + num2 + num3;
    }

    public double add(double num1 , int num2)
    {
        return num1 + num2;
    }

    public int add(int num1 , int num2)
    {
        return num1 + num2;
    }
}

class Demo{
    public static void main(String args[])
    {
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        double num4 = 20.5;
        Calculator calc = new Calculator();

        int result1 = calc.add(num1 , num2);
        System.out.println("The sum of two integers is: " + result1);
        int result2 = calc.add(num1 , num2 , num3);
        System.out.println("The sum of three integers is: " + result2);
        double result3 = calc.add(num4 , num2);
        System.out.println("The sum of a double and an integer is: " + result3);
        
    }
}