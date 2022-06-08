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
    
    static String stringHousing;
    static String stringFood;
    static String stringOther;
    static String stringIncome;
    static String stringGoal;
    
    static double housing;
    static double food;
    static double other;
    static double income;
    static double goalMoney;
    static double expenses;
    static double moneyDifference;
    static double months15percent;
    static double months20percent;
    static double months25percent;
    static double months50percent;
    static double monthsTotal;
    
    public static void setVariables(){
        stringHousing = Housing.housing.getText();
        stringFood = OtherExpenses.food.getText();
        stringOther = OtherExpenses.other.getText();
        stringIncome = MonthlyIncome.income.getText();
        stringGoal = goal.goal.getText();
    }
    
    public static void toDec(){
        housing = Double.parseDouble(stringHousing);
        food = Double.parseDouble(stringFood);
        other = Double.parseDouble(stringOther);
        income = Double.parseDouble(stringIncome);
        goalMoney = Double.parseDouble(stringGoal);
        
    }
    
    public static void calculateMoney(){
        setVariables();
        toDec();
        expenses = (housing + food + other);
        moneyDifference = (income - expenses);
        months15percent = (goalMoney/(moneyDifference*0.15));
        months20percent = (goalMoney/(moneyDifference*0.20));
        months25percent = (goalMoney/(moneyDifference*0.25));
        months50percent = (goalMoney/(moneyDifference*0.50));
        monthsTotal = (goalMoney/moneyDifference);
        
        Results.goal.setText("$" + goalMoney);
    }
}
