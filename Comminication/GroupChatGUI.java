
public class GroupChatGUI extends javax.swing.JFrame {

    /**
     * Creates new form GroupChatGUI
     */
    public GroupChatGUI() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void setupGroupChatPanel() {
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        buttonOpenGroup = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaGroupChat = new javax.swing.JTextArea();
        buttonSend = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaMessage = new javax.swing.JTextArea();
        buttonLogout = new javax.swing.JButton();
        buttonGotoIndividualChat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Group Name");

        buttonOpenGroup.setText("Open Group");
        buttonOpenGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOpenGroupActionPerformed(evt);
            }
        });

        textAreaGroupChat.setEditable(false);
        textAreaGroupChat.setColumns(20);
        textAreaGroupChat.setRows(5);
        jScrollPane1.setViewportView(textAreaGroupChat);

        buttonSend.setText("Send");
        buttonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendActionPerformed(evt);
            }
        });

        textAreaMessage.setColumns(20);
        textAreaMessage.setRows(5);
        jScrollPane3.setViewportView(textAreaMessage);

        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        buttonGotoIndividualChat.setText("Goto Individual Chat");
        buttonGotoIndividualChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGotoIndividualChatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Group Chat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonOpenGroup))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonGotoIndividualChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonSend))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLogout)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGotoIndividualChat)
                    .addComponent(buttonOpenGroup)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(buttonSend)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOpenGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOpenGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonOpenGroupActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        // TODO add your handling code here:
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    setVisible(false);
                    dispose();
                    new LoginGUI().setupLoginPanel();
                }
            });
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void buttonGotoIndividualChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGotoIndividualChatActionPerformed
        // TODO add your handling code here:
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    setVisible(false);
                    dispose();
                    new ChatGUI().setupChatPanel();
                }
            });
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_buttonGotoIndividualChatActionPerformed

    private void buttonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSendActionPerformed
        // TODO add your handling code here:
        String message = textAreaMessage.getText().trim();
        if (message.length() > 0) {
            textAreaGroupChat.setText(textAreaGroupChat.getText() + "Me: " + message + "\n");
            textAreaMessage.setText("");
        }
    }//GEN-LAST:event_buttonSendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGotoIndividualChat;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonOpenGroup;
    private javax.swing.JButton buttonSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea textAreaGroupChat;
    private javax.swing.JTextArea textAreaMessage;
    // End of variables declaration//GEN-END:variables
}
