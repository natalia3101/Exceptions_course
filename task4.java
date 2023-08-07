// Разработайте программу, которая выбросит Exception, когда пользователь вводит 
// пустую строку. Пользователю должно показаться сообщение, что пустые строки 
// вводить нельзя.

public class task4 {

    public static void main(String[] args){
        enterMessage();
    }
    
    private static void enterMessage(){
        boolean isCorrect = false;
        System.out.println("Enter a message: ");
        while (!isCorrect){
            try{
                String str = System.console().readLine();
                if (str.length() != 0) {
                    isCorrect = true;
                    System.out.println(str);
                } else {
                    isCorrect = false;
                    throw new Exception("The line is empty. Enter a message");
                }
            } catch(Exception e){
                System.err.println(e);
            }

        }
    }
}
