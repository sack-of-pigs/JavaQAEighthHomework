package ru.netology.services;

public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int balance = 0;          // текущий баланс денег
        int vacationMonths = 0;   // количество месяцев отдыха

        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) {
                // Решение отдохнуть
                int initialExpense = expenses;
                int restExpense = (balance - expenses) * 2 / 3; // тратим 2/3 остатка после обязательных трат
                System.out.println("Месяц " + month + ". Денег " + balance + ". Буду отдыхать. Потратил -" + initialExpense + ", затем ещё -" + restExpense);
                balance -= expenses;
                balance -= restExpense;
                vacationMonths++;
            } else {
                // Решение работать
                System.out.println("Месяц " + month + ". Денег " + balance + ". Придётся работать. Заработал +" + income + ", потратил -" + expenses);
                balance += income;
                balance -= expenses;
            }
        }
        return vacationMonths;
    }
}
