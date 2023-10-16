package MainPackage;

import javax.swing.JOptionPane;

public class AddUser extends javax.swing.JFrame {
   public BorrowedNode head;
   
   public ViewUser viewuser;

   
    public AddUser() {
        
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameBorrowedField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TitleBorrowedField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DateBorrowedField = new javax.swing.JTextField();
        DateReturnedField = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        DisplayUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel1.setText("Borrowed Book Details");

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        jLabel2.setText("Name: ");

        NameBorrowedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameBorrowedFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        jLabel3.setText("Book Title:");

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        jLabel4.setText("Date Borrowed:");

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        jLabel5.setText("Date Returned:");

        SaveButton.setBackground(new java.awt.Color(255, 255, 255));
        SaveButton.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        SaveButton.setText("Save");
        SaveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        jButton1.setText("←Back");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        Exit.setText("Exit");
        Exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        DisplayUser.setBackground(new java.awt.Color(255, 255, 255));
        DisplayUser.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        DisplayUser.setText("Display User");
        DisplayUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DisplayUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(DisplayUser))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NameBorrowedField)
                            .addComponent(TitleBorrowedField)
                            .addComponent(DateBorrowedField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateReturnedField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NameBorrowedField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleBorrowedField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateBorrowedField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateReturnedField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DisplayUser))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameBorrowedFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameBorrowedFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameBorrowedFieldActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
    String user = NameBorrowedField.getText();
    String bookTitle = TitleBorrowedField.getText();
    String dateBorrowed = DateBorrowedField.getText();
    String dateReturned = DateReturnedField.getText();

    Borrowed borrowed = new Borrowed(user, bookTitle, dateBorrowed, dateReturned);
    add(borrowed);
    clearInputFields();

    JOptionPane.showMessageDialog(this, "User added successfully!");         
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       AdminLogin admin = new AdminLogin();
       admin.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void DisplayUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayUserActionPerformed
        ViewUser view = new ViewUser(this);
        view.populateTable2();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DisplayUserActionPerformed
    class Borrowed {
        String userName;
        String bookTitle;
        String dateBorrowed;
        String dateReturned;

        public Borrowed(String userName, String bookTitle, String dateBorrowed, String dateReturned) {
            this.userName = userName;
            this.bookTitle = bookTitle;
            this.dateBorrowed = dateBorrowed;
            this.dateReturned = dateReturned;
        }
    }

    class BorrowedNode {
        Borrowed data;
        BorrowedNode next;

        public BorrowedNode(Borrowed data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(Borrowed borrowed) {
        BorrowedNode newNode = new BorrowedNode(borrowed);
        if (head == null) {
            head = newNode;
        } else {
            BorrowedNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    private void clearInputFields() {
        NameBorrowedField.setText("");
        TitleBorrowedField.setText("");
        DateBorrowedField.setText("");
        DateReturnedField.setText("");
         
    }                                                

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateBorrowedField;
    private javax.swing.JTextField DateReturnedField;
    private javax.swing.JButton DisplayUser;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField NameBorrowedField;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField TitleBorrowedField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
