import java.io.*;
import java.math.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.prefs.*;
import java.util.regex.*;
import java.util.stream.*;
void print(boolean b) { System.out.print(b); }
void print(char c) { System.out.print(c); }
void print(int i) { System.out.print(i); }
void print(long l) { System.out.print(l); }
void print(float f) { System.out.print(f); }
void print(double d) { System.out.print(d); }
void print(char s[]) { System.out.print(s); }
void print(String s) { System.out.print(s); }
void print(Object obj) { System.out.print(obj); }
void println() { System.out.println(); }
void println(boolean b) { System.out.println(b); }
void println(char c) { System.out.println(c); }
void println(int i) { System.out.println(i); }
void println(long l) { System.out.println(l); }
void println(float f) { System.out.println(f); }
void println(double d) { System.out.println(d); }
void println(char s[]) { System.out.println(s); }
void println(String s) { System.out.println(s); }
void println(Object obj) { System.out.println(obj); }
void printf(java.util.Locale l, String format, Object... args) { System.out.printf(l, format, args); }
void printf(String format, Object... args) { System.out.printf(format, args); }
public class Person{
	private String name;
	private int age;
	public Person(){
		this.name = null;
		this.age = 0;
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String newName){
		this.name = newName;
	}
	public void setAge(int newAge){
		this.age = newAge;
	}
}
class Student extends Person{
	private String id;
	private int credits;
	public Student(){
		super();
		this.id="$$";
		this.credits = 0;
	}
	public Student(String name, int age, String id, int credits ){
		super(name,age);
		this.id = id;
		this.credits = credits;
	}
	public String getId(){
		return this.id;
	}
	public int getCredits(){
		return this.credits;
	}
	public void setID(String updatedID){
		this.id = updatedID;
	}
	public void setCredits(int newCredits){
		this.credits = newCredits;
	}
}
Person p1 = new Person("anthony",23);
Student s1 = new Student("Joe",12,"$1234",180);
int i = 23.4;