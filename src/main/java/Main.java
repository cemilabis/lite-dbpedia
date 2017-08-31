import java.util.Scanner;

/**
 * Created by cemil on 31.08.2017.
 */
public class Main {

    //region Main

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(args.length==0){
            System.out.println("You must give the settings file location as parameter");
        }
        else{
            try {
                DbpediaFilter filter = new DbpediaFilter();
                filter.filterDbpedia(args[0]);
            }
            catch(Exception ex){
                ex.printStackTrace(System.out);
            }

        }
        System.out.println("Press any key to continue...");
        in.next();
    }

    //endregion

    //region Private



    //endregion

}
