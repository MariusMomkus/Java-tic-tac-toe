/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kryziukai_nuliukai1;



public class Kryziukai_nuliukai extends javax.swing.JFrame {

    
    int e = 0;
    int lang7=3;
    int lang8=3;
    int lang9=3;
    int lang4=3;
    int lang5=3;
    int lang6=3;
    int lang1=3;
    int lang2=3;
    int lang3=3;
    boolean[] P = {true, true, true, true, true, true, true, true, true};
            
    public void Winner(){
    
    // 789
     if(lang7 == 1 && lang8 == 1 && lang9 == 1){
    jLabel2.setText("Crosses won!");
    e=9;
    }
    
    else if (lang7 == 0 && lang8 == 0 && lang9 == 0){
    jLabel2.setText("Zeros won!");
    e=9;
    }
    
    
    // 456
     else if(lang4 == 1 && lang5 == 1 && lang6 == 1){
    jLabel2.setText("Crosses won!");
    e=9;
    }
    
     else if (lang4 == 0 && lang5 == 0 && lang6 == 0){
    jLabel2.setText("Zeros won!");
    e=9;
    }
    
    
    // 123
     else if(lang1 == 1 && lang2 == 1 && lang3 == 1){
    jLabel2.setText("Crosses won!");
    e=9;
    }
    
     else if (lang1 == 0 && lang2 == 0 && lang3 == 0){
    jLabel2.setText("Zeros won!");
    e=9;
    }
    
    
    // 741
    else if(lang7 == 1 && lang4 == 1 && lang1 == 1){
    jLabel2.setText("Crosses won!");
    e=9;
    }
    
    else if (lang7 == 0 && lang4 == 0 && lang1 == 0){
    jLabel2.setText("Zeros won!");
    e=9;
    }
    
    // 852
     else if(lang8 == 1 && lang5 == 1 && lang2 == 1){
    jLabel2.setText("Zeros won!");
    e=9;
    }
    
     else if (lang8 == 0 && lang5 == 0 && lang2 == 0){
    jLabel2.setText("Zeros won!");
    e=9;
    }
    
    
    // 963
     else if(lang9 == 1 && lang6 == 1 && lang3 == 1){
    jLabel2.setText("Crosses won!");
    e=9;
    }
    
    else if (lang9 == 0 && lang6 == 0 && lang3 == 0){
    jLabel2.setText("Zeros won!");
    e=9;
    }
    
    
    // 159
     else if(lang1 == 1 && lang5 == 1 && lang9 == 1){
    jLabel2.setText("Crosses won!");
    e=9;
    }
    
    else if (lang1 == 0 && lang5 == 0 && lang9 == 0){
    jLabel2.setText( "Zeros won!");
    e=9;
    }
    
    
    // 357
     else if(lang3 == 1 && lang5 == 1 && lang7 == 1){
    jLabel2.setText("Crosses won!");
    e=9;
    }
    
    else if (lang3 == 0 && lang5 == 0 && lang7 == 0){
    jLabel2.setText("Zeros won!");
    e=9;
    }
    
    else if (e==9){
        jLabel2.setText("Tie");
    e=9;
    }
        
    }
    
