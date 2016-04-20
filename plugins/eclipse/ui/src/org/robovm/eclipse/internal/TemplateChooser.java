/*
 * Copyright (C) 2015 RoboVM AB
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.robovm.compiler.target.ConsoleTarget;
import org.robovm.compiler.target.ios.IOSTarget;

/**
 * Creates a {@link Composite} for the new project wizards which displays a
 * {@link Combo} with template choices.
 */
public class TemplateChooser {

    public static class Template {
        private final String id;
        private final String name;
        private final String targetType;
        private final String description;

        private Template(String id, String targetType, String name, String description) {
            this.id = id;
            this.targetType = targetType;
            this.name = name;
            this.description = description;
        }
    }

    private static final Template[] TEMPLATES = {
        new Template("single-view", IOSTarget.TYPE, "RoboVM iOS Single View App",
                "Creates a basic single view app using storyboards"),
        new Template("default", IOSTarget.TYPE, "RoboVM iOS App without storyboards",
                "Creates a basic single view app without storyboards"),
        new Template("console", ConsoleTarget.TYPE, "RoboVM Console App", "Creates a console app for Mac OS X or Linux")
    };

    private FontMetrics fontMetrics = null;
    private Combo templateCombo;
    private List<Template> templates;
    private Label descriptionLabel;

    public TemplateChooser(Composite parent, String targetType) {
        templates = new ArrayList<>();
        for (int i = 0; i < TEMPLATES.length; i++) {
            if (targetType == TEMPLATES[i].targetType) {
                templates.add(TEMPLATES[i]);
            }
        }

        GC gc = new GC(parent);
        gc.setFont(JFaceResources.getDialogFont());
        fontMetrics = gc.getFontMetrics();
        gc.dispose();

        Group group = new Group(parent, SWT.NONE);
        group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        group.setFont(parent.getFont());
        group.setLayout(initGridLayout(new GridLayout(2, false)));
        group.setText("Template Selection");

        createControls(group);
    }

    public String getSelectedTemplate() {
        return templates.get(templateCombo.getSelectionIndex()).id;
    }

    protected void createControls(Composite parent) {
        Label templateLabel = new Label(parent, SWT.NONE);
        templateLabel.setFont(parent.getFont());
        templateLabel.setText("Template:");
        templateLabel.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER, false, false));

        String[] templateNames = new String[templates.size()];
        for (int i = 0; i < templateNames.length; i++) {
            templateNames[i] = templates.get(i).name;
        }

        templateCombo = new Combo(parent, SWT.READ_ONLY | SWT.BORDER);
        templateCombo.setItems(templateNames);
        templateCombo.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true, false));
        templateCombo.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                int index = templateCombo.getSelectionIndex();
                descriptionLabel.setText(templates.get(index).description);
            }
        });

        descriptionLabel = new Label(parent, SWT.NONE);
        descriptionLabel.setFont(parent.getFont());
        descriptionLabel.setText(templates.get(0).description);
        GridData gd = new GridData(GridData.FILL, GridData.CENTER, true, false);
        gd.horizontalSpan = 2;
        descriptionLabel.setLayoutData(gd);

        templateCombo.select(0);
    }

    private GridLayout initGridLayout(GridLayout layout) {
        layout.horizontalSpacing = Dialog.convertHorizontalDLUsToPixels(fontMetrics,
                IDialogConstants.HORIZONTAL_SPACING);
        layout.verticalSpacing = Dialog.convertVerticalDLUsToPixels(fontMetrics, IDialogConstants.VERTICAL_SPACING);
        layout.marginWidth = Dialog.convertHorizontalDLUsToPixels(fontMetrics, IDialogConstants.HORIZONTAL_MARGIN);
        layout.marginHeight = Dialog.convertVerticalDLUsToPixels(fontMetrics, IDialogConstants.VERTICAL_MARGIN);
        return layout;
    }
}
