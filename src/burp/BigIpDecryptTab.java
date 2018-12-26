/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burp;

import extend.util.SwingUtil;
import extend.view.base.MatchItem;
import java.awt.Component;
import java.awt.event.ComponentEvent;
import java.util.EnumSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author isayan
 */
public class BigIpDecryptTab extends javax.swing.JPanel implements ITab {

    /**
     * Creates new form BigIpDecryptTab
     */
    public BigIpDecryptTab() {
        initComponents();
        customizeComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbetOption = new javax.swing.JTabbedPane();
        pnlDecrypt = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDecrypt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEncrypt = new javax.swing.JTextArea();
        btnDecrypt = new javax.swing.JButton();
        pnlOptions = new javax.swing.JPanel();
        pnlScanHeader = new javax.swing.JPanel();
        chkResponse = new javax.swing.JCheckBox();
        chkRequest = new javax.swing.JCheckBox();
        pnlFreeScan = new javax.swing.JPanel();
        chk_Comment = new javax.swing.JCheckBox();
        cmbHighlightColor = new javax.swing.JComboBox();
        chkItem_highlight = new javax.swing.JCheckBox();
        pnlDetectionOption = new javax.swing.JPanel();
        chkPrivateIP = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        txtDecrypt.setEditable(false);
        txtDecrypt.setColumns(20);
        txtDecrypt.setRows(5);
        jScrollPane1.setViewportView(txtDecrypt);

        txtEncrypt.setColumns(20);
        txtEncrypt.setRows(5);
        jScrollPane2.setViewportView(txtEncrypt);

        btnDecrypt.setText("Decrypt");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDecryptLayout = new javax.swing.GroupLayout(pnlDecrypt);
        pnlDecrypt.setLayout(pnlDecryptLayout);
        pnlDecryptLayout.setHorizontalGroup(
            pnlDecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDecryptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDecryptLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDecrypt)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        pnlDecryptLayout.setVerticalGroup(
            pnlDecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDecryptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDecrypt))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        tabbetOption.addTab("Decrypt", pnlDecrypt);

        pnlScanHeader.setBorder(javax.swing.BorderFactory.createTitledBorder("Scan Header"));

