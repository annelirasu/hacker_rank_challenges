package hackerrank.stilleasy;

import java.security.Permission;
import java.util.Scanner;

interface Food{

   String getType();

}

class Pizza implements Food{
    @Override
    public String getType() {
        return ("Someone ordered Fast Food!");
    }
}

class Cake implements Food{
    @Override
    public String getType() {
        return ("Someone ordered a Dessert!");
    }
}

class FoodFactory{
    public Food getFood(String food){
        if(food.equalsIgnoreCase("pizza")){
            return new Pizza();
        }
        else if( food.equalsIgnoreCase("cake")){
            return  new Cake();
        }
        else if (food==null){
            return null;
        }
        return null;
    }
}

public class FactoryExcample {
    public static void main(String args[]){
        Do_Not_Terminate.forbidExit();

        try{

            Scanner sc=new Scanner(System.in);
            //creating the factory
            FoodFactory foodFactory = new FoodFactory();

            //factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());


            System.out.println("The factory returned "+food.getClass());
            System.out.println(food.getType());
        }
        catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
