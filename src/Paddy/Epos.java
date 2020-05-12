//Patrick Newton - 30317939 - EPOS Assignment
package Paddy;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Paddy - 30317939
 */
public class Epos extends javax.swing.JFrame {

    private double runningTotal = 0.00;
    public ArrayList<Double> totalList = new ArrayList<Double>();

    public Epos() {
        initComponents();
    }

    //Auto generated code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        mainPanel = new javax.swing.JPanel();
        tabbedMain = new javax.swing.JTabbedPane();
        tabbedOrder = new javax.swing.JTabbedPane();
        pnlOrder = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        btnPay = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaOrder = new javax.swing.JTextArea();
        lblTotal = new javax.swing.JLabel();
        lblOrderEmployeeNumber = new javax.swing.JLabel();
        spinnerQuantity = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btnSoup = new javax.swing.JButton();
        btnDippers = new javax.swing.JButton();
        btnPate = new javax.swing.JButton();
        btnPasta = new javax.swing.JButton();
        btnSteak = new javax.swing.JButton();
        btnSalmon = new javax.swing.JButton();
        btnCake = new javax.swing.JButton();
        btnCheese = new javax.swing.JButton();
        btnBread = new javax.swing.JButton();
        tabbedAccount = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblEmployeeNumber = new javax.swing.JLabel();
        lblLogIn = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JTextField();
        txtCurrentPassword = new javax.swing.JPasswordField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();
        tabbedReports = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblTotalCustomers = new javax.swing.JLabel();
        lblTotalSales = new javax.swing.JLabel();
        lblMaxSale = new javax.swing.JLabel();
        lblMinSale = new javax.swing.JLabel();
        lblAverageSale = new javax.swing.JLabel();
        btnUpdateSales = new javax.swing.JButton();
        tabbedManagement = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboUsers = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        chkManager = new javax.swing.JCheckBox();
        btnAddNewUser = new javax.swing.JButton();
        tabbedRestart = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnResetData = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabbedOrder.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPay.setText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(btnPay, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnCancelOrder, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelOrder)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPay)
                    .addComponent(btnCancelOrder))
                .addContainerGap())
        );

        jLabel15.setText("Total: £");

        txtAreaOrder.setColumns(20);
        txtAreaOrder.setRows(5);
        jScrollPane2.setViewportView(txtAreaOrder);

        lblTotal.setText("0.00");

        lblOrderEmployeeNumber.setText("no");

        jLabel30.setText("Quantity:");

        jLabel31.setText("Employee No.");

        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblOrderEmployeeNumber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(spinnerQuantity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOrderEmployeeNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderEmployeeNumber)
                    .addComponent(spinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnSoup.setText("Soup");
        btnSoup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoupActionPerformed(evt);
            }
        });

        btnDippers.setText("Dippers");
        btnDippers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDippersActionPerformed(evt);
            }
        });

        btnPate.setText("Pate");
        btnPate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPateActionPerformed(evt);
            }
        });

        btnPasta.setText("Pasta");
        btnPasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastaActionPerformed(evt);
            }
        });

        btnSteak.setText("Steak");
        btnSteak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSteakActionPerformed(evt);
            }
        });

        btnSalmon.setText("Salmon");
        btnSalmon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalmonActionPerformed(evt);
            }
        });

        btnCake.setText("Cake");
        btnCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCakeActionPerformed(evt);
            }
        });

        btnCheese.setText("Cheese");
        btnCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheeseActionPerformed(evt);
            }
        });

        btnBread.setText("Bread");
        btnBread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBreadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOrderLayout = new javax.swing.GroupLayout(pnlOrder);
        pnlOrder.setLayout(pnlOrderLayout);
        pnlOrderLayout.setHorizontalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSoup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSteak, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(btnCake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDippers, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(btnCheese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnPate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalmon, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                    .addComponent(btnBread, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlOrderLayout.setVerticalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDippers, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btnSoup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPasta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(btnSalmon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSteak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCake, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBread, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        tabbedOrder.addTab("Menu", pnlOrder);

        tabbedMain.addTab("Order", tabbedOrder);

        tabbedAccount.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jLabel1.setText("Account Details");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Employee Number:");

        jLabel5.setText("Log In Name:");

        jLabel6.setText("Role:");

        lblFirstName.setText("jLabel14");

        lblLastName.setText("jLabel14");

        lblEmployeeNumber.setText("jLabel14");

        lblLogIn.setText("jLabel14");

        lblRole.setText("jLabel14");

        jLabel27.setText("Change your password:");

        txtCurrentPassword.setText("jPasswordField1");

        jLabel28.setText("Current Password:");

        jLabel29.setText("New Password:");

        btnChangePassword.setText("Confirm");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmployeeNumber))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(lblRole))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLastName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLogIn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(lblFirstName)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                        .addComponent(jLabel28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel29)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(btnChangePassword)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNewPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCurrentPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel27))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblFirstName)
                    .addComponent(txtCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblLastName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblEmployeeNumber)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblLogIn)
                    .addComponent(btnChangePassword))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblRole))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        tabbedAccount.addTab("Account Details", jPanel1);

        tabbedMain.addTab("My Account", tabbedAccount);

        tabbedReports.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jLabel16.setText("Total Number of Customers served:");

        jLabel17.setText("Total Sales of working day:");

        jLabel18.setText("Highest sale of the day:");

        jLabel19.setText("Lowest sale of the day:");

        jLabel20.setText("Average sale of the day:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setText("Sales Report:");

        lblTotalCustomers.setText("totalCustomers");

        lblTotalSales.setText("totalSales");

        lblMaxSale.setText("highestGross");

        lblMinSale.setText("lowestGross");

        lblAverageSale.setText("averageGross");

        btnUpdateSales.setText("Update");
        btnUpdateSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblMaxSale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                                .addComponent(btnUpdateSales))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotalSales)
                                    .addComponent(lblAverageSale)
                                    .addComponent(lblMinSale)
                                    .addComponent(lblTotalCustomers))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel21)))
                .addGap(57, 57, 57))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblTotalCustomers))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblTotalSales))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblMaxSale)
                    .addComponent(btnUpdateSales))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblMinSale))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblAverageSale))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        tabbedReports.addTab("Reports", jPanel4);

        tabbedMain.addTab("Reports", tabbedReports);

        tabbedManagement.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jLabel7.setText("Current Products:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soup", "Dippers", "Pate", "Pasta", "Steak", "Salmon", "Cake", "Cheese", "Bread" }));

        jLabel8.setText("Current User logins:");

        jLabel9.setText("Add a new user:");

        jLabel10.setText("First Name:");

        jLabel11.setText("Last Name:");

        jLabel12.setText("Password:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        chkManager.setText("Manager?");

        btnAddNewUser.setText("Add new user");
        btnAddNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cboUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(txtFirstName))
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkManager)
                            .addComponent(btnAddNewUser))
                        .addGap(68, 68, 68))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkManager)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddNewUser)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        tabbedManagement.addTab("Management", jPanel2);

        tabbedMain.addTab("Management", tabbedManagement);

        tabbedRestart.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        btnResetData.setText("Reset all data");
        btnResetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDataActionPerformed(evt);
            }
        });

        jLabel13.setText("Would you like to reset all sales data?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(btnResetData))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel13)))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(btnResetData)
                .addGap(109, 109, 109))
        );

        tabbedRestart.addTab("Restart", jPanel3);

        tabbedMain.addTab("Restart", tabbedRestart);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedMain)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedMain)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        login();
        setComboBox();
        setReports();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnSoupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoupActionPerformed
        
        double soup = 4.50;
       
       //Gets the quantity from the spinner
       int quantity = (Integer)spinnerQuantity.getValue();
       
       //adds to the total
       runningTotal = runningTotal + (soup * quantity);
       
       txtAreaOrder.append("Soup x" + quantity + " - £" + (soup * quantity) + "\n");
       //resets the quantity to 1, ready for the next product
       spinnerQuantity.setValue(1);
       
       //Updates the total
       lblTotal.setText(Double.toString(runningTotal) + "0");
    }//GEN-LAST:event_btnSoupActionPerformed

    private void btnDippersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDippersActionPerformed
        
        double dippers = 5.00;
       
       //Gets the quantity from the spinner
       int quantity = (Integer)spinnerQuantity.getValue();
       
       //adds to the total
       runningTotal = runningTotal + (dippers * quantity);
       
       txtAreaOrder.append("Dippers x" + quantity + " - £" + (dippers * quantity) + "\n");
       //resets the quantity to 1, ready for the next product
       spinnerQuantity.setValue(1);
       
       //Updates the total
       lblTotal.setText(Double.toString(runningTotal) + "0");
    }//GEN-LAST:event_btnDippersActionPerformed

    private void btnAddNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewUserActionPerformed
        //If the role is a user it is indicated by a U, if it is a manager it is indicated by a M
        String ifAdmin = "USER";
        String loginFirstChar;
        String login = "";
        
        //Concatenating the users names to make a login name
        loginFirstChar = txtFirstName.getText().substring(0, 1);
        login = loginFirstChar + txtLastName.getText();
        
        //If the checkbox is selected the role is saved as manager
        if(chkManager.isSelected()){ifAdmin = "MANAGER";}
        
        try {
            //Opens the connection to the database
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://data\\Epos.accdb");
            Statement stmt = con.createStatement();
        
            //Receving the data from the text boxes to submit the users details
            String theSql = "INSERT INTO Users (firstname, lastname, password, Role, logIn) VALUES ('";
            theSql = theSql + txtFirstName.getText() + "' , '" + txtLastName.getText() + "' , '" + txtPassword.getText() + "' , '" + ifAdmin + "' , '" + login + "')";
            stmt.executeUpdate(theSql);
            
            JOptionPane.showMessageDialog(this, "New user added:" + txtFirstName.getText() + " " + txtLastName.getText());
            
            //Resets the inputs
            txtFirstName.setText("");
            txtLastName.setText("");
            txtPassword.setText("");
           
            //Calls to reset the combobox
            setComboBox();
            
        }catch (SQLException e) {
            System.out.println("SQL exception occured" + e);
    }
    }//GEN-LAST:event_btnAddNewUserActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        
        try {
            //opens the connection
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://data\\Epos.accdb");
            Statement stmt = con.createStatement();
        
            //Receving the data from the text boxes to submit the users details
            String theSql = "INSERT INTO sales (employeeNumber, sale) VALUES ('";
            theSql = theSql + lblOrderEmployeeNumber.getText() + "' , '" + lblTotal.getText() + "')";
            stmt.executeUpdate(theSql);
            //Resets the inputs
            
            lblTotal.setText("0.00");
            
            
            JOptionPane.showMessageDialog(this, "Transaction Successful");
            runningTotal = 0.00;
            txtAreaOrder.setText("");
            
        }catch (SQLException e) {
            System.out.println("SQL exception occured" + e);
    }
        
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnUpdateSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSalesActionPerformed
        
        
        databaseUtil.isDatabaseDriversExist();
        
        try 
            {
                //gets the connection open
                Connection con=databaseUtil.getConnection();
                Statement stmt = con.createStatement();
                //The sql is taking all the sales data from the sales table
                ResultSet rs = stmt.executeQuery ("SELECT sale FROM sales");

                while(rs.next()){
                //adding the sale totals to the arraylist so long as theres another entry
                totalList.add(rs.getDouble("sale"));
                }
                
                //Find min algorithm
            double min = totalList.get(0);
            for(int i = 0; i < totalList.size(); i++){
        
            if(totalList.get(i) < min){
            min = totalList.get(i);
            }
    }
        lblMinSale.setText("£" + Double.toString(min) + "0");
        
        
        //Find max algorithm
        double max = totalList.get(0);
        for(int i = 0; i < totalList.size(); i++){
        
            if(totalList.get(i) > max){
            max = totalList.get(i);
        }
    }
        lblMaxSale.setText("£" + Double.toString(max) + "0");
        
        
        //Calculating the total customers 
        int totalCustomers = totalList.size();
        lblTotalCustomers.setText(Integer.toString(totalCustomers));
        
        //Total sales for the day
        double totalSales = 0;
        for(int i = 0; i < totalList.size(); i++)
            totalSales += totalList.get(i);
        lblTotalSales.setText("£" +Double.toString(totalSales) + "0");
        
        //Calculating the average sale
        double sum;
        sum = Math.round(totalSales / totalCustomers);
        lblAverageSale.setText("£" + Double.toString(sum) + "0");
            }catch(SQLException e)
            {
                System.out.println("SQL exception occured" + e);
            }

    }//GEN-LAST:event_btnUpdateSalesActionPerformed

    
    
    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        //If the order is cancelled this resets all the entries
        txtAreaOrder.setText("");
        lblTotal.setText("0.00");
        runningTotal = 0.00;
        JOptionPane.showMessageDialog(this, "Order has been cancelled");
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        //Opens the connection
        try{
            
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://data\\Epos.accdb");
        Statement stmt = con.createStatement();
            //The sql will search for the employee number and change the current password to the new one entered
        String sql = "UPDATE Users SET password='" + txtNewPassword.getText() + "' WHERE employeeNumber= '" + lblOrderEmployeeNumber.getText() + "'";

        stmt.executeUpdate(sql);
        //Clears the text boxes
        txtCurrentPassword.setText("");
        txtNewPassword.setText("");
        
        JOptionPane.showMessageDialog(this, "Password Updated");
      
        }catch (SQLException e) {
            System.out.println("SQL exception occured" + e);
}


    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnPateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPateActionPerformed
        
        double pate = 4.00;
       
       //Gets the quantity from the spinner
       int quantity = (Integer)spinnerQuantity.getValue();
       
       //adds to the total
       runningTotal = runningTotal + (pate * quantity);
       
       txtAreaOrder.append("Pate x" + quantity + " - £" + (pate * quantity) + "\n");
       //resets the quantity to 1, ready for the next product
       spinnerQuantity.setValue(1);
       
       //Updates the total
       lblTotal.setText(Double.toString(runningTotal) + "0");
    }//GEN-LAST:event_btnPateActionPerformed

    private void btnSteakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSteakActionPerformed
       
        double steak = 13.00;
       
       //Gets the quantity from the spinner
       int quantity = (Integer)spinnerQuantity.getValue();
       
       //adds to the total
       runningTotal = runningTotal + (steak * quantity);
       
       txtAreaOrder.append("Steak x" + quantity + " - £" + (steak * quantity) + "\n");
       //resets the quantity to 1, ready for the next product
       spinnerQuantity.setValue(1);
       
       //Updates the total
       lblTotal.setText(Double.toString(runningTotal) + "0");
    }//GEN-LAST:event_btnSteakActionPerformed

    private void btnPastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastaActionPerformed
        
        double pasta = 11.00;
       
       //Gets the quantity from the spinner
       int quantity = (Integer)spinnerQuantity.getValue();
       
       //adds to the total
       runningTotal = runningTotal + (pasta * quantity);
       
       txtAreaOrder.append("Pasta x" + quantity + " - £" + (pasta * quantity) + "\n");
       //resets the quantity to 1, ready for the next product
       spinnerQuantity.setValue(1);
       
       //Updates the total
       lblTotal.setText(Double.toString(runningTotal) + "0");
    }//GEN-LAST:event_btnPastaActionPerformed

    private void btnSalmonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalmonActionPerformed
       
        double salmon = 12.00;
       
       //Gets the quantity from the spinner
       int quantity = (Integer)spinnerQuantity.getValue();
       
       //adds to the total
       runningTotal = runningTotal + (salmon * quantity);
       
       txtAreaOrder.append("Salmon x" + quantity + " - £" + (salmon * quantity) + "\n");
       //resets the quantity to 1, ready for the next product
       spinnerQuantity.setValue(1);
       
       //Updates the total
       lblTotal.setText(Double.toString(runningTotal) + "0");
    }//GEN-LAST:event_btnSalmonActionPerformed

    private void btnCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCakeActionPerformed
        
        double cake = 7.00;
       
       //Gets the quantity from the spinner
       int quantity = (Integer)spinnerQuantity.getValue();
       
       //adds to the total
       runningTotal = runningTotal + (cake * quantity);
       
       txtAreaOrder.append("Cake  x" + quantity + " - £" + (cake * quantity) + "\n");
       //resets the quantity to 1, ready for the next product
       spinnerQuantity.setValue(1);
       
       //Updates the total
       lblTotal.setText(Double.toString(runningTotal) + "0");
    }//GEN-LAST:event_btnCakeActionPerformed

    private void btnCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheeseActionPerformed
       
        double cheese = 9.00;
       
       //Gets the quantity from the spinner
       int quantity = (Integer)spinnerQuantity.getValue();
       
       //adds to the total
       runningTotal = runningTotal + (cheese * quantity);
       
       txtAreaOrder.append("Cheese x" + quantity + " - £" + (cheese * quantity) + "\n");
       //resets the quantity to 1, ready for the next product
       spinnerQuantity.setValue(1);
       
       //Updates the total
       lblTotal.setText(Double.toString(runningTotal) + "0");
    }//GEN-LAST:event_btnCheeseActionPerformed

    private void btnBreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBreadActionPerformed
        
        double bread = 4.00;
       
       //Gets the quantity from the spinner
       int quantity = (Integer)spinnerQuantity.getValue();
       
       //adds to the total
       runningTotal = runningTotal + (bread * quantity);
       
       txtAreaOrder.append("Bread x" + quantity + " - £" + (bread * quantity) + "\n");
       //resets the quantity to 1, ready for the next product
       spinnerQuantity.setValue(1);
       
       //Updates the total
       lblTotal.setText(Double.toString(runningTotal) + "0");
    }//GEN-LAST:event_btnBreadActionPerformed

    private void btnResetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDataActionPerformed
        
        //clears the list array
        totalList.clear();
        
        try {
            //opens the connection
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://data\\Epos.accdb");
            Statement stmt = con.createStatement();
            
            //Sends to the database to clear the sales table
            String theSql = "DELETE * FROM sales";
            stmt.executeUpdate(theSql);
            
            JOptionPane.showMessageDialog(this, "The sales data has been cleared");
        }catch (SQLException e) {
            System.out.println("SQL exception occured" + e);
                }
        
        setReports();
        
    }//GEN-LAST:event_btnResetDataActionPerformed

    public void setReports()
    {
        //This method resets the labels in the reports tab
    lblMinSale.setText("£0.00");
        lblMaxSale.setText("£0.00");
        lblAverageSale.setText("£0.00");
        lblTotalCustomers.setText("£0.00");
        lblTotalSales.setText("£0.00");
    }
    
    public void setComboBox(){
        cboUsers.removeAllItems();
        
        //calling the method to retrive the current users data
        ArrayList<String> comboBoxData = userDataHandler.collectUsersName();
        
        int sizeComboBoxData = comboBoxData.size();
        
        //populates the combobox for each entry in the database
        for(int i = 0; i<sizeComboBoxData; i = i+1)
        {
        cboUsers.addItem(comboBoxData.get(i));
        }
        //The combobox is populated in the format of employeeNumber: employeeLogin.
    }
    
    public void login(){
        //This creates the login panel
    JLabel label_login = new JLabel("Username:");
    JTextField login = new JTextField();
    JLabel label_password = new JLabel("Password:");
    JPasswordField password = new JPasswordField();

 Object[] login_GUI_Elelemnts = { label_login, login, label_password, password };

 int activeUser = JOptionPane.showConfirmDialog(null, login_GUI_Elelemnts, "Login",
 JOptionPane.OK_CANCEL_OPTION,
 JOptionPane.PLAIN_MESSAGE);
//If they click login
 if (activeUser == JOptionPane.OK_OPTION)
 {
 String userLogin = login.getText(); // user string that the user entered in the textfield
 String pass = password.getText(); //gets the password string from textfield
 

  Boolean entryGranted = false ;//access is not allowed unless valid login is entered.
 
 
 user ACUser = new user();//Instantiate this user object
 ACUser.setLogIn(userLogin);
 ACUser.setPassword(pass);// set the password
 
 
 userDataHandler userDataHandlerTemp= new userDataHandler();
 
 if (userDataHandlerTemp.checkUserExists(ACUser)){ //This takes the users entry and compares it to the database
    
     ACUser = userDataHandlerTemp.getValidUser(ACUser);
     
  if (ACUser.getRole().toUpperCase().equals("USER")) //If the database brings back the role as a user
    {
    JOptionPane.showMessageDialog(this, "Logged in as user");
       //If the login is from a user it removes the tabs the user isnt allowed to access
       this.tabbedMain.remove(tabbedManagement); 
       this.tabbedMain.remove(tabbedRestart); 
       //When entry is granted it allows the user to interact with the Epos
    entryGranted=true;
    }
    else if (ACUser.getRole().toUpperCase().equals("MANAGER")) // if the database brings back the role as manager
    {
    JOptionPane.showMessageDialog(this, "Logged in as Manager");
    //No tabs are removed as the manager is allowed access to all areas
    entryGranted=true;
    }
  
        if(entryGranted == true)
        {
            //Populating the account tab and the employee order number for the purchases
        lblOrderEmployeeNumber.setText(Integer.toString(ACUser.getEmployeeNumber()));
        lblFirstName.setText(ACUser.getFirstName());
        lblLastName.setText(ACUser.getLastName());
        lblRole.setText(ACUser.getRole());
        lblLogIn.setText(ACUser.getLogIn());
        lblEmployeeNumber.setText(Integer.toString(ACUser.getEmployeeNumber()));
        txtCurrentPassword.setText(ACUser.getPassword());
        spinnerQuantity.setValue(1);
        //Clunky looking but saves time in future
        }
 }
 else
    {
    activeUser = JOptionPane.CANCEL_OPTION;
    }
 }
 
 //If the user closes the login or if the details are incorrect
 if ( (activeUser == JOptionPane.CANCEL_OPTION) || (activeUser == JOptionPane.CLOSED_OPTION) )
    {
    JOptionPane.showMessageDialog(this, "Login was unsuccessful\nInvalid interaction");
    //Invalid interaction is just either a wrong login or if the user closes the panel
    System.exit(0);
    }
 
    }
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Epos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Epos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Epos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Epos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Epos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewUser;
    private javax.swing.JButton btnBread;
    private javax.swing.JButton btnCake;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnCheese;
    private javax.swing.JButton btnDippers;
    private javax.swing.JButton btnPasta;
    private javax.swing.JButton btnPate;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnResetData;
    private javax.swing.JButton btnSalmon;
    private javax.swing.JButton btnSoup;
    private javax.swing.JButton btnSteak;
    private javax.swing.JButton btnUpdateSales;
    private javax.swing.JComboBox<String> cboUsers;
    private javax.swing.JCheckBox chkManager;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAverageSale;
    private javax.swing.JLabel lblEmployeeNumber;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLogIn;
    private javax.swing.JLabel lblMaxSale;
    private javax.swing.JLabel lblMinSale;
    private javax.swing.JLabel lblOrderEmployeeNumber;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalCustomers;
    private javax.swing.JLabel lblTotalSales;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pnlOrder;
    private javax.swing.JSpinner spinnerQuantity;
    private javax.swing.JTabbedPane tabbedAccount;
    private javax.swing.JTabbedPane tabbedMain;
    private javax.swing.JTabbedPane tabbedManagement;
    private javax.swing.JTabbedPane tabbedOrder;
    private javax.swing.JTabbedPane tabbedReports;
    private javax.swing.JTabbedPane tabbedRestart;
    private javax.swing.JTextArea txtAreaOrder;
    private javax.swing.JPasswordField txtCurrentPassword;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNewPassword;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
