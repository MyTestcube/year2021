package Moon7;
import java.util.*;
import java.lang.Comparable;
public class EqualsTest3 {
    public static void main(String[] args) {
        Person p1=new Person("eee",100);
        Person p2=new Person("eee",100);

        System.out.printf("p1.equals(p2) : %s\n",p1.equals(p2));
        System.out.printf("p1==p2 : %s\n",p1==p2);

    }
    private static class Person{
        int age;
        String name;

        public Person(String name,int age ){
            this.name=name;
            this.age=age;
        }


        public String toString(){
            return name+"-"+age;
        }

        @Override
        public boolean equals(Object obj) {

            if (obj==null){
                return false;
            }
            if (this==obj){
                return true;
            }
            if (this.getClass()!=obj.getClass()){
                return false;
            }
            Person person=(Person)obj;
            return  name.equals(person.name)&&age== person.age;
        }

    }
}
