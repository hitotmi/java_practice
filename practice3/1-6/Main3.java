public class Main3 {
    public static void main(String[] args) {
        int userAge = 30;
        int serviceCost;


        if (userAge == 10) {
            serviceCost = 1000;
        } else if (userAge == 20) {
            serviceCost = 2000;
        } else if (userAge >= 30 && userAge < 60) {
            serviceCost = 3000;
        } else {
            serviceCost = 2000;
        }

        // switch (userAge) {
        //     case 10:
        //         serviceCost = 1000;
        //         break;
        //     case 20:
        //         serviceCost = 2000;
        //         break;
        //     case 30:
        //     case 40:
        //     case 50:
        //     case 60:
        //     case 70:
        //         serviceCost = 3000;
        //         break;
        //     case 80:
        //         serviceCost = 5000;
        //         break;
        //     default:
        //         serviceCost = 500;
        // }

        System.out.println(userAge + "代の料金は" + serviceCost + "円");
    }
}