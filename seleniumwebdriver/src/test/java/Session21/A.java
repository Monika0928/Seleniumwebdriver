package Session21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Practice1.A;
import Practice1.B;

public class A {
		int a=10;
		void mt1() {
			System.out.println(a);
		}
	}

	class B extends A {

			int a=10;
			void mt1() {
			System.out.println(a);
		}
			
	public static void main(String[] args) {
				B obj= new B();
				
				System.out.println(obj.a);
		
		}
			}
