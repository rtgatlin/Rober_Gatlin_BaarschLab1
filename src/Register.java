import java.util.Scanner;

public class Register {

    public Purse makeChange(double amt) {
        var myPurse = new Purse();
        int hunCount = 0;
        int twenCount = 0;
        int fifCount = 0;
        int tenCount = 0;
        int fiveCount = 0;
        int oneCount = 0;
        int quarters=0, dimes=0, nickles=0, pennies=0;
        int intAmt = (int) amt;
        double decimal= amt - intAmt;

        while (amt > 100) {
            amt -= 100;
            hunCount++;
        }
        if(hunCount>0)
            myPurse.add(Denomination.hundreds, hunCount);
        while (amt > 50) {
            amt -= 50;
            fifCount++;
        }
        if(fifCount>0)
            myPurse.add(Denomination.fifties, fifCount);
        while (amt>20)
        {
            amt -= 20;
            twenCount++;
        }
        if(twenCount>0)
            myPurse.add(Denomination.twenties, twenCount);
        while(amt>10){
            amt -= 10;
            tenCount++;
        }
        if(tenCount>0)
            myPurse.add(Denomination.tens, tenCount);
        while(amt>5){
            amt -= 5;
            fiveCount++;
        }
        if(fiveCount>0)
            myPurse.add(Denomination.fives, fiveCount);
        while(amt>1)
        {
            amt -= 1;
            oneCount++;
        }
        if(oneCount>0)
            myPurse.add(Denomination.ones, oneCount);
        while(decimal>=.25){
            decimal -= .25;
            quarters++;
        }
        if(quarters>0)
            myPurse.add(Denomination.quarter, quarters);
        while(decimal>=.10){
            decimal -= .10;
            dimes++;
        }
        if(dimes>0)
            myPurse.add(Denomination.dime, dimes);
        while(decimal>=.05){
            decimal -= .05;
            nickles++;
        }
        if(nickles>0)
            myPurse.add(Denomination.nickel, nickles);
        while(decimal>=.01) {
            decimal -= .01;
            pennies++;
        }
        if(decimal<.01 && decimal>=.005){
            pennies++;
        }
        if(pennies>0)
            myPurse.add(Denomination.penny, pennies);

        return myPurse;
    }

    public static void main(String[]args){
        Register reg = new Register();
        var in = new Scanner(System.in);

        System.out.println("How much money do you have?");
        double money = in.nextDouble();


        System.out.println(reg.makeChange(money));
    }
}


