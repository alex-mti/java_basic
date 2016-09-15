package java_basic;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Homework_01 {

    /**ДЗ № 1
     * Задания решаются внутри одного класса
     * @author kraychikov  
     */
	
    //Задание 1. Решение квадратного уравнения
	
	public static void main(String[] args) {
        double a, b, c;
        double D;
        System.out.println("Для решения квадратного уравнение вида:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите значения a, b и c:");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        D = b * b - 4 * a * c;
        if (a == 0) {
        	System.out.println("Первый коэффициент не может быть 0");
        }
        else  if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Нет действительных решений уравнения");
        	}
	}	           
	
	// Задание 2. Простые числа в дипозоне от 1 до 1000
    
	public static void prime (String[] args) {
			Set <Integer> primeNumbers = new HashSet <Integer> ();
			    		System.out.println("Все простые числа от 1 до 1000: ");
    		for (int i = 2; i < 1000; i++) {
    			boolean Prime = true;
    			int sqrt = (int) Math.sqrt(i);
    			for (Integer primeNumber: primeNumbers)	{	
    				if (primeNumber > sqrt)
    				{
    					break;
    				}
    				if (i % primeNumber == 0)
    				{					
    					Prime = false;
    					break;
    				}
    			}
    			if (Prime)
    			{
    				primeNumbers.add(i);
    				System.out.println(i + " ");
    			}								
		
    		}
        }
}