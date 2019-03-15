package MVC1.view;

import MVC1.controller.Controller;
import MVC1.model.Model;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class SwingView implements ActionListener, View
{
    private JFrame frame;
    private JList<String> list;
    private JButton btnAdd;
    private JButton btnRem;
    private JTextField txbField;
    private Controller controller;
    
    public SwingView() 
    {
        initComponents();
    }

    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == btnAdd)
        {
            controller.addAction( txbField.getText() );
        } else if (e.getSource() == btnRem)
        {
            controller.removeAction( list.getSelectedValue() );
            list.clearSelection();
        }
    }

    @Override
    public void dispose() 
    {
        frame.dispose();
    }

    @Override
    public void setController(Controller controller) {    this.controller=controller;   }

    @Override
    public void setModel(Model model) {
        list.setModel( new ModelWrapper(model) );
    }

    @Override public void show() 
    {
        SwingUtilities.invokeLater( ()-> frame.setVisible(true) );
    }
    
    private void initComponents()
    {
        frame = new JFrame("List");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout( new FlowLayout() );
        frame.setSize( new Dimension(500, 150) );
        frame.setContentPane(mainPanel);
        
        list = createList();
        mainPanel.add(list);
                
        txbField = createField();
        mainPanel.add(txbField);
        
        btnAdd = createButton("Add");
        mainPanel.add(btnAdd);
        
        btnRem = createButton("Remove");
        mainPanel.add(btnRem);
        
    }
    
    private JButton createButton( String name)
    {
        JButton btn = new JButton(name);
        btn.addActionListener(this);
        btn.setEnabled(false);
        return btn;
    }
    
    private JTextField createField()
    {
        JTextField fld = new JTextField(15);
        fld.getDocument().addDocumentListener(
            new DocumentListener() 
            {
                @Override
                public void insertUpdate(DocumentEvent e) {
                   updateAddButtonState();          }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    updateAddButtonState();           }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    updateAddButtonState();           }

                private void updateAddButtonState() {
                    btnAdd.setEnabled( !txbField.getText().isEmpty() );
            }
            
        }       );
        return fld;
    }
    
    private JList<String> createList()
    {
        JList<String> lst = new JList<String>();
        lst.setPreferredSize( new Dimension(100,100));
        lst.addListSelectionListener( e->btnRem.setEnabled(!list.isSelectionEmpty()) );
        return lst;
    }
    
    private  class ModelWrapper extends AbstractListModel<String> implements Observer
    {
        private Model model;

        public ModelWrapper(Model model) {
            this.model = model;
            model.addObserver(this);
        }
        
        @Override
        public int getSize() { return model.size();       }

        @Override
        public String getElementAt(int index) {   return model.get(index);     }

        @Override
        public void update(Observable o, Object arg) {
            fireContentsChanged(this, 0, model.size());
        }
        
    }
}
