package MainPackage;
import MainPackage.LIBRARYDISPLAY;
import javax.swing.JOptionPane;


public class AddBooks extends javax.swing.JFrame {
public BookNode head;
public LIBRARYDISPLAY libraryDisplay;
public Functions functions;

    public AddBooks() {
        this.functions = functions;
        initComponents();
       
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addbookAUTHORFIELD = new javax.swing.JTextField();
        addbookISBNFIELD = new javax.swing.JTextField();
        addbookTITLEFIELD = new javax.swing.JTextField();
        insertbookBUTTON = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        addbookQUANTITYFIELD = new javax.swing.JTextField();
        backBUTTON = new javax.swing.JButton();
        viewLibraryBUTTON = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setBackground(new java.awt.Color(255, 204, 102));
        jLabel1.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Book Information");

        jPanel2.setBackground(new java.awt.Color(225, 225, 245));

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        jLabel2.setText("BOOK TITLE: ");

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        jLabel3.setText("BOOK AUTHOR: ");

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        jLabel4.setText("BOOK ISBN: ");

        addbookAUTHORFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookAUTHORFIELDActionPerformed(evt);
            }
        });

        addbookISBNFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookISBNFIELDActionPerformed(evt);
            }
        });

        addbookTITLEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookTITLEFIELDActionPerformed(evt);
            }
        });

        insertbookBUTTON.setBackground(new java.awt.Color(189, 153, 137));
        insertbookBUTTON.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        insertbookBUTTON.setText("Insert Book");
        insertbookBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbookBUTTONActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        jLabel8.setText("BOOK QUANTITY:");

        addbookQUANTITYFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookQUANTITYFIELDActionPerformed(evt);
            }
        });

        backBUTTON.setText("Back");
        backBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBUTTONActionPerformed(evt);
            }
        });

        viewLibraryBUTTON.setText("View Library");
        viewLibraryBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLibraryBUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addbookQUANTITYFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addbookISBNFIELD, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addComponent(addbookAUTHORFIELD)
                        .addComponent(addbookTITLEFIELD)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(backBUTTON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewLibraryBUTTON)
                .addGap(18, 18, 18)
                .addComponent(insertbookBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbookTITLEFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbookAUTHORFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbookISBNFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbookQUANTITYFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewLibraryBUTTON)
                    .addComponent(insertbookBUTTON)
                    .addComponent(backBUTTON))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertbookBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbookBUTTONActionPerformed
        String title = addbookTITLEFIELD.getText();
        String author = addbookAUTHORFIELD.getText();
        long isbn = 0;
        int quantity = 0;
        
      boolean isIsbnValid = true;
      boolean isQuantityValid = true;
      
  try {
        isbn = Long.parseLong(addbookISBNFIELD.getText());
    } catch (NumberFormatException e) {
        isIsbnValid = false;
    }

    try {
        quantity = Integer.parseInt(addbookQUANTITYFIELD.getText());
    } catch (NumberFormatException e) {
        isQuantityValid = false;
    }

    if (!isIsbnValid) {
        JOptionPane.showMessageDialog(this, "Invalid input in ISBN. Please enter a valid integer for ISBN.");
    } else if (!isQuantityValid) {
        JOptionPane.showMessageDialog(this, "Invalid input in Quantity. Please enter a valid integer for Quantity.");
    } else {
        Book book = new Book(title, author, isbn, quantity);
        add(book);
        clearInputFields();
        JOptionPane.showMessageDialog(this, "Book added successfully!");
    }
    }
    class Book {
        public String title;
        public String author;
        public long isbn;
        public int quantity;
        
        

        public Book(String title, String author, long isbn,  int quantity) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;

            this.quantity = quantity;
        }
    }

    class BookNode {
        Book data;
        BookNode next;

        public BookNode(Book data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(Book book) {
        BookNode newNode = new BookNode(book);
        if (head == null) {
            head = newNode;
        } else {
            BookNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    private void clearInputFields() {
        addbookTITLEFIELD.setText("");
        addbookAUTHORFIELD.setText("");
        addbookISBNFIELD.setText("");
        addbookQUANTITYFIELD.setText("");
         
    }//GEN-LAST:event_insertbookBUTTONActionPerformed


    private void addbookTITLEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookTITLEFIELDActionPerformed
    }//GEN-LAST:event_addbookTITLEFIELDActionPerformed

    private void addbookAUTHORFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookAUTHORFIELDActionPerformed
    }//GEN-LAST:event_addbookAUTHORFIELDActionPerformed

    private void addbookISBNFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookISBNFIELDActionPerformed
    }//GEN-LAST:event_addbookISBNFIELDActionPerformed

    private void addbookQUANTITYFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookQUANTITYFIELDActionPerformed
        
    }//GEN-LAST:event_addbookQUANTITYFIELDActionPerformed

    private void viewLibraryBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLibraryBUTTONActionPerformed
    LIBRARYDISPLAY view = new LIBRARYDISPLAY(this);
    view.setVisible(true);
    
    }//GEN-LAST:event_viewLibraryBUTTONActionPerformed

    private void backBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBUTTONActionPerformed
        Functions function = new Functions();
        
        functions.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_backBUTTONActionPerformed


    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addbookAUTHORFIELD;
    private javax.swing.JTextField addbookISBNFIELD;
    private javax.swing.JTextField addbookQUANTITYFIELD;
    private javax.swing.JTextField addbookTITLEFIELD;
    private javax.swing.JButton backBUTTON;
    private javax.swing.JButton insertbookBUTTON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton viewLibraryBUTTON;
    // End of variables declaration//GEN-END:variables
}
    
