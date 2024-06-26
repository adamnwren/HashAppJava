/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hashappjava;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.security.*;

/**
 *
 * @author adamn
 */
public class HashPanel extends javax.swing.JPanel {

    private File file;
    private final String[] hashes = new String[] {"MD5", "SHA-1", "SHA-256"};
    
    /**
     * Creates new form HashPanel
     */
    public HashPanel() {
        initComponents();
        
        
        for (int i = 0; i < hashes.length; i++)
        {
            hashBox.addItem(hashes[i]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileLbl = new javax.swing.JLabel();
        srcTxt = new javax.swing.JTextField();
        browseBtn = new javax.swing.JButton();
        expectedLbl = new javax.swing.JLabel();
        inputArea = new javax.swing.JScrollPane();
        inputTxt = new javax.swing.JTextArea();
        hashBox = new javax.swing.JComboBox<>();
        algoLbl = new javax.swing.JLabel();
        outputLbl = new javax.swing.JLabel();
        outputArea = new javax.swing.JScrollPane();
        outputTxt = new javax.swing.JTextArea();
        verifyBtn = new javax.swing.JButton();

        fileLbl.setText("File:");

        srcTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcTxtActionPerformed(evt);
            }
        });

        browseBtn.setText("Browse...");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        expectedLbl.setText("Expected Hash:");

        inputTxt.setColumns(20);
        inputTxt.setRows(5);
        inputArea.setViewportView(inputTxt);

        hashBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hashBoxActionPerformed(evt);
            }
        });

        algoLbl.setText("A:glorithm");

        outputLbl.setText("Output:");

        outputTxt.setColumns(20);
        outputTxt.setRows(5);
        outputArea.setViewportView(outputTxt);

        verifyBtn.setText("Verify");
        verifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expectedLbl)
                    .addComponent(fileLbl)
                    .addComponent(algoLbl)
                    .addComponent(outputLbl))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hashBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputArea)
                    .addComponent(outputArea)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(srcTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(verifyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileLbl)
                    .addComponent(srcTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseBtn))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expectedLbl)
                    .addComponent(inputArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hashBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(algoLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputLbl)
                    .addComponent(outputArea, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verifyBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void srcTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srcTxtActionPerformed

    private void verifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyBtnActionPerformed
        if (inputTxt.getText().equals(outputTxt.getText()))
        {
            outputTxt.setBackground(Color.green);
            inputTxt.setBackground(Color.green);
        }
        else
        {
            outputTxt.setBackground(Color.red);
            inputTxt.setBackground(Color.red);
        }
    }//GEN-LAST:event_verifyBtnActionPerformed

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            srcTxt.setText(file.getAbsolutePath());
            
            try{
                outputTxt.setText(getHash(hashBox.getSelectedItem().toString()));
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_browseBtnActionPerformed

    private void hashBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hashBoxActionPerformed
        /*
        if (!
                srcTxt.equals(null))
        {
            
        }*/
        try{
            outputTxt.setText(getHash(hashBox.getSelectedItem().toString()));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(hashBox.getSelectedItem().toString());        // TODO add your handling code here:
    }//GEN-LAST:event_hashBoxActionPerformed

    
    private String getHash(String algorithm) throws IOException, NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(algorithm);
        
        try (FileInputStream fis = new FileInputStream(file);
             DigestInputStream dis = new DigestInputStream(fis, md)) {
            byte[] buffer = new byte[8192];
            while (dis.read(buffer) != -1) {
                // Read the file and update the MessageDigest
            }
        }
        
        byte[] digestBytes = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digestBytes) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel algoLbl;
    private javax.swing.JButton browseBtn;
    private javax.swing.JLabel expectedLbl;
    private javax.swing.JLabel fileLbl;
    private javax.swing.JComboBox<String> hashBox;
    private javax.swing.JScrollPane inputArea;
    private javax.swing.JTextArea inputTxt;
    private javax.swing.JScrollPane outputArea;
    private javax.swing.JLabel outputLbl;
    private javax.swing.JTextArea outputTxt;
    private javax.swing.JTextField srcTxt;
    private javax.swing.JButton verifyBtn;
    // End of variables declaration//GEN-END:variables
}
