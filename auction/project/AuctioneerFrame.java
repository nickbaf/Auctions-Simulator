package auction.project;

import jade.Boot;
import jade.core.AID;
import jade.core.Agent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import java.util.Random;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.DefaultComboBoxModel;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.core.Runtime;
import jade.domain.DFService;
import jade.wrapper.ControllerException;
import jade.wrapper.StaleProxyException;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;

/**
 * The GRaphical User Interface of our Project.It extends the JFrame class.
 *
 * @author Kalliopi Malerou(2370),Nikolaos Mamais(2371),Nikolaos Bafatakis(2383)
 */
public class AuctioneerFrame extends javax.swing.JFrame {

    /**
     * Creates new form auctionFrame
     */
    private static ContainerController cont;
    private static boolean flag = false;

    public AuctioneerFrame() {
        this.setIconImage(new ImageIcon("Resources/ico.png").getImage());
        initComponents();
        this.setSize(955, 515);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(30,128,240));

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
        type = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bidder2Budget = new javax.swing.JTextField();
        autoBudget = new javax.swing.JCheckBox();
        bidder1Budget = new javax.swing.JTextField();
        commence = new javax.swing.JButton();
        budgetSlider = new javax.swing.JSlider();
        pricePanel = new javax.swing.JPanel();
        messageOptions = new javax.swing.JLabel();
        startPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bidder1Spinner = new javax.swing.JSpinner();
        bidder2Spinner = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventsList = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auction Panel v.1");
        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+10));
        jLabel1.setText("Auction Simulator");
        jLabel1.setToolTipText("Press for App info!");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        DefaultComboBoxModel model1=new DefaultComboBoxModel();
        model1.addElement("English Auction");
        model1.addElement("Dutch Auction");
        model1.addElement("Japanese Auction");
        model1.addElement("First-price sealed-bid Auction");
        model1.addElement("Second-price sealed-bid aka.Vickrey Auction");
        type.setModel(model1);
        type.setSelectedIndex(0);
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, jLabel2.getFont().getSize()+2));
        jLabel2.setText("Auction Type:");

        jLabel3.setFont(jLabel3.getFont().deriveFont((jLabel3.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, jLabel3.getFont().getSize()+2));
        jLabel3.setText("Bidder_1 Budget:");

        jLabel4.setFont(jLabel4.getFont().deriveFont((jLabel4.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, jLabel4.getFont().getSize()+2));
        jLabel4.setText("Bidder_2 Budget:");

        bidder2Budget.setColumns(10);

        autoBudget.setText("Auto Budget");
        autoBudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoBudgetActionPerformed(evt);
            }
        });

        bidder1Budget.setColumns(10);
        bidder1Budget.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                bidder1BudgetPropertyChange(evt);
            }
        });

        commence.setFont(commence.getFont().deriveFont((commence.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, commence.getFont().getSize()+3));
        commence.setText("Commence Auction");
        commence.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                commenceStateChanged(evt);
            }
        });
        commence.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                commenceInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        commence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commenceActionPerformed(evt);
            }
        });

        budgetSlider.setEnabled(false);
        DefaultBoundedRangeModel range=new DefaultBoundedRangeModel();
        range.setMinimum(1000);
        range.setMaximum(50000);
        budgetSlider.setModel(range);
        budgetSlider.setFont(budgetSlider.getFont().deriveFont((budgetSlider.getFont().getStyle() | java.awt.Font.ITALIC), budgetSlider.getFont().getSize()+1));
        budgetSlider.setForeground(new java.awt.Color(102, 255, 102));
        budgetSlider.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                budgetSliderAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        budgetSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                budgetSliderStateChanged(evt);
            }
        });

        pricePanel.setVisible(true);
        pricePanel.setBackground(new java.awt.Color(252, 56, 65));
        pricePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        messageOptions.setFont(messageOptions.getFont().deriveFont((messageOptions.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, messageOptions.getFont().getSize()+1));
        messageOptions.setText("Starting Price:");

        startPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startPriceActionPerformed(evt);
            }
        });

        jLabel6.setText("Bidder_1 Item Desire:");

        jLabel7.setText("Bidder_2 Item Desire:");

        SpinnerNumberModel spin1=new SpinnerNumberModel(Integer.valueOf(5),Integer.valueOf(1),Integer.valueOf(10),Integer.valueOf(1));
        bidder1Spinner.setModel(spin1);

        SpinnerNumberModel spin2=new SpinnerNumberModel(Integer.valueOf(5),Integer.valueOf(1),Integer.valueOf(10),Integer.valueOf(1));
        bidder2Spinner.setModel(spin2);

        javax.swing.GroupLayout pricePanelLayout = new javax.swing.GroupLayout(pricePanel);
        pricePanel.setLayout(pricePanelLayout);
        pricePanelLayout.setHorizontalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricePanelLayout.createSequentialGroup()
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pricePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bidder1Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(bidder2Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(pricePanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageOptions)
                            .addComponent(startPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        pricePanelLayout.setVerticalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageOptions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bidder1Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(9, 9, 9)
                .addComponent(bidder2Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DefaultListModel list1=new DefaultListModel();
        eventsList.setModel(list1);
        eventsList.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                eventsListComponentAdded(evt);
            }
        });
        eventsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                eventsListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(eventsList);
        eventsList.setDragEnabled(false);

        jLabel8.setText("Auctioneers' Log:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(159, 159, 159)
                .addComponent(jLabel8)
                .addGap(116, 116, 116))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(commence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(autoBudget)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(budgetSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(bidder1Budget, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(57, 57, 57)
                                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(bidder2Budget, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 44, Short.MAX_VALUE))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bidder1Budget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bidder2Budget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pricePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autoBudget, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(budgetSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commence, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        DefaultComboBoxModel mod = (DefaultComboBoxModel) type.getModel();
        if (mod.getSelectedItem().equals("English Auction")) {
            pricePanel.setVisible(true);
            bidder1Spinner.setEnabled(true);
            bidder2Spinner.setEnabled(true);
            messageOptions.setText("<html>Set the <b>Starting</b> Price</html>");
        } else if (mod.getSelectedItem().equals("Dutch Auction")) {
            pricePanel.setVisible(true);
            bidder1Spinner.setEnabled(false);
            bidder2Spinner.setEnabled(false);
            messageOptions.setText("<html>Set the <b>Maximum</b> Price</html>");
        } else if (mod.getSelectedItem().equals("Japanese Auction")) {
            pricePanel.setVisible(false);
        } else if (mod.getSelectedItem().equals("First-price sealed-bid Auction")) {
            pricePanel.setVisible(false);
        }
    }//GEN-LAST:event_typeActionPerformed

    private void autoBudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoBudgetActionPerformed
        if (autoBudget.isSelected()) {
            budgetSlider.setEnabled(true);
            int value = budgetSlider.getModel().getValue();
            Random rand = new Random();
            int n1 = value + rand.nextInt(5000);
            int n2 = value + rand.nextInt(5000);
            bidder1Budget.setText(String.valueOf(n1));
            bidder2Budget.setText(String.valueOf(n2));
        } else {
            budgetSlider.getModel().setValue(1000);
            budgetSlider.setEnabled(false);
            bidder1Budget.setText(" ");
            bidder2Budget.setText(" ");
        }
    }//GEN-LAST:event_autoBudgetActionPerformed

    private void commenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commenceActionPerformed
        //System.out.println(NameGenerator.generateName("male")+" "+NameGenerator.generateName("female"));
        try {
            if (!commence.getText().equals("cancel Auction...")) {
                if (type.getModel().getSelectedItem().equals("English Auction")) {
                    DefaultListModel listtemp = (DefaultListModel) eventsList.getModel();
                    listtemp.removeAllElements();
                    Object[] args = new Object[2];
                    args[0] = Integer.valueOf(startPrice.getText());
                    args[1] = "english";
                    cont.createNewAgent("Auctioneer", "auction.project.Auctioneer", args).start();
                    args = new Object[4];
                    args[0] = Integer.valueOf(bidder1Budget.getText());
                    args[1] = "english";
                    args[2] = bidder1Spinner.getValue();
                    args[3] = Integer.valueOf(startPrice.getText());
                    String name = NameGenerator.generateName("male");
                    jLabel3.setText(name);
                    cont.createNewAgent(name, "auction.project.Bidder", args).start();
                    args = new Object[4];
                    args[2] = bidder2Spinner.getValue();
                    args[1] = "english";
                    args[0] = Integer.valueOf(bidder2Budget.getText());
                    args[3] = Integer.valueOf(startPrice.getText());
                    name = NameGenerator.generateName("female");
                    jLabel4.setText(name);
                    cont.createNewAgent(name, "auction.project.Bidder", args).start();
                    bidder1Budget.setEnabled(false);
                    bidder2Budget.setEnabled(false);
                    commence.setText("cancel Auction...");
                } else if (type.getModel().getSelectedItem().equals("Dutch Auction")) {
                    DefaultListModel listtemp = (DefaultListModel) eventsList.getModel();
                    listtemp.removeAllElements();
                    Object[] args = new Object[2];
                    args[0] = Integer.valueOf(startPrice.getText());
                    args[1] = "dutch";
                    cont.createNewAgent("Auctioneer", "auction.project.Auctioneer", args).start();

                    args = new Object[2];
                    args[0] = Integer.valueOf(bidder1Budget.getText());
                    args[1] = "dutch";
                    String name = NameGenerator.generateName("male");
                    jLabel3.setText(name);
                    cont.createNewAgent(name, "auction.project.Bidder", args).start();
                    args = new Object[2];
                    args[1] = "dutch";
                    args[0] = Integer.valueOf(bidder2Budget.getText());
                    name = NameGenerator.generateName("female");
                    jLabel4.setText(name);
                    cont.createNewAgent(name, "auction.project.Bidder", args).start();
                    bidder1Budget.setEnabled(false);
                    bidder2Budget.setEnabled(false);
                    commence.setText("cancel Auction...");
                } else if (type.getModel().getSelectedItem().equals("Japanese Auction")) {
                    DefaultListModel listtemp = (DefaultListModel) eventsList.getModel();
                    listtemp.removeAllElements();
                    Object[] args = new Object[2];
                    args[0] = 0;
                    args[1] = "japanese";
                    cont.createNewAgent("Auctioneer", "auction.project.Auctioneer", args).start();

                    args = new Object[2];
                    args[0] = Integer.valueOf(bidder1Budget.getText());
                    args[1] = "japanese";
                    String name = NameGenerator.generateName("male");
                    jLabel3.setText(name);
                    cont.createNewAgent(name, "auction.project.Bidder", args).start();
                    args = new Object[2];
                    args[1] = "japanese";
                    args[0] = Integer.valueOf(bidder2Budget.getText());
                    name = NameGenerator.generateName("female");
                    jLabel4.setText(name);
                    cont.createNewAgent(name, "auction.project.Bidder", args).start();
                    bidder1Budget.setEnabled(false);
                    bidder2Budget.setEnabled(false);
                    commence.setText("cancel Auction...");
                } else if (type.getModel().getSelectedItem().equals("First-price sealed-bid Auction")) {
                    DefaultListModel listtemp = (DefaultListModel) eventsList.getModel();
                    listtemp.removeAllElements();
                    Object[] args = new Object[2];
                    args[0] = 0;
                    args[1] = "first-price";
                    cont.createNewAgent("Auctioneer", "auction.project.Auctioneer", args).start();

                    args = new Object[2];
                    args[0] = Integer.valueOf(bidder1Budget.getText());
                    args[1] = "first-price";
                    String name = NameGenerator.generateName("male");
                    jLabel3.setText(name);
                    cont.createNewAgent(name, "auction.project.Bidder", args).start();
                    args = new Object[2];
                    args[1] = "first-price";
                    args[0] = Integer.valueOf(bidder2Budget.getText());
                    name = NameGenerator.generateName("female");
                    jLabel4.setText(name);
                    cont.createNewAgent(name, "auction.project.Bidder", args).start();
                    bidder1Budget.setEnabled(false);
                    bidder2Budget.setEnabled(false);
                    commence.setText("cancel Auction...");
                } else if (type.getModel().getSelectedItem().equals("Second-price sealed-bid aka.Vickrey Auction")) {
                    DefaultListModel listtemp = (DefaultListModel) eventsList.getModel();
                    listtemp.removeAllElements();
                    Object[] args = new Object[2];
                    args[0] = 0;
                    args[1] = "second-price";
                    cont.createNewAgent("Auctioneer", "auction.project.Auctioneer", args).start();

                    args = new Object[2];
                    args[0] = Integer.valueOf(bidder1Budget.getText());
                    args[1] = "second-price";
                    String name = NameGenerator.generateName("male");
                    jLabel3.setText(name);
                    cont.createNewAgent(name, "auction.project.Bidder", args).start();
                    args = new Object[2];
                    args[1] = "second-price";
                    args[0] = Integer.valueOf(bidder2Budget.getText());
                    name = NameGenerator.generateName("female");
                    jLabel4.setText(name);
                    cont.createNewAgent(name, "auction.project.Bidder", args).start();
                    bidder1Budget.setEnabled(false);
                    bidder2Budget.setEnabled(false);
                    commence.setText("cancel Auction...");
                }

            } else {
                cont.getAgent("Auctioneer").kill();
                cont.getAgent(jLabel4.getText()).kill();
                cont.getAgent(jLabel3.getText());

                commence.setText("Commence Auction");
                bidder1Budget.setEnabled(true);
                bidder2Budget.setEnabled(true);
            }
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            commence.setText("running Auction...");
            commence.setEnabled(false);
            flag = true;//the auction started
        } catch (ControllerException | NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, "Please fill in the correct data.", "Wrong data!!", JOptionPane.ERROR_MESSAGE, new ImageIcon("Resources/ico100.png"));

        }

    }//GEN-LAST:event_commenceActionPerformed

    private void startPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startPriceActionPerformed

    private void budgetSliderAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_budgetSliderAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_budgetSliderAncestorMoved
    /**
     * budget Slider events
     * @param evt 
     */
    private void budgetSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_budgetSliderStateChanged
        int value = budgetSlider.getModel().getValue();
        Random rand = new Random();
        int n1 = value + rand.nextInt(5000);
        int n2 = value + rand.nextInt(5000);
        bidder1Budget.setText(String.valueOf(n1));
        bidder2Budget.setText(String.valueOf(n2));
    }//GEN-LAST:event_budgetSliderStateChanged
    /**
     * programm info.
     * 
     */
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(this, "<html>Copyright © 2017 :<br> <b>Kalliopi Malerou</b> , <a href='kmalerou@csd.auth.gr'>kmalerou@csd.auth.gr</a> ,RN2370 <br>"
                + "<b>Nikolaos Mamais</b> ,<a href='nikolmamai@csd.auth.gr'>nikolmamai@csd.auth.gr</a>, RN2371<br>"
                + "<b>Nikolaos Bafatakis</b> ,<a href='nikompaf@csd.auth.gr'>nikompaf@csd.auth.gr</a>,RN2383<br><br>This software is for academic use only.</html>");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void commenceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_commenceStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_commenceStateChanged

    private void commenceInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_commenceInputMethodTextChanged

    }//GEN-LAST:event_commenceInputMethodTextChanged

    private void bidder1BudgetPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_bidder1BudgetPropertyChange

    }//GEN-LAST:event_bidder1BudgetPropertyChange

    private void eventsListComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_eventsListComponentAdded

    }//GEN-LAST:event_eventsListComponentAdded

    private void eventsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_eventsListValueChanged

        if (!flag) {
            setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_eventsListValueChanged

    public static void setEvent(String text) {
        if (text.equals("0000")) {
            flag = false;//the auction closed
            //resetall Bidder_1 Budget:
            bidder1Budget.setEnabled(true);
            bidder2Budget.setEnabled(true);
            //jLabel3.setText("Bidder_1 Budget:");
            //jLabel4.setText("Bidder_2 Budget:");
            commence.setText("Commence Auction");
            commence.setEnabled(true);
            DefaultListModel listtemp = (DefaultListModel) eventsList.getModel();
            listtemp.addElement("***********");
            eventsList.setSelectedIndex(listtemp.size() - 2);
            eventsList.ensureIndexIsVisible(listtemp.size() - 1);
        }
        if (flag) {
            DefaultListModel listtemp = (DefaultListModel) eventsList.getModel();
            listtemp.addElement(text);

            eventsList.ensureIndexIsVisible(listtemp.size() - 1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Auctions_Simulator.progressBar.setValue(5);
        Auctions_Simulator.progressBar.setString("Initializing Main Windows");
        /* Create and display the form */
        try {

            Thread.sleep(2000);
            Auctions_Simulator.progressBar.setValue(15);
            System.err.println("asdasdasd");
            Auctions_Simulator.progressBar.setString("Initializing the Jade Platform");
            String[] services = {"-gui"};
            Boot.main(services);
            Thread.sleep(1000);
            Auctions_Simulator.progressBar.setValue(20);
            Auctions_Simulator.progressBar.setString("Running Instances");
            Runtime rt = Runtime.instance();
            Auctions_Simulator.progressBar.setValue(26);
            Profile p = new ProfileImpl();
            Thread.sleep(500);
            Auctions_Simulator.progressBar.setValue(32);
            Auctions_Simulator.progressBar.setString("Connecting to Jade Services");
            Thread.sleep(2000);
            p.setParameter(Profile.MAIN_HOST, "localhost");
            Auctions_Simulator.progressBar.setValue(40);
            p.setParameter(Profile.MAIN_PORT, "1099");
            p.setParameter(Profile.CONTAINER_NAME, "Auction_Private_Container");
            Auctions_Simulator.progressBar.setValue(55);

            //System.out.println("before");
            //rt.startUp(p);
            Auctions_Simulator.progressBar.setString("Creating the Container");
            Auctions_Simulator.temp.repaint();
            cont = rt.createAgentContainer(p);
            p.isMasterMain();
            Auctions_Simulator.progressBar.setValue(70);
            System.out.println("after");
            // Object[] args = new Object[2];
            //args[0] = 2000;
            // args[1] = 8;
            Thread.sleep(1000);
            //cont.createNewAgent("test", "auction.project.Bidder", args);
        } catch (Throwable ex) {
            Auctions_Simulator.exMessages(new Throwable("<html><b>Initialization Error</b><br></html>" + ex.getMessage()));
        }
        Auctions_Simulator.progressBar.setValue(100);

        Auctions_Simulator.progressBar.setString("Completed...");
        new AuctioneerFrame().setAlwaysOnTop(true);
        try {
            Thread.sleep(250);
            Auctions_Simulator.temp.dispose();
        } catch (InterruptedException ex) {
            Auctions_Simulator.exMessages(new Throwable("<html><b>Initialization Error</b><br></html>" + ex.getMessage()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox autoBudget;
    private static javax.swing.JTextField bidder1Budget;
    private javax.swing.JSpinner bidder1Spinner;
    private static javax.swing.JTextField bidder2Budget;
    private javax.swing.JSpinner bidder2Spinner;
    private javax.swing.JSlider budgetSlider;
    private static javax.swing.JButton commence;
    protected static javax.swing.JList<String> eventsList;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel messageOptions;
    private javax.swing.JPanel pricePanel;
    private javax.swing.JTextField startPrice;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
