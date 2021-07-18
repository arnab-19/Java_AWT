import java.awt.*;  
import java.awt.event.*;  
public class Dnaexample extends Frame implements ActionListener{  
    TextField tf; Label l; Button b; Label n;Label n1;Label n2;Label n3;
    Dnaexample(){  
        tf=new TextField();  
        tf.setBounds(50,50, 150,20);  
        l=new Label(); 
        l.setBounds(50,100, 250,20);  
    n=new Label(); 
        n.setBounds(50,150, 250,20); 
n1=new Label(); 
        n1.setBounds(50,200, 250,20);
n2=new Label(); 
        n2.setBounds(50,250, 250,20);
n3=new Label(); 
        n3.setBounds(50,300, 250,20);
        b=new Button("DNA sequence");  
        b.setBounds(50,350,100,30);  
        b.addActionListener(this);    
        add(b);add(tf);add(l);add(n);add(n1);add(n2);add(n3);    
        setSize(500,500);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e) {
String m2=  tf.getText();
int m= tf.getText().length(); 
char m1='A';char m5='C';
char m4='T';char m6='G';
int a1=0,a2=0,a3=0,a4=0;
for(int i=0;i<m;i++){
if (m2.charAt(i)==m1){
a1= a1 + 1;
}
if (m2.charAt(i)==m4){
a2= a2 + 1;
}
if (m2.charAt(i)==m5){
a3= a3 + 1;
}
if (m2.charAt(i)==m6){
a4= a4 + 1;
}
}
float f1=(float)a1/m*100;
float f2=(float)a2/m*100;
float f3=(float)a3/m*100;
float f4=(float)a4/m*100;
n.setText("A frequency: " + f1);
n1.setText("T frequency: " + f2);
n2.setText("C frequency: " + f3);
n3.setText("G frequency: " + f4);
l.setText("Total count: " + m);
}
    public static void main(String[] args) {  
        new Dnaexample();  
    }  
}  