/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturent_management;


public class Food_item {
    public double Chicken_Grilled;
    public double Burger;
    public double Shawarma;
    public double Sandwiches;
    public double Pizza;
    public double French_Fries;
    
public double Water;
public double Coca_Cola;
public double Sprite;
public double Fanta;
public double Apple_Juice;
public double Tea;
public double Coffee;
public double Ice_Cream;
    
    public double Food;
    public double Drink;
    public double Total_food_and_drink;
    public double Cost_of_Total_food_and_drink;
    public double cost_of_delivery;
    public double getAmount()
    {
    
    Food = Chicken_Grilled + Burger + Shawarma + Sandwiches +Pizza+French_Fries;
    Drink= Water+Coca_Cola+Sprite+Fanta+Apple_Juice+Tea+Coffee+Ice_Cream;
    cost_of_delivery=50.00;
    Total_food_and_drink = Food+Drink;
            
    Cost_of_Total_food_and_drink = Total_food_and_drink+cost_of_delivery;
    
    return Cost_of_Total_food_and_drink;

    }
    
    //======================price================================
    public double pChicken_Grilled=90;
    public double pBurger=120;
    public double pShawarma=100;
    public double pSandwiches=60;
    public double pPizza=120;
    public double pFrench_Fries=50;
    
public double pWater=35;
public double pCoca_Cola=65;
public double pSprite=55;
public double pFanta=50;
public double pApple_Juice=60;
public double pTea=50;
public double pCoffee=70;
public double pIce_Cream=80;
    
    
    //===========================================================
    
    public double tax= 17.00;
    public double cfindTax(){
    
    double Findtax = tax;
    return Findtax;
    
    
    }    
    
}