    public Kryziukai_nuliukai() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(66, 18));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("pakartoti");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton10)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // 7 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(P[0]==true){
        if(e==0 || e==2 || e==4 || e==6 || e==8){
        jButton1.setText("X");
        e++;
        lang7 = 1;
        P[0]=false;
       }
       
       else if(e==1 || e==3 || e==5 || e==7){
        jButton1.setText("O");
        e++;
        lang7 = 0;
        P[0]=false;
        }
    }
       else{}
       
       kasLaimejo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kasLaimejo() {
    }


    // 8
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(P[1]==true){ 
        if(e==0 || e==2 || e==4 || e==6 || e==8){
        jButton3.setText("X");
        e++;
        lang8 = 1;
        P[1]=false;
       }
       
       else if(e==1 || e==3 || e==5 || e==7){
        jButton3.setText("O");
        e++;
        lang8 = 0;
        P[1]=false;
        }
        }
        else{}
       kasLaimejo();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    // 9
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(P[2]==true){
        if(e==0 || e==2 || e==4 || e==6 || e==8){
        jButton2.setText("X");
        e++;
        lang9 = 1;
       }
       
       else if(e==1 || e==3 || e==5 || e==7){
        jButton2.setText("O");
        e++;
        lang9 = 0;
        }
        P[2]=false;
        }
        else{}
        kasLaimejo();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    // 4
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(P[3]==true) {
        if(e==0 || e==2 || e==4 || e==6 || e==8){
        jButton9.setText("X");
        e++;
        lang4 = 1;
       }
       
       else if(e==1 || e==3 || e==5 || e==7){
        jButton9.setText("O");
        e++;
        lang4 = 0;
        }
        P[3]=false;
        }
        else{}
         kasLaimejo();
    }//GEN-LAST:event_jButton9ActionPerformed

    
    // 5
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(P[4]==true){ 
        if(e==0 || e==2 || e==4 || e==6 || e==8){
        jButton8.setText("X");
        e++;
        lang5 = 1;
       }
       
       else if(e==1 || e==3 || e==5 || e==7){
        jButton8.setText("O");
        e++;
        lang5 = 0;
        }
        P[4]=false;
        }
        else{}
         kasLaimejo();
    }//GEN-LAST:event_jButton8ActionPerformed

    
    // 6
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(P[5]==true){ 
        if(e==0 || e==2 || e==4 || e==6 || e==8){
        jButton7.setText("X");
        e++;
        lang6 = 1;
       }
       
       else if(e==1 || e==3 || e==5 || e==7){
        jButton7.setText("O");
        e++;
        lang6 = 0;
        }
        P[5]=false;
        }
        else{}
         kasLaimejo();
    }//GEN-LAST:event_jButton7ActionPerformed

    
    // 1
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(P[6]==true){ 
        if(e==0 || e==2 || e==4 || e==6 || e==8){
        jButton4.setText("X");
        e++;
        lang1 = 1;
       }
       
       else if(e==1 || e==3 || e==5 || e==7){
        jButton4.setText("O");
        e++;
        lang1 = 0;
        }
        P[6]=false;
        }
        else{}
         kasLaimejo();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    // 2
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(P[7]==true){ 
        if(e==0 || e==2 || e==4 || e==6 || e==8){
        jButton5.setText("X");
        e++;
        lang2 = 1;
       }
       
       else if(e==1 || e==3 || e==5 || e==7){
        jButton5.setText("O");
        e++;
        lang2 = 0;
        }
        P[7]=false;
        }
        else{}
         kasLaimejo();
    }//GEN-LAST:event_jButton5ActionPerformed

    
    // 3
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(P[8]==true){
        if(e==0 || e==2 || e==4 || e==6 || e==8){
        jButton6.setText("X");
        e++;
        lang3 = 1;
       }
       
       else if(e==1 || e==3 || e==5 || e==7){
        jButton6.setText("O");
        e++;
        lang3 = 0;
        }
        P[8]=false;
        }
        else{}
         kasLaimejo();
    }//GEN-LAST:event_jButton6ActionPerformed

    
    // pakartoti
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        e=0;
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
         lang7 = 3;
         lang8 = 3;
         lang9 = 3;
         lang4 = 3;
         lang5 = 3;
         lang6 = 3;
         lang1 = 3;
         lang2 = 3;
         lang3 = 3;
        jLabel2.setText(" ");
        for(int i=0; i<9; i++){
        P[i]=true;
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(Kryziukai_nuliukai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kryziukai_nuliukai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kryziukai_nuliukai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kryziukai_nuliukai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kryziukai_nuliukai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
