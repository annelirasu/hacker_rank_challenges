package hackerrank.stilleasy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Student1{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
}
//võtab klassil ja prindib välja kõik selle meetodid

public class ReflectionMethods {

    public static void main(String[] args){
        Student1 student = new Student1();
        Method[] methods = Student1.class.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(int i=0;i<methods.length;i++){
            methodList.add(methods[i].getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}
