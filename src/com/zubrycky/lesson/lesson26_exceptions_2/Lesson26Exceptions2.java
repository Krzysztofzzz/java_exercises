package com.zubrycky.lesson.lesson26_exceptions_2;

import java.util.Scanner;

import static com.zubrycky.utils.Utils.print;

public class Lesson26Exceptions2 implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                displayForm();
                print("Good!!!");
            } catch (FormValidationException e) {
                print("Wrong! " + e.getMessage());
            } finally {
                print("Let's start again");
            }
        }
    }

    private void displayForm() throws FormValidationException {
        String name = getString("Enter name:");
        validateName(name);

        String age = getString("Enter age:");
        validateAge(age);

        String gender = getString("Enter gender (M, F, UNKNOWN):");
        validateGender(gender);
    }

    private void validateGender(String gender) throws InvalidGenderException {
        if (!gender.equals("M") && !gender.equals("F") && !gender.equals("UNKNOWN")) {
            throw new InvalidGenderException("Enter correct gender");
        }
    }

    private void validateAge(String age) throws InvalidAgeException {
        try {
            int validatedAge = Integer.parseInt(age);
            if (validatedAge < 0) {
                throw new InvalidAgeException("Age has to ba a positive number");
            }
        } catch (NumberFormatException e) {
            throw new InvalidAgeException("Age has to be a number");
        }
    }

    private void validateName(String name) throws InvalidNameException {
        if (name.length() < 2 || name.length() > 50) {
            throw new InvalidNameException("Name has to be greater than 1 and less than 50 characters");
        }
    }

    private String getString(String message) {
        print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
