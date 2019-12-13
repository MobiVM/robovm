package org.robovm.idea.components.setupwizard;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.ProcessOutput;
import com.intellij.execution.util.ExecUtil;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDialog;
import com.intellij.openapi.fileChooser.FileChooserFactory;
import com.intellij.openapi.projectRoots.JavaSdk;
import com.intellij.openapi.projectRoots.JdkUtil;
import com.intellij.openapi.projectRoots.ProjectJdkTable;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

public class JdkSetupDialog extends JDialog {
    private JPanel panel;
    private JTextField jdkHome;
    private JButton browseButton;
    private JLabel infoText;
    private JButton downloadJDKButton;
    private JButton nextButton;
    private JLabel errorLabel;

    public JdkSetupDialog() {
        setContentPane(panel);
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("RoboVM Setup");
        infoText.setText("<html>RoboVM requires Java Development Kit (JDK) 8.0 or higher.<br><br>Please specify the location of your JDK.");

        for (String jdkLocation : JavaSdk.getInstance().suggestHomePaths()) {
            jdkHome.setText(jdkLocation);
            break;
        }

        browseButton.addActionListener(e -> {
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
            if (jdkHome.getText() != null && !jdkHome.getText().isEmpty()) {
                jdkDir = new File(jdkHome.getText());
            }

            VirtualFile[] dir = fileChooser.choose(null, LocalFileSystem.getInstance().findFileByIoFile(jdkDir));
            if (dir.length > 0) {
                jdkHome.setText(dir[0].getCanonicalPath());
            }
            validateInput();
        });

        downloadJDKButton.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.oracle.com/technetwork/java/javase/downloads/index.html"));
            } catch (URISyntaxException | IOException e1) {
                // do nothing
            }
        });

        nextButton.addActionListener(e -> {
            final File jdkDir = new File(jdkHome.getText());
            ApplicationManager.getApplication().runWriteAction(() -> {
                JavaSdk javaSdk = JavaSdk.getInstance();
                Sdk sdk = javaSdk.createJdk(suggestJdkName(jdkDir), jdkDir.getAbsolutePath());
                javaSdk.setupSdkPaths(sdk);
                ProjectJdkTable.getInstance().addJdk(sdk);
            });
            dispose();
        });

        validateInput();
        pack();
        setLocationRelativeTo(null);
    }

    private void validateInput() {
        String jdkPath = jdkHome.getText();
        boolean valid = jdkPath != null && !jdkPath.isEmpty() && JdkUtil.checkForJdk(new File(jdkPath));
        errorLabel.setVisible(!valid);
        nextButton.setEnabled(valid);
    }

    private static String suggestJdkName(File jdkDir) {
        File javaExe = new File(new File(jdkDir, "bin"), "java");
        if (!javaExe.exists()) {
            new File(new File(jdkDir, "bin"), "java.exe");
        }
        ProcessOutput output;
        try {
            output = ExecUtil.execAndGetOutput(new GeneralCommandLine(Arrays.asList(javaExe.getAbsolutePath(), "-version")));
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
                stringBuilder.append(line, pos + 7, line.length() - 1);
            }
            line = lines.get(2);
            pos = line.indexOf(" (build");
            if (pos != -1) {
                String substring = line.substring(0, pos);
                stringBuilder.append(" (").append(substring).append(")");
            }
        } else {
            stringBuilder.append(jdkDir.getName());
        }
        return stringBuilder.toString();
    }
}
