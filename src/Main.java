import LmsTask.enums.Category;
import LmsTask.enums.KeyCharacters;
import LmsTask.model.Characters;
import LmsTask.model.Product;
import LmsTask.service.serviceImpl.Service;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        Service service=new Service();
        switch(num=scanner.nextInt()){
            case 1:
              //  service.saveProduct(new Product(1L,Category.PHONE,"Samsung",List.of(KeyCharacters.CD,"serdtfgyh"),12000,KeyCharacters.CD,"gyuhj");
           break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            default:
                System.out.println("Input number only 1-7");

        }


    }
}
