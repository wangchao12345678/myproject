import java.util.LinkedList;
import java.util.Scanner;

public class Jump {
    static int n;
    static int m;
    static int count = 0;
   static LinkedList<String> stack=new LinkedList<String>();
    public static void main(String[] args) {

            // TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
        System.out.println("请输入y轴大小：");
            n=sc.nextInt();
        System.out.println("请输入x轴大小：");
            m=sc.nextInt();
            dfs(0,0);
            System.out.println("路径数"+count);
        }
        public static void dfs(int a, int b) {
            if(a<0||a>n||b<0||b>m) {
              return;
            }
            if(a==n&&b==m) {
                count++;
                stack.addLast("("+b+","+a+")");
                System.out.println("############");
                for (String str:stack){
                    System.out.println(str);
                }
                stack.clear();
            }
            else {
                stack.addLast("("+b+","+a+")");
                dfs(a + 2, b + 1);
                dfs(a + 1, b + 2);
                dfs(a - 1, b + 2);
                dfs(a - 2, b + 1);
            }

        }
    }


