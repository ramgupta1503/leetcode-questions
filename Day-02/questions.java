// PATTERN QUESTIONS

// package leetcode-questions.Day-02;

// public class questions{
//     public static void main(String[] args) {

//         for (int i=1; i<5 ;i++){
//             for (int j=0; j<i; j++){
//                 System.out.print("#");
//             }
//                 System.out.println();
//         }

//     }
// }


// public class questions{
//     public static void main(String[] args) {

//         for (int i=4; i>0 ;i--){
//             for (int j=0; j<i; j++){
//                 System.out.print("#");
//             }
//                 System.out.println();
//         }

//     }
// }



// public class questions{
//     public static void main(String[] args) {

//         int a = 1234;
//         int digit, number = 0;

//         while(a!=0){
//             digit = a%10;
//             System.out.print(digit + " ");
//             a = a/10;
//             number = number*10 + digit;
//         }
//         System.out.println(number);
//     }
// }



// LEETCODE QUESTION :- 258

class Main {
    public static void main(String[] args) {
        int answer = 0, num = 199, output = 0, rem, digit, number = 0;
        while(num>0){
            digit = num%10;
            number = number + digit;
            num = num/10;      
        }
        if (number>9){
        while(number>9){
            output = 0;
                while(number>0){
                rem = number % 10;
                output = rem + output;
                number = number/10;
                }
                number = output;
        }
            answer = number;
            }
        else {
            answer = number;
        }
         System.out.print(answer);
    }
}