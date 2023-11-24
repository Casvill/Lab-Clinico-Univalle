package view;

import java.awt.event.ActionListener;
/**
 *
 * @author Daniel Casvill
 */
public class ViewMain extends javax.swing.JFrame {

    /**
     * Creates new form mainView
     */

    public ViewMain() {
        initComponents();
        setSize(790,678);
        setTitle("Laboratorio Clínico Univalle");
                     
    }
    
   public void addBtnAñadirExamenListener(ActionListener listenControllers){
        jbAñadirExamen.addActionListener(listenControllers);}

   public void addBtnEliminarExamen(ActionListener listenControllers){
        jbEliminarExamen.addActionListener(listenControllers);}
   
   public void addBtnRegistrarPacienteAñadirTelefono(ActionListener listenControllers){
        jbRegistrarPacienteAñadirTelefono.addActionListener(listenControllers);}
    
   public void addBtnRegistrarPacienteEliminarTelefono(ActionListener listenControllers){
        jbRegistrarPacienteEliminarTelefono.addActionListener(listenControllers);}
   
   public void addBtnActualizarPacienteBuscar(ActionListener listenControllers){
        jbActualizarPacienteBuscar.addActionListener(listenControllers);}
   
   public void addBtnActualizarPacienteAñadirTelefono(ActionListener listenControllers){
        jbActualizarPacienteAñadirTelefono.addActionListener(listenControllers);}
   
   public void addBtnActualizarPacienteEliminarTelefono(ActionListener listenControllers){
        jbActualizarPacienteEliminarTelefono.addActionListener(listenControllers);}
   
   public void addBtnActualizarPacienteActualizar(ActionListener listenControllers){
        jbActualizarPacienteActualizar.addActionListener(listenControllers);}
   
   public void addBtnRegistrarMedicoAñadirTelefono(ActionListener listenControllers){
        jbRegistrarMedicoAñadirTelefono.addActionListener(listenControllers);}
   
   public void addBtnRegistrarMedicoEliminarTelefono(ActionListener listenControllers){
        jbRegistrarMedicoEliminarTelefono.addActionListener(listenControllers);}
   
   public void addBtnActualizarMedicoBuscar(ActionListener listenControllers){
        jbActualizarMedicoBuscar.addActionListener(listenControllers);}
   
   public void addBtnActualizarMedicoAñadirTelefono(ActionListener listenControllers){
        jbActualizarMedicoAñadirTelefono.addActionListener(listenControllers);}
     
   public void addBtnActualizarMedicoEliminar(ActionListener listenControllers){
        jbActualizarMedicoEliminar.addActionListener(listenControllers);}
   
   public void addBtnActualizarMedicoActualizar(ActionListener listenControllers){
        jbActualizarMedicoActualizar.addActionListener(listenControllers);}
 
   public void addBtnEliminarMedicoBuscar(ActionListener listenControllers){
        jbEliminarMedicoBuscar.addActionListener(listenControllers);}
   
   public void addBtnEliminarMedicoEliminar(ActionListener listenControllers){
        jbEliminarMedicoEliminar.addActionListener(listenControllers);}
 
   public String getJtfActualizarMedicoApellidos() {
        return jtfActualizarMedicoApellidos.getText();
    }

    public void setJtfActualizarMedicoApellidos(String text) {
        jtfActualizarMedicoApellidos.setText(text);
    }

    public String getJtfActualizarMedicoCedula() {
        return jtfActualizarMedicoCedula.getText();
    }

    public void setJtfActualizarMedicoCedula(String text) {
        jtfActualizarMedicoCedula.setText(text);
    }

    public String getJtfActualizarMedicoDireccion() {
        return jtfActualizarMedicoDireccion.getText();
    }

    public void setJtfActualizarMedicoDireccion(String text) {
        jtfActualizarMedicoDireccion.setText(text);
    }

    public String getJtfActualizarMedicoNombres() {
        return jtfActualizarMedicoNombres.getText();
    }

    public void setJtfActualizarMedicoNombres(String text) {
        jtfActualizarMedicoNombres.setText(text);
    }

    public String getJtfActualizarPacienteApellidos() {
        return jtfActualizarPacienteApellidos.getText();
    }

    public void setJtfActualizarPacienteApellidos(String text) {
        jtfActualizarPacienteApellidos.setText(text);
    }

    public String getJtfActualizarPacienteCedula() {
        return jtfActualizarPacienteCedula.getText();
    }

    public void setJtfActualizarPacienteCedula(String text) {
        jtfActualizarPacienteCedula.setText(text);
    }

    public String getJtfActualizarPacienteEmail() {
        return jtfActualizarPacienteEmail.getText();
    }

    public void setJtfActualizarPacienteEmail(String text) {
        jtfActualizarPacienteEmail.setText(text);
    }

    public String getJtfActualizarPacienteFechaDeNacimiento() {
        return jtfActualizarPacienteFechaDeNacimiento.getText();
    }

    public void setJtfActualizarPacienteFechaDeNacimiento(String text) {
        jtfActualizarPacienteFechaDeNacimiento.setText(text);
    }

    public String getJtfActualizarPacienteNombreContacto() {
        return jtfActualizarPacienteNombreContacto.getText();
    }

    public void setJtfActualizarPacienteNombreContacto(String text) {
        jtfActualizarPacienteNombreContacto.setText(text);
    }

    public String getJtfActualizarPacienteNombres() {
        return jtfActualizarPacienteNombres.getText();
    }

    public void setJtfActualizarPacienteNombres(String text) {
        jtfActualizarPacienteNombres.setText(text);
    }

