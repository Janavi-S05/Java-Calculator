# awt package is imported to develop a Graphical user interface application
import java.awt.*;
import java.awt.event.*;
#ActionListener performs certain actions when a button is clicked
public class Calculator implements ActionListener
{
	int c,num;
	String s1,s2,s3,s4,s5;
  # Frame creates the window
	Frame f;
  # On clicking the button operations are carried out
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,Add,Sub,Mul,Div,Mod,Equal,Clear;
	Panel p;
  # Textfield holds the operands
	TextField tf;
	GridLayout g;
	Calculator()
	{
    # Creates the application name
		f = new Frame("Simple Calculator");
		p = new Panel();
		f.setLayout(new FlowLayout());
    # addActionListener handles all action events when the component is clicked
		b1 = new Button("0");
		b1.addActionListener(this);
		b2 = new Button("1");
		b2.addActionListener(this);
		b3 = new Button("2");
		b3.addActionListener(this);
		b4 = new Button("3");
		b4.addActionListener(this);
		b5 = new Button("4");
		b5.addActionListener(this);
		b6 = new Button("5");
		b6.addActionListener(this);
		b7 = new Button("6");
		b7.addActionListener(this);
		b8 = new Button("7");
		b8.addActionListener(this);
		b9 = new Button("8");
		b9.addActionListener(this);
		b10 = new Button("9");
		b10.addActionListener(this);
		Add = new Button("+");
		Add.addActionListener(this);
		Sub = new Button("-");
		Sub.addActionListener(this);
		Mul = new Button("*");
		Mul.addActionListener(this);
		Div = new Button("/");
		Div.addActionListener(this);
		Mod = new Button("%");
		Mod.addActionListener(this);
		Equal = new Button("=");
		Equal.addActionListener(this);
		Clear = new Button("C");
		Clear.addActionListener(this);
		tf = new TextField(30);
		f.add(tf);
		g = new GridLayout(5,5,30,30);
		p.setLayout(g);
		p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);
		p.add(b10);p.add(Add);p.add(Sub);p.add(Mul);p.add(Div);p.add(Mod);p.add(Equal);p.add(Clear);
		f.add(p);
		f.setSize(400,400);
		f.setVisible(true);
	}
  
  # This function performs the calculation and returns the result in the textfield
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
		  s3 = tf.getText();
		  s4 = "0";
		  s5 = s3+s4;
		  tf.setText(s5);
		}
    if(e.getSource()==b2)
    {
      s3 = tf.getText();
      s4 = "1";
      s5 = s3+s4;
      tf.setText(s5);
    }
    if(e.getSource()==b3)
    {
      s3 = tf.getText();
      s4 = "2";
      s5 = s3+s4;
      tf.setText(s5);
    }
    if(e.getSource()==b4)
    {
      s3 = tf.getText();
      s4 = "3";
      s5 = s3+s4;
      tf.setText(s5);
    }
    if(e.getSource()==b5)
    {
      s3 = tf.getText();
      s4 = "4";
      s5 = s3+s4;
      tf.setText(s5);
    }
    if(e.getSource()==b6)
    {
      s3 = tf.getText();
      s4 = "5";
      s5 = s3+s4;
      tf.setText(s5);
    }
    if(e.getSource()==b7)
    {
      s3 = tf.getText();
      s4 = "6";
      s5 = s3+s4;
      tf.setText(s5);
    }
    if(e.getSource()==b8)
    {
      s3 = tf.getText();
      s4 = "7";
      s5 = s3+s4;
      tf.setText(s5);
    }
    if(e.getSource()==b9)
    {
      s3 = tf.getText();
      s4 = "8";
      s5 = s3+s4;
      tf.setText(s5);
    }
    if(e.getSource()==b10)
    {
      s3 = tf.getText();
      s4 = "9";
      s5 = s3+s4;
      tf.setText(s5);
    }
    if(e.getSource()==Add)
    {
      s1 = tf.getText();
      tf.setText("");
      c=1;
    }
    if(e.getSource()==Sub)
    {
      s1 = tf.getText();
      tf.setText("");
      c=2;
    }
    if(e.getSource()==Mul)
    {
      s1 = tf.getText();
      tf.setText("");
      c=3;
    }
    if(e.getSource()==Div)
    {
      s1 = tf.getText();
      tf.setText("");
      c=4;
    }
    if(e.getSource()==Mod)
    {
      s1 = tf.getText();
      tf.setText("");
      c=5;
    }
	  if(e.getSource()==Equal)
	  {
	    s2 = tf.getText();
	    if(c==1)
	    {
	        num = Integer.parseInt(s1)+Integer.parseInt(s2);
	        tf.setText(String.valueOf(num));
	    }
	    else if(c==2)
	    {
	      num = Integer.parseInt(s1)-Integer.parseInt(s2);
	      tf.setText(String.valueOf(num));
	    }
	    else if(c==3)
      {
        num = Integer.parseInt(s1)*Integer.parseInt(s2);
        tf.setText(String.valueOf(num));
      }
      if(c==4)
      {
        try
        {
          int p=Integer.parseInt(s2);
          if(p!=0)
          {
             num = Integer.parseInt(s1)/Integer.parseInt(s2);
             tf.setText(String.valueOf(num));
          }
          else
           tf.setText("Infinite");
        }
        catch(Exception i){}
        }
        if(c==5)
        {
          num = Integer.parseInt(s1)%Integer.parseInt(s2);
          tf.setText(String.valueOf(num));
        }
      }
      if(e.getSource()==Clear)
      {
        tf.setText("");
      }
    }
  # main function invokes the constructor
  public static void main(String[] args)
  {
	  Calculator mycal = new Calculator();
  }
}
