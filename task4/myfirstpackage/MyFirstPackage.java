package myfirstpackage;

public class MyFirstPackage { 
    private int num1;
    private int num2;
    
    public MyFirstPackage(int uzernum1, int uzernum2) {
        num1 = uzernum1;
        num2 = uzernum2;
    }

    public int getNum1() {
        return this.num1;
    }
    
    public int getNum2() {
        return this.num2;
    }
    
    public void setNum1(int num) {
        this.num1 = num;
    }

    public void setNum2(int num) {
        this.num2 = num;
    }

    public int Or() {
        return num1 ^ num2;
    }
}