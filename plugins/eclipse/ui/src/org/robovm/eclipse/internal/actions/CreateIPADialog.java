/*
 * Copyright (C) 2013 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.eclipse.internal.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.target.ios.ProvisioningProfile;
import org.robovm.compiler.target.ios.SigningIdentity;
import org.robovm.eclipse.RoboVMPlugin;

/**
 * 
 */
public class CreateIPADialog extends TitleAreaDialog {

    private static final Arch[][] POSSIBLE_ARCH_VALUES;
    private static final String[] POSSIBLE_ARCH_NAMES;

    static {
        POSSIBLE_ARCH_VALUES = new Arch[RoboVMPlugin.IOS_DEVICE_ARCH_VALUES.length + 1][];
        POSSIBLE_ARCH_NAMES = new String[RoboVMPlugin.IOS_DEVICE_ARCH_NAMES.length + 1];
        POSSIBLE_ARCH_VALUES[0] = RoboVMPlugin.IOS_DEVICE_ARCH_VALUES;
        POSSIBLE_ARCH_NAMES[0] = "All - " + join(RoboVMPlugin.IOS_DEVICE_ARCH_NAMES);
        for (int i = 0; i < RoboVMPlugin.IOS_DEVICE_ARCH_VALUES.length; i++) {
            POSSIBLE_ARCH_VALUES[i + 1] = new Arch[] {RoboVMPlugin.IOS_DEVICE_ARCH_VALUES[i]}; 
            POSSIBLE_ARCH_NAMES[i + 1] = RoboVMPlugin.IOS_DEVICE_ARCH_NAMES[i]; 
        }
    }
    
