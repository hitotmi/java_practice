import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      System.out.println("小数点を含んだ数値を入力してください");
      
      Scanner scanner = new Scanner(System.in);
      double input = scanner.nextDouble();
      System.out.println("入力した小数点を含んだ数値は" + input);
      scanner.close();
   }
}



// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
//       System.out.println("整数を入力してください");
//       Scanner scanner = new Scanner(System.in);

//       int input = scanner.nextInt();
//       System.out.println("入力した整数は:" + input);
//       scanner.close();
//   }
// }



// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
//       System.out.println("入力してください");

//       Scanner scanner = new Scanner(System.in);
//       // String input= scanner.next();

//       //入力した内容は改行を区切りとして取得する
//       String input = scanner.nextLine();
//       System.out.println("入力されたもの：" + input);
//       scanner.close();
//   }

// }
