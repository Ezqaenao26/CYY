//小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。


public class Text01 {
    public static void main(String[] args) {
      int day=1;
      float money=2.5f;

     while (money<100){
         money+=2.5;
         day++;
         if(day%5==0){
             money-=6;
         }
     }
        System.out.println("第"+day+"天,存了"+money   );
    }
}
