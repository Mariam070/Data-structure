import java.util.*;
public class Array {
    public static void main(String[] args) {
        int[] list=new int[100];
        int i;
        for (i=0;i<list.length;i++){
            list[i]=(int)(Math.random()*100);
            System.out.print(list[i] + "  ");
        }
        Arrays.sort(list);
        for(i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }}