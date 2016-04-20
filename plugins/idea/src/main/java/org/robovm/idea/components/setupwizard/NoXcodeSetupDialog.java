package org.robovm.idea.components.setupwizard;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.*;

import org.robovm.compiler.util.ToolchainUtil;

import com.intellij.ui.components.labels.LinkLabel;
import com.intellij.ui.components.labels.LinkListener;

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

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    private void createUIComponents() {
    }
}
