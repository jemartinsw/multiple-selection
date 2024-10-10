import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MultipleSelectionFrame extends JFrame 
{
   private final JList<String> colorJList; // variaveis de uso exclusivo da classe (lista de seleção)
   private final JList<String> copyJList; // list to hold copied names (lista branca)   
   private final JList<String> fruitJList; // variaveis de uso exclusivo da classe (lista de seleção)
   private final JList<String> copiJList; // list to hold copied names (lista branca)


   private JButton copyJButton; // button to copy selected names
   private JButton copiJButton; // button to copy selected names
   private static final String[] fruitNames = {"Abacaxi", "Caqui", "Coco","Uva","Laranja","Pêssego","Morango"};
   private static final String[] colorNames = {"Black", "Blue", "Cyan",//matriz das cores
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow"};

     public MultipleSelectionFrame() // MultipleSelectionFrame constructor
   {
      super("Multiple Selection Lists");
      setLayout(new FlowLayout());//método herdado do jframe que define tipo do layout(ssaida de camada atraves do fluxo de entrada)

      colorJList = new JList<String>(colorNames); // list of color names. atribui objeot
      colorJList.setVisibleRowCount(5); // show five rows. define quantia d elinhas
      colorJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(colorJList)); // add list with scrollpane. Painel = jscrollpane

      copyJButton = new JButton("Copy >>>"); //atribui novo objeto jbutton ao copyjbutton
      copyJButton.addActionListener(//invoca objeto addactionlistener
         new ActionListener() // anonymous inner class 
         {  
            // handle button event
            @Override//sobrescrever
            public void actionPerformed(ActionEvent event)//event recebe informações do evento 
            {
               // place selected values in copyJList
               copyJList.setListData(//define a configuração dos dados da lista do quadro em branco. 
                  colorJList.getSelectedValuesList().toArray(//transforma o conversor em matriz de string que usa o 0 como o primeiro item selecionado
                     new String[0]));
            }
         } 
      ); 

      add(copyJButton); // add copy button to JFrame

      copyJList = new JList<String>(); // list to hold copied color names. Copyjlist é o quador embranco da lista
      copyJList.setVisibleRowCount(3); // define 5 linhas
      copyJList.setFixedCellWidth(100); // set width
      copyJList.setFixedCellHeight(15); // set height
      copyJList.setSelectionMode(//
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);//
      add(new JScrollPane(copyJList)); // add list with scrollpane

      fruitJList = new JList<String>(fruitNames); // list of color names. atribui objeot
      fruitJList.setVisibleRowCount(3); // show five rows. define quantia d elinhas
      fruitJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(fruitJList)); // add list with scrollpane. Painel = jscrollpane

      copiJButton = new JButton("Copy >>>"); //atribui novo objeto jbutton ao copyjbutton
      copiJButton.addActionListener(//invoca objeto addactionlistener
         new ActionListener() // anonymous inner class 
         {  
            // handle button event
            @Override//sobrescrever
            public void actionPerformed(ActionEvent event)//event recebe informações do evento 
            {
               // place selected values in copyJList
               copiJList.setListData(//define a configuração dos dados da lista do quadro em branco. 
                  fruitJList.getSelectedValuesList().toArray(//transforma o conversor em matriz de string que usa o 0 como o primeiro item selecionado
                     new String[0]));
            }
         } 
      );

      add(copiJButton); // add copy button to JFrame

      copiJList = new JList<String>(); // list to hold copied color names. Copyjlist é o quador embranco da lista
      copiJList.setVisibleRowCount(3); // define 5 linhas
      copiJList.setFixedCellWidth(100); // set width
      copiJList.setFixedCellHeight(15); // set height
      copiJList.setSelectionMode(//
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);//
      add(new JScrollPane(copiJList)); // add list with scrollpane
   } 
} 