    public String getJtfActualizarPacientePOS() {
        return jtfActualizarPacientePOS.getText();
    }

    public void setJtfActualizarPacientePOS(String text) {
        jtfActualizarPacientePOS.setText(text);
    }

    public String getJtfActualizarPacienteTelefonoContacto() {
        return jtfActualizarPacienteTelefonoContacto.getText();
    }

    public void setJtfActualizarPacienteTelefonoContacto(String text) {
        jtfActualizarPacienteTelefonoContacto.setText(text);
    }

    public String getJtfEliminarMedicoCedula() {
        return jtfEliminarMedicoCedula.getText();
    }

    public void setJtfEliminarMedicoCedula(String text) {
        jtfEliminarMedicoCedula.setText(text);
    }

    public String getJtfEliminarPacienteCedula() {
        return jtfEliminarPacienteCedula.getText();
    }

    public void setJtfEliminarPacienteCedula(String text) {
        jtfEliminarPacienteCedula.setText(text);
    }

    public String getJtfFechaDeSolicitud() {
        return jtfFechaDeSolicitud.getText();
    }

    public void setJtfFechaDeSolicitud(String text) {
        jtfFechaDeSolicitud.setText(text);
    }

    public String getJtfNuevaOrdenFechaDeIngreso() {
        return jtfNuevaOrdenFechaDeIngreso.getText();
    }

    public void setJtfNuevaOrdenFechaDeIngreso(String text) {
        jtfNuevaOrdenFechaDeIngreso.setText(text);
    }

    public String getJtfRegistrarMedicoApellidos() {
        return jtfRegistrarMedicoApellidos.getText();
    }

    public void setJtfRegistrarMedicoApellidos(String text) {
        jtfRegistrarMedicoApellidos.setText(text);
    }

    public String getJtfRegistrarMedicoCedula() {
        return jtfRegistrarMedicoCedula.getText();
    }

    public void setJtfRegistrarMedicoCedula(String text) {
        jtfRegistrarMedicoCedula.setText(text);
    }

    public String getJtfRegistrarMedicoDireccion() {
        return jtfRegistrarMedicoDireccion.getText();
    }

    public void setJtfRegistrarMedicoDireccion(String text) {
        jtfRegistrarMedicoDireccion.setText(text);
    }

    public String getJtfRegistrarMedicoNombres() {
        return jtfRegistrarMedicoNombres.getText();
    }

    public void setJtfRegistrarMedicoNombres(String text) {
        jtfRegistrarMedicoNombres.setText(text);
    }

    public String getJtfRegistrarPacienteApellidos() {
        return jtfRegistrarPacienteApellidos.getText();
    }

    public void setJtfRegistrarPacienteApellidos(String text) {
        jtfRegistrarPacienteApellidos.setText(text);
    }

    public String getJtfRegistrarPacienteCedula() {
        return jtfRegistrarPacienteCedula.getText();
    }

    public void setJtfRegistrarPacienteCedula(String text) {
        jtfRegistrarPacienteCedula.setText(text);
    }

    public String getJtfRegistrarPacienteEmail() {
        return jtfRegistrarPacienteEmail.getText();
    }

    public void setJtfRegistrarPacienteEmail(String text) {
        jtfRegistrarPacienteEmail.setText(text);
    }

    public String getJtfRegistrarPacienteFechaDeNacimiento() {
        return jtfRegistrarPacienteFechaDeNacimiento.getText();
    }

    public void setJtfRegistrarPacienteFechaDeNacimiento(String text) {
        jtfRegistrarPacienteFechaDeNacimiento.setText(text);
    }

    public String getJtfRegistrarPacienteNombreContacto() {
        return jtfRegistrarPacienteNombreContacto.getText();
    }

    public void setJtfRegistrarPacienteNombreContacto(String text) {
        jtfRegistrarPacienteNombreContacto.setText(text);
    }

    public String getJtfRegistrarPacienteNombres() {
        return jtfRegistrarPacienteNombres.getText();
    }

    public void setJtfRegistrarPacienteNombres(String text) {
        jtfRegistrarPacienteNombres.setText(text);
    }

    public String getJtfRegistrarPacientePOS() {
        return jtfRegistrarPacientePOS.getText();
    }

    public void setJtfRegistrarPacientePOS(String text) {
        jtfRegistrarPacientePOS.setText(text);
    }

    public String getJtfRegistrarPacienteTelefonoContacto() {
        return jtfRegistrarPacienteTelefonoContacto.getText();
    }

