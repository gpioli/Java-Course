public class X011_StringExamplePerformanceTestConcat {
    public static void main(String[] args) {

        // We will test the performance of the concat types

        String a = "a";
        String b = "b";
        String c = a; // so c == a

        StringBuilder sb = new StringBuilder(a); // used in the last test | it allows us to construct strings
        // Bear in mind that String builider creates a MUTABLE object

        long start = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++){
            c = c.concat(a).concat(b).concat("\n"); // 500 iter => 2ms | 10.000 iter => 106 ms
            //c += a + b + "\n"; // 500 iter => 18ms (this is the same as: c = c + a + b + "\n";) | 10.000 iter => 63ms
//            sb.append(a)
//                    .append(b)
//                    .append("\n"); // 500 iter => StringBuilder only took ~0ms | 10.000 iter => 2ms

        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);

    }
}