    private static String join(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (i > 0) {
                sb.append(" + ");
            }
            sb.append(strings[i]);
        }
        return sb.toString();
    }
    
    private Composite container;
    private Text txtDestDir;
    private Combo coSigningId;
    private Combo coProvProfile;
    private Combo coArchs;

    private String destinationDir;
    private String signingIdentity;
    private String provisioningProfile;
    private List<Arch> archs;

    private List<ProvisioningProfile> provisioningProfiles;
    
    public CreateIPADialog(Shell parentShell) {
        super(parentShell);
        archs = new ArrayList<Arch>(Arrays.asList(RoboVMPlugin.IOS_DEVICE_ARCH_VALUES));
    }

    @Override
    public void create() {
        setHelpAvailable(false);
        super.create();
        setTitle("Package for App Store/Ad-Hoc distribution");
        setMessage("Package your iOS app in an IPA archive for App Store or Ad-Hoc distribution.");
        fieldsChanged();
    }

    private void fieldsChanged() {
        String s1 = txtDestDir.getText().trim();
        String s2 = coSigningId.getText().trim();
        getButton(IDialogConstants.OK_ID).setEnabled(s1.length() > 0 
                && new File(s1).isDirectory() && s2.length() > 0);
    }
    
    private void selectDestDir() {
        DirectoryDialog d = new DirectoryDialog(getShell());
        if (txtDestDir.getText().trim().length() > 0) {
            d.setFilterPath(txtDestDir.getText().trim());
        }
        String path = d.open();
        if (path != null) {
            txtDestDir.setText(path);
        }
    }
    
    @Override
    protected void okPressed() {
        this.destinationDir = txtDestDir.getText().trim();
        this.signingIdentity = coSigningId.getText().trim();
        if (coProvProfile.getSelectionIndex() > 0) {
            this.provisioningProfile = provisioningProfiles.get(coProvProfile.getSelectionIndex() - 1).getUuid();
        } else {
            this.provisioningProfile = null;
        }
        archs.clear();
        archs.addAll(Arrays.asList(POSSIBLE_ARCH_VALUES[coArchs.getSelectionIndex()]));
        super.okPressed();
    }
    
    @Override
    public int open() {
        return super.open();
    }
    
    @Override
    protected Control createDialogArea(Composite parent) {
        provisioningProfiles = ProvisioningProfile.list();
        
        Composite area = (Composite) super.createDialogArea(parent);
        container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(GridData.FILL_BOTH));
        GridLayout glContainer = new GridLayout(3, false);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        container.setLayout(glContainer);

        ModifyListener fieldsChangedListener = new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                fieldsChanged();
            }
        };
        
        Label lbDestDir = new Label(container, SWT.NONE);
        lbDestDir.setText("Destination dir");

        GridData gdDestDir = new GridData();
        gdDestDir.grabExcessHorizontalSpace = true;
        gdDestDir.horizontalAlignment = GridData.FILL;

        txtDestDir = new Text(container, SWT.BORDER);
        txtDestDir.setLayoutData(gdDestDir);

        Button btnBrowse = new Button(container, SWT.NONE);
        btnBrowse.setText("Browse...");
        btnBrowse.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                selectDestDir();
            }
        });

        Label lbSigningId = new Label(container, SWT.NONE);
        lbSigningId.setText("Signing identity");

        coSigningId = new Combo(container, SWT.NONE);
        coSigningId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
        coSigningId.setItems(readSigningIdentities());

        Label lbProvProfile = new Label(container, SWT.NONE);
        lbProvProfile.setText("Provisioning profile");

        coProvProfile = new Combo(container, SWT.READ_ONLY);
        coProvProfile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
        coProvProfile.setItems(readProvisioningProfiles());

        Label lbArchs = new Label(container, SWT.NONE);
        lbArchs.setText("Architectures");

        coArchs = new Combo(container, SWT.READ_ONLY);
        coArchs.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
        coArchs.setItems(POSSIBLE_ARCH_NAMES);

        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);

        final StyledText stAppLoader = new StyledText(container, SWT.WRAP);
        stAppLoader.setLineSpacing(3);
        stAppLoader.setEnabled(false);
        stAppLoader.setDoubleClickEnabled(false);
        stAppLoader.setEditable(false);
        final GridData gdAppLoader = new GridData(SWT.LEFT, SWT.TOP, true, true, 3, 1);
        gdAppLoader.horizontalIndent = 5;
        gdAppLoader.widthHint = 500;
        stAppLoader.setLayoutData(gdAppLoader);
        stAppLoader.setText("After the package has been created successfully you " 
                + "should use the Application Loader application that comes " 
                + "with Xcode to submit the IPA file to App Store.");
        stAppLoader.setBackground(container.getBackground());
        StyleRange styleRange = new StyleRange();
        styleRange.start = stAppLoader.getText().indexOf("Application Loader");
        styleRange.length = "Application Loader".length();
        styleRange.fontStyle = SWT.BOLD | SWT.ITALIC;
        stAppLoader.setStyleRange(styleRange);
        stAppLoader.addListener(SWT.Resize, new Listener () {
            public void handleEvent(Event event) {
                Rectangle bounds = container.getBounds();
                gdAppLoader.widthHint = bounds.width;
                getShell().layout(new Control[] {stAppLoader});
            }
        });
        
        if (destinationDir != null) {
            txtDestDir.setText(destinationDir);
        }
        if (signingIdentity != null) {
            coSigningId.setText(signingIdentity);
        }
        coProvProfile.select(0);
        if (provisioningProfile != null) {
            try {
                ProvisioningProfile p = ProvisioningProfile.find(provisioningProfiles, provisioningProfile);
                coProvProfile.select(provisioningProfiles.indexOf(p) + 1);
            } catch (IllegalArgumentException e) {
                // Not found
            }
        }
        coArchs.select(0);
        for (int i = 0; i < POSSIBLE_ARCH_VALUES.length; i++) {
            if (new HashSet<>(archs).equals(new HashSet<>(Arrays.asList(POSSIBLE_ARCH_VALUES[i])))) {
                coArchs.select(i);
                break;
            }
        }
        
        txtDestDir.addModifyListener(fieldsChangedListener);
        coSigningId.addModifyListener(fieldsChangedListener);
        
        return area;
    }

    @Override
    protected boolean isResizable() {
        return true;
    }
    
    public String getDestinationDir() {
        return destinationDir;
    }
    
    public String getSigningIdentity() {
        return signingIdentity;
    }

    public String getProvisioningProfile() {
        return provisioningProfile;
    }
    
    public List<Arch> getArchs() {
        return archs;
    }
    
    private String[] readSigningIdentities() {
        List<SigningIdentity> list = SigningIdentity.list();
        String[] result = new String[list.size()];
        int i = 0;
        for (SigningIdentity sid : list) {
            result[i++] = sid.getName();
        }
        return result;
    }
    
    private String[] readProvisioningProfiles() {
        String[] result = new String[provisioningProfiles.size() + 1];
        int i = 0;
        result[i++] = "Auto";
        for (ProvisioningProfile p : provisioningProfiles) {
            String appId = p.getEntitlements().objectForKey("application-identifier").toString();
            result[i++] = p.getName() + " (" + appId + ")";
        }
        return result;
    }

}
