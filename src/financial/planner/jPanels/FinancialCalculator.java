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
    static int months15percent;
    static int months20percent;
    static int months25percent;
    static int months50percent;
    static int monthsTotal;
    
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
    
    public static void updateResults(){
        Results.goal.setText("$" + goalMoney);
        Results.fifteen.setText("If 15% or " + (moneyDifference*0.15) + " put away per month, it will take " + months15percent + " months");
        Results.twenty.setText("If 20% or " + (moneyDifference*0.2) + " put away per month, it will take " + months20percent + " months");
        Results.twentyfive.setText("If 25% or " + (moneyDifference*0.25) + " put away per month, it will take " + months25percent + " months");
        Results.fifty.setText("If 50% or " + (moneyDifference*0.5) + " put away per month, it will take " + months50percent + " months");
        Results.onehundred.setText("If 100% or " + (moneyDifference) + " put away per month, it will take " + monthsTotal + " months");
    }
    
    public static void calculateMoney(){
        setVariables();
        toDec();
        expenses = (housing + food + other);
        moneyDifference = (income - expenses);
        months15percent = (int) Math.ceil((goalMoney/(moneyDifference*0.15)));
        months20percent = (int) Math.ceil((goalMoney/(moneyDifference*0.20)));
        months25percent = (int) Math.ceil((goalMoney/(moneyDifference*0.25)));
        months50percent = (int) Math.ceil((goalMoney/(moneyDifference*0.50)));
        monthsTotal = (int) Math.ceil((goalMoney/moneyDifference));
        updateResults();
    }
}
