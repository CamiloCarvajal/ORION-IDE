/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textlinenumberui;

import utils.FileManager;
import java.awt.Toolkit;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author saliya
 */
public class textLineNumbers extends javax.swing.JFrame {

    private FileManager fileManager = new FileManager();

    /**
     * Creates new form textLineNumbers
     */
    public textLineNumbers() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/orion.png")));
        TextLineNumber tln = new TextLineNumber(textEditor);
        jScrollPane1.setRowHeaderView(tln);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textEditor = new javax.swing.JTextPane();
        ToolBar = new javax.swing.JToolBar();
        btnUpload = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDownload = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBuild = new javax.swing.JButton();
        btnRun = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        charCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("orion IDE");
        setBackground(new java.awt.Color(153, 51, 0));
        setResizable(false);

        textEditor.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        textEditor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textEditorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(textEditor);
        textEditor.getAccessibleContext().setAccessibleName("editorText");

        ToolBar.setFloatable(false);
        ToolBar.setRollover(true);

        btnUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/files_folders_upload_icon.png"))); // NOI18N
        btnUpload.setToolTipText("Abrir");
        btnUpload.setAlignmentX(1.0F);
        btnUpload.setAlignmentY(1.0F);
        btnUpload.setFocusCycleRoot(true);
        btnUpload.setFocusable(false);
        btnUpload.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpload.setMaximumSize(new java.awt.Dimension(40, 40));
        btnUpload.setMinimumSize(new java.awt.Dimension(40, 40));
        btnUpload.setPreferredSize(new java.awt.Dimension(40, 40));
        btnUpload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUploadMouseClicked(evt);
            }
        });
        ToolBar.add(btnUpload);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/download_guardar_save_icon.png"))); // NOI18N
        btnSave.setToolTipText("Guardar");
        btnSave.setAlignmentX(1.0F);
        btnSave.setAlignmentY(1.0F);
        btnSave.setFocusCycleRoot(true);
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setMaximumSize(new java.awt.Dimension(40, 40));
        btnSave.setMinimumSize(new java.awt.Dimension(40, 40));
        btnSave.setPreferredSize(new java.awt.Dimension(40, 40));
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        ToolBar.add(btnSave);

        btnDownload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/download_file_files_folders_icon.png"))); // NOI18N
        btnDownload.setToolTipText("Descargar");
        btnDownload.setAlignmentX(1.0F);
        btnDownload.setAlignmentY(1.0F);
        btnDownload.setFocusCycleRoot(true);
        btnDownload.setFocusable(false);
        btnDownload.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDownload.setMaximumSize(new java.awt.Dimension(40, 40));
        btnDownload.setMinimumSize(new java.awt.Dimension(40, 40));
        btnDownload.setPreferredSize(new java.awt.Dimension(40, 40));
        btnDownload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDownloadMouseClicked(evt);
            }
        });
        ToolBar.add(btnDownload);

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 0, 24)); // NOI18N
        jLabel1.setText("|");
        jLabel1.setMaximumSize(new java.awt.Dimension(12, 40));
        ToolBar.add(jLabel1);

        btnBuild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/hammer_tool_icon.png"))); // NOI18N
        btnBuild.setToolTipText("Compilar");
        btnBuild.setAlignmentX(1.0F);
        btnBuild.setAlignmentY(1.0F);
        btnBuild.setFocusCycleRoot(true);
        btnBuild.setFocusPainted(false);
        btnBuild.setMaximumSize(new java.awt.Dimension(40, 40));
        btnBuild.setMinimumSize(new java.awt.Dimension(40, 40));
        btnBuild.setPreferredSize(new java.awt.Dimension(40, 40));
        ToolBar.add(btnBuild);
        btnBuild.getAccessibleContext().setAccessibleName("Compilar");

        btnRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/play.png"))); // NOI18N
        btnRun.setToolTipText("Ejecutar");
        btnRun.setAlignmentX(1.0F);
        btnRun.setAlignmentY(1.0F);
        btnRun.setFocusCycleRoot(true);
        btnRun.setFocusable(false);
        btnRun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRun.setMaximumSize(new java.awt.Dimension(40, 40));
        btnRun.setMinimumSize(new java.awt.Dimension(40, 40));
        btnRun.setPreferredSize(new java.awt.Dimension(40, 40));
        btnRun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBar.add(btnRun);
        btnRun.getAccessibleContext().setAccessibleName("Ejecutar1");
        btnRun.getAccessibleContext().setAccessibleDescription("Ejecutar2");

        jLabel2.setText("Caracteres:");

        charCount.setText("0");
        charCount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(798, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(charCount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addComponent(ToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(charCount))
                .addContainerGap())
        );

        ToolBar.getAccessibleContext().setAccessibleDescription("BarraDeHerramientas");
        charCount.getAccessibleContext().setAccessibleName("charsCount");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(textLineNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(textLineNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(textLineNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(textLineNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new textLineNumbers().setVisible(true);
            }
        });
    }


    private void textEditorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEditorKeyReleased
        charCounter();
    }//GEN-LAST:event_textEditorKeyReleased

    private void btnUploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUploadMouseClicked

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter("orion files", "on"));

        int response = fileChooser.showDialog(this, "Abrir archivo");
        if (response == JFileChooser.APPROVE_OPTION) {

            Map<String, String> result = fileManager.getFileContent(fileChooser.getSelectedFile().getAbsolutePath());
            if ("success".equals(result.get("result"))) {
                textEditor.setText(result.get("payload"));
                charCounter();
            }
        }

    }//GEN-LAST:event_btnUploadMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked

        boolean fileSaved = fileManager.saveFileContent(textEditor.getText());
        if (!fileSaved) {
            JOptionPane.showMessageDialog(this, "Error guardando el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnDownloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDownloadMouseClicked

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecionar carpeta de destino");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int response = fileChooser.showSaveDialog(null);
        if (response == JFileChooser.APPROVE_OPTION) {

            String path = fileChooser.getSelectedFile().getAbsolutePath();
            String fileName = fileChooser.getSelectedFile().getName();

            Pattern pattern = Pattern.compile("[A-Za-z0-9]+\\.on");
            Matcher matcher = pattern.matcher(fileName);

            if (!matcher.find()) {
                JOptionPane.showMessageDialog(this, "Por favor, indique un nombre valido para el archivo e incluya la extension .on", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (fileManager.downloadFile(path, textEditor.getText())) {
                    JOptionPane.showMessageDialog(this, "Ubicacion del archivo  " + path, "Archivo creado satisfactoriamente", JOptionPane.PLAIN_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "El archivo no pudo ser creado", "Alerta", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
    }//GEN-LAST:event_btnDownloadMouseClicked

    private void charCounter() {
        int count = textEditor.getText().length();
        charCount.setText(Integer.toString(count));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar ToolBar;
    private javax.swing.JButton btnBuild;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpload;
    private javax.swing.JLabel charCount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane textEditor;
    // End of variables declaration//GEN-END:variables
}
