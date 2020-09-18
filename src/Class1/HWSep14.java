package Class1;

public class HWSep14 {

    public static void main(String[] args) {

        /**
         * Store Below Scenario value in an appropriate dataType variable, and print the same in console.
         * 1. number of hours in a day. (byte)
         * 2. Max number of day in a year.
         * 3. Total number of employees in organization.
         * 4. Population in a country.
         * 5. Interest rate.
         * 6. Balance in a bank account.
         * 7. Does the sun rise from the west ? store answer.
         * 8. Initial your name.
         * 9. Your Name.
         */

        // 1. number of hours in a day (byte)
        byte noOfHours = 24;
        System.out.println("1. There are " + noOfHours + " hours in a day." );

        // 2. Max number of day in a year.
        short maxNumOfTheDaysInAYear = 365;
        System.out.println("2. There are "+ maxNumOfTheDaysInAYear +" days in a year.");

        // 3.Total number of employees in organization.
        short totalNoOfEmployees = 560;
        System.out.println("3. Total Number of the employees " + totalNoOfEmployees + " in the organization.");

        // 4. Population in a country.
        long populationInACountry = 329877505L;
        System.out.println("4. Total Population " + populationInACountry + " of a country.");

        // 5. Interest rate.
        float interestRate = 2.75f;
        System.out.println("5. Interest rate is " + interestRate +"%.");

        // 6.Balance in a bank account.
        double balanceInTheBank = 9876212.33;
        System.out.println("6. Total Balance in the Bank : US $"+ balanceInTheBank);

        // 7. Does the sun rise from the west ? store answer.
        boolean isSunRiseWest = false;
        System.out.println("7. Does the sun rise from the west ? " + isSunRiseWest);

        // 8. Initial your name.
        char initialFirstName = 'S';
        char initialLastName = 'T';
        System.out.println("8. Initial of the Name :"+ initialFirstName + initialLastName);

        // 9. Your Name.
        String fullName = "Sikder Tabrez";
        System.out.println("9. My Full name is : "+ fullName);



    }
}
