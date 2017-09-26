package megabasterd;

import java.awt.Dialog;
import javax.swing.JOptionPane;
import static megabasterd.MainPanel.THREAD_POOL;
import static megabasterd.MainPanel.VERSION;
import static megabasterd.MiscTools.swingReflectionInvoke;

/**
 *
 * @author tonikelope
 */
public final class AboutDialog extends javax.swing.JDialog {

    private static final String MEGA_URL = "https://mega.nz/#F!lYsRWaQB!uVhntmyKcVECRaOxAbcL4A";
    private static final String TONIKELOPE_URL = "http://toni.world";
    private static final String MEGACRYPTER_URL = "https://megacrypter.com";
    private static final String SPAIN_URL = "https://en.wikipedia.org/wiki/Spain";
    private static final String MEGABASTERD_GITHUB_URL = "https://github.com/tonikelope/megabasterd";

    public AboutDialog(MainPanelView parent, boolean modal) {

        super(parent, modal);

        initComponents();

        swingReflectionInvoke("setText", title_label, "MegaBasterd " + VERSION);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title_label = new javax.swing.JLabel();
        made_in_spain_label = new javax.swing.JLabel();
        subtitle_label = new javax.swing.JLabel();
        mc_logo_label = new javax.swing.JLabel();
        mcdown_url_button = new javax.swing.JButton();
        author_webpage_label = new javax.swing.JLabel();
        pica_roja_label = new javax.swing.JLabel();
        check_version_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");
        setIconImage(null);
        setResizable(false);

        title_label.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        title_label.setText("MegaBasterd X.X");
        title_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        title_label.setDoubleBuffered(true);
        title_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                title_labelMouseReleased(evt);
            }
        });

        made_in_spain_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megabasterd/made_in_spain.jpg"))); // NOI18N
        made_in_spain_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        made_in_spain_label.setDoubleBuffered(true);
        made_in_spain_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                made_in_spain_labelMouseReleased(evt);
            }
        });

        subtitle_label.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        subtitle_label.setForeground(new java.awt.Color(102, 102, 102));
        subtitle_label.setText("(Made with love by tonikelope)");
        subtitle_label.setDoubleBuffered(true);

        mc_logo_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megabasterd/mega_crypter.png"))); // NOI18N
        mc_logo_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mc_logo_label.setDoubleBuffered(true);
        mc_logo_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mc_logo_labelMouseReleased(evt);
            }
        });

        mcdown_url_button.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        mcdown_url_button.setText("Copy MegaBasterd download URL");
        mcdown_url_button.setDoubleBuffered(true);
        mcdown_url_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcdown_url_buttonActionPerformed(evt);
            }
        });

        author_webpage_label.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        author_webpage_label.setForeground(new java.awt.Color(102, 102, 102));
        author_webpage_label.setText("http://toni.world");
        author_webpage_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        author_webpage_label.setDoubleBuffered(true);
        author_webpage_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                author_webpage_labelMouseReleased(evt);
            }
        });

        pica_roja_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megabasterd/pica_roja_big.png"))); // NOI18N
        pica_roja_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pica_roja_label.setDoubleBuffered(true);
        pica_roja_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pica_roja_labelMouseReleased(evt);
            }
        });

        check_version_button.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        check_version_button.setText("Check version");
        check_version_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_version_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(subtitle_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mcdown_url_button, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(check_version_button, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(made_in_spain_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(author_webpage_label)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(pica_roja_label)
                                .addGap(18, 18, 18)
                                .addComponent(mc_logo_label))))
                    .addComponent(title_label, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitle_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mcdown_url_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_version_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(made_in_spain_label)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pica_roja_label, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mc_logo_label, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(author_webpage_label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mcdown_url_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcdown_url_buttonActionPerformed

        MiscTools.copyTextToClipboard(MEGA_URL);

        JOptionPane.showMessageDialog(this, "MEGA URL was copied to clipboard!");
    }//GEN-LAST:event_mcdown_url_buttonActionPerformed

    private void check_version_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_version_buttonActionPerformed

        check_version_button.setEnabled(false);

        check_version_button.setText("Checking, please wait...");

        final Dialog tthis = this;

        THREAD_POOL.execute(new Runnable() {
            @Override
            public void run() {

                String new_version = MiscTools.checkNewVersion("lYsRWaQB", "uVhntmyKcVECRaOxAbcL4A");

                if (new_version != null) {

                    JOptionPane.showMessageDialog(tthis, "MegaBasterd NEW VERSION (" + new_version + ") is available!\n\n(HELP > ABOUT for more info)");

                } else {

                    JOptionPane.showMessageDialog(tthis, "You have the latest version ;)");
                }

                swingReflectionInvoke("setText", check_version_button, "Check version");

                swingReflectionInvoke("setEnabled", check_version_button, true);

            }
        });

    }//GEN-LAST:event_check_version_buttonActionPerformed

    private void pica_roja_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pica_roja_labelMouseReleased

        MiscTools.openBrowserURL(TONIKELOPE_URL);
    }//GEN-LAST:event_pica_roja_labelMouseReleased

    private void author_webpage_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_author_webpage_labelMouseReleased

        MiscTools.openBrowserURL(TONIKELOPE_URL);
    }//GEN-LAST:event_author_webpage_labelMouseReleased

    private void mc_logo_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mc_logo_labelMouseReleased

        MiscTools.openBrowserURL(MEGACRYPTER_URL);
    }//GEN-LAST:event_mc_logo_labelMouseReleased

    private void made_in_spain_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_made_in_spain_labelMouseReleased

        MiscTools.openBrowserURL(SPAIN_URL);
    }//GEN-LAST:event_made_in_spain_labelMouseReleased

    private void title_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_title_labelMouseReleased
        MiscTools.openBrowserURL(MEGABASTERD_GITHUB_URL);
    }//GEN-LAST:event_title_labelMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author_webpage_label;
    private javax.swing.JButton check_version_button;
    private javax.swing.JLabel made_in_spain_label;
    private javax.swing.JLabel mc_logo_label;
    private javax.swing.JButton mcdown_url_button;
    private javax.swing.JLabel pica_roja_label;
    private javax.swing.JLabel subtitle_label;
    private javax.swing.JLabel title_label;
    // End of variables declaration//GEN-END:variables
}
