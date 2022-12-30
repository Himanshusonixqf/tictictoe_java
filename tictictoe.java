

import javax.swing.JButton;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tictictoe extends JFrame   {
 // super("tictictoe_GAME") ; 
//  public static ButtonGroup bg;

 public static JButton b1;
 public static JButton b2;
 public static JButton b3;
 public static JButton b4;
 public static JButton b5;
 public static JButton b6;
 public static JButton b7;
 public static JButton b8;
 public static JButton b9;
 @Override
 public void setTitle(String title) {
   // TODO Auto-generated method stub
   super.setTitle("tictictoe_GAME");
 }
 
Main main=new Main();
// JFrame fr=new JFrame();

  Container c=getContentPane();
public   tictictoe(){
 initComponenet();
 
}
public void initComponenet(){


 b1=new JButton();
 b2=new JButton();
 b3=new JButton();
 b4=new JButton();
 b5=new JButton();
 b6=new JButton();
 b7=new JButton();
 b8=new JButton();
 b9=new JButton();

c.add(b1);
c.add(b2);
c.add(b3);
c.add(b4);
c.add(b5);
c.add(b6);
c.add(b7);
c.add(b8);
c.add(b9);
 

 setVisible(true);
setLayout(new GridLayout(3,3,7,8));
setSize(600,650);

//Container contentPane=getContentPane();

b1.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
    
      if(b1.getText().equals("")){
      if(Main.p1turn==true){
        b1.setText("x");
        Main.isWon();
        Main.p1turn=false;
        Main.p2turn=true;

      }
      else{b1.setText("0");
    Main.isWon();
      Main.p2turn=false;
      Main.p1turn=true;}
      }  
    }
    

});


b2.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
      if(b2.getText().equals("")){
      if(Main.p1turn==true){
        b2.setText("x");
        Main.isWon();
        Main.p1turn=false;
        Main.p2turn=true;

      }
      else{b2.setText("0");
    Main.isWon();
      Main.p2turn=false;
      Main.p1turn=true;}
      }  
    }
    

});

b3.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
      if(b3.getText().equals("")){
      if(Main.p1turn==true){
        b3.setText("x");
        Main.isWon();
        Main.p1turn=false;
        Main.p2turn=true;

      }
      else{b3.setText("0");
    Main.isWon();
      Main.p1turn=true;
      Main.p2turn=false;}
      }  
    }
    

});


b4.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
      if(b4.getText().equals("")){
      if(Main.p1turn==true){
        b4.setText("x");
        Main.isWon();
        Main.p1turn=false;
        Main.p2turn=true;

      }
      else{b4.setText("0");
    Main.isWon();
      Main.p1turn=true;
      Main.p2turn=false;}
      }  
    }
    

});

b5.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
      if(b5.getText().equals("")){
      if(Main.p1turn==true){
        b5.setText("x");
        Main.isWon();
        Main.p1turn=false;
        Main.p2turn=true;

      }
      else{b5.setText("0");
    Main.isWon();
      Main.p1turn=true;
      Main.p2turn=false;}
      }  
    }
    

});


b6.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
      if(b6.getText().equals("")){
      if(Main.p1turn==true){
        b6.setText("x");
        Main.isWon();
        Main.p1turn=false;
        Main.p2turn=true;

      }
      else{b6.setText("0");
    Main.isWon();
      Main.p1turn=true;
      Main.p2turn=false;}
      }  
    }
    

});

b7.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
      if(b7.getText().equals("")){
      if(Main.p1turn==true){
        b7.setText("x");
        Main.isWon();
        Main.p1turn=false;
        Main.p2turn=true;

      }
      else{b7.setText("0");
    Main.isWon();
      Main.p1turn=true;
      Main.p2turn=false;}
      }  
    }
    

});

b8.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
      if(b8.getText().equals("")){
      if(Main.p1turn==true){
        b8.setText("x");
        Main.isWon();
        Main.p1turn=false;
        Main.p2turn=true;

      }
      else{b8.setText("0");
    Main.isWon();
      Main.p1turn=true;
      Main.p2turn=false;}
      }  
    }
    

});

   
//pack();
    



   


b9.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
        
          if(b9.getText().equals("")){
          if(Main.p1turn==true){
            b9.setText("x");
            Main.isWon();
            Main.p1turn=false;
            Main.p2turn=true;
    
          }
          else{b9.setText("0");
        Main.isWon();
          Main.p1turn=true;
          Main.p2turn=false;}
          }  
        }
     });
    }
    // GroupLayout contentPaneLayout = new GroupLayout(contentPane);
    // contentPane.setLayout(contentPaneLayout);
    // contentPaneLayout.setHorizontalGroup(
    //     contentPaneLayout.createParallelGroup()
    //         .addGroup(contentPaneLayout.createSequentialGroup()
    //             .addContainerGap()
    //             .addGroup(contentPaneLayout.createParallelGroup()
    //                 .addGroup(contentPaneLayout.createSequentialGroup()
    //                     .addComponent(b1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
    //                     .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
    //                     .addComponent(b2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
    //                     .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
    //                     .addComponent(b3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
    //                 .addGroup(contentPaneLayout.createSequentialGroup()
    //                     .addComponent(b4, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
    //                     .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
    //                     .addComponent(b5, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
    //                     .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
    //                     .addComponent(b6, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
    //                 .addGroup(contentPaneLayout.createSequentialGroup()
    //                     .addComponent(b7, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
    //                     .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
    //                     .addComponent(b8, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
    //                     .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
    //                     .addComponent(b9, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
    //             .addContainerGap(11, Short.MAX_VALUE))
    // );
    // contentPaneLayout.setVerticalGroup(
    //     contentPaneLayout.createParallelGroup()
    //         .addGroup(contentPaneLayout.createSequentialGroup()
    //             .addContainerGap()
    //             .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
    //                 .addComponent(b1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
    //                 .addComponent(b2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
    //                 .addComponent(b3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
    //             .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
    //             .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
    //                 .addComponent(b4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
    //                 .addComponent(b5, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
    //                 .addComponent(b6, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
    //             .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
    //             .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
    //                 .addComponent(b7, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
    //                 .addComponent(b8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
    //                 .addComponent(b9, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
    //             .addContainerGap(15, Short.MAX_VALUE))
    // );
    // pack();
    // setLocationRelativeTo(getOwner());
    // // JFormDesigner - End of component initialization  //GEN-END:initComponents

    // }

  

    
}
        
    
    
    


        
    
    
