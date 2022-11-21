import java.util.*;

public class Vocabulary {
    public static void main (String [] args){
        if (args.length==0){
            System.out.println("ERROR: eine nicht leere Standardeingabe eingeben bitte");
        }

        // Scanner initialisieren
        Scanner standardInput = new Scanner(System.in);

        while(standardInput.hasNext()){
            String expression =standardInput.nextLine();
                
            // sameLine Array will store the Lines given that are seperated with "/n" using split("/n")
            String sameLine[] = expression.split("/n");
            List<String> withoutComma = new ArrayList<String>();



            for (int e=0;e<sameLine.length;++e){
                for (int i =0;i==1;++i){
                    //create an array "Splitted" each time with length=2 that contains the swedisch word and it´s translation
                    String splitted []={};
                    splitted = sameLine[e].split(","); 
                    // store the swedisch word an it`s translation in withoucomma Array , so that the swedisch word in the odd positions
                    // and the translation in the non odd positions               
                    withoutComma.add(splitted[i]); 
    
                }
                
            }
                  
        }  
        
        // scrumble every string in an even position of the withouComma Array (german translation)

        List<Character> chars = new ArrayList<Character>();
        
        for (int i =1;i< withoutComma.size();i+=2){
        
           for ( char c : withoutComma.get(i).toCharArray() ) {
             chars.add(c);
            }
        }

        Collections.shuffle(chars);
        char[] shuffled = new char[chars.size()];
        for ( int j = 0; j < shuffled.length; j++ ) {
        shuffled[j] = chars.get(j);
        }

        //print the result which is every element of the withoutcomma(Swedisch word) + every element of the shuffledWord Array (german translation)
        for (int a=1;a<shuffled.length;++a){
            for (int b=0 ; b<withoutComma.size();++b){
            System.out.print(withoutComma.get(b)+" "+shuffled[a]);
            }
            System.out.println();           
        }

    }
}
            


