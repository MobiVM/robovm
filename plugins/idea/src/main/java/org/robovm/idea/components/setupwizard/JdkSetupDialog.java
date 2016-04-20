package org.robovm.idea.components.setupwizard;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.process.ProcessOutput;
import com.intellij.execution.util.ExecUtil;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDialog;
import com.intellij.openapi.fileChooser.FileChooserFactory;
import com.intellij.openapi.projectRoots.*;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.ValidationInfo;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;
import java.util.List;

public class JdkSetupDialog extends JDialog {
    private JPanel panel;
    private JTextField jdkHome;
    private JButton browseButton;
    private JLabel infoText;
    private JButton downloadJDKButton;
    private JButton nextButton;
    private JLabel errorLabel;
    private JPanel header;

    public JdkSetupDialog() {
        setContentPane(panel);
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("RoboVM Setup");
        infoText.setText("<html>RoboVM requires Java Development Kit (JDK) 8.0 or higher.<br><br>Please specify the location of your JDK.");

        for(String jdkLocation: JavaSdk.getInstance().suggestHomePaths()) {
            jdkHome.setText(jdkLocation);
            break;
        }

        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileChooserDialog fileChooser = FileChooserFactory.getInstance()
                        .createFileChooser(new FileChooserDescriptor(true, false, false, false, false, false) {
                            @Override
                            public boolean isFileVisible(VirtualFile file, boolean showHiddenFiles) {
                                return file.isDirectory();
                            }
                            @Override
                            public boolean isFileSelectable(VirtualFile file) {
                                return file.isDirectory();
                            }
                        }, null, panel);
                File jdkDir = new File(System.getProperty("user.home"));
                if(jdkHome.getText() != null && !jdkHome.getText().isEmpty()) {
                    jdkDir = new File(jdkHome.getText());
                }

                VirtualFile[] dir = fileChooser.choose(null, LocalFileSystem.getInstance().findFileByIoFile(jdkDir));
                if(dir != null && dir.length > 0) {
                    jdkHome.setText(dir[0].getCanonicalPath());
                }
                validateInput();
            }
        });

        downloadJDKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://www.oracle.com/technetwork/java/javase/downloads/index.html"));
                } catch (URISyntaxException e1) {
                    // do nothing
                } catch (IOException e2) {
                    // do nothing
                }
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final File jdkDir = new File(jdkHome.getText());
                ApplicationManager.getApplication().runWriteAction(new Runnable() {
                    @Override
                    public void run() {
                        JavaSdk javaSdk = JavaSdk.getInstance();
                        Sdk sdk = javaSdk.createJdk(suggestJdkName(jdkDir), jdkDir.getAbsolutePath());
                        javaSdk.setupSdkPaths(sdk);
                        ProjectJdkTable.getInstance().addJdk(sdk);
                    }
                });
                dispose();
            }
        });

        validateInput();
        pack();
        setLocationRelativeTo(null);
    }

    private void validateInput() {
        boolean valid = jdkHome.getText() != null &&
                !jdkHome.getText().isEmpty() &&
                JavaSdk.checkForJdk(new File(jdkHome.getText()));
        errorLabel.setVisible(!valid);
        nextButton.setEnabled(valid);
    }

    private static String suggestJdkName(File jdkDir) {
        File file = jdkDir;
        File javaExe = new File(new File(file, "bin"), "java");
        if(!javaExe.exists()) {
            new File(new File(file, "bin"), "java.exe");
        }
        ProcessOutput output = null;
        try {
            output = ExecUtil.execAndGetOutput(Arrays.asList(javaExe.getAbsolutePath(), "-version"), null);
        } catch (ExecutionException e) {
            e.printStackTrace();
            return "JDK";
        }
        List<String> lines = output.getStderrLines();
        if (lines.isEmpty()) {
            lines = output.getStdoutLines();
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (lines.size() == 3) {
            stringBuilder.append("JDK ");
            String line = lines.get(1);
            int pos = line.indexOf("(build ");
            if (pos != -1) {
                stringBuilder.append(line.substring(pos + 7, line.length() - 1));
            }
            line = lines.get(2);
            pos = line.indexOf(" (build");
            if (pos != -1) {
                String substring = line.substring(0, pos);
                stringBuilder.append(" (").append(substring).append(")");
            }
        }
        else {
            stringBuilder.append(file.getName());
        }
        return stringBuilder.toString();
    }
}
