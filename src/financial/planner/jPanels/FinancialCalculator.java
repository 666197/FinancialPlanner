/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package financial.planner.jPanels;

/**
 *
 * @author salih
 */
public class FinancialCalculator {
    
    static String stringHousing = Housing.housing.getText();
    static String stringFood = OtherExpenses.food.getText();
    static String stringOther = OtherExpenses.other.getText();
    static String stringIncome = MonthlyIncome.income.getText();
    static String stringGoal = goal.goal.getText();
    
    static double housing;
    static double food;
    static double other;
    static double income;
    static double goalMoney;
    static double expenses;
    static double moneyDifference;
    
    public static void toDec(){
        housing = Double.parseDouble(stringHousing);
        food = Double.parseDouble(stringFood);
        other = Double.parseDouble(stringOther);
        income = Double.parseDouble(stringIncome);
        goalMoney = Double.parseDouble(stringGoal);
        
    }
    
    public static void calculateMoney(){
        toDec();
        expenses = (housing + food + other);
        
    }
}
