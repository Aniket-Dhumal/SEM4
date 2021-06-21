import javax.swing.*; 

import java.awt.event.*; 

import java.net.*; 
//Author @CodeWithCoffee.tech
// URL Information Finder

public class IPFinder extends JFrame implements ActionListener

{ 

    JLabel l,l1,l2,l3,l4,l5,l6; 

    JTextField tf; 

    JButton b,c; 

    IPFinder()

   { 

    super("URL Information Finder  (Project By- Aniket )"); 

    l=new JLabel("Enter URL:"); 

    l.setBounds(10,50,50,30);; 

    tf=new JTextField(); 

    tf.setBounds(80,100,400,40); 

   

    l1=new JLabel("IP Address: :-");
    l1.setBounds(20,250,200,30);
    l2=new JLabel("Protocall: :-");
    l2.setBounds(20,300,200,30);
    l3=new JLabel("Host Name: :-");
    l3.setBounds(20,370,200,30);
    l4=new JLabel("Port Number: :-");
    l4.setBounds(20,430,200,30);
    l5=new JLabel("Default Port Number :-");
    l5.setBounds(20,500,200,30);
    l6=new JLabel("Path: :-");
    l6.setBounds(50,620,400,30);
    

   //Button With Action 

    b=new JButton("Get Information"); 

    b.setBounds(50,150,200,40); 

    b.addActionListener(this); 

// Space Buttons With Menu
    //c=new JButton("Get Information"); 
    //c.setBounds(100,300,160,60);

    add(l); 

    add(tf); 

    add(b); 

    add(l1);

    add(l2);

    add(l3); 

    add(l4); 

    add(l5); 

    add(l6);
    


    setSize(550,725); 

    

    setVisible(true); 

} 

public void actionPerformed(ActionEvent e){ 

    String url=tf.getText(); 
   
    

    try { 
         URL u=new URL(url);
        String hostname= u.getHost();
        InetAddress ia=InetAddress.getByName(hostname); 

        String ip=ia.getHostAddress(); 

        l1.setText("IP Address :: "+ip);
        
        String Pr=u.getProtocol();
        l2.setText("Protocall :: "+Pr);

        String hn=u.getHost();
        l3.setText("Host Name :: "+hn);

        int po=u.getPort();
        String s=Integer.toString(po);
        l4.setText("Port :: "+s);

        int dp=u.getDefaultPort();
        String k=Integer.toString(dp);
        l5.setText("Default Port :: "+k);

        String Path=u.getPath();
        l6.setText("Path :: "+Path);

       

    } catch (Exception e1) { 

        JOptionPane.showMessageDialog(this,e1.toString()); 

    } 

} 

public static void main(String[] args) { 

    new IPFinder(); 

} 

}  