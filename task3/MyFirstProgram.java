class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(12, 3);
        System.out.println(o.Or());

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setNum1(i);
                o.setNum2(j);
                System.out.print(o.Or());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


class MySecondClass {
    private int num1;
    private int num2;
    MySecondClass(int uzernum1, int uzernum2) {
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