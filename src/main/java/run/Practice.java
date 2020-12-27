package run;

import java.util.Arrays;

public class Practice {
    int age;
    String name;

    public Practice(int age) {
        this.age = age;
    }

    public Practice(int age, String name) {
        this(age);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
       /* String str = "subash selvaraj";
        char[] chars = str.toCharArray();
        char[] reverse = new char[chars.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = chars[chars.length - 1 - i];
        }
        String reversestring = new String(reverse);
        System.out.println(str);
        System.out.println(reversestring);
        */
        /*String[] names={"Surya", "Rajini","Kamal","Vijay","Dhanush"};
        int[] num = {6,8,9,3,7,1,4};
        Arrays.sort(num,2,7);
        Arrays.sort(names,2,5);
        System.out.println(names);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(names));
        */
        Practice practice = new Practice(25,"subash");
        System.out.println(practice );

    }
}
