import java.util.Scanner;

public class ArrayExample {
    public  Integer[] createRandom(){
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random()*100);
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        System.out.println("danh sach phan tu cua mang");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ",");
        }
        System.out.println("nhap vao vi can tim:");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (index<0 || index>=100){
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Chỉ số vượt quá giới hạn của mảng");
            }
        }else System.out.println(arr[index]);
    }
}

