# OOPS-LAB

##LAB 1 
Create a class to represent points in 2D plane with proper constructors. Create objects of this class within the main():
a) in the same class
b) in a different class

##LAB 2 
A. Creat a class to represent stack (for
integer data).
B. Now, create another class to evaluate
any postfix expression (having +,-,*, / as
operators and single digit numbers as
operands. This class should use the above
Stack class.

2*3+1 ===> 23*1+   (answer 7)

##LAB 3
1. Create a single class to implement the following using suitable methods.
a) Write a program to show whether the number is prime. Data will be taken from the command line argument.
b) Write a program to show the prime numbers in a given range using the command line.

2. Write a program to display the Fibonacci series of length n (n is user input using Scanner class).

3. Take a String as input using a command line argument and check whether it is a palindrome.

4. Create a class named “DesignPattern” with different static methods to draw triangle, rectangle, and square using ‘*’. Demonstrate the class using the main method.

##LAB 4 
Q#1
A. Create a base class named "Person" with attributes like name and age. The class must have a proper constructor.
B. Create a subclass named "Employee" by inheriting the "Person" class. Add these attributes: employeeId and salary.
C. Demonstrate using the super keyword to call the superclass constructor from the subclass constructor.


Q#2
Create the following classes:
A. Person - to represent any common person having ID, name, gender, and date of birth.
B. Voter - to represent a valid voter (minimum 18 years old). The Voter class must have a
method to register a person as a voter.
C. InvalidVoterException class which will be thrown when any person below 18 years is tried to register as a voter.
D. Now, create a suitable program which will do the following:
1. Create an array of n number of person objects.
2. create an array of m valid voters (m<n).
3. Implement voter registration which will demonstrate exceptions also.
4. List all registered voters.
5. List all invalid voters.

##LAB 5
1. Write a Java program to create an abstract class named "Student". Now inherit the class and create two subclasses - CseStudent and ItStudent. The class must have an abstract method "giveExam()".
a) Now, within the main method, create objects of the instantiable classes and call the above-mentioned method on behalf of each object. 

b) Can we create a single reference of the Student class to refer to CseStudent and then ItStudent? Write code and check.   

2. create a Tic-Tac-Toe game. Use the following method as the base design. Update this method as per your requirements.
public void drawGrid(){
        System.out.println("       |       |       ");    
        System.out.println("   1   |   2   |   3   ");    
        System.out.println("       |       |       ");    
        System.out.println("-----------------------");
        System.out.println("       |       |       ");    
        System.out.println("   4   |   5   |   6   ");    
        System.out.println("       |       |       ");    
        System.out.println("-----------------------");
        System.out.println("       |       |       ");    
        System.out.println("   7   |   8   |   9   ");    
        System.out.println("       |       |       "); 
}