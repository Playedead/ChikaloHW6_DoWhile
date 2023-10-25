public class Main {

  public static void main(String[] args) {
    System.out.println("Задача №1");
    int savings = 15000;
    int totalSavings = 0;
    int i = 0;
    while (totalSavings < 2_459_000) {
      i = i + 1;
      totalSavings = totalSavings + savings;
      System.out.println("В месяц " + i + " сумма накоплений равна " + totalSavings);
    }
    System.out.println();

    System.out.println("Задача №2");
    int x = 0;
    while (x < 10) {
      x = x + 1;
      System.out.print(x + " ");
    }
    System.out.println();
    for (int b = 10; b >= 1; b--) {
      System.out.print(b + " ");
    }
    System.out.println();
    System.out.println();

    System.out.println("Задача №3");
    int population = 12_000_000;
    int birthRate = 17;
    int deathRate = 8;
    int coeff = 1_000;
    int growth = birthRate - deathRate;
    for (int year = 1; year <= 10; year++) {
      population = population + population * growth / coeff;
      System.out.println("Год " + year + ", численность населения составляет " + population);
    }
    System.out.println();

    System.out.println("Задача №4");
    double totalSavings1 = 15000;
    int month = 0;
    while (totalSavings1 <= 12000000) {
      totalSavings1 = totalSavings1 * 1.07;
      month++;
      int totalSavings4 = (int)Math.round(totalSavings1);
      System.out.println("В месяц " + month + ", сумма накоплений равна " + totalSavings4);
    }
    System.out.println();

    System.out.println("Задача №5");
    double totalSavings2 = 15000;
    int month1 = 0;
    while (totalSavings2 <= 12000000) {
      totalSavings2 = totalSavings2 * 1.07;
      month1++;
      int totalSavings3 = (int)Math.round(totalSavings2);
      if (month1 % 6 == 0) {
        System.out.println("В месяц " + month1 + ", сумма накоплений равна " + totalSavings3);
      }
    }
    System.out.println();

    System.out.println("Задача №6");
    double money = 15000;
    int period = 6;
    int years = 9;
    int months = years * 12;
    double bankPercent = 0.07;
    for (int p = 1; p <= months; p++) {
      money = money + money * bankPercent;
      int money1 = (int)Math.round(money);
      if (p % period == 0) {
        System.out.println("Сумма накоплений " + money1 + " на " + p + "-й месяц.");
      }
    }
    System.out.println();

    System.out.println("Задача №7");
    for (int f = 5; f <= 31; f = f + 7) {
        System.out.println("Сегодня пятница, " + f + "-е число. Необходимо подготовить отчёт.");
    }
    System.out.println();

    System.out.println("Задача 8");
    int currentYear = 2023;
    for (int r = 0; r < currentYear + 100; r += 79) {
      if (r > currentYear - 200) {
        System.out.println(r);
      }
    }
  }
}