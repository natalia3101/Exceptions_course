// Реализуйте метод, который запрашивает у пользователя ввод дробного числа 
// (типа float), и возвращает введенное значение. Ввод текста вместо числа не
//  должно приводить к падению приложения, вместо этого, необходимо повторно
//   запросить у пользователя ввод данных.



public class task1 {

    public static void main(String[] args){
        printFloatNumber();
    }

    private static void printFloatNumber(){
        boolean isCorrect = false;
        while (!isCorrect) {
            try{
                System.out.println("Enter a float number");
                float usersNumber = Float.parseFloat(System.console().readLine());
                isCorrect = true;
                System.out.println(usersNumber);
            } catch(NumberFormatException e){
                System.err.println("Not a number. Try again");
            }
        }
    }


}
