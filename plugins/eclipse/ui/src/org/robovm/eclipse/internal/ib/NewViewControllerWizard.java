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
package org.robovm.eclipse.internal.ib;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.robovm.eclipse.RoboVMPlugin;

/**
 * 
 */
public class NewViewControllerWizard extends AbstractNewXcodeFileWizard {

    @Override
    protected String getExtension() {
        return "xib";
    }

    @Override
    protected String getTitle() {
        return "New iOS view controller UI";
    }

    @Override
    protected String getPageTitle() {
        return "View controller UI";
    }

    @Override
    protected String getPageDescription() {
        return "Create a new Interface Builder document for an iOS view controller";
    }

    @Override
    protected String getPageBanner() {
        return RoboVMPlugin.IMAGE_NEW_IOS_VIEW_CONTROLLER_BANNER;
    }

    @Override
    protected String getPageName() {
        return "newIOSViewControllerPage";
    }

    @Override
    protected void createFile(IProject project, String name, File path) {
        IBIntegratorManager.getInstance().getIBIntegrator(project).newIOSViewController(name, path);
    }
}
