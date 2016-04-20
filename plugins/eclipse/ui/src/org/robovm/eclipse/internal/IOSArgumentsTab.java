/*
 * Copyright (C) 2014 RoboVM AB
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
package org.robovm.eclipse.internal;
 
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.StringVariableSelectionDialog;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchTab;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.robovm.eclipse.RoboVMPlugin;

/**
 * Launch tab which displays program arguments. This is a simplification of
 * Eclipe's {@code JavaArgumentsTab} used when launching ordinary Java
 * applications.
 */
public class IOSArgumentsTab extends JavaLaunchTab {
    private Text argumentsText;

    public void createControl(Composite parent) {
        Composite comp = new Composite(parent, SWT.NONE);
        comp.setLayout(new GridLayout(1, true));
        comp.setFont(parent.getFont());
        
        comp.setLayoutData(new GridData(GridData.FILL_BOTH));
        setControl(comp);
        
        Group group = new Group(comp, SWT.NONE);
        group.setFont(parent.getFont());
        group.setLayout(new GridLayout());
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
        
        group.setText("Program arguments:");
        argumentsText = new Text(group, SWT.MULTI | SWT.WRAP | SWT.BORDER | SWT.V_SCROLL);
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.heightHint = 40;
        gd.widthHint = 100;
        argumentsText.setLayoutData(gd);
        argumentsText.setFont(parent.getFont());
        argumentsText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent evt) {
                scheduleUpdateJob();
            }
        });
        
        Button varsButton = createPushButton(group, "Variables...", null); 
        varsButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
        varsButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                StringVariableSelectionDialog dialog = new StringVariableSelectionDialog(getShell());
                dialog.open();
                String variable = dialog.getVariableExpression();
                if (variable != null) {
                    argumentsText.insert(variable);
                }
            }
        });
    }
                        
    public void setDefaults(ILaunchConfigurationWorkingCopy config) {
        config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, (String) null);
    }

    @Override
    public void initializeFrom(ILaunchConfiguration configuration) {
        try {
            argumentsText.setText(configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, ""));
        } catch (CoreException e) {
            RoboVMPlugin.log(e);
        }
    }

    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        String value = argumentsText.getText().trim();
        if (value.length() == 0) {
            value = null;
        }
        configuration.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, value);
    }

    public String getName() {
        return "Arguments"; 
    }       
    
    @Override
    public String getId() {
        return getClass().getName();
    }

    @Override
    public void deactivated(ILaunchConfigurationWorkingCopy workingCopy) {
        // do nothing when deactivated
    }
}
