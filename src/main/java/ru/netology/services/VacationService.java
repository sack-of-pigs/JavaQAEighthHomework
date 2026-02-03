package ru.netology.services;

public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int balance = 0;          // текущий баланс денег
        int vacationMonths = 0;   // количество месяцев отдыха

        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) {
                // Решение отдохнуть
                balance -= expenses;           // вычитаем обязательные траты
                balance = balance / 3;       // тратим ещё 2/3 остатка (остаётся 1/3)
                vacationMonths++;
            } else {
                // Решение работать
                balance += income;             // добавляем доход от работы
                balance -= expenses;           // вычитаем обязательные траты
            }
        }

        return vacationMonths;
    }
}
