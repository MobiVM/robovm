package org.robovm.idea.components.setupwizard;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.process.ProcessOutput;
import com.intellij.execution.util.ExecUtil;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDialog;
import com.intellij.openapi.fileChooser.FileChooserFactory;
import com.intellij.openapi.projectRoots.JavaSdk;
import com.intellij.openapi.projectRoots.ProjectJdkTable;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.components.labels.LinkLabel;
import com.intellij.ui.components.labels.LinkListener;
import org.robovm.compiler.util.ToolchainUtil;

public class XcodeSetupDialog extends JDialog {
    private JPanel panel;
    private JLabel infoText;
    private JButton nextButton;
    private JLabel errorLabel;
    private JPanel header;
    private JButton installXcodeButton;
    private JLabel linkLabel;

    public XcodeSetupDialog() {
        setContentPane(panel);
        setModalityType(ModalityType.APPLICATION_MODAL);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("RoboVM Setup");
        infoText.setText("<html>RoboVM requires Xcode 6 or higher.<br><br>" +
                "Once installed <ol><li>Open Xcode</li><li>Agree to the TOS.</li><li>Agree to install the command line " +
                "tools</li></ol><br>" +
                "<strong>Note</strong>: to deploy to a device, you will need to signup for an <strong>Apple Developer Account</strong> " +
                "and create a signing identity and provisioning profile.");
        linkLabel.setText("Visit the Apple iOS Developer Center");
        installXcodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("macappstore://itunes.apple.com/at/app/xcode/id497799835?mt=12#"));
                } catch (Throwable t) {
                    // nothing to do here
                }
            }
        });

        new Thread(new Runnable() {
            boolean done = false;
            @Override
            public void run() {
                while(!done) {
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            validateInput();
                            done = !errorLabel.isVisible();
                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        validateInput();
        pack();
        setLocationRelativeTo(null);
    }

    private void validateInput() {
        boolean valid = false;
        try {
            ToolchainUtil.findXcodePath();
            valid = true;
        } catch (Throwable e) {
            valid = false;
        }
        errorLabel.setVisible(!valid);
        nextButton.setEnabled(valid);
        installXcodeButton.setEnabled(!valid);
    }

    private void createUIComponents() {
        linkLabel = new LinkLabel("Visit the Apple iOS Developer Center", null, new LinkListener() {
            @Override
            public void linkSelected(LinkLabel aSource, Object aLinkData) {
                try {
                    Desktop.getDesktop().browse(new URI("https://developer.apple.com/devcenter/ios/index.action"));
                } catch (URISyntaxException | IOException ex) {
                    //It looks like there's a problem
                }
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
