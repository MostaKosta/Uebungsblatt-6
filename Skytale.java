public class Skytale {

    private static String encrypt(String secretMessage,int n,int m){

        char [] [] characters= new char [n][m];
        // create and initialise an array with the caracters of the string secretMessage
        char [] charactersArray= secretMessage.toCharArray();
        
        // fill our matrix characters with this characters
        for (int i=0;i<n;++i){
            for (int j=0;j<m;++j){
                for (char e:charactersArray){
                    characters[i][j]=e;
                }
                
            }
        }
        
        String ausgabeString="";
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                ausgabeString+=characters[i][j];
            }
        }
        return ausgabeString;
           
    }

    private static String decrypt(String encryptedMessage,int n,int m){
        char [] [] characters= new char [n][m];
        // create and initialise an array with the caracters of the string encryptedMessage
        char [] charactersArray= encryptedMessage.toCharArray();


        // fill our matrix characters with this characters
        for (int j=0;j<m;++j){
            for (int i=0;i<n;++i){
                for (char e:charactersArray){
                    characters[i][j]=e;
                }             
            }
        }

        String ausgabeString="";
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                ausgabeString+=characters[i][j];
            }
        }

        return ausgabeString;

    }
    public static void main (String args []){

       if (args[0]=="-E"){
    
          if(encrypt(args[1], 4, 7).length()>28 || args.length<2){
              System.out.println("ERROR") ;
            }
          else{
              System.out.println(encrypt(args[1], 4, 7));
            }
        
        }

      else if (args[0]=="-D"){
          if(encrypt(args[1], 4, 7).length()>28 || args.length<2){
              System.out.println("ERROR");
            }
          else{
              System.out.println(decrypt(args[1], 4, 7));
            }
      
        } 

      else {
        System.out.println("ERROR");
      }

    }
}

