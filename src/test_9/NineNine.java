package test_9;

public class NineNine {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i;j ++) {
                int num = 0;
                num = i*j;
                System.out.print(i+"*"+j+"="+num+"\t");

            }
            System.out.println();
        }
    }
}
