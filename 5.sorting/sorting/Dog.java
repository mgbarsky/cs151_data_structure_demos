package sorting;

import java.util.Comparator;

public class Dog implements Comparable<Dog>{
    String name;
    double age;
    int height;
    String owner; 
    
    public Dog(String name, double age, 
            int height, String owner) {
        this.name = name;
        this.age = age;
        this.height = height;        
        this.owner = owner;
    }
    
    public String toString() {
        return String.format("Dog %7s %4.1f years %4d inches owned by %7s",
                this.name, this.age, this.height, this.owner );      
    }
    
    public int compareTo(Dog another) {
        return this.name.compareTo((another).name);
    }
    
    public static Comparator<Dog> AgeComparator = new Comparator<Dog>() {        
        public int compare(Dog d1, Dog d2) {
            return (int) (d1.age - d2.age);
        }
    };
}
