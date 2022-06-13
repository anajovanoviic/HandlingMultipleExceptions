package basics;



import org.apache.log4j.Logger;

public class HandlingMultipleExceptions {

    private static Logger logger = Logger.getLogger(HandlingMultipleExceptions.class);

    public static void main (String[] args) {

        try{
            int a = 10;
            int b = 5;
            System.out.println(a/b);

            int array[] = new int[3];

            for(int j=0; j < array.length; j++) {
                array[j] = 5;
            }

            HandlingMultipleExceptions obj = null;
            System.out.println(obj.toString());

        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            //System.out.println("Exception occurs " + e);
            logger.info("Exception occurs " + e);
        }
    }
}
