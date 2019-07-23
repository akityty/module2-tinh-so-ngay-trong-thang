import java.util.Scanner;
public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte month;
        System.out.println("input month: ");
        month = scanner.nextByte();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang "+month+" co 31 ngay");
                break;
            case 2:
                System.out.println("Thang "+month+" co 28 hoac 29 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.format("Thang "+month+" co 30 ngay");
                break;
                default:
                    System.out.println(month+" khong phai la thang!");
        }
    }
}
