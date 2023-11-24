package controller;

import dao.ILabClinicoDAO;
import dao.LabClinicoDAOImplementation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import view.ViewMain;

/**
 *
 * @author Daniel Casvill
 */
public class ControladorOrden 
{
    private ViewMain view;
    private ILabClinicoDAO dao = new LabClinicoDAOImplementation();
    
    public ControladorOrden(ViewMain view) 
    {
        this.view = view;
        
        this.view.addBtnNuevaOrdenAñadirExamenListener(new OrdenListener());
        this.view.addBtnNuevaOrdenEliminarExamen(new OrdenListener());
        this.view.setVisible(true);
        this.view.setLocationRelativeTo(null);
    }
    
    class OrdenListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getActionCommand().equalsIgnoreCase("Añadir Exámen"))
            {
                String sql = "SELECT tipo_examen FROM ValorExamen;";
                String resultSQL =  dao.realizarConsulta(sql);
                String[] examenes = resultSQL.split("-");
                
                
                
                // Crear un panel personalizado con un JTextField y un JComboBox
                JPanel panel = new JPanel(new GridLayout(2, 2));
                JComboBox<String> comboBox = new JComboBox<>();                
                panel.add(new JLabel("Examen:"));
                panel.add(comboBox);                
                
                for(int i = 0; i < examenes.length ;i ++)
                {
                   comboBox.addItem(examenes[i]);
                }
                
                comboBox.setSelectedIndex(-1);
                
                int result = JOptionPane.showConfirmDialog(null, panel, "Añadir Exámen", JOptionPane.OK_CANCEL_OPTION);

                // Manejar la respuesta del usuario
                if (result == JOptionPane.OK_OPTION) 
                {                                
                    if(comboBox.getSelectedIndex() != -1)
                    {
                        String selectedOption = comboBox.getSelectedItem().toString();
                        view.añadirExamen(selectedOption);
                    }                                                                  
                }
            }
            
        }
        
    }
    
}
