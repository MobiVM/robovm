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
package org.robovm.idea.builder;

import javax.swing.*;

public class RoboVmNewModuleEditor {
    public JLabel packageNameLabel;
    public JLabel appNameLabel;
    public JLabel appIdLabel;
    public JLabel mainClassNameLabel;
    public JTextField packageName;
    public JTextField appName;
    public JTextField appId;
    public JTextField mainClassName;
    public JPanel panel;
    public JRadioButton gradleRadioButton;
    public JRadioButton mavenRadioButton;
    public JRadioButton noneRadioButton;
    public JLabel buildSystemLabel;
}
