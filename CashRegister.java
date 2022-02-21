/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cash.register;

import java.util.Scanner;

/**
 *
 * @author tasmintaylor
 */
public class CashRegister {

    /**
     * @param args the command line arguments
     */
    enum Type
{
Cash,
DebitCard,
CreditCard,
Check
  
}
  
  
public static void main(String args[])
{
double price=0,total=0,afterpayment=0;
double change=0;
Scanner sc=new Scanner(System.in);
  
Type cardType = null;
System.out.println("Transaction listing the items and asking for payment : ");
System.out.println("Item 1 : apple : 0.5");
System.out.println("Item 1 : pear : 0.75");
System.out.println("Item 1 : pineapple : 0.75");
total=0.5+0.75+0.75;
System.out.println("Total "+total);
System.out.println("Please enter payment type : 1. Cash\n2. Debit Card\n3. Credit Card\n4. Check");
int i=sc.nextInt();
switch(i)
{
case 1:
{
System.out.println("Enter the amount to pay with this type .");
price=sc.nextDouble();
cardType=Type.Cash;
afterpayment=total-price;
change=price-total;
System.out.println("Total after payment : "+afterpayment);
break;
}
case 2:
{
System.out.println("Enter the amount to pay with this type .");
price=sc.nextDouble();
cardType=Type.DebitCard;
afterpayment=total-price;
change=price-total;
  
System.out.println("Total after payment : "+afterpayment);
break;
}
case 3:
{
System.out.println("Enter the amount to pay with this type .");
price=sc.nextDouble();
cardType=Type.CreditCard;
afterpayment=total-price;
change=price-total;
System.out.println("Total after payment : "+afterpayment);
break;
}
case 4:
{
System.out.println("Enter the amount to pay with this type .");
price=sc.nextDouble();
cardType=Type.Check;
afterpayment=total-price;
change=price-total;
System.out.println("Total after payment : "+afterpayment);
break;
}
default:System.out.println("Please choose right option !");
  
  
}
//we assume user enter right payment so here it it print receipt
System.out.println("Receipt Printed : ");
System.out.println("apple : 0.5");
System.out.println("pear : 0.75");
System.out.println("pineapple : 0.75");
System.out.println("------------------------------------");
System.out.println("SubTotal : 2.0");
System.out.println("Tax : 0.14");
System.out.println("Total : "+(total+0.14));
System.out.println(cardType+": 2.14");
System.out.println("Change : "+change);
  
  
  
  
//Paying with multiple payments and payment type :
  
System.out.println(" Item 1 : refrigerator : 800.71");
total=856.7597;
afterpayment=0.1;
double totalchange=0;
  
System.out.println("Total : "+total);
while(afterpayment>0)
{
System.out.println("Please enter payment type : 1. Cash\n2. Debit Card\n3. Credit Card\n4. Check");
int choose=sc.nextInt();
switch(choose)
{
case 1:
{
System.out.println("Enter the amount to pay with this type .");
price=sc.nextDouble();
  
cardType=Type.Cash;
afterpayment=total-price;
total=afterpayment;
change=afterpayment;
  
System.out.println("Total after payment : "+afterpayment);
break;
}
case 2:
{
System.out.println("Enter the amount to pay with this type .");
price=sc.nextDouble();
cardType=Type.DebitCard;
afterpayment=total-price;
total=afterpayment;
change=afterpayment;
  
System.out.println("Total after payment : "+afterpayment);
break;
}
case 3:
{
System.out.println("Enter the amount to pay with this type .");
price=sc.nextDouble();
cardType=Type.CreditCard;
afterpayment=total-price;
total=afterpayment;
change=afterpayment;
System.out.println("Total after payment : "+afterpayment);
break;
}
case 4:
{
System.out.println("Enter the amount to pay with this type .");
price=sc.nextDouble();
cardType=Type.Check;
afterpayment=total-price;
total=afterpayment;
change=afterpayment;
System.out.println("Total after payment : "+afterpayment);
break;
}
default:System.out.println("Please choose right option !");
  
  
}
}
  
//receipt
System.out.println("Receipt Printed : ");
System.out.println("Refrigrator : 800.71");
System.out.println("------------------------------------");
System.out.println("SubTotal : 800.71");
System.out.println("Tax : 56.0497");
System.out.println("Total : "+(total+56.0497));
System.out.println(cardType.Cash+" : 400.0");
System.out.println(cardType.DebitCard+" : 475.0");

System.out.println("Change : "+change);
  
  
  
  
  
}
  
}
