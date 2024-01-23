/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package classprojectoop;

/**
 *
 * @author Samantha
 */
public class NewsFeedFrame extends javax.swing.JInternalFrame {
      DatabaseTableCreater dbc = new DatabaseTableCreater();
         
    /**
     * Creates new form NewsFeedFrame
     */
    public NewsFeedFrame() {
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

        backgroundPanel = new javax.swing.JPanel();
        newsFeedPanel = new javax.swing.JPanel();
        newsFeedLbl = new javax.swing.JLabel();
        linksPanel = new javax.swing.JPanel();
        userLbl = new javax.swing.JLabel();
        msgLbl = new javax.swing.JLabel();
        userTwoLbl = new javax.swing.JLabel();
        msgTwoLbl = new javax.swing.JLabel();
        descTF = new javax.swing.JTextField();
        postBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 0));

        backgroundPanel.setBackground(new java.awt.Color(255, 102, 0));

        newsFeedPanel.setBackground(new java.awt.Color(102, 102, 255));

        newsFeedLbl.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        newsFeedLbl.setText("News Feed");

        javax.swing.GroupLayout newsFeedPanelLayout = new javax.swing.GroupLayout(newsFeedPanel);
        newsFeedPanel.setLayout(newsFeedPanelLayout);
        newsFeedPanelLayout.setHorizontalGroup(
            newsFeedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newsFeedPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(newsFeedLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addGap(419, 419, 419))
        );
        newsFeedPanelLayout.setVerticalGroup(
            newsFeedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newsFeedPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(newsFeedLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        linksPanel.setBackground(new java.awt.Color(255, 255, 255));

        userLbl.setText("Jason Mc Connell");

        msgLbl.setBackground(new java.awt.Color(204, 204, 204));
        msgLbl.setText(" I love doing GUI!");
        msgLbl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        userTwoLbl.setText("James O'Neill");

        msgTwoLbl.setText("GUI is so much fun!");
        msgTwoLbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout linksPanelLayout = new javax.swing.GroupLayout(linksPanel);
        linksPanel.setLayout(linksPanelLayout);
        linksPanelLayout.setHorizontalGroup(
            linksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(linksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLbl)
                    .addComponent(userTwoLbl))
                .addGap(18, 18, 18)
                .addGroup(linksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgTwoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(426, Short.MAX_VALUE))
        );

        linksPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {msgLbl, msgTwoLbl});

        linksPanelLayout.setVerticalGroup(
            linksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(linksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLbl)
                    .addComponent(msgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(linksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTwoLbl)
                    .addComponent(msgTwoLbl))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        linksPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {msgLbl, msgTwoLbl});

        descTF.setText("Any News??");
        descTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descTFActionPerformed(evt);
            }
        });

        postBtn.setText("Post");
        postBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newsFeedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(linksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(descTF, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(postBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(newsFeedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(postBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descTF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descTFActionPerformed

    private void postBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postBtnActionPerformed
        // TODO add your handling code here:
        String userName = userLbl.getText();
        String NewsFeed = descTF.getText();
       dbc.createNewsFeed(NewsFeed);
       String newsFeed = userLbl.getText();
       dbc.createNewsFeed(newsFeed);
        
       
       
       
        
    }//GEN-LAST:event_postBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JTextField descTF;
    private javax.swing.JPanel linksPanel;
    private javax.swing.JLabel msgLbl;
    private javax.swing.JLabel msgTwoLbl;
    private javax.swing.JLabel newsFeedLbl;
    private javax.swing.JPanel newsFeedPanel;
    private javax.swing.JButton postBtn;
    private javax.swing.JLabel userLbl;
    private javax.swing.JLabel userTwoLbl;
    // End of variables declaration//GEN-END:variables
}