        chkResponse.setSelected(true);
        chkResponse.setText("Response Set-Cookie");
        chkResponse.setEnabled(false);
        chkResponse.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkResponseStateChanged(evt);
            }
        });

        chkRequest.setText("Request Cookie");
        chkRequest.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkRequestStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlScanHeaderLayout = new javax.swing.GroupLayout(pnlScanHeader);
        pnlScanHeader.setLayout(pnlScanHeaderLayout);
        pnlScanHeaderLayout.setHorizontalGroup(
            pnlScanHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScanHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlScanHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkResponse)
                    .addComponent(chkRequest))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlScanHeaderLayout.setVerticalGroup(
            pnlScanHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlScanHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkResponse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkRequest)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnlFreeScan.setBorder(javax.swing.BorderFactory.createTitledBorder("Free version scan option"));

        chk_Comment.setText("comment");
        chk_Comment.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chk_CommentStateChanged(evt);
            }
        });

        cmbHighlightColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "red", "orange", "yellow", "green", "cyan", "blue", "pink", "magenta", "gray" }));
        cmbHighlightColor.setEnabled(false);
        cmbHighlightColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHighlightColorActionPerformed(evt);
            }
        });

        chkItem_highlight.setText("item highlight");
        chkItem_highlight.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkItem_highlightStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlFreeScanLayout = new javax.swing.GroupLayout(pnlFreeScan);
        pnlFreeScan.setLayout(pnlFreeScanLayout);
        pnlFreeScanLayout.setHorizontalGroup(
            pnlFreeScanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFreeScanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFreeScanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkItem_highlight)
                    .addComponent(cmbHighlightColor, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_Comment))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFreeScanLayout.setVerticalGroup(
            pnlFreeScanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFreeScanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkItem_highlight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbHighlightColor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_Comment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDetectionOption.setBorder(javax.swing.BorderFactory.createTitledBorder("Detection Option"));

        chkPrivateIP.setSelected(true);
        chkPrivateIP.setText("Private IP Only");
        chkPrivateIP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkPrivateIPStateChanged(evt);
            }
        });

        jLabel1.setText("<html><ul><li>PrivateIP: Severity: Low</li><li>OtherIP: Severity: Info</li></ul> ");

        javax.swing.GroupLayout pnlDetectionOptionLayout = new javax.swing.GroupLayout(pnlDetectionOption);
        pnlDetectionOption.setLayout(pnlDetectionOptionLayout);
        pnlDetectionOptionLayout.setHorizontalGroup(
            pnlDetectionOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetectionOptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetectionOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPrivateIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDetectionOptionLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDetectionOptionLayout.setVerticalGroup(
            pnlDetectionOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetectionOptionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkPrivateIP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlOptionsLayout = new javax.swing.GroupLayout(pnlOptions);
        pnlOptions.setLayout(pnlOptionsLayout);
        pnlOptionsLayout.setHorizontalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlDetectionOption, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlScanHeader, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFreeScan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlOptionsLayout.setVerticalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlFreeScan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlOptionsLayout.createSequentialGroup()
                        .addComponent(pnlScanHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlDetectionOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        tabbetOption.addTab("Options", pnlOptions);

        add(tabbetOption, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void customizeComponents() {

        this.cmbHighlightColor.setModel(
                new DefaultComboBoxModel(
                        new MatchItem.HighlightColor[]{MatchItem.HighlightColor.RED, MatchItem.HighlightColor.ORANGE,
                            MatchItem.HighlightColor.YELLOW, MatchItem.HighlightColor.GREEN, MatchItem.HighlightColor.CYAN,
                            MatchItem.HighlightColor.BLUE, MatchItem.HighlightColor.PINK, MatchItem.HighlightColor.MAGENTA,
                            MatchItem.HighlightColor.GRAY}));

        this.cmbHighlightColor.setEnabled(false);
        this.cmbHighlightColor.setRenderer(new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel l = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                MatchItem.HighlightColor hc = (MatchItem.HighlightColor) value;
                if (hc != null) {
                    l.setIcon(hc.toIcon());
                    l.setIconTextGap(2);
                }
                return l;
            }
        });        
        // FreeVersion only
        this.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                SwingUtil.setContainerEnable(pnlFreeScan, !BurpExtender.getInstance().isProfessional());
            }
        });

    }

    private void chkRequestStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkRequestStateChanged
        this.firePropertyChange(OptionProperty.SCAN_PROPERTY, null, this.getScanProperty());
    }//GEN-LAST:event_chkRequestStateChanged

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        String value = BigIpDecrypt.decrypt(this.txtEncrypt.getText());
        this.txtDecrypt.setText(value);
    }//GEN-LAST:event_btnDecryptActionPerformed

    private void chk_CommentStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chk_CommentStateChanged
        this.firePropertyChange(OptionProperty.SCAN_PROPERTY, null, this.getScanProperty());
    }//GEN-LAST:event_chk_CommentStateChanged

    private void cmbHighlightColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHighlightColorActionPerformed
        this.firePropertyChange(OptionProperty.SCAN_PROPERTY, null, this.getScanProperty());
    }//GEN-LAST:event_cmbHighlightColorActionPerformed

    private void chkItem_highlightStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkItem_highlightStateChanged
        this.cmbHighlightColor.setEnabled(this.chkItem_highlight.isSelected());
        this.firePropertyChange(OptionProperty.SCAN_PROPERTY, null, this.getScanProperty());
    }//GEN-LAST:event_chkItem_highlightStateChanged

    private void chkPrivateIPStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkPrivateIPStateChanged
        this.firePropertyChange(OptionProperty.SCAN_PROPERTY, null, this.getScanProperty());
    }//GEN-LAST:event_chkPrivateIPStateChanged

    private void chkResponseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkResponseStateChanged
        this.firePropertyChange(OptionProperty.SCAN_PROPERTY, null, this.getScanProperty());
    }//GEN-LAST:event_chkResponseStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JCheckBox chkItem_highlight;
    private javax.swing.JCheckBox chkPrivateIP;
    private javax.swing.JCheckBox chkRequest;
    private javax.swing.JCheckBox chkResponse;
    private javax.swing.JCheckBox chk_Comment;
    private javax.swing.JComboBox cmbHighlightColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlDecrypt;
    private javax.swing.JPanel pnlDetectionOption;
    private javax.swing.JPanel pnlFreeScan;
    private javax.swing.JPanel pnlOptions;
    private javax.swing.JPanel pnlScanHeader;
    private javax.swing.JTabbedPane tabbetOption;
    private javax.swing.JTextArea txtDecrypt;
    private javax.swing.JTextArea txtEncrypt;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getTabCaption() {
        return "BigIP";
    }

    @Override
    public Component getUiComponent() {
        return this;
    }

    public void setScanProperty(ScanProperty scan) {
        this.chkRequest.setSelected(scan.getScanRequest());
        this.chkResponse.setSelected(scan.getScanResponse());

        EnumSet<MatchItem.NotifyType> notifyTypes = scan.getNotifyTypes();
        this.chkItem_highlight.setSelected(notifyTypes.contains(MatchItem.NotifyType.ITEM_HIGHLIGHT));
        this.chk_Comment.setSelected(notifyTypes.contains(MatchItem.NotifyType.COMMENT));
        this.cmbHighlightColor.setSelectedItem(scan.getHighlightColor());

        this.chkPrivateIP.setSelected(scan.isDetectionPrivateIP());

    }

    public ScanProperty getScanProperty() {
        ScanProperty scan = new ScanProperty();
        scan.setScanRequest(this.chkRequest.isSelected());
        scan.setScanResponse(this.chkResponse.isSelected());

        EnumSet<MatchItem.NotifyType> notifyTypes = EnumSet.noneOf(MatchItem.NotifyType.class);
        if (this.chkItem_highlight.isSelected()) {
            notifyTypes.add(MatchItem.NotifyType.ITEM_HIGHLIGHT);
        }
        if (this.chk_Comment.isSelected()) {
            notifyTypes.add(MatchItem.NotifyType.COMMENT);
        }
        scan.setNotifyTypes(notifyTypes);
        if (scan.getNotifyTypes().contains(MatchItem.NotifyType.ITEM_HIGHLIGHT)) {
            scan.setHighlightColor((MatchItem.HighlightColor) this.cmbHighlightColor.getSelectedItem());
        }
        scan.setDetectionPrivateIP(this.chkPrivateIP.isSelected());

        return scan;
    }

}
