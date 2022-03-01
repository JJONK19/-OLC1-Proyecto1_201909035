/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplicacion;

import Analizador.Lexico;
import Analizador.Sintactico;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author JJONK19
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();
        Generar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Consola = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Archivos = new javax.swing.JTree();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        GuardarComo = new javax.swing.JMenuItem();
        JSON = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ExpAnalyzer");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color2"));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Area de Texto");

        Texto.setBackground(java.awt.Color.darkGray);
        Texto.setColumns(20);
        Texto.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        Texto.setForeground(java.awt.Color.white);
        Texto.setRows(5);
        jScrollPane1.setViewportView(Texto);

        Generar.setBackground(java.awt.Color.gray);
        Generar.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 14)); // NOI18N
        Generar.setForeground(java.awt.Color.white);
        Generar.setText("Generar Automata");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.gray);
        jButton2.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 14)); // NOI18N
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setText("Analizar Entradas");

        Consola.setEditable(false);
        Consola.setBackground(java.awt.Color.darkGray);
        Consola.setColumns(20);
        Consola.setForeground(java.awt.Color.white);
        Consola.setRows(5);
        jScrollPane2.setViewportView(Consola);

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Salida");

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Archivos.setBackground(java.awt.Color.darkGray);
        Archivos.setForeground(java.awt.Color.white);
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Dir");
        treeNode1.add(treeNode2);
        Archivos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane3.setViewportView(Archivos);

        jLabel4.setBackground(java.awt.Color.darkGray);
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("No Image");

        jButton3.setBackground(java.awt.Color.gray);
        jButton3.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 14)); // NOI18N
        jButton3.setForeground(java.awt.Color.white);
        jButton3.setText("Anterior");

        jButton4.setBackground(java.awt.Color.gray);
        jButton4.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 14)); // NOI18N
        jButton4.setForeground(java.awt.Color.white);
        jButton4.setText("Siguiente");

        jComboBox1.setBackground(java.awt.Color.darkGray);
        jComboBox1.setForeground(java.awt.Color.white);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arboles", "Siguientes", "Transiciones", "Automatas Deterministas", "Automatas No Deterministas", " ", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Generar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Generar)
                                    .addComponent(jButton2)))
                            .addComponent(jScrollPane3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(java.awt.Color.darkGray);

        Menu.setText("Archivo");

        Abrir.setText("Abrir Archivo");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        Menu.add(Abrir);

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        Menu.add(Guardar);

        GuardarComo.setText("Guardar Como");
        GuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarComoActionPerformed(evt);
            }
        });
        Menu.add(GuardarComo);

        JSON.setText("Generar JSON");
        Menu.add(JSON);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    //Abre un archivo y lo muestra en la caja de texto
    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter exp = new FileNameExtensionFilter("Archivos exp (*.exp)", "exp");
        filechooser.addChoosableFileFilter(exp);
        filechooser.setFileFilter(exp);
        if(filechooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            try{
                Texto.setText("");
                f = filechooser.getSelectedFile();
                Scanner a  = new Scanner(f);
                String  t = "";
                while(a.hasNextLine()){
                    t += a.nextLine();
                    t += "\n";
                }
                a.close();
                Texto.setText(t);
                ban = 1;
            }catch(Exception e){
               
            }
        }
        
    }//GEN-LAST:event_AbrirActionPerformed
    
    //Guardar Informacion en el archivo cargado
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        if(ban == 1){
            try {
                FileWriter stream = new FileWriter (f, false);
                stream.write(Texto.getText());
                stream.close();
            }catch (Exception e) {

            }
        }else{
            JFileChooser file = new JFileChooser();
            FileNameExtensionFilter exp = new FileNameExtensionFilter("Archivos exp (*.exp)", "exp");
            file.addChoosableFileFilter(exp);
            file.setFileFilter(exp);
            String dir;
            File fi = null;
            file.setDialogTitle("Especifique el archivo a guardar");
            if (file.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
               fi = file.getSelectedFile();
            }

            try {
                FileWriter stream = new FileWriter (fi, false);
                stream.write(Texto.getText());
                stream.close();
            }catch (Exception e) {

            }
        }
        
    }//GEN-LAST:event_GuardarActionPerformed

    private void GuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarComoActionPerformed
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter exp = new FileNameExtensionFilter("Archivos exp (*.exp)", "exp");
        file.addChoosableFileFilter(exp);
        file.setFileFilter(exp);
        String dir;
        File fi = null;
        file.setDialogTitle("Especifique el archivo a guardar");
        if (file.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
           fi = file.getSelectedFile();
        }
        
        try {
            FileWriter stream = new FileWriter (fi, false);
            stream.write(Texto.getText());
            stream.close();
        }catch (Exception e) {
            

        }
    }//GEN-LAST:event_GuardarComoActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        Lexico lexico = new Lexico(new BufferedReader( new StringReader(Texto.getText())));
        Sintactico sintactico =new Sintactico(lexico);
        consola("Leyendo...");
        try {
            sintactico.parse();
            consola("Análisis finalizado correctamente.");
        } catch (Exception e) {
            consola("Ocurrió un error.");
        }
        for (int i = 0; i < lexico.a.size();i++ ){
            System.out.println(lexico.a.get(i).contenido);
        }
        
        for (int i = 0; i < sintactico.a.size();i++ ){
            System.out.println(sintactico.a.get(i).contenido);
        }
    }//GEN-LAST:event_GenerarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
        
        
    }
    
    //Diseño del arbol de archivos: https://www.youtube.com/watch?v=zWdA8lMEz3A
    //El metodo actualizar se va a activar cada que se crea una nueva imagen
    private void actualizar(){
        File fichero = new File("Reportes/");
        raiz = new DefaultMutableTreeNode(fichero.getName());
        modelo = new DefaultTreeModel(raiz);
        crear(fichero, raiz);
        Archivos.setModel(modelo);
    }
    
    private void crear(File dir, DefaultMutableTreeNode nodo){
        File[] archivos =dir.listFiles();
        if(archivos != null){
            int c = 0;
            for(File f:archivos){
                DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(f.getName());
                modelo.insertNodeInto(hijo, nodo, c);
                c++;
                if(f.isDirectory()){
                    crear(f, hijo);
                }
            }
        }
    }
    
    private void consola(String a){
        String temp = "";
        temp += Consola.getText() + "\n";
        temp += a;
        Consola.setText(temp);
        
    }
    
    
    //Variables creadas manualmente
    private DefaultMutableTreeNode raiz; 
    private DefaultTreeModel modelo;
    private File f;
    public static int ban = 0; //Determina si hay una imagen cargada 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JTree Archivos;
    private javax.swing.JTextArea Consola;
    private javax.swing.JButton Generar;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JMenuItem GuardarComo;
    private javax.swing.JMenuItem JSON;
    private javax.swing.JMenu Menu;
    private javax.swing.JTextArea Texto;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
