import java.util.Scanner;

public class Main {

    protected static boolean p1turn;
    protected static boolean p2turn;
    protected static boolean p1won;
    protected static boolean p2won;
    public static  tictictoe board=new tictictoe();

        public static Scanner ss=new Scanner(System.in);
    
        public static void main(String args[]){
            if(board.isVisible()==false)
                board.setVisible(true);
            
                
            
            }
    

    /**
     * 
     */
    public  static void isWon() {
      
                    if(tictictoe.b1.getText().equals("x")){
                        if(tictictoe.b2.getText().equals("x")){
                        if(tictictoe.b3.getText().equals("x")){
                       p1won=true;
                       p2won=false;
            
                       System.out.println("p1 is won");
            
                        }
                    }
                     
                }
                if(tictictoe.b4.getText().equals("x")){
                    if(tictictoe.b5.getText().equals("x")){
                    if(tictictoe.b6.getText().equals("x")){
                   p1won=true;
                   p2won=false;
        
                   System.out.println("p1 is won");
        
                    }
                }
                 
            }
        
            if(tictictoe.b7.getText().equals("x")){
                if(tictictoe.b8.getText().equals("x")){
                if(tictictoe.b9.getText().equals("x")){
               p1won=true;
               p2won=false;
        
               System.out.println("p1 is won");
        
                }
            }
             
        }
            
        if(tictictoe.b1.getText().equals("x")){
            if(tictictoe.b4.getText().equals("x")){
            if(tictictoe.b7.getText().equals("x")){
           p1won=true;
           p2won=false;
        
           System.out.println("p1 is won");
        
            }
        }
         
        }
        if(tictictoe.b2.getText().equals("x")){
            if(tictictoe.b5.getText().equals("x")){
            if(tictictoe.b8.getText().equals("x")){
           p1won=true;
           p2won=false;
        
           System.out.println("p1 is won");
        
            }
        }
         
        }
        if(tictictoe.b3.getText().equals("x")){
            if(tictictoe.b6.getText().equals("x")){
            if(tictictoe.b9.getText().equals("x")){
           p1won=true;
           p2won=false;
        
           System.out.println("p1 is won");
        
            }
        }
         
        }
        if(tictictoe.b3.getText().equals("x")){
            if(tictictoe.b5.getText().equals("x")){
                if(tictictoe.b7.getText().equals("x")){
                    p1won=true;
                    p2won=false;
                System.out.println("p1 is won");
                }
            }
        }
        if(tictictoe.b1.getText().equals("x")){
            if(tictictoe.b5.getText().equals("x")){
                if(tictictoe.b9.getText().equals("x")){
                    p1won=true;
                    p2won=false;
                    System.out.println("p2 won");
                }
            }
        }
        
        if(tictictoe.b1.getText().equals("0")){
            if(tictictoe.b2.getText().equals("0")){
                if(tictictoe.b3.getText().equals("0")){
                    p2won=true;
                    p1won=false;
                    System.out.println("p2 won");
                }
            }
        }
        
        if(tictictoe.b4.getText().equals("0")){
        if(tictictoe.b5.getText().equals("0")){
        if(tictictoe.b6.getText().equals("0")){
        p2won=true;
        p1won=false;
        
        System.out.println("p2 is won");
        
        }
        }
        
        }
        
        if(tictictoe.b7.getText().equals("0")){
        if(tictictoe.b8.getText().equals("0")){
        if(tictictoe.b9.getText().equals("0")){
        p2won=true;
        p1won=false;
        
        System.out.println("p2 is won");
        
        }
        }
        
        }
        
        if(tictictoe.b1.getText().equals("0")){
        if(tictictoe.b4.getText().equals("0")){
        if(tictictoe.b7.getText().equals("0")){
        p2won=true;
        p1won=false;
        
        System.out.println("p2 is won");
        
        }
        }
        
        }
        if(tictictoe.b2.getText().equals("0")){
        if(tictictoe.b5.getText().equals("0")){
        if(tictictoe.b8.getText().equals("0")){
        p2won=true;
        p1won=false;
        
        System.out.println("p2 is won");
        
        }
        }
        
        }
        if(tictictoe.b3.getText().equals("0")){
        if(tictictoe.b6.getText().equals("0")){
        if(tictictoe.b9.getText().equals("0")){
        p2won=true;
        p1won=false;
        
        System.out.println("p2 is won");
        
        }
        }
        
        }
        if(tictictoe.b3.getText().equals("0")){
        if(tictictoe.b5.getText().equals("0")){
        if(tictictoe.b7.getText().equals("0")){
        p2won=true;
        p1won=false;
        System.out.println("p2 is won");
        }
        }
        }
        if(tictictoe.b1.getText().equals("0")){
        if(tictictoe.b5.getText().equals("0")){
        if(tictictoe.b9.getText().equals("0")){
        p2won=true;
        p1won=false;
        System.out.println("p2 won");
        }
        }
        }
        if(p1won==true|| p2won==true){
            board.setVisible(false);
        }
        
        
        
        }
        
        
        }
        
        
