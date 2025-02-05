
package powerpuffgirls;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
public class Powerpuffgirls extends JPanel { 
public void  paintComponent (Graphics g){
// background 
g.setColor(new Color(0,153,76));
g.fillRect(0,0,400,165);
g.setColor(new Color(253,153,153));
g.fillRect(0,165,400,240);
g.setColor(new Color(215,193,85));
g.fillRect(0,330,400,500);    
//buttercup
//arm
g.setColor(Color.black);
g.fillRoundRect(48,98,12,30, 50,20);
g.fillRoundRect(80,98,12,30, 50,20);
g.setColor(new Color(255,204,153));
g.fillRoundRect(50,100,10,25, 50,20);
g.fillRoundRect(80,100,10,25, 50,20);
   
//hair
g.setColor(Color.black);
g.fillArc(5,35, 130, 65, 0, 360);
g.setColor(new Color(0,153,76));
g.fillArc(-55,30, 70, 60, 0, 360);
g.fillArc(125,30, 70, 60, 0, 360);
//feet
g.setColor(Color.black);
g.fillRoundRect(57, 120, 14, 37, 50, 20);
g.fillRoundRect(70, 120, 14, 37, 50, 20);
g.setColor(Color.WHITE);
g.fillRoundRect(60, 120, 9, 30, 50, 20);
g.fillRoundRect(72, 120, 9, 30, 50, 20);
g.setColor(Color.black);
g.drawLine(59, 146, 68, 146);
g.drawLine(72, 146, 81, 146);
int x[]={55,61,61};
int y[]={130,80,130};
g.setColor(Color.black);
g.fillPolygon(x,y,3);
int a[]={80,77,85};
int b[]={95,130,130};
g.setColor(Color.black);
g.fillPolygon(a,b,3);
//body
g.setColor(Color.black);
g.fillRect(60, 90, 20, 40);
    

//head
g.setColor(Color.black);
g.fillOval( 14, 10, 112,  88);
g.setColor(new Color(255,204,153));
g.fillOval( 20, 22, 100, 75);
//eyes
g.setColor(Color.black);
g.fillOval(18, 25, 49, 49);
g.fillOval(73, 25, 49, 49);
g.setColor(Color.white);
g.fillOval(19, 26, 47, 47);
g.fillOval(74, 26, 47, 47);
g.setColor(new Color(0,204,0));
g.fillOval(26, 29, 41, 41);
g.fillOval(73, 29, 41, 41);
g.setColor(Color.black);
g.fillOval(35, 36, 31, 31);
g.fillOval(74, 36, 31, 31);
g.setColor(Color.white);
g.fillOval(46, 45, 12, 12);
g.fillOval(82, 45, 12, 12);
//smile
g.setColor(Color.black);
g.drawArc(65, 70, 10, 13, 0, -180);
//hair
g.setColor(Color.black);
//dress
int d[]={62,64,77,79};
int c []={105,100,100,105};
g.setColor(new Color(0,204,0));
g.fillPolygon(d,c,4);
int e[]={60,61,80,81};
int f []={125,115,115,125};
g.setColor(new Color(0,204,0));
g.fillPolygon(e,f,4);
//bangs
g.setColor(Color.black);
g.fillArc(23, 15, 95, 43, 0, 180);
int i[]={50,18,23};
int h []={35,47,36};
g.setColor(Color.black);
g.fillPolygon(i,h,3);
int j[]={90,117,122};
int k []={35,35,46};
g.setColor(Color.BLACK);
g.fillPolygon(j,k,3);
int m[]={65,75,70};
int n []={37,37,27};
g.setColor(new Color(255,204,153));
g.fillPolygon(m,n,3);
//text
g.setColor(new Color(0,51,25));
g.setFont(new Font("IMPACT", Font.PLAIN,53));  g.drawString("BUTTERCUP",141,99);
g.setColor(new Color(253,153,153));
g.setFont(new Font("IMPACT", Font.PLAIN,50));    g.drawString("BUTTERCUP",146,100);
    


//blossom
//ribbon
g.setColor(Color.black);
g.fillArc(278,190,50,60,0,180);
g.setColor(Color.red);
g.fillArc(278,193,50,60,0,180);
g.setColor(Color.black);
g.fillArc(266,148,32,80,0,360);
g.fillArc(311,148,32,80,0,360); 
g.setColor(Color.red);
g.fillArc(270,152,25,80,0,360);
g.fillArc(314,152,25,80,0,360); 
//hair
g.setColor(new Color(204,120,0));
g.fillArc(270,285,70,60,0,360);
g.setColor(new Color(253,153,153));
g.fillArc(223,263,70,60,0,360);
g.fillArc(317,263,70,60,0,360);
//head
g.setColor(Color.black); g.fillOval( 250, 200, 111,  96);
g.setColor(new Color(255,204,153));
g.fillOval(253, 203, 105, 90);
//eyes
g.setColor(Color.black);
g.fillOval(251, 222, 49, 49);
g.fillOval(310, 222, 49, 49);
g.setColor(Color.white);
g.fillOval(252, 223, 47, 47);
g.fillOval(311, 223, 47, 47);
g.setColor(new Color(255,153,153));
g.fillOval(256, 226, 43, 43);
g.fillOval(311, 226, 43, 43);
g.setColor(Color.black);
g.fillOval(264, 231, 35, 35);
g.fillOval(311, 231, 35, 35);
g.setColor(Color.white);
g.fillOval(277, 240, 14, 15);
g.fillOval(320, 240, 14, 15);
//bangs
g.setColor(new Color(204,120,0));
g.fillArc(258,203,95,58,0,180);
 int q[]={296,314,305};
 int z []={233,233,218};
g.setColor(new Color(255,204,153));
g.fillPolygon(q,z,3);
//smile
g.setColor(Color.black);
g.drawArc(299,268,12,15,0,-180);
//feet
g.setColor(Color.black);
g.fillRoundRect(295,320,14,37,50, 20);
g.fillRoundRect(305,320,14,37,50, 20);
g.setColor(Color.WHITE);
g.fillRoundRect(297,320,9,30,50, 20);
g.fillRoundRect(308,320,9,30,50, 20);
g.setColor(Color.black);
g.drawLine(296, 344, 305, 344);
g.drawLine(303, 344, 317, 344);
//arm
g.setColor(Color.black);
g.fillRoundRect(283, 293, 12, 32, 50,20);
g.fillRoundRect(315, 293, 12, 32, 50,20);
g.setColor(new Color(255,204,153));
g.fillRoundRect(285, 295, 10, 30, 50,20);
g.fillRoundRect(315, 295, 10, 30, 50,20);
//body
g.setColor(Color.black);
g.fillRect(295, 296, 20, 35);
g.setColor(Color.BLACK);
int A[]={290,295,305};
int B[]={331,295,331};
g.setColor(Color.black);
g.fillPolygon(A,B,3);
int V[]={310,315,323};
int C[]={331,295,331};
g.setColor(Color.black);
g.fillPolygon(V,C,3);
//dress
int ab[]={297,299,312,314};
int bc []={302,298,298,302};
g.setColor(new Color(255,153,153));
g.fillPolygon(ab,bc,4);
int ef[]={295,296,315,317};
int fg []={325,315,315,325};
g.setColor(new Color(255,153,153));
g.fillPolygon(ef,fg,4);
//text
g.setColor(new Color(188,143,143));
g.setFont(new Font("IMPACT", Font.PLAIN,52));  g.drawString("BLOSSOM",15,280);
g.setColor(new Color(255,255,153));
g.setFont(new Font("IMPACT", Font.PLAIN,50));    g.drawString("BLOSSOM",17,280);
//bubbles //hair
g.setColor(Color.yellow);
g.fillOval( 20, 347, 40,40);
g.setColor(Color.yellow);
g.fillOval(10,370,40,40);
g.setColor(new Color(215,193,85));
g.fillOval( -10, 367, 35,35);
//head
g.setColor(Color.black);
g.fillOval( 30, 340, 110,  96);
g.setColor(new Color(255,204,153));
g.fillOval( 35, 343, 100, 90);
//eyes
g.setColor(Color.black);
g.fillOval(32, 358, 47, 62);
g.fillOval(84, 358, 51, 62);
g.setColor(Color.white);
g.fillOval(32, 360, 45, 58);
g.fillOval(85, 360, 49, 58);
g.setColor(new Color(135,206,235));
g.fillOval(34, 361, 44, 56);
g.fillOval(85, 361, 48, 56);
g.setColor(Color.black);
g.fillOval(42, 368, 37, 44);
g.fillOval(90, 368, 41, 44);
g.setColor(Color.white);
g.fillOval(56, 384, 14, 15);
g.fillOval(102, 384, 14, 15); 
//hair
g.setColor(Color.yellow);
g.fillOval( 120, 347, 45,45);
g.setColor(Color.yellow);
g.fillArc(122,345,70,60,0,-180);
g.fillArc(39,343, 90, 55, 0, 180);
g.setColor(new Color(215,193,85));
g.fillOval( 158, 368, 40,40);
int pp[]={70,85,95};
int oo []={372,360,372};
g.setColor(new Color(255,204,153));
g.fillPolygon(pp,oo,3);
//smile
g.setColor(Color.black);
g.fillArc(74,395,15,35,0,-180);
g.setColor(new Color(255,204,153));
g.fillOval(75,403,12,15);
g.setColor(new Color(255,102,102));
g.fillOval(80,422,5,6);
//text
g.setColor(new Color(0,51,25));
g.setFont(new Font("IMPACT", Font.PLAIN,53)); g.drawString("BUBBLES",180,420);
g.setColor(new Color(51,255,153));
g.setFont(new Font("IMPACT", Font.PLAIN,50));   g.drawString("BUBBLES",183,420);
}   
public static void main(String[] args){
Powerpuffgirls panel = new Powerpuffgirls();
JFrame test = new JFrame("Powerpuffs");
test.add(panel);
test.setSize(400,500);
test.setVisible(true);
    }  
}

