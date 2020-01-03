package org.robovm.idea.components.setupwizard;

import javax.swing.*;

public class NoXcodeSetupDialog extends JDialog {
    private JPanel panel;
    private JLabel infoText;
    private JButton nextButton;

    public NoXcodeSetupDialog() {
        setContentPane(panel);
        setModalityType(ModalityType.APPLICATION_MODAL);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("RoboVM Setup");
        infoText.setText("<html>To compile for iOS simuators or devices, you will need a Mac running <strong>Mac OS X 10.x</strong> and <strong>Xcode 6 or higher</strong>. " +
                "<br><br>You can still view and edit the code on Windows or Linux, but you will not be able to compile it via RoboVM.");

        nextButton.addActionListener(e -> dispose());

        pack();
        setLocationRelativeTo(null);
    }

    private void createUIComponents() {
    }
}
