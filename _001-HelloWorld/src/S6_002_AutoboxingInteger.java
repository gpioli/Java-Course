public class S6_002_AutoboxingInteger {
    public static void main(String[] args) {

        // autoboxing:
        Integer[] integs = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int sum = 0;

        for(Integer i: integs){
            // explicit form (this is unnecessary, we could only use the Integer value and java automatically will
            // convert the type)
            if (i.intValue() % 2 == 0){
                sum = sum + i.intValue();
            }
        }
        System.out.println("sum = " + sum);

    }

}