    public void setJtfRegistrarPacienteTelefonoContacto(String text) {
        jtfRegistrarPacienteTelefonoContacto.setText(text);
    }

   
   /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTPane = new javax.swing.JTabbedPane();
        jpOrden = new javax.swing.JPanel();
        jlTitleOrden = new javax.swing.JLabel();
        jtPOrden = new javax.swing.JTabbedPane();
        jpNuevaOrden = new javax.swing.JPanel();
        jtfFechaDeSolicitud = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jcbMedicoTratante = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlExamenes = new javax.swing.JList<>();
        jbEliminarExamen = new javax.swing.JButton();
        jbAñadirExamen = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jtfNuevaOrdenFechaDeIngreso = new javax.swing.JTextField();
        jpListarOrdenes = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtOrdenes = new javax.swing.JTable();
        jpPacientes = new javax.swing.JPanel();
        jtPaciente = new javax.swing.JTabbedPane();
        jpRegistrarPaciente = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jtfRegistrarPacienteNombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfRegistrarPacienteCedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfRegistrarPacienteFechaDeNacimiento = new javax.swing.JTextField();
        jtfRegistrarPacienteApellidos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfRegistrarPacientePOS = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtfRegistrarPacienteEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlRegistrarPacienteTelefonos = new javax.swing.JList<>();
        jbRegistrarPacienteEliminarTelefono = new javax.swing.JButton();
        jbRegistrarPacienteAñadirTelefono = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtfRegistrarPacienteTelefonoContacto = new javax.swing.JTextField();
        jtfRegistrarPacienteNombreContacto = new javax.swing.JTextField();
        jlTitlePacientes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jlTitlePacientesListar = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtListarPacientesPacientes = new javax.swing.JTable();
        jpEliminarPaciente = new javax.swing.JPanel();
        jlTitlePacientes2 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jtfEliminarPacienteCedula = new javax.swing.JTextField();
        jbEliminarPacienteBuscar = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtEliminarPacientePaciente = new javax.swing.JTable();
        jbEliminarContactoEliminar = new javax.swing.JButton();
        jpActualizarPaciente = new javax.swing.JPanel();
        jlTitlePacientes1 = new javax.swing.JLabel();
        jtfActualizarPacienteCedula = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jtfActualizarPacienteNombres = new javax.swing.JTextField();
        jtfActualizarPacienteApellidos = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jtfActualizarPacienteFechaDeNacimiento = new javax.swing.JTextField();
        jtfActualizarPacientePOS = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jtfActualizarPacienteEmail = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jlActualizarPacienteTelefonos = new javax.swing.JList<>();
        jLabel29 = new javax.swing.JLabel();
        jbActualizarPacienteAñadirTelefono = new javax.swing.JButton();
        jbActualizarPacienteEliminarTelefono = new javax.swing.JButton();
        jtfActualizarPacienteNombreContacto = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jtfActualizarPacienteTelefonoContacto = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jbActualizarPacienteBuscar = new javax.swing.JButton();
        jbActualizarPacienteActualizar = new javax.swing.JButton();
        jpMedicos = new javax.swing.JPanel();
        jtMedico = new javax.swing.JTabbedPane();
        jpRegistrarMedico = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtfRegistrarMedicoCedula = new javax.swing.JTextField();
        jtfRegistrarMedicoNombres = new javax.swing.JTextField();
        jtfRegistrarMedicoApellidos = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlRegistrarMedicoTelefonos = new javax.swing.JList<>();
        jtfRegistrarMedicoDireccion = new javax.swing.JTextField();
        jbRegistrarMedicoEliminarTelefono = new javax.swing.JButton();
        jbRegistrarMedicoAñadirTelefono = new javax.swing.JButton();
        jcbRegistrarMedicoEspecialidad = new javax.swing.JComboBox<>();
        jlTitleMedicos = new javax.swing.JLabel();
        jpListarMedicos = new javax.swing.JPanel();
        jlTitleMedicos1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtListarMedicosMedicos = new javax.swing.JTable();
        jpActualizarMedico = new javax.swing.JPanel();
        jlTitleMedicos2 = new javax.swing.JLabel();
        jtfActualizarMedicoCedula = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jtfActualizarMedicoNombres = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jlActualizarMedicoTelefonos = new javax.swing.JList<>();
        jtfActualizarMedicoApellidos = new javax.swing.JTextField();
        jtfActualizarMedicoDireccion = new javax.swing.JTextField();
        jcbActualizarMedicoEspecialidad = new javax.swing.JComboBox<>();
        jbActualizarMedicoEliminar = new javax.swing.JButton();
        jbActualizarMedicoAñadirTelefono = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jbActualizarMedicoBuscar = new javax.swing.JButton();
        jbActualizarMedicoActualizar = new javax.swing.JButton();
        jpEliminarMedico = new javax.swing.JPanel();
        jtfEliminarMedicoCedula = new javax.swing.JTextField();
        jbEliminarMedicoBuscar = new javax.swing.JButton();
        jlTitlePacientes3 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jbEliminarMedicoEliminar = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jtEliminarMedicoMedico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(777, 637));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(777, 637));
        jPanel1.setLayout(null);

        jpOrden.setLayout(null);

        jlTitleOrden.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        jlTitleOrden.setText("  LABORATORIO CLÍNICO UNIVALLE");
        jpOrden.add(jlTitleOrden);
        jlTitleOrden.setBounds(90, 30, 600, 100);

        jpNuevaOrden.setLayout(null);

        jtfFechaDeSolicitud.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpNuevaOrden.add(jtfFechaDeSolicitud);
        jtfFechaDeSolicitud.setBounds(240, 280, 280, 22);

        jLabel1.setText("Fecha de Solicitud:");
        jpNuevaOrden.add(jLabel1);
        jLabel1.setBounds(110, 280, 120, 16);

        jpNuevaOrden.add(jcbMedicoTratante);
        jcbMedicoTratante.setBounds(240, 330, 280, 22);

        jLabel2.setText("Médico Tratante:");
        jpNuevaOrden.add(jLabel2);
        jLabel2.setBounds(110, 330, 107, 16);

        jLabel3.setText("Exámenes:");
        jpNuevaOrden.add(jLabel3);
        jLabel3.setBounds(110, 390, 107, 20);

        jScrollPane1.setViewportView(jlExamenes);

        jpNuevaOrden.add(jScrollPane1);
        jScrollPane1.setBounds(240, 390, 280, 121);

        jbEliminarExamen.setText("Eliminar Exámen");
        jpNuevaOrden.add(jbEliminarExamen);
        jbEliminarExamen.setBounds(530, 430, 137, 23);

        jbAñadirExamen.setText("Añadir Exámen");
        jpNuevaOrden.add(jbAñadirExamen);
        jbAñadirExamen.setBounds(530, 390, 137, 23);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NÚMERO DE ORDEN:");
        jpNuevaOrden.add(jLabel4);
        jLabel4.setBounds(290, 110, 150, 50);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("000");
        jpNuevaOrden.add(jLabel5);
        jLabel5.setBounds(320, 150, 80, 60);

        jLabel22.setText("Fecha de Ingreso:");
        jpNuevaOrden.add(jLabel22);
        jLabel22.setBounds(110, 230, 120, 16);

        jtfNuevaOrdenFechaDeIngreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfNuevaOrdenFechaDeIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNuevaOrdenFechaDeIngresoActionPerformed(evt);
            }
        });
        jpNuevaOrden.add(jtfNuevaOrdenFechaDeIngreso);
        jtfNuevaOrdenFechaDeIngreso.setBounds(240, 230, 280, 22);

        jtPOrden.addTab("NUEVA ORDEN", jpNuevaOrden);

        jpListarOrdenes.setLayout(null);

        jtOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NÚMERO DE ORDEN", "FECHA SOLICITUD", "FECHA INGRESO", "MÉDICO", "PACIENTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jtOrdenes);

        jpListarOrdenes.add(jScrollPane4);
        jScrollPane4.setBounds(50, 90, 670, 470);

        jtPOrden.addTab("LISTAR ORDENES", jpListarOrdenes);

        jpOrden.add(jtPOrden);
        jtPOrden.setBounds(0, 0, 780, 610);

        jTPane.addTab("ORDEN", jpOrden);

        jpPacientes.setLayout(null);

        jpRegistrarPaciente.setLayout(null);

        jLabel7.setText("Nombres:");
        jpRegistrarPaciente.add(jLabel7);
        jLabel7.setBounds(110, 150, 70, 16);
        jpRegistrarPaciente.add(jtfRegistrarPacienteNombres);
        jtfRegistrarPacienteNombres.setBounds(260, 140, 260, 22);

        jLabel6.setText("Cédula:");
        jpRegistrarPaciente.add(jLabel6);
        jLabel6.setBounds(110, 110, 70, 16);
        jpRegistrarPaciente.add(jtfRegistrarPacienteCedula);
        jtfRegistrarPacienteCedula.setBounds(260, 100, 260, 22);

        jLabel8.setText("Apellidos:");
        jpRegistrarPaciente.add(jLabel8);
        jLabel8.setBounds(110, 190, 100, 16);

        jLabel9.setText("Fecha de Nacimiento:");
        jpRegistrarPaciente.add(jLabel9);
        jLabel9.setBounds(110, 230, 140, 16);
        jpRegistrarPaciente.add(jtfRegistrarPacienteFechaDeNacimiento);
        jtfRegistrarPacienteFechaDeNacimiento.setBounds(260, 220, 260, 22);
        jpRegistrarPaciente.add(jtfRegistrarPacienteApellidos);
        jtfRegistrarPacienteApellidos.setBounds(260, 180, 260, 22);

        jLabel10.setText("POS:");
        jpRegistrarPaciente.add(jLabel10);
        jLabel10.setBounds(110, 270, 110, 16);
        jpRegistrarPaciente.add(jtfRegistrarPacientePOS);
        jtfRegistrarPacientePOS.setBounds(260, 260, 260, 22);

        jLabel11.setText("E-Mail:");
        jpRegistrarPaciente.add(jLabel11);
        jLabel11.setBounds(110, 310, 43, 16);

        jLabel12.setText("Teléfonos:");
        jpRegistrarPaciente.add(jLabel12);
        jLabel12.setBounds(110, 350, 120, 16);
        jpRegistrarPaciente.add(jtfRegistrarPacienteEmail);
        jtfRegistrarPacienteEmail.setBounds(260, 300, 260, 22);

        jScrollPane2.setViewportView(jlRegistrarPacienteTelefonos);

        jpRegistrarPaciente.add(jScrollPane2);
        jScrollPane2.setBounds(260, 340, 258, 60);

        jbRegistrarPacienteEliminarTelefono.setText("ELIMINAR");
        jpRegistrarPaciente.add(jbRegistrarPacienteEliminarTelefono);
        jbRegistrarPacienteEliminarTelefono.setBounds(530, 370, 140, 23);

        jbRegistrarPacienteAñadirTelefono.setText("AÑADIR");
        jpRegistrarPaciente.add(jbRegistrarPacienteAñadirTelefono);
        jbRegistrarPacienteAñadirTelefono.setBounds(530, 340, 140, 23);

        jLabel13.setText("Contacto en caso de emergencia:");
        jpRegistrarPaciente.add(jLabel13);
        jLabel13.setBounds(110, 430, 290, 16);

        jLabel14.setText("Nombre:");
        jpRegistrarPaciente.add(jLabel14);
        jLabel14.setBounds(110, 470, 100, 16);

        jLabel15.setText("Teléfono:");
        jpRegistrarPaciente.add(jLabel15);
        jLabel15.setBounds(110, 510, 80, 16);
        jpRegistrarPaciente.add(jtfRegistrarPacienteTelefonoContacto);
        jtfRegistrarPacienteTelefonoContacto.setBounds(260, 500, 260, 22);
        jpRegistrarPaciente.add(jtfRegistrarPacienteNombreContacto);
        jtfRegistrarPacienteNombreContacto.setBounds(260, 460, 260, 22);

        jlTitlePacientes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        jlTitlePacientes.setText("  LABORATORIO CLÍNICO UNIVALLE");
        jpRegistrarPaciente.add(jlTitlePacientes);
        jlTitlePacientes.setBounds(90, 10, 600, 100);
        jpRegistrarPaciente.add(jSeparator1);
        jSeparator1.setBounds(100, 420, 570, 10);

        jtPaciente.addTab("REGISTRAR PACIENTE", jpRegistrarPaciente);

        jPanel2.setLayout(null);

        jlTitlePacientesListar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        jlTitlePacientesListar.setText("  LABORATORIO CLÍNICO UNIVALLE");
        jPanel2.add(jlTitlePacientesListar);
        jlTitlePacientesListar.setBounds(90, 10, 600, 100);

        jtListarPacientesPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÉDULA", "NOMBRES", "APELLIDOS", "FECHA NMTO", "POS", "TELÉFONOS", "E-MAIL", "NOM CONTACTO EMER", "TEL CONTACT EMER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jtListarPacientesPacientes);

        jPanel2.add(jScrollPane5);
        jScrollPane5.setBounds(16, 110, 740, 450);

        jtPaciente.addTab("LISTAR PACIENTES", jPanel2);

        jpEliminarPaciente.setLayout(null);

        jlTitlePacientes2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        jlTitlePacientes2.setText("  LABORATORIO CLÍNICO UNIVALLE");
        jpEliminarPaciente.add(jlTitlePacientes2);
        jlTitlePacientes2.setBounds(90, 10, 600, 80);

        jLabel39.setText("CÉDULA:");
        jpEliminarPaciente.add(jLabel39);
        jLabel39.setBounds(110, 130, 100, 16);
        jpEliminarPaciente.add(jtfEliminarPacienteCedula);
        jtfEliminarPacienteCedula.setBounds(190, 130, 340, 22);

        jbEliminarPacienteBuscar.setText("BUSCAR");
        jpEliminarPaciente.add(jbEliminarPacienteBuscar);
        jbEliminarPacienteBuscar.setBounds(550, 130, 120, 23);

        jtEliminarPacientePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÉDULA", "NOMBRES", "APELLIDOS", "FECHA NMTO", "POS", "TELÉFONOS", "E-MAIL", "NOM CONTACTO EMER", "TEL CONTACT EMER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jtEliminarPacientePaciente);

        jpEliminarPaciente.add(jScrollPane9);
        jScrollPane9.setBounds(20, 180, 740, 130);

        jbEliminarContactoEliminar.setText("ELIMINAR");
        jpEliminarPaciente.add(jbEliminarContactoEliminar);
        jbEliminarContactoEliminar.setBounds(320, 350, 130, 23);

        jtPaciente.addTab("ELIMINAR PACIENTE", jpEliminarPaciente);

        jpActualizarPaciente.setLayout(null);

        jlTitlePacientes1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        jlTitlePacientes1.setText("  LABORATORIO CLÍNICO UNIVALLE");
        jpActualizarPaciente.add(jlTitlePacientes1);
        jlTitlePacientes1.setBounds(90, 10, 600, 80);
        jpActualizarPaciente.add(jtfActualizarPacienteCedula);
        jtfActualizarPacienteCedula.setBounds(260, 90, 260, 22);

        jLabel23.setText("Cédula:");
        jpActualizarPaciente.add(jLabel23);
        jLabel23.setBounds(110, 100, 70, 16);

        jLabel24.setText("Nombres:");
        jpActualizarPaciente.add(jLabel24);
        jLabel24.setBounds(110, 140, 70, 16);
        jpActualizarPaciente.add(jtfActualizarPacienteNombres);
        jtfActualizarPacienteNombres.setBounds(260, 130, 260, 22);
        jpActualizarPaciente.add(jtfActualizarPacienteApellidos);
        jtfActualizarPacienteApellidos.setBounds(260, 170, 260, 22);

        jLabel25.setText("Apellidos:");
        jpActualizarPaciente.add(jLabel25);
        jLabel25.setBounds(110, 180, 100, 16);

        jLabel26.setText("Fecha de Nacimiento:");
        jpActualizarPaciente.add(jLabel26);
        jLabel26.setBounds(110, 220, 140, 16);
        jpActualizarPaciente.add(jtfActualizarPacienteFechaDeNacimiento);
        jtfActualizarPacienteFechaDeNacimiento.setBounds(260, 210, 260, 22);
        jpActualizarPaciente.add(jtfActualizarPacientePOS);
        jtfActualizarPacientePOS.setBounds(260, 250, 260, 22);

        jLabel27.setText("POS:");
        jpActualizarPaciente.add(jLabel27);
        jLabel27.setBounds(110, 260, 110, 16);

        jLabel28.setText("E-Mail:");
        jpActualizarPaciente.add(jLabel28);
        jLabel28.setBounds(110, 300, 43, 16);
        jpActualizarPaciente.add(jtfActualizarPacienteEmail);
        jtfActualizarPacienteEmail.setBounds(260, 290, 260, 22);

        jScrollPane7.setViewportView(jlActualizarPacienteTelefonos);

        jpActualizarPaciente.add(jScrollPane7);
        jScrollPane7.setBounds(260, 330, 258, 60);

        jLabel29.setText("Teléfonos:");
        jpActualizarPaciente.add(jLabel29);
        jLabel29.setBounds(110, 340, 120, 16);

        jbActualizarPacienteAñadirTelefono.setText("AÑADIR");
        jpActualizarPaciente.add(jbActualizarPacienteAñadirTelefono);
        jbActualizarPacienteAñadirTelefono.setBounds(530, 330, 140, 23);

        jbActualizarPacienteEliminarTelefono.setText("ELIMINAR");
        jpActualizarPaciente.add(jbActualizarPacienteEliminarTelefono);
        jbActualizarPacienteEliminarTelefono.setBounds(530, 360, 140, 23);
        jpActualizarPaciente.add(jtfActualizarPacienteNombreContacto);
        jtfActualizarPacienteNombreContacto.setBounds(260, 450, 260, 22);

        jLabel30.setText("Contacto en caso de emergencia:");
        jpActualizarPaciente.add(jLabel30);
        jLabel30.setBounds(110, 420, 290, 16);
        jpActualizarPaciente.add(jSeparator2);
        jSeparator2.setBounds(100, 410, 570, 10);
        jpActualizarPaciente.add(jtfActualizarPacienteTelefonoContacto);
        jtfActualizarPacienteTelefonoContacto.setBounds(260, 490, 260, 22);

        jLabel31.setText("Nombre:");
        jpActualizarPaciente.add(jLabel31);
        jLabel31.setBounds(110, 460, 100, 16);

        jLabel32.setText("Teléfono:");
        jpActualizarPaciente.add(jLabel32);
        jLabel32.setBounds(110, 500, 80, 16);

        jbActualizarPacienteBuscar.setText("BUSCAR");
        jpActualizarPaciente.add(jbActualizarPacienteBuscar);
        jbActualizarPacienteBuscar.setBounds(530, 90, 140, 23);

        jbActualizarPacienteActualizar.setText("ACTUALIZAR");
        jpActualizarPaciente.add(jbActualizarPacienteActualizar);
        jbActualizarPacienteActualizar.setBounds(310, 540, 180, 23);

        jtPaciente.addTab("ACTUALIZAR PACIENTE", jpActualizarPaciente);

        jpPacientes.add(jtPaciente);
        jtPaciente.setBounds(0, 0, 780, 610);

        jTPane.addTab("PACIENTES", jpPacientes);

        jpMedicos.setLayout(null);

        jpRegistrarMedico.setLayout(null);

        jLabel16.setText("Cédula:");
        jpRegistrarMedico.add(jLabel16);
        jLabel16.setBounds(120, 150, 90, 16);

        jLabel17.setText("Nombres:");
        jpRegistrarMedico.add(jLabel17);
        jLabel17.setBounds(120, 200, 90, 16);

        jLabel18.setText("Apellidos:");
        jpRegistrarMedico.add(jLabel18);
        jLabel18.setBounds(120, 250, 100, 16);

        jLabel19.setText("Teléfonos:");
        jpRegistrarMedico.add(jLabel19);
        jLabel19.setBounds(120, 300, 110, 16);

        jLabel20.setText("Dirección:");
        jpRegistrarMedico.add(jLabel20);
        jLabel20.setBounds(120, 415, 80, 16);

        jLabel21.setText("Especialidad:");
        jpRegistrarMedico.add(jLabel21);
        jLabel21.setBounds(120, 465, 80, 16);
        jpRegistrarMedico.add(jtfRegistrarMedicoCedula);
        jtfRegistrarMedicoCedula.setBounds(210, 140, 330, 22);
        jpRegistrarMedico.add(jtfRegistrarMedicoNombres);
        jtfRegistrarMedicoNombres.setBounds(210, 190, 330, 22);
        jpRegistrarMedico.add(jtfRegistrarMedicoApellidos);
        jtfRegistrarMedicoApellidos.setBounds(210, 240, 330, 22);

        jScrollPane3.setViewportView(jlRegistrarMedicoTelefonos);

        jpRegistrarMedico.add(jScrollPane3);
        jScrollPane3.setBounds(210, 290, 330, 100);
        jpRegistrarMedico.add(jtfRegistrarMedicoDireccion);
        jtfRegistrarMedicoDireccion.setBounds(210, 410, 330, 22);

        jbRegistrarMedicoEliminarTelefono.setText("ELIMINAR");
        jpRegistrarMedico.add(jbRegistrarMedicoEliminarTelefono);
        jbRegistrarMedicoEliminarTelefono.setBounds(550, 340, 130, 30);

        jbRegistrarMedicoAñadirTelefono.setText("AÑADIR");
        jpRegistrarMedico.add(jbRegistrarMedicoAñadirTelefono);
        jbRegistrarMedicoAñadirTelefono.setBounds(550, 300, 130, 30);

        jpRegistrarMedico.add(jcbRegistrarMedicoEspecialidad);
        jcbRegistrarMedicoEspecialidad.setBounds(210, 460, 330, 22);

        jlTitleMedicos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        jlTitleMedicos.setText("  LABORATORIO CLÍNICO UNIVALLE");
        jpRegistrarMedico.add(jlTitleMedicos);
        jlTitleMedicos.setBounds(90, 20, 600, 100);

        jtMedico.addTab("REGISTRAR MEDICO", jpRegistrarMedico);

        jpListarMedicos.setLayout(null);

        jlTitleMedicos1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        jlTitleMedicos1.setText("  LABORATORIO CLÍNICO UNIVALLE");
        jpListarMedicos.add(jlTitleMedicos1);
        jlTitleMedicos1.setBounds(90, 20, 600, 100);

        jtListarMedicosMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CÉDULA", "NOMBRES", "APELLIDOS", "TELÉFONOS", "DIRECCIÓN", "ESPECIALIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jtListarMedicosMedicos);

        jpListarMedicos.add(jScrollPane6);
        jScrollPane6.setBounds(30, 100, 720, 450);

        jtMedico.addTab("LISTAR MEDICOS", jpListarMedicos);

        jpActualizarMedico.setLayout(null);

        jlTitleMedicos2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        jlTitleMedicos2.setText("  LABORATORIO CLÍNICO UNIVALLE");
        jpActualizarMedico.add(jlTitleMedicos2);
        jlTitleMedicos2.setBounds(90, 20, 600, 100);
        jpActualizarMedico.add(jtfActualizarMedicoCedula);
        jtfActualizarMedicoCedula.setBounds(210, 120, 330, 22);

        jLabel33.setText("Cédula:");
        jpActualizarMedico.add(jLabel33);
        jLabel33.setBounds(120, 130, 90, 16);
        jpActualizarMedico.add(jtfActualizarMedicoNombres);
        jtfActualizarMedicoNombres.setBounds(210, 170, 330, 22);

        jScrollPane8.setViewportView(jlActualizarMedicoTelefonos);

        jpActualizarMedico.add(jScrollPane8);
        jScrollPane8.setBounds(210, 270, 330, 100);
        jpActualizarMedico.add(jtfActualizarMedicoApellidos);
        jtfActualizarMedicoApellidos.setBounds(210, 220, 330, 22);
        jpActualizarMedico.add(jtfActualizarMedicoDireccion);
        jtfActualizarMedicoDireccion.setBounds(210, 390, 330, 22);

        jpActualizarMedico.add(jcbActualizarMedicoEspecialidad);
        jcbActualizarMedicoEspecialidad.setBounds(210, 440, 330, 22);

        jbActualizarMedicoEliminar.setText("ELIMINAR");
        jpActualizarMedico.add(jbActualizarMedicoEliminar);
        jbActualizarMedicoEliminar.setBounds(550, 320, 130, 30);

        jbActualizarMedicoAñadirTelefono.setText("AÑADIR");
        jpActualizarMedico.add(jbActualizarMedicoAñadirTelefono);
        jbActualizarMedicoAñadirTelefono.setBounds(550, 280, 130, 30);

        jLabel34.setText("Nombres:");
        jpActualizarMedico.add(jLabel34);
        jLabel34.setBounds(120, 180, 90, 16);

        jLabel35.setText("Apellidos:");
        jpActualizarMedico.add(jLabel35);
        jLabel35.setBounds(120, 230, 100, 16);

        jLabel36.setText("Teléfonos:");
        jpActualizarMedico.add(jLabel36);
        jLabel36.setBounds(120, 280, 110, 16);

        jLabel37.setText("Dirección:");
        jpActualizarMedico.add(jLabel37);
        jLabel37.setBounds(120, 390, 80, 16);

        jLabel38.setText("Especialidad:");
        jpActualizarMedico.add(jLabel38);
        jLabel38.setBounds(120, 440, 80, 16);

        jbActualizarMedicoBuscar.setText("BUSCAR");
        jpActualizarMedico.add(jbActualizarMedicoBuscar);
        jbActualizarMedicoBuscar.setBounds(550, 120, 120, 23);

        jbActualizarMedicoActualizar.setText("ACTUALIZAR");
        jpActualizarMedico.add(jbActualizarMedicoActualizar);
        jbActualizarMedicoActualizar.setBounds(300, 510, 150, 23);

        jtMedico.addTab("ACTUALIZAR MEDICO", jpActualizarMedico);

        jpEliminarMedico.setLayout(null);
        jpEliminarMedico.add(jtfEliminarMedicoCedula);
        jtfEliminarMedicoCedula.setBounds(190, 130, 340, 22);

        jbEliminarMedicoBuscar.setText("BUSCAR");
        jpEliminarMedico.add(jbEliminarMedicoBuscar);
        jbEliminarMedicoBuscar.setBounds(550, 130, 120, 23);

        jlTitlePacientes3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        jlTitlePacientes3.setText("  LABORATORIO CLÍNICO UNIVALLE");
        jpEliminarMedico.add(jlTitlePacientes3);
        jlTitlePacientes3.setBounds(90, 10, 600, 80);

        jLabel40.setText("CÉDULA:");
        jpEliminarMedico.add(jLabel40);
        jLabel40.setBounds(110, 130, 100, 16);

        jbEliminarMedicoEliminar.setText("ELIMINAR");
        jpEliminarMedico.add(jbEliminarMedicoEliminar);
        jbEliminarMedicoEliminar.setBounds(320, 360, 130, 23);

        jtEliminarMedicoMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "CÉDULA", "NOMBRES", "APELLIDOS", "TELÉFONOS", "DIRECCIÓN", "ESPECIALIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jtEliminarMedicoMedico);

        jpEliminarMedico.add(jScrollPane11);
        jScrollPane11.setBounds(30, 170, 720, 160);

        jtMedico.addTab("ELIMINAR MEDICO", jpEliminarMedico);

        jpMedicos.add(jtMedico);
        jtMedico.setBounds(0, 0, 780, 610);

        jTPane.addTab("MEDICOS", jpMedicos);

        jPanel1.add(jTPane);
        jTPane.setBounds(0, 0, 777, 637);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 780, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNuevaOrdenFechaDeIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNuevaOrdenFechaDeIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNuevaOrdenFechaDeIngresoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTPane;
    private javax.swing.JButton jbActualizarMedicoActualizar;
    private javax.swing.JButton jbActualizarMedicoAñadirTelefono;
    private javax.swing.JButton jbActualizarMedicoBuscar;
    private javax.swing.JButton jbActualizarMedicoEliminar;
    private javax.swing.JButton jbActualizarPacienteActualizar;
    private javax.swing.JButton jbActualizarPacienteAñadirTelefono;
    private javax.swing.JButton jbActualizarPacienteBuscar;
    private javax.swing.JButton jbActualizarPacienteEliminarTelefono;
    private javax.swing.JButton jbAñadirExamen;
    private javax.swing.JButton jbEliminarContactoEliminar;
    private javax.swing.JButton jbEliminarExamen;
    private javax.swing.JButton jbEliminarMedicoBuscar;
    private javax.swing.JButton jbEliminarMedicoEliminar;
    private javax.swing.JButton jbEliminarPacienteBuscar;
    private javax.swing.JButton jbRegistrarMedicoAñadirTelefono;
    private javax.swing.JButton jbRegistrarMedicoEliminarTelefono;
    private javax.swing.JButton jbRegistrarPacienteAñadirTelefono;
    private javax.swing.JButton jbRegistrarPacienteEliminarTelefono;
    private javax.swing.JComboBox<String> jcbActualizarMedicoEspecialidad;
    private javax.swing.JComboBox<String> jcbMedicoTratante;
    private javax.swing.JComboBox<String> jcbRegistrarMedicoEspecialidad;
    private javax.swing.JList<String> jlActualizarMedicoTelefonos;
    private javax.swing.JList<String> jlActualizarPacienteTelefonos;
    private javax.swing.JList<String> jlExamenes;
    private javax.swing.JList<String> jlRegistrarMedicoTelefonos;
    private javax.swing.JList<String> jlRegistrarPacienteTelefonos;
    private javax.swing.JLabel jlTitleMedicos;
    private javax.swing.JLabel jlTitleMedicos1;
    private javax.swing.JLabel jlTitleMedicos2;
    private javax.swing.JLabel jlTitleOrden;
    private javax.swing.JLabel jlTitlePacientes;
    private javax.swing.JLabel jlTitlePacientes1;
    private javax.swing.JLabel jlTitlePacientes2;
    private javax.swing.JLabel jlTitlePacientes3;
    private javax.swing.JLabel jlTitlePacientesListar;
    private javax.swing.JPanel jpActualizarMedico;
    private javax.swing.JPanel jpActualizarPaciente;
    private javax.swing.JPanel jpEliminarMedico;
    private javax.swing.JPanel jpEliminarPaciente;
    private javax.swing.JPanel jpListarMedicos;
    private javax.swing.JPanel jpListarOrdenes;
    private javax.swing.JPanel jpMedicos;
    private javax.swing.JPanel jpNuevaOrden;
    private javax.swing.JPanel jpOrden;
    private javax.swing.JPanel jpPacientes;
    private javax.swing.JPanel jpRegistrarMedico;
    private javax.swing.JPanel jpRegistrarPaciente;
    private javax.swing.JTable jtEliminarMedicoMedico;
    private javax.swing.JTable jtEliminarPacientePaciente;
    private javax.swing.JTable jtListarMedicosMedicos;
    private javax.swing.JTable jtListarPacientesPacientes;
    private javax.swing.JTabbedPane jtMedico;
    private javax.swing.JTable jtOrdenes;
    private javax.swing.JTabbedPane jtPOrden;
    private javax.swing.JTabbedPane jtPaciente;
    private javax.swing.JTextField jtfActualizarMedicoApellidos;
    private javax.swing.JTextField jtfActualizarMedicoCedula;
    private javax.swing.JTextField jtfActualizarMedicoDireccion;
    private javax.swing.JTextField jtfActualizarMedicoNombres;
    private javax.swing.JTextField jtfActualizarPacienteApellidos;
    private javax.swing.JTextField jtfActualizarPacienteCedula;
    private javax.swing.JTextField jtfActualizarPacienteEmail;
    private javax.swing.JTextField jtfActualizarPacienteFechaDeNacimiento;
    private javax.swing.JTextField jtfActualizarPacienteNombreContacto;
    private javax.swing.JTextField jtfActualizarPacienteNombres;
    private javax.swing.JTextField jtfActualizarPacientePOS;
    private javax.swing.JTextField jtfActualizarPacienteTelefonoContacto;
    private javax.swing.JTextField jtfEliminarMedicoCedula;
    private javax.swing.JTextField jtfEliminarPacienteCedula;
    private javax.swing.JTextField jtfFechaDeSolicitud;
    private javax.swing.JTextField jtfNuevaOrdenFechaDeIngreso;
    private javax.swing.JTextField jtfRegistrarMedicoApellidos;
    private javax.swing.JTextField jtfRegistrarMedicoCedula;
    private javax.swing.JTextField jtfRegistrarMedicoDireccion;
    private javax.swing.JTextField jtfRegistrarMedicoNombres;
    private javax.swing.JTextField jtfRegistrarPacienteApellidos;
    private javax.swing.JTextField jtfRegistrarPacienteCedula;
    private javax.swing.JTextField jtfRegistrarPacienteEmail;
    private javax.swing.JTextField jtfRegistrarPacienteFechaDeNacimiento;
    private javax.swing.JTextField jtfRegistrarPacienteNombreContacto;
    private javax.swing.JTextField jtfRegistrarPacienteNombres;
    private javax.swing.JTextField jtfRegistrarPacientePOS;
    private javax.swing.JTextField jtfRegistrarPacienteTelefonoContacto;
    // End of variables declaration//GEN-END:variables
}