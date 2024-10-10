import javax.swing.*;

public class MultipleSelectionTest
{
   public static void main(String[] args)
   { 
      MultipleSelectionFrame multipleSelectionFrame =//declara variavel multiple selection frame
         new MultipleSelectionFrame(); //recebe construtor que ta dentro do arquivo
      multipleSelectionFrame.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE);
      multipleSelectionFrame.setSize(450, 200); 
      multipleSelectionFrame.setVisible(true); 
   } 
}