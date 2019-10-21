package com.java.basic.hillel;

public class Convector {
    public static void main(String[] args) {

        System.out.println("Привет Алексей, спасибо за помощь! Предоставляю отчет по домашнему заданию:");
        //1.Convert Celsius to Fahrenheit
        double celsius = 40;
        double celsiusToFahrenheit = celsius *9/5 +32;
        System.out.println("Task #1.0.: celsiusToFahrenheit = " + celsiusToFahrenheit);

        //    2.Convert Fahrenheit to Celsius
        double fahrenheit = 100;
        double fahrenheitToCelsius = (fahrenheit - 32) * 5/9;
        System.out.println("Task #2.0.: fahrenheitToCelsius = " + fahrenheitToCelsius);

        //    3.Convert Celsius to Kelvin
        //double celsius = 50;
        double celsiusToKelvin = celsius +273.15;
        System.out.println("Task #3.0.: celsiusToKelvin = " + celsiusToKelvin);


        //4.Convert meters to inches.
        double meters = 10;
        double metersToInches = meters * 39.3701;
        System.out.println("Task #4.0.: metersToInches = " + metersToInches);

        //And reverse
        double inches = 39.3701;
        double inchesToMeters = inches / 39.3701;
        System.out.println("Task #4.1.: inchesToMeters = " + inchesToMeters);

        // 5.Convert miles to kilometres.
        double miles = 100;
        double milesToKilometres = miles * 1.60934;
        System.out.println("Task #5.0.: milesToKilometres = " + milesToKilometres);

        //And reverse
        double kilometres = 100;
        double KilometresToMiles = kilometres / 1.60934;
        System.out.println("Task #5.1.: KilometresToMiles = " + KilometresToMiles);

        // 6.Convert kilograms to pounds.
        double kilograms = 10000;
        double kilogramsToPounds = kilograms / 16.381;
        System.out.println("Task #6.0.: kilogramsToPounds = " + kilogramsToPounds);

        //And reverse
        double pounds = 610.475;
        double poundsToKilograms = pounds * 16.381;
        System.out.println("Task #6.1.: poundsToKilograms = " + poundsToKilograms);

        // 7. Convert speed km/hr to mi/hr.
        double kilometersPerHour = 100;
        double kilometersPerHourToMilesPerHour = kilometersPerHour / 1.609;
        System.out.println("Task #7.0.: kilometersPerHourToMilesPerHour = " + kilometersPerHourToMilesPerHour);

        //And reverse
        double MilesPerHour = 10;
        double MilesPerHourToKilometersPerHour = MilesPerHour * 1.609;
        System.out.println("Task #7.1.: MilesPerHourToKilometersPerHour = " + MilesPerHourToKilometersPerHour);

        System.out.println("Задачи со свездочкой:");
        //8. ​ Time calculations
        // convert time in seconds to days, hours, min and seconds

        double seconds = 86400;
        double secondsToDays = seconds / 86400;
        double secondsToHours = seconds / 3600;
        double secondsToMin = seconds / 60;

        System.out.println("Task #8.0.: secondsToDays = " + secondsToDays);
        System.out.println("Task #8.1.: secondsToHours = " + secondsToHours);
        System.out.println("Task #8.2.: secondsToMin = " + secondsToMin);

        //or reverse
        double days = 2;
        double daysToSeconds = days * 86400;
        double hoursToSeconds = days * 3600;
        double minToSeconds = days * 60;

        System.out.println("Task #8.3.: daysToSeconds = " + daysToSeconds);
        System.out.println("Task #8.4.: hoursToSeconds = " + hoursToSeconds);
        System.out.println("Task #8.5.: minToSeconds = " + minToSeconds);

        //9. calculate the number seconds, minutes, hours, days, weeks, years you’ve been live
        double birthdayInSeconds = 1162918877;
        double birthdayInMinutes = birthdayInSeconds / 60;
        double birthdayInHours = birthdayInSeconds / 60 / 60;
        double birthdayInDays = birthdayInSeconds / 60 / 60 / 24;
        double birthdayInWeeks = birthdayInSeconds / 60 / 60 / 24 / 7;
        double birthdayInYears = birthdayInSeconds / 60 / 60 / 24 / 365.25;

        System.out.println("Date of my birthday - 14.12.1982. Выполнял задание в районе 16:45 21.10.2019 ");
        System.out.println("Task #9.0.: birthdayInSeconds = " + daysToSeconds);
        System.out.println("Task #9.1.: birthdayInMinutes = " + birthdayInMinutes);
        System.out.println("Task #9.2.: birthdayInHours = " + birthdayInHours);
        System.out.println("Task #9.3.: birthdayInDays = " + birthdayInDays);
        System.out.println("Task #9.4.: birthdayInWeeks = " + birthdayInWeeks);
        System.out.println("Task #9.5.: birthdayInYears = " + birthdayInYears);

        //10. ​ Marks conversions
        // Given a mark on a test and the test total, find the percentage (values can be entered from command line)
        // Example:  total test = 10; marked test = 8; Results: 80%

        double totalTest = 10;
        double markedTest = 8;
        double results = markedTest / totalTest * 100;

        System.out.println("Task #10.0.: resultsMarkedTest = " + results + "%");

        //11. ​ Multiple choice test score
        // Calculate the final score on a multiple choice test: final = number correct - 1⁄4(number wrong) Example: total test = 10; passed test = 3; failed test = 7;
        // Result: passed 30%, failed 70%;

        double test = 10;
        double passedTest = 3;
        double failedTest = 7;
        double passedTestResults = passedTest / test * 100;
        double failedTestResults = failedTest / test * 100;

        System.out.println("Task #11.0.: passedTestResults = " + passedTestResults + "%");
        System.out.println("Task #11.0.: failedTestResults = " + failedTestResults + "%");
    }
}
