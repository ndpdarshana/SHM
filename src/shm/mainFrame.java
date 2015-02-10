
package shm;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class mainFrame extends javax.swing.JFrame {

    private pendulum.pendulum pnlPendulum;
    
    private circulerMotion.Circule pnlCircle;
    private circulerMotion.pnlCOutput pnlCOutput;
    
    private graphs.PEVsT pnlGPEVsT;
    private graphs.KEVsT pnlGKEVsT;
    private graphs.TEVsT pnlGTEVsT;
    private graphs.Combination pnlGCVsT;
        
    double input1;
    int input2;
    int input3;
    double input4;
    /** Creates new form mainFrame */
    public mainFrame() {
        initComponents();
        lblInput3.setVisible(false);
        lblInput4.setVisible(false);
        txtInput3.setVisible(false);
        txtInput4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameSelector = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblInput1 = new javax.swing.JLabel();
        txtInput1 = new javax.swing.JTextField();
        lblInput2 = new javax.swing.JLabel();
        txtInput2 = new javax.swing.JTextField();
        lblInput3 = new javax.swing.JLabel();
        txtInput3 = new javax.swing.JTextField();
        btnGo = new javax.swing.JButton();
        lblInput4 = new javax.swing.JLabel();
        txtInput4 = new javax.swing.JTextField();
        pnlModel = new javax.swing.JPanel();
        rdbPendulum = new javax.swing.JRadioButton();
        rdbCircle = new javax.swing.JRadioButton();
        pnlOutput = new javax.swing.JPanel();
        tbGraphs = new javax.swing.JTabbedPane();
        pnlPEVsT = new javax.swing.JPanel();
        pnlKEVsT = new javax.swing.JPanel();
        pnlTEVsT = new javax.swing.JPanel();
        pnlCVsT = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));

        lblInput1.setText("Gravitation");

        txtInput1.setName(""); // NOI18N

        lblInput2.setText("Length");

        lblInput3.setText("Mass");

        btnGo.setText("GO");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        lblInput4.setText("Mass");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInput1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInput2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInput3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInput4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnGo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGo)
                    .addComponent(lblInput2)
                    .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInput3)
                    .addComponent(txtInput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInput4)
                    .addComponent(txtInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblInput1.getAccessibleContext().setAccessibleName("gravitation");

        pnlModel.setMinimumSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout pnlModelLayout = new javax.swing.GroupLayout(pnlModel);
        pnlModel.setLayout(pnlModelLayout);
        pnlModelLayout.setHorizontalGroup(
            pnlModelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        pnlModelLayout.setVerticalGroup(
            pnlModelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        frameSelector.add(rdbPendulum);
        rdbPendulum.setSelected(true);
        rdbPendulum.setText("Pendulum");
        rdbPendulum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPendulumActionPerformed(evt);
            }
        });

        frameSelector.add(rdbCircle);
        rdbCircle.setText("Circle ");
        rdbCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCircleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPEVsTLayout = new javax.swing.GroupLayout(pnlPEVsT);
        pnlPEVsT.setLayout(pnlPEVsTLayout);
        pnlPEVsTLayout.setHorizontalGroup(
            pnlPEVsTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        pnlPEVsTLayout.setVerticalGroup(
            pnlPEVsTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        tbGraphs.addTab("P.E. Vs Time.", pnlPEVsT);

        javax.swing.GroupLayout pnlKEVsTLayout = new javax.swing.GroupLayout(pnlKEVsT);
        pnlKEVsT.setLayout(pnlKEVsTLayout);
        pnlKEVsTLayout.setHorizontalGroup(
            pnlKEVsTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        pnlKEVsTLayout.setVerticalGroup(
            pnlKEVsTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        tbGraphs.addTab("K.E. Vs Time", pnlKEVsT);

        javax.swing.GroupLayout pnlTEVsTLayout = new javax.swing.GroupLayout(pnlTEVsT);
        pnlTEVsT.setLayout(pnlTEVsTLayout);
        pnlTEVsTLayout.setHorizontalGroup(
            pnlTEVsTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        pnlTEVsTLayout.setVerticalGroup(
            pnlTEVsTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        tbGraphs.addTab("T.E. Vs Time", pnlTEVsT);

        javax.swing.GroupLayout pnlCVsTLayout = new javax.swing.GroupLayout(pnlCVsT);
        pnlCVsT.setLayout(pnlCVsTLayout);
        pnlCVsTLayout.setHorizontalGroup(
            pnlCVsTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        pnlCVsTLayout.setVerticalGroup(
            pnlCVsTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        tbGraphs.addTab("Combination", pnlCVsT);

        javax.swing.GroupLayout pnlOutputLayout = new javax.swing.GroupLayout(pnlOutput);
        pnlOutput.setLayout(pnlOutputLayout);
        pnlOutputLayout.setHorizontalGroup(
            pnlOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbGraphs, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
        );
        pnlOutputLayout.setVerticalGroup(
            pnlOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutputLayout.createSequentialGroup()
                .addComponent(tbGraphs, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(rdbPendulum)
                        .addGap(18, 18, 18)
                        .addComponent(rdbCircle)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbCircle)
                            .addComponent(rdbPendulum)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("ffff");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        
        if(rdbPendulum.isSelected() == true){
            try{
                input1 = Double.parseDouble(txtInput1.getText().toString());
                input2 = Integer.parseInt(txtInput2.getText().toString()) * 100;
                //Set mass 
                input3 = 5; //Integer.parseInt(txtInput3.getText().toString());
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Invalid inputs");
            }
            drawPendulum();
        } else if(rdbCircle.isSelected() == true){
           try{
                input1 = Double.parseDouble(txtInput1.getText().toString());
                input2 = Integer.parseInt(txtInput2.getText().toString());
                input3 = Integer.parseInt(txtInput3.getText().toString());
                input4 = Double.parseDouble(txtInput4.getText().toString());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Invalid inputs");
            }
            drawCircle();
        }
        
        //Calculation
        //double oscillationTime = 2*Math.PI*Math.sqrt(input2/input1); 

        // <editor-fold defaultstate="collapsed" desc="PE Vs Time graph">

        //add PEVsT graph to main frame
        if(pnlGPEVsT != null){
            pnlPEVsT.remove(pnlGPEVsT);
        }
        
        pnlGPEVsT = new graphs.PEVsT(input1,input2,input3);
        pnlGPEVsT.setSize(pnlPEVsT.getWidth(), pnlPEVsT.getHeight());
        pnlPEVsT.add(pnlGPEVsT);
        pnlGPEVsT.repaint();
        
        // <editor-fold defaultstate="collapsed" desc="KE Vs Time graph">
        //add PEVsT graph to main frame
        if(pnlGKEVsT != null){
            pnlKEVsT.remove(pnlGPEVsT);
        }
        
        pnlGKEVsT = new graphs.KEVsT(input1,input2,input3);
        pnlGKEVsT.setSize(pnlKEVsT.getWidth(), pnlKEVsT.getHeight());
        pnlKEVsT.add(pnlGKEVsT);
        pnlGKEVsT.repaint();
        
        // <editor-fold defaultstate="collapsed" desc="TE Vs Time graph">
        //add TEVsT graph to main frame
        if(pnlGTEVsT != null){
            pnlTEVsT.remove(pnlGTEVsT);
        }
        
        pnlGTEVsT = new graphs.TEVsT(input1,input2,input3);
        pnlGTEVsT.setSize(pnlTEVsT.getWidth(), pnlTEVsT.getHeight());
        pnlTEVsT.add(pnlGTEVsT);
        pnlGTEVsT.repaint();
        
          // <editor-fold defaultstate="collapsed" desc="Combination Vs Time graph">
        //add CombinatiomVsT graph to main frame
        if(pnlGCVsT != null){
            pnlCVsT.remove(pnlGCVsT);
        }
        
        pnlGCVsT = new graphs.Combination(input1,input2,input3);
        pnlGCVsT.setSize(pnlCVsT.getWidth(), pnlCVsT.getHeight());
        pnlCVsT.add(pnlGCVsT);
        pnlGCVsT.repaint();
    }//GEN-LAST:event_btnGoActionPerformed

    private void drawPendulum(){
        //add pandulum panal to main frame
        if(pnlPendulum!=null){
            //pnlModel.remove(pnlCircle);
            pnlModel.remove(pnlPendulum);
        }
        if(pnlCircle!=null){
            pnlModel.remove(pnlCircle);
        }
        
        pnlPendulum = new pendulum.pendulum(input2,input1,input3);
        pnlPendulum.pendulamThread(input2,input1,input3);
        pnlPendulum.setSize(pnlModel.getWidth(), pnlModel.getHeight());
        //pnlModel.remove(pnlCircle);
        pnlModel.add(pnlPendulum);
        //pnlPendulum.repaint();
        new Thread(pnlPendulum).start();
    }
    
    private void drawCircle(){
         //add pandulum panal to main frame
        if(pnlCircle!=null){
            //pnlModel.remove(pnlPendulum);
            pnlModel.remove(pnlCircle);
        }
        if(pnlPendulum!=null){
            pnlModel.remove(pnlPendulum);
        }
        
        pnlCircle = new circulerMotion.Circule();
        pnlCircle.circleThread();
        pnlCircle.setSize(pnlModel.getWidth(), pnlModel.getHeight());
        //pnlModel.remove(pnlPendulum);
        pnlModel.add(pnlCircle);
        //pnlPendulum.repaint();
        new Thread(pnlCircle).start();
        
        //add PEVsT graph to main frame
        if(pnlCOutput != null){
            pnlOutput.remove(pnlCOutput);
        }
        
        pnlCOutput = new circulerMotion.pnlCOutput(input1, input2, input3, input4);
        pnlCOutput.setSize(pnlOutput.getWidth(), pnlOutput.getHeight());
        pnlOutput.add(pnlCOutput);
        pnlCOutput.repaint();
    }
    
    private void rdbCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCircleActionPerformed
        //Setting up interface
        //drawCircle(); 
        if(pnlPendulum!=null){
            pnlModel.remove(pnlPendulum);
        }
        tbGraphs.setVisible(false);
        lblInput1.setText("Velocity");
        lblInput2.setText("Radius");
        lblInput3.setText("Mass");
        lblInput4.setText("Angle");
        lblInput3.setVisible(true);
        lblInput4.setVisible(true);
        txtInput3.setVisible(true);
        txtInput4.setVisible(true);
        txtInput1.setText(null);
        txtInput2.setText(null);
        txtInput3.setText(null);
        txtInput4.setText(null);
        
    }//GEN-LAST:event_rdbCircleActionPerformed

    private void rdbPendulumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPendulumActionPerformed
        //drawPendulum();
        if(pnlCircle!=null){
            pnlModel.remove(pnlCircle);
        }
        tbGraphs.setVisible(true);
        lblInput1.setText("Gravitation");
        lblInput2.setText("Length");
        lblInput3.setVisible(false);
        lblInput4.setVisible(false);
        txtInput3.setVisible(false);
        txtInput4.setVisible(false);
    }//GEN-LAST:event_rdbPendulumActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
        
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.ButtonGroup frameSelector;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInput1;
    private javax.swing.JLabel lblInput2;
    private javax.swing.JLabel lblInput3;
    private javax.swing.JLabel lblInput4;
    private javax.swing.JPanel pnlCVsT;
    private javax.swing.JPanel pnlKEVsT;
    private javax.swing.JPanel pnlModel;
    private javax.swing.JPanel pnlOutput;
    private javax.swing.JPanel pnlPEVsT;
    private javax.swing.JPanel pnlTEVsT;
    private javax.swing.JRadioButton rdbCircle;
    private javax.swing.JRadioButton rdbPendulum;
    private javax.swing.JTabbedPane tbGraphs;
    private javax.swing.JTextField txtInput1;
    private javax.swing.JTextField txtInput2;
    private javax.swing.JTextField txtInput3;
    private javax.swing.JTextField txtInput4;
    // End of variables declaration//GEN-END:variables
}
