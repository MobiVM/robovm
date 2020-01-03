package org.robovm.idea.components.setupwizard;

import com.intellij.ui.components.labels.LinkLabel;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class XcodeSetupDialog extends JDialog {
    private JPanel panel;
    private JLabel infoText;
    private JButton skipButton;
    private JButton installXcodeButton;
    private JLabel linkLabel;

    public XcodeSetupDialog() {
        setContentPane(panel);
        setModalityType(ModalityType.APPLICATION_MODAL);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("RoboVM Setup");
        infoText.setText("<html>RoboVM requires Xcode 9 or higher.<br><br>" +
                "Once installed <ol><li>Open Xcode</li><li>Agree to the TOS.</li><li>Agree to install the command line " +
                "tools</li></ol><br>" +
                "<strong>Note</strong>: to deploy to a device, you will need to signup for an <strong>Apple Developer Account</strong> " +
                "and create a signing identity and provisioning profile.");
        linkLabel.setText("Visit the Apple iOS Developer Center");
        installXcodeButton.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("macappstore://itunes.apple.com/at/app/xcode/id497799835?mt=12#"));
            } catch (Throwable ignored) {
            }
        });

        skipButton.addActionListener(e -> dispose());

        pack();
        setLocationRelativeTo(null);
    }

    private void createUIComponents() {
        linkLabel = new LinkLabel<>("Visit the Apple iOS Developer Center", null, (aSource, aLinkData) -> {
            try {
                Desktop.getDesktop().browse(new URI("https://developer.apple.com/devcenter/ios/index.action"));
            } catch (URISyntaxException | IOException ex) {
                //It looks like there's a problem
            }
        });
    }

    public static void main(String[] args) {
        XcodeSetupDialog dialog = new XcodeSetupDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
