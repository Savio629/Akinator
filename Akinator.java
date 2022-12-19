import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Akinator
{
        public static void main(String...args){
            boolean y = true;
            boolean n = false;

HashMap c1 = new HashMap();c1.put("name","Neil");c1.put("male",y);c1.put("hostel",n);c1.put("competitive coder",n);c1.put("eyeglasses", n);c1.put("christian",y);c1.put("repeated name",n);c1.put("repeated surname",n);c1.put("height",y);c1.put("size",y);
HashMap c2 = new HashMap();c2.put("name","Shruti Dalvi");c2.put("male",n);c2.put("hostel",n);c2.put("competitive coder",n);c2.put("eyeglasses", n);c2.put("christian",n);c2.put("repeated name",y);c2.put("repeated surname",n);c2.put("height",n);c2.put("size",n);
HashMap c3 = new HashMap();c3.put("name","Abisha");c3.put("male",n);c3.put("hostel",n);c3.put("competitive coder",n);c3.put("eyeglasses", n);c3.put("christian",y);c3.put("repeated name",n);c3.put("repeated surname",n);c3.put("height",n);c3.put("size",y);
HashMap c4 = new HashMap();c4.put("name","Shreyas");c4.put("male",y);c4.put("hostel",n);c4.put("competitive coder",y);c4.put("eyeglasses", n);c4.put("christian",n);c4.put("repeated name",n);c4.put("repeated surname",y);c4.put("height",n);c4.put("size",y);
HashMap c5 = new HashMap();c5.put("name","Aditya");c5.put("male",y);c5.put("hostel",n);c5.put("competitive coder",n);c5.put("eyeglasses", n);c5.put("christian",n);c5.put("repeated name",n);c5.put("repeated surname",y);c5.put("height",y);c5.put("size",n);
HashMap c6 = new HashMap();c6.put("name","Shruti Deshpande");c6.put("male",n);c6.put("hostel",n);c6.put("competitive coder",n);c6.put("eyeglasses", n);c6.put("christian",n);c6.put("repeated name",y);c6.put("repeated surname",y);c6.put("height",n);c6.put("size",y);
HashMap c7 = new HashMap();c7.put("name","Harsh");c7.put("male",y);c7.put("hostel",n);c7.put("competitive coder",n);c7.put("eyeglasses", n);c7.put("christian",n);c7.put("repeated name",n);c7.put("repeated surname",n);c7.put("height",y);c7.put("size",n);
HashMap c8 = new HashMap();c8.put("name","Aareen");c8.put("male",y);c8.put("hostel",n);c8.put("competitive coder",n);c8.put("eyeglasses", y);c8.put("christian",n);c8.put("repeated name",n);c8.put("repeated surname",n);c8.put("height",n);c8.put("size",n);
HashMap c9 = new HashMap();c9.put("name","Rohan");c9.put("male",y);c9.put("hostel",n);c9.put("competitive coder",n);c9.put("eyeglasses", y);c9.put("christian",n);c9.put("repeated name",n);c9.put("repeated surname",n);c9.put("height",n);c9.put("size",n);
HashMap c10 = new HashMap();c10.put("name","Savio");c10.put("male",y);c10.put("hostel",n);c10.put("competitive coder",y);c10.put("eyeglasses", y);c10.put("christian",y);c10.put("repeated name",n);c10.put("repeated surname",n);c10.put("height",n);c10.put("size",y);
HashMap c11 = new HashMap();c11.put("name","Reuben Anthony Dsilva");c11.put("male",y);c11.put("hostel",n);c11.put("competitive coder",n);c11.put("eyeglasses", n);c11.put("christian",y);c11.put("repeated name",y);c11.put("repeated surname",y);c11.put("height",y);c11.put("size",y);
HashMap c12 = new HashMap();c12.put("name","Reuben Brian Dsilva");c12.put("male",y);c12.put("hostel",n);c12.put("competitive coder",n);c12.put("eyeglasses", y);c12.put("christian",y);c12.put("repeated name",y);c12.put("repeated surname",y);c12.put("height",y);c12.put("size",n);
HashMap c13 = new HashMap();c13.put("name","Colin");c13.put("male",y);c13.put("hostel",n);c13.put("competitive coder",n);c13.put("eyeglasses", n);c13.put("christian",y);c13.put("repeated name",n);c13.put("repeated surname",y);c13.put("height",n);c13.put("size",y);
HashMap c14 = new HashMap();c14.put("name","Alistair");c14.put("male",y);c14.put("hostel",n);c14.put("competitive coder",n);c14.put("eyeglasses", n);c14.put("christian",y);c14.put("repeated name",n);c14.put("repeated surname",y);c14.put("height",y);c14.put("size",y);
HashMap c15 = new HashMap();c15.put("name","Darren");c15.put("male",y);c15.put("hostel",n);c15.put("competitive coder",n);c15.put("eyeglasses", y);c15.put("christian",y);c15.put("repeated name",n);c15.put("repeated surname",y);c15.put("height",n);c15.put("size",y);
HashMap c16 = new HashMap();c16.put("name","Rolston");c16.put("male",y);c16.put("hostel",n);c16.put("competitive coder",n);c16.put("eyeglasses", n);c16.put("christian",y);c16.put("repeated name",n);c16.put("repeated surname",n);c16.put("height",n);c16.put("size",n);
HashMap c17 = new HashMap();c17.put("name","Kaushik");c17.put("male",y);c17.put("hostel",n);c17.put("competitive coder",n);c17.put("eyeglasses", n);c17.put("christian",n);c17.put("repeated name",n);c17.put("repeated surname",n);c17.put("height",n);c17.put("size",y);
HashMap c18 = new HashMap();c18.put("name","Gaurav");c18.put("male",y);c18.put("hostel",n);c18.put("competitive coder",n);c18.put("eyeglasses", n);c18.put("christian",y);c18.put("repeated name",n);c18.put("repeated surname",n);c18.put("height",y);c18.put("size",y);
HashMap c19 = new HashMap();c19.put("name","Ishmeen");c19.put("male",n);c19.put("hostel",n);c19.put("competitive coder",n);c19.put("eyeglasses", y);c19.put("christian",n);c19.put("repeated name",n);c19.put("repeated surname",n);c19.put("height",n);c19.put("size",n);
HashMap c20 = new HashMap();c20.put("name","Gautaum");c20.put("male",y);c20.put("hostel",n);c20.put("competitive coder",n);c20.put("eyeglasses", y);c20.put("christian",n);c20.put("repeated name",n);c20.put("repeated surname",n);c20.put("height",n);c20.put("size",n);
HashMap c21 = new HashMap();c21.put("name","Sahil");c21.put("male",y);c21.put("hostel",y);c21.put("competitive coder",n);c21.put("eyeglasses", n);c21.put("christian",n);c21.put("repeated name",n);c21.put("repeated surname",n);c21.put("height",y);c21.put("size",y);
HashMap c22 = new HashMap();c22.put("name","Israel");c22.put("male",y);c22.put("hostel",n);c22.put("competitive coder",n);c22.put("eyeglasses", n);c22.put("christian",y);c22.put("repeated name",n);c22.put("repeated surname",n);c22.put("height",n);c22.put("size",y);
HashMap c23 = new HashMap();c23.put("name","Serena");c23.put("male",n);c23.put("hostel",n);c23.put("competitive coder",n);c23.put("eyeglasses", n);c23.put("christian",y);c23.put("repeated name",n);c23.put("repeated surname",n);c23.put("height",n);c23.put("size",y);

            ArrayList database = new ArrayList();
            database.add(c1);database.add(c2);database.add(c3);database.add(c4);database.add(c5);database.add(c6);database.add(c7);database.add(c8);database.add(c9);database.add(c10);database.add(c11);database.add(c12);database.add(c13);database.add(c14);database.add(c15);database.add(c16);database.add(c17);database.add(c18);database.add(c19);database.add(c20);database.add(c21);database.add(c22);database.add(c23);

            Scanner sc = new Scanner(System.in);
            System.out.println("--------Welcome to Akinator--------");
            System.out.println("Press 1 for YES and 0 for NO");

            System.out.println("Is your character's gender Male?");
            take_input(sc.nextInt(), "male", database);

            System.out.println("Does your character live in hostel?");
            take_input(sc.nextInt(),"hostel",database);

            System.out.println("Is your character a competitive coder?");
            take_input(sc.nextInt(),"christian",database);
            
            System.out.println("Does your character wear eyeglasses?");
            take_input(sc.nextInt(),"eyeglasses",database);

            System.out.println("Is your character's religion christian?");
            take_input(sc.nextInt(),"christian",database);

            System.out.println("Is the name of your character repeated in the batch?");
            take_input(sc.nextInt(),"repeated name",database);

            System.out.println("Is the surname of your character repeated in the batch?");
            take_input(sc.nextInt(),"repeated surname",database);

            System.out.println("Is your character tall?");
            take_input(sc.nextInt(),"height",database);
            
            System.out.println("Is your character slim?");
            take_input(sc.nextInt(),"size",database);
        }

        public static void take_input(int answer, String property, ArrayList database){
            boolean ans;
            if ( answer == 1){
                ans = true;
            }
            else{
                ans = false;
            }
            ArrayList to_remove = new ArrayList();
            for (Object d: database){
                HashMap character = (HashMap) d;
                boolean prop = (boolean)character.get(property);
                if (prop != ans){
                        to_remove.add(character);
                }

            }
            for (Object ch: to_remove){
                database.remove(ch);
            }
            if (database.size() == 1){

                HashMap character = (HashMap)database.get(0);
                String name = (String)character.get("name");
                System.out.println("your character is "+name);
                System.exit(0);
            }
           // System.out.println(" "+database.size());

        }

}